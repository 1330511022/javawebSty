package com.javaweb.servlet;

import com.javaweb.DB.DBConnection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet(name = "VoteServlet", value = "/VoteServlet")
public class VoteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String vote = request.getParameter("vote");
        PreparedStatement preparedStatement = null;
        Connection connection = null;
        try {
            connection = DBConnection.getConnection();
            if (vote.equals("1")) {
                String sql1 = "UPDATE candidate SET votes = votes + 1 WHERE id = 1";
                preparedStatement = connection.prepareStatement(sql1);
                request.setAttribute("data","王艳兵");
            }
            if (vote.equals("2")) {
                String sql2 = "UPDATE candidate SET votes = votes + 1 WHERE id = 2";
                preparedStatement = connection.prepareStatement(sql2);
                request.setAttribute("data","李二牛");
            }
            if (vote.equals("3")) {
                String sql3 = "UPDATE candidate SET votes = votes + 1 WHERE id = 3";
                preparedStatement = connection.prepareStatement(sql3);
                request.setAttribute("data","何晨光");
            }
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        RequestDispatcher dispatcher1 = request.getRequestDispatcher("end.jsp");
        dispatcher1.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
