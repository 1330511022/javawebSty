package com.javaweb.Servlet;

import com.javaweb.DB.DBConnection;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet(name = "RegisterServlet", value = "/Register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String registerusername = request.getParameter("registerusername");
        String registeremail = request.getParameter("registeremail");
        String registerpassword = request.getParameter("registerpassword");

        PreparedStatement preparedStatement = null;
        Connection connection = null;
        try {
            connection = DBConnection.getConnection();
            String sql = "INSERT INTO users (email, username, password) VALUES (?,?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, registeremail);
            preparedStatement.setString(2, registerusername);
            preparedStatement.setString(3, registerpassword);
            preparedStatement.executeUpdate();
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
        RequestDispatcher dispatcher1 = request.getRequestDispatcher("index.jsp");
        dispatcher1.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
