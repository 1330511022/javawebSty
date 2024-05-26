<%--
  Created by IntelliJ IDEA.
  User: 22222222222222222222
  Date: 2023/11/1
  Time: 20:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>投票人登录系统</title>
  <style>
    body {
      font-family: Arial, sans-serif;
       background: url(img.jpg) no-repeat center  fixed;
      background-color: #f4f4f4;
      margin: 0;
      padding: 0;
    }

    .container {
      width: 300px;
      margin: 100px auto;
      background-color: #fff;
      padding: 20px;
      border-radius: 5px;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }

    h1 {
      text-align: center;
      color: #333;
    }

    .form-group {
      margin-bottom: 20px;
    }

    label {
      display: block;
      font-weight: bold;
      margin-bottom: 5px;
    }

    input[type="text"],
    input[type="password"] {
      width: 100%;
      padding: 10px;
      border: 1px solid #ccc;
      border-radius: 3px;
    }

    input[type="submit"] {
      width: 100%;
      background-color: #4CAF50;
      color: #fff;
      border: none;
      padding: 10px;
      border-radius: 3px;
      cursor: pointer;
    }
  </style>
</head>
<body>
  <div class="container">
    <h1>投票人登录系统</h1>
    <form action="http://localhost:8082/project02/Login" method="get">
    <div class="form-group">
            <label for="name">您的姓名:</label>
            <input type="text" id="name" name="name" required>
          </div>

      <div class="form-group">
        <label for="username">用户名:</label>
        <input type="text" id="username" name="username" required>
      </div>

      <div class="form-group">
        <label for="password">密码:</label>
        <input type="password" id="password" name="password" required>
      </div>

      <input type="submit" value="登录">
      <a href='/project02/register.jsp'>注册</a>
       <a href='/project02/AdministratorLogin.jsp'>管理员登录</a>
    </form>
  </div>
</body>
</html>
