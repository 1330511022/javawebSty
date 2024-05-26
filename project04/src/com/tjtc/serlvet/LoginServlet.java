package com.tjtc.serlvet;

import com.tjtc.DB.JdbcTool;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.*;
import java.text.SimpleDateFormat;

@WebServlet(name = "LoginServlet", value = "/Login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String loginUser = request.getParameter("loginUser");
        String loginPassword = request.getParameter("loginPassword");
        String loginPhone = request.getParameter("loginPhone");

        long timestamp = System.currentTimeMillis();
        Date date = new Date(timestamp);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
        String formattedDate = sdf.format(date);

        ResultSet resultSet = null;
        ResultSet resultSet1 = null;
        PreparedStatement preparedStatement = null;
        PreparedStatement preparedStatement1 = null;
        Connection connection = null;
        try {
            connection = JdbcTool.getConnection();
            String sql = "SELECT * FROM users WHERE username = ? AND password = ? ";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, loginUser);
            preparedStatement.setString(2, loginPassword);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                System.out.println("登录成功！");
                HttpSession session = request.getSession();
                String query = "SELECT id FROM users WHERE username = ?";
                preparedStatement1 = connection.prepareStatement(query);
                preparedStatement1.setString(1, loginUser);
                resultSet1 = preparedStatement1.executeQuery();
                if (resultSet1.next()) {
                    int id = resultSet1.getInt("id");
                    session.setAttribute("id", id);
                }
                session.setAttribute("loginusername", loginUser);
                session.setAttribute("logindate", formattedDate);
                session.setAttribute("loginPhone", loginPhone);
            } else {
                RequestDispatcher dispatcher = request.getRequestDispatcher("register.jsp");
                dispatcher.forward(request, response);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }


        }
        RequestDispatcher dispatcher1 = request.getRequestDispatcher("user.jsp");
        dispatcher1.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
