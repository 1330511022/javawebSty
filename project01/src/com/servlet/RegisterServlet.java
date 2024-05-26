package com.servlet;

import com.User.User;
import com.mysql.DBConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(name = "RegisterServlet", value = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");


        String registerUser = request.getParameter("registerUser");
        String registerPassword = request.getParameter("registerPassword");
        String registerEmail = request.getParameter("registerEmail");

        User registeruser = new User();
        registeruser.setPassword(registerPassword);
        registeruser.setUsername(registerUser);
        registeruser.setEmail(registerEmail);
        PreparedStatement preparedStatement = null;
        Connection connection = null;

        try {
            connection = DBConnection.getConnection();
            String sql = "INSERT INTO users (username, password, email) VALUES (?,?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, registerUser);
            preparedStatement.setString(2, registerPassword);
            preparedStatement.setString(3, registerEmail);
            int i = preparedStatement.executeUpdate();
            if (i > 0) {
                System.out.println("数据添加成功");

            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null ) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                preparedStatement = null;

            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                connection = null;
            }
        }
        response.sendRedirect("/project01/login.jsp");
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
