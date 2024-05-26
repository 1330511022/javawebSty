package com.tjtc.serlvet;

import com.tjtc.DB.JdbcTool;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet(name = "RegisterSerlvet", value = "/Register")
public class RegisterSerlvet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String registerUser = request.getParameter("registerUser");
        String registerPhone = request.getParameter("registerPhone");
        String registerPassword = request.getParameter("registerPassword");

        PreparedStatement preparedStatement = null;
        Connection connection = null;
        try {
            connection = JdbcTool.getConnection();
            String sql = "INSERT INTO users (username, password, phone) VALUES (?,?,?) ";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, registerUser);
            preparedStatement.setString(2, registerPassword);
            preparedStatement.setString(3, registerPhone);

            int i = preparedStatement.executeUpdate();
            if (i > 0) {
                System.out.println("注册成功");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
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
        response.sendRedirect("login.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
