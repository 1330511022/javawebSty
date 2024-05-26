package com.servlet;

import com.User.User;

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

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();
        String loginUsername = request.getParameter("LoginUsername");
        String loginPassword = request.getParameter("LoginPassword");
        String loginEmail = request.getParameter("LoginEmail");
        user.setUsername(loginUsername);
        user.setPassword(loginPassword);
        user.setEmail(loginEmail);
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        Connection connection = null;
        PreparedStatement preparedStatement1 = null;
        long timestamp = System.currentTimeMillis();
        Date date = new Date(timestamp);
        // 将日期格式化为字符串
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss");
        String formattedDate = sdf.format(date);
        ResultSet resultSet1 = null;
        try {
            // 加载数据库驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/OLmall";
            String username = "root";
            String password = "297592781";
            connection = DriverManager.getConnection(url, username, password);
            // 编写SQL查询语句
            String sql = "SELECT * FROM users WHERE username = ? AND password = ? ";
            // 使用PreparedStatement执行查询
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, loginUsername);
            preparedStatement.setString(2, loginPassword);
            // 处理查询结果
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                System.out.println("登录成功！");
                HttpSession session = request.getSession();
                String query = "SELECT id FROM users WHERE username = ?";
                preparedStatement1 = connection.prepareStatement(query);
                preparedStatement1.setString(1, loginUsername);
                resultSet1 = preparedStatement1.executeQuery();
                if (resultSet1.next()) {
                    int id = resultSet1.getInt("id");
                    session.setAttribute("id", id);
                }
                session.setAttribute("loginuser", loginUsername);
                session.setAttribute("loginemail", loginEmail);
                session.setAttribute("logindate", formattedDate);
                String data = user.getUsername();
            } else {
                RequestDispatcher dispatcher1 = request.getRequestDispatcher("/login.jsp");
                dispatcher1.forward(request, response);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null && resultSet1 != null) {
                try {
                    resultSet.close();
                    resultSet1.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                resultSet = null;
                resultSet1 = null;
            }
            if (preparedStatement != null && preparedStatement1 != null) {
                try {
                    preparedStatement.close();
                    preparedStatement1.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                preparedStatement = null;
                preparedStatement1 = null;
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
//        String data1 = user.getUsername();
        request.setAttribute("data1", request.getSession().getAttribute("loginuser"));
        RequestDispatcher dispatcher1 = request.getRequestDispatcher("welcome.jsp");
        dispatcher1.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
