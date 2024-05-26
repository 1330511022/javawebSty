package com.tjtc.DB;

import com.tjtc.products.PurchaseRecord;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcTool {
    private static final String URL = "jdbc:mysql://localhost:3306/textbookmall";
    private static final String USER = "root";
    private static final String PASSWORD = "297592781";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    //添加商品
    public void AddPurchases(int parameter, Object phone) throws Exception {
        int id1;
        Connection connection = JdbcTool.getConnection();
        PreparedStatement stmt = connection.prepareStatement("SELECT id FROM users WHERE phone = ?");
        stmt.setString(1, (String) phone);
        ResultSet rs = stmt.executeQuery();
        PreparedStatement preparedStatement = null;
        if (rs.next()) {
            id1 = rs.getInt("id");
            String sql1 = "INSERT INTO purchases (user_id,product_id) VALUES (?,?)";
            preparedStatement = connection.prepareStatement(sql1);
            preparedStatement.setInt(1, id1);
            preparedStatement.setInt(2, parameter);
            preparedStatement.executeUpdate();
        }
        if (preparedStatement != null) {
            preparedStatement.close();
        }
        stmt.close();
        connection.close();
    }



    //用来处理商品购买记录
    public List<PurchaseRecord> getPurchaseRecords(int userId) throws SQLException {
        List<PurchaseRecord> purchaseRecords = new ArrayList<>();

        ResultSet rs = null;
        PreparedStatement preparedStatement = null;
        Connection connection = null;
        try {
            // 创建数据库连接
            connection = JdbcTool.getConnection();
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
}





