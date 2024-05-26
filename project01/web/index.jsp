<%--
  Created by IntelliJ IDEA.
  User: 22222222222222222222
  Date: 2023/10/24
  Time: 21:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>商城页面</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: url(index.jpg) no-repeat center  fixed;
            background-size:cover;
        }
        header {

            background-color: #f1f1f1;
            padding: 50px;
            text-align: center;
            background:url(index02.jpg) no-repeat center fixed;
        }
        header h1{
        margin:20px;
        }
        header a{

        }
        nav {
            display: flex;
            justify-content: space-around;
            background-color: #333;
        }
        nav a {
            color: white;
            text-decoration: none;
            padding: 14px 20px;
        }
        nav a:hover {
            background-color: #ddd;
            color: black;
        }
        main {
            display: flex;
            flex-wrap: wrap;
            justify-content: center;
            padding: 20px;
        }
        .product {
            border: 1px solid #ccc;
            border-radius: 5px;
            margin: 10px;
            padding: 10px;
            width: 200px;
            text-align: center;
        }
        .product img {
            width: 100%;
            height: auto;
        }
        .product h3 {
            margin: 10px 0;
        }
        .product p {
            color: #777;
        }
    </style>
</head>
<body>
    <header>
        <h1>商品商城</h1>
         <a href='/project01/login.jsp'>登录</a>
    </header>
    <nav>
        <a href="#">首页</a>
        <a href="/project01/ShoppingCar.jsp">购买记录</a>
        <a href="/project01/account.jsp">我的账户</a>
    </nav>
    <form action="http://localhost:8082/project01/ShoppingCart" method="get">
    <main>
        <div class="product">
            <img src="product1.jpg" alt="西瓜">
            <h3>西瓜</h3>
            <p>价格：¥50</p>
            <button name="buy1" value="1">加入购物车</button>
        </div>
        <div class="product">
        <img src="product2.jpg" alt="鸡">
            <h3>鸡</h3>
            <p>价格：¥200</p>
            <button name="buy2" value="2">加入购物车</button>
        </div>
        <div class="product">
            <img src="product3.jpg" alt="军刀">
            <h3>军刀</h3>
            <p>价格：¥500</p>
            <button name="buy3" value="3">加入购物车</button>
        </div>
    </main>
 </form>
</body>
</html>

