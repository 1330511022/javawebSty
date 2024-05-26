package com.mysql;

import java.sql.*;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/OLmall";
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


    public void AddPurchases(int parameter, Object email) throws Exception {
        int id1;
        Connection connection = DBConnection.getConnection();
        PreparedStatement stmt = connection.prepareStatement("SELECT id FROM users WHERE email = ?");
        stmt.setString(1, (String) email);
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





}
