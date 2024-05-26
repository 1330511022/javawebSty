<%--
  Created by IntelliJ IDEA.
  User: 22222222222222222222
  Date: 2023/11/4
  Time: 11:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>注册页面</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f1f1f1;
      background: url(img.jpg);
    }

    .container {
      max-width: 400px;
      margin: 0 auto;
      padding: 20px;
      background-color: #fff;
      border-radius: 5px;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
      margin-top: 100px;
    }

    h2 {
      text-align: center;
    }

    .form-group {
      margin-bottom: 20px;
    }

    .form-group label {
      display: block;
      font-weight: bold;
      margin-bottom: 5px;
    }

    .form-group input {
      width: 100%;
      padding: 8px;
      border: 1px solid #ccc;
      border-radius: 3px;
    }

    .form-group input[type="submit"] {
      background-color: #FF3399;
      color: #fff;
      cursor: pointer;
    }
  </style>
</head>
<body>
  <div class="container">
    <h2>用户注册</h2>
    <form action="http://localhost:8082/project03/Register" method="get">
      <div class="form-group">
        <label for="username">用户名:</label>
        <input type="text" id="username" name="registerusername" required>
      </div>
      <div class="form-group">
        <label for="email">邮箱:</label>
        <input type="email" id="email" name="registeremail" required>
      </div>
      <div class="form-group">
        <label for="password">密码:</label>
        <input type="password" id="password" name="registerpassword" required>
      </div>
      <div class="form-group">
        <input type="submit" value="注册">
      </div>
    </form>
  </div>
</body>
</html>