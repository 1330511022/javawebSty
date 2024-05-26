package com.javaweb.servlet;

import com.javaweb.DB.DBConnection;
import com.javaweb.users.Candidate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "AdministratorLoginServlet", value = "/AdministratorLoginServlet")
public class AdministratorLoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        ResultSet rs = null;
        PreparedStatement preparedStatement = null;
        Connection connection = null;
        List<Candidate> candidates;
        try {
            connection = DBConnection.getConnection();
            String sql = "select name,votes from candidate;";
            preparedStatement = connection.prepareStatement(sql);
            rs = preparedStatement.executeQuery();
            // 创建一个列表来保存候选人的选票数量和姓名
            candidates = new ArrayList<>();
            // 提取查询结果并将其添加到列表中
            while (rs.next()) {
                String name = rs.getString("name");
                int votes = rs.getInt("votes");
                Candidate candidate = new Candidate(name, votes);
                candidates.add(candidate);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
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
        // 将候选人列表存储在请求属性中
        request.setAttribute("candidates", candidates);
        // 转发到显示选票的JSP页面
        request.getRequestDispatcher("result.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}