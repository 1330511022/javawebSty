package com.javaweb.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet(name = "RegisterServlet", value = "/Register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String registeusername = request.getParameter("registeusername");
        String registername = request.getParameter("registername");
        String registeremail = request.getParameter("registeremail");
        String registerpassword = request.getParameter("registerpassword");
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/voting";
            String username = "root";
            String password = "297592781";
            connection = DriverManager.getConnection(url, username, password);
            String sql = "INSERT INTO voter (name, username, password) VALUES (?,?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, registername);
            preparedStatement.setString(2, registeusername);
            preparedStatement.setString(3, registerpassword);
            int i = preparedStatement.executeUpdate();
            if (i > 0) {
                System.out.println("数据添加成功");
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
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
        response.sendRedirect("/project02/index.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
