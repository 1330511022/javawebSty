<%--
  Created by IntelliJ IDEA.
  User: 22222222222222222222
  Date: 2023/11/8
  Time: 16:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
        /* Reset CSS */
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        /* Global styles */
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
        }

        header {
            background-color: #333;
            color: #fff;
            padding: 10px 20px;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        nav ul {
            list-style: none;
            display: flex;
        }

        nav ul li {
            margin-right: 20px;
        }

        nav ul li a {
            text-decoration: none;
            color: #fff;
        }

        main {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 80vh;
        }

        .cart {
            background-color: #fff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        .cart h2 {
            text-align: center;
            margin-bottom: 20px;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-bottom: 20px;
        }

        table th,
        table td {
            padding: 10px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        table th:first-child,
        table td:first-child {
            width: 40%;
        }

        table th:last-child,
        table td:last-child {
            width: 20%;
        }

        .product-info {
            margin-left: 20px;
        }

        .product-info h3 {
            margin-bottom: 10px;
        }

        .cart-total {
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        .cart-total h3 {
            margin: 0;
        }

        .cart-total button {
            padding: 10px;
            background-color: #333;
            color: #fff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        .cart-total button:hover {
            background-color: #555;
        }

        footer {
            background-color: #333;
            color: #fff;
            padding: 20px;
            text-align: center;
        }
    </style>
    <title>购物车</title>
</head>
<body>
<header>
    <div class="logo">购物车</div>
    <nav>
        <ul>
            <li><a href="index.jsp">首页</a></li>
            <li><a href="#">我的订单</a></li>
        </ul>
    </nav>
</header>

<main>
    <section class="cart">
        <h2><%= session.getAttribute("loginusername") %>的购物车</h2>
        <table>
            <thead>
            <tr>
                <th>商品</th>
                <th>单价</th>
                <th>购买者</th>
            </tr>
            </thead>
            <c:forEach var="record" items="${purchaseRecords}">
            <tr>
                <td>${record.productName}</td>
                <td>${record.productPrice}</td>
                <td>${record.username}</td>
            </tr>
            </c:forEach>
        </table>
    </section>
</main>

<footer>
    <div class="contact">
        <p>联系我们：天津职业大学计算机二班教材工作室</p>
        <p>地址：天津职业大学学生公寓</p>
    </div>
</footer>
</body>
</html>
