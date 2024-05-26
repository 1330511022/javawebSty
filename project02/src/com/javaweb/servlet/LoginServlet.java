package com.javaweb.servlet;

import com.javaweb.DB.DBConnection;
import com.javaweb.users.Voter;
import java.sql.PreparedStatement;
import java.sql.Connection;
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
        String VoterUsername = request.getParameter("username");
        String VotePassword = request.getParameter("password");
        String VoteName = request.getParameter("name");

        Voter voter = new Voter();
        voter.setName(VoteName);
        voter.setPassword(VotePassword);
        voter.setUsername(VoterUsername);

        long timestamp = System.currentTimeMillis();
        Date date = new Date(timestamp);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
        String formattedDate = sdf.format(date);

        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        Connection connection = null;
        try {
            connection = DBConnection.getConnection();
            String sql = "SELECT * FROM voter WHERE username = ? AND password = ? ";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, VoterUsername);
            preparedStatement.setString(2, VotePassword);
            resultSet = preparedStatement.executeQuery();
            HttpSession session = null;
            if (resultSet.next()) {
                System.out.println("登录成功！");
                session = request.getSession();
                /*######################################################*/
                session.setAttribute("loginuser", VoterUsername);
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
        request.setAttribute("data1", request.getSession().getAttribute("loginuser"));
        RequestDispatcher dispatcher1 = request.getRequestDispatcher("welcome.jsp");
        dispatcher1.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
