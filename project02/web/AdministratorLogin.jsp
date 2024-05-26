<%--
  Created by IntelliJ IDEA.
  User: 22222222222222222222
  Date: 2023/11/2
  Time: 20:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>管理员登录</title>
  <style>
  body {
    background-color: #f2f2f2;
     background: url(img.jpg) no-repeat center  fixed;
    font-family: Arial, sans-serif;
  }

  .login-container {
    width: 300px;
    margin: 0 auto;
    background-color: #fff;
    padding: 20px;
    border-radius: 5px;
    box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
  }

  h2 {
    text-align: center;
  }

  .form-group {
    margin-bottom: 10px;
  }

  label {
    display: block;
    font-weight: bold;
  }

  input[type="text"],
  input[type="password"] {
    width: 100%;
    padding: 5px;
    border: 1px solid #ccc;
    border-radius: 3px;
  }

  input[type="submit"] {
    width: 100%;
    padding: 10px;
    background-color: #4CAF50;
    color: #fff;
    border: none;
    border-radius: 3px;
    cursor: pointer;
  }

  input[type="submit"]:hover {
    background-color: #45a049;
  }
  </style>
</head>
<body>
  <div class="login-container">
    <h2>管理员登录</h2>
    <form action="http://localhost:8082/project02/AdministratorLoginServlet" method="get"  id="loginForm">
      <div class="form-group">
        <label for="username">管理员用户名:</label>
        <input type="text" id="username"  name="username" required>
      </div>
      <div class="form-group">
        <label for="password">管理员密码:</label>
        <input type="password" id="password" name="password" required>
      </div>
      <div class="form-group">
        <input type="submit" value="登录">
      </div>
    </form>
  </div>
</body>
<script>
    document.getElementById('loginForm').addEventListener('submit', function(event) {
      event.preventDefault(); // 阻止表单默认提交行为

      var username = document.getElementById('username').value;
      var password = document.getElementById('password').value;
      var correctUsername = '123456';
      var correctPassword = '123456';

      if (username === correctUsername && password === correctPassword) {
         document.getElementById("loginForm").submit();
      } else {
        alert('账号密码错误，请重试！');
      }
    });
  </script>
</html>
