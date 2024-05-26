<%--
  Created by IntelliJ IDEA.
  User: 22222222222222222222
  Date: 2023/11/4
  Time: 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>登录页面</title>
  <style>
    body {
      background-color: #f2f2f2;
      font-family: Arial, sans-serif;
       background: url(img.jpg);
    }

    .container {
      width: 300px;
      margin: 0 auto;
      margin-top: 100px;
      background-color: #fff;
      padding: 20px;
      border-radius: 5px;
      box-shadow: 0 0 5px rgba(0, 0, 0, 0.3);
    }

    h2 {
      text-align: center;
      margin-bottom: 20px;
    }

    .form-group {
      margin-bottom: 20px;
    }

    .form-group label {
      display: block;
      margin-bottom: 5px;
    }

    .form-group input {
      width: 100%;
      padding: 5px;
      border: 1px solid #ccc;
      border-radius: 3px;
    }

    .form-group button {
      width: 100%;
      padding: 10px;
      background-color: #FF3399;
      color: #fff;
      border: none;
      border-radius: 3px;
      cursor: pointer;
    }
    .form-group button:hover {
      background-color: #FF3399;
    }
    a{
        float: right;
    }
    h1{
       text-align: center;
        color: #FF3399;
        font-size: 80px;

    }


  </style>
</head>
<body>
 <h1>欢迎来到新闻网！</h1>
  <div class="container">
    <h2>登录</h2>
    <form action="http://localhost:8082/project03/Login" method="get" >
      <div class="form-group">
        <label for="username">用户名:</label>
        <input type="text" name="username" required>
      </div>
      <div class="form-group">
        <label for="password">密码:</label>
        <input type="password" name="password" required>
      </div>
      <div class="form-group">
        <button type="submit">登录</button>
         <a href='register.jsp'>注册</a>
      </div>
    </form>
  </div>
</body>
</html>