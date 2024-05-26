package com.javaweb.Servlet;

import com.javaweb.DB.DBConnection;

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
        String Username = request.getParameter("username");
        String Password = request.getParameter("password");

        long timestamp = System.currentTimeMillis();
        Date date = new Date(timestamp);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
        String formattedDate = sdf.format(date);

        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        Connection connection = null;
        try {
            connection = DBConnection.getConnection();
            String sql = "SELECT * FROM users WHERE username = ? AND password = ? ";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, Username);
            preparedStatement.setString(2, Password);

            resultSet = preparedStatement.executeQuery();
            HttpSession session = null;
            if (resultSet.next()) {
                session = request.getSession();
                /*######################################################*/
                session.setAttribute("loginuser", Username);
                session.setAttribute("logindate", formattedDate);
            } else {
                RequestDispatcher dispatcher1 = request.getRequestDispatcher("/register.jsp");
                dispatcher1.forward(request, response);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                resultSet.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        request.setAttribute("data", request.getSession().getAttribute("loginuser"));
        RequestDispatcher dispatcher1 = request.getRequestDispatcher("welcome.jsp");
        dispatcher1.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
