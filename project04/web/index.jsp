<%--
  Created by IntelliJ IDEA.
  User: 22222222222222222222
  Date: 2023/11/8
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
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

        .search {
            display: flex;
        }

        .search input {
            padding: 5px;
            margin-right: 10px;
        }

        .search button {
            padding: 5px 10px;
            background-color: #fff;
            border: none;
            cursor: pointer;
        }

        main {
            display: flex;
        }

        aside {
            background-color: #f4f4f4;
            padding: 20px;
        }

        aside ul {
            list-style: none;
        }

        aside ul li {
            margin-bottom: 10px;
        }

        .products {
            display: flex;
            flex-wrap: wrap;
            justify-content: space-around;
            padding: 20px;
        }

        .product {
            background-color: #fff;
            padding: 20px;
            margin: 10px;
            text-align: center;
        }

        .product img {
            width: 200px;
            height: 200px;
            object-fit: cover;
            margin-bottom: 10px;
        }

        footer {
            background-color: #333;
            color: #fff;
            padding: 20px;
            text-align: center;
        }

        footer a {
            color: #fff;
            text-decoration: none;
            margin: 0 10px;
        }


    </style>
    <title>教材订购商城</title>
</head>
<body>
<header>
    <div class="logo">教材商城</div>
    <nav>
        <ul>
            <li><h2>商城首页</h2></li>
        </ul>
    </nav>
</header>

<main>
    <aside>
        <h2>用户中心</h2>
        <ul>
            <li><a href="shopping.jsp">我的订单</a></li>
            <li><a href="user.jsp">个人信息</a></li>
        </ul>
    </aside>
    <form action="http://localhost:8082/project04/Shopping" method="get">
        <section class="products">
            <div class="product">
                <img src="教材1.jpg" alt="教材1">
                <h3>Java EE企业级应用开发教程</h3>
                <p>价格：￥38</p>
                <button name="buy1" value="1">加入购物车</button>
            </div>
            <div class="product">
                <img src="教材2.jpg" alt="教材2">
                <h3>Vue.js前端开发实战</h3>
                <p>价格：￥40</p>
                <button name="buy2" value="2">加入购物车</button>
            </div>
            <div class="product">
                <img src="教材3.jpg" alt="教材3">
                <h3>Linux编程基础</h3>
                <p>价格：￥30</p>
                <button name="buy3" value="3">加入购物车</button>
            </div>
            <div class="product">
                <img src="教材4.jpg" alt="教材4">
                <h3>JavaWeb程序设计任务教程</h3>
                <p>价格：￥44</p>
                <button name="buy4" value="4">加入购物车</button>
            </div>
            <div class="product">
                <img src="教材5.jpg" alt="教材5">
                <h3>算法导论第三版</h3>
                <p>价格：￥25</p>
                <button name="buy5" value="5">加入购物车</button>
            </div>
            <div class="product">
                <img src="教材6.jpg" alt="教材6">
                <h3>计算机组成原理（第3版）</h3>
                <p>价格：￥19</p>
                <button name="buy6" value="6">加入购物车</button>
            </div>
            <div class="product">
                <img src="教材7.jpg" alt="教材7">
                <h3>操作系统教程-第5版</h3>
                <p>价格：￥19</p>
                <button name="buy7" value="7">加入购物车</button>
            </div>
        </section>
    </form>
</main>

<footer>
    <div class="contact">
        <p>联系我们：天津职业大学计算机二班教材工作室</p>
        <p>地址：天津职业大学学生公寓</p>
    </div>
    <div class="terms">
        <a href="#">服务条款</a>
        <a href="#">隐私政策</a>
    </div>
    <div class="social">
        <a href="https://www.csdn.net/">CSDN</a>
        <a href="https://www.baidu.com">百度</a>
        <a href="https://weibo.com/newlogin?tabtype=weibo&gid=102803&openLoginLayer=0&url=https%3A%2F%2Fwww.weibo.com%2F">新浪微博</a>
    </div>
</footer>
</body>
</html>
