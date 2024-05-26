package com.servlet;

import com.mysql.DBConnection;
import com.products.Products;
import com.products.PurchaseRecord;

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

@WebServlet(name = "ShoppingCartServlet", value = "/ShoppingCart")
public class ShoppingCartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        //用来将购买的商品传入数据库的商品购买记录表中
        //西瓜
        int parameter1 = 0;
        if (request.getParameter("buy1") != null) {
            Products products = new Products();
            products.setPrductName("鸡");
            products.setPrductPrice(50);
            parameter1 = Integer.parseInt(request.getParameter("buy1"));
        }
        System.out.println(parameter1);
        //鸡
        int parameter2 = 0;
        if (request.getParameter("buy2") != null) {
            parameter2 = Integer.parseInt(request.getParameter("buy2"));
        }
        //军刀
        int parameter3 = 0;
        if (request.getParameter("buy3") != null) {
            parameter3 = Integer.parseInt(request.getParameter("buy3"));
        }
        Object loginemail = request.getSession().getAttribute("loginemail");
        if (parameter1 == 1) {
            DBConnection dbConnection = new DBConnection();
            try {
                dbConnection.AddPurchases(parameter1, loginemail);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        if (parameter2 == 2) {
            DBConnection dbConnection = new DBConnection();
            try {
                dbConnection.AddPurchases(parameter2, loginemail);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        if (parameter3 == 3) {
            DBConnection dbConnection = new DBConnection();
            try {
                dbConnection.AddPurchases(parameter3, loginemail);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        //用来处理商品购买记录

        int userId = (int) request.getSession().getAttribute("id");

        // 查询购买记录
        List<PurchaseRecord> purchaseRecords = null;
        try {
            purchaseRecords = getPurchaseRecords(userId);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        // 将查询结果存储在request对象中
        request.setAttribute("purchaseRecords", purchaseRecords);
        // 转发到购买记录页面
        request.getRequestDispatcher("ShoppingCar.jsp").forward(request, response);
    }
    private List<PurchaseRecord> getPurchaseRecords(int userId) throws SQLException {
        List<PurchaseRecord> purchaseRecords = new ArrayList<>();

        ResultSet rs = null;
        PreparedStatement preparedStatement = null;
        Connection connection = null;
        try {
            // 创建数据库连接
            connection = DBConnection.getConnection();
            // 查询购买记录的SQL语句
            String sql = "SELECT users.username, products.name, products.price "
                    + "FROM purchases INNER JOIN products ON purchases.product_id = products.id "
                    + "INNER JOIN users ON purchases.user_id = users.id WHERE purchases.user_id = ?";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, userId);

            rs = preparedStatement.executeQuery();

            // 遍历查询结果，将每条记录封装为PurchaseRecord对象并添加到列表中
            while (rs.next()) {
                String productName = rs.getString("name");
                double productPrice = rs.getDouble("price");
                String username = rs.getString("username");

                PurchaseRecord record = new PurchaseRecord(null, productName, productPrice, username);
                purchaseRecords.add(record);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }

        return purchaseRecords;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
