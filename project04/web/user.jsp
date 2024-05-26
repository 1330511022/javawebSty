<%--
  Created by IntelliJ IDEA.
  User: 22222222222222222222
  Date: 2023/11/8
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored ="false" %>
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

  .profile {
    background-color: #fff;
    padding: 20px;
    border-radius: 10px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
  }

  .profile h2 {
    text-align: center;
    margin-bottom: 20px;
  }

  .profile-details {
    display: flex;
    flex-direction: column;
  }

  .profile-info {
    margin-bottom: 10px;
  }

  .profile-info label {
    font-weight: bold;
  }

  footer {
    background-color: #333;
    color: #fff;
    padding: 20px;
    text-align: center;
  }

  .inputaaaa {
    width: 100%;
    padding: 10px;
    background: #007bff;
    color: #fff;
    border: none;
    border-radius: 5px;
    cursor: pointer;
  }
  .inputaaaa:hover {
    background: #0056b3;
  }



  </style>
  <title>个人信息</title>
</head>
<body>
  <header>
    <div class="logo">个人信息</div>
    <nav>
      <ul>
        <li><a href="index.jsp">首页</a></li>
        <li><a href="shopping.jsp">我的订单</a></li>
      </ul>
    </nav>
  </header>

  <main>
    <section class="profile">
      <h2>个人信息</h2>
      <div class="profile-details">
        <div class="profile-info">
          <label for="username">用户名：</label>
          <span id="username"><%= session.getAttribute("loginusername") %></span>
        </div>
        <div class="profile-info">
          <label for="phone">电话：</label>
          <span id="phone"><%= session.getAttribute("loginPhone")%></span>
        </div>
        <div class="profile-info">
          <label for="address">登录时间：</label>
          <span id="address"><%= session.getAttribute("logindate")%></span>
        </div>
      </div>
      <form action="http://localhost:8082/project04/Logout" method="post">
        <input type="submit" class="inputaaaa" value="退出登录">
      </form>
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
