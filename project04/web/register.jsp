<%--
  Created by IntelliJ IDEA.
  User: 22222222222222222222
  Date: 2023/11/9
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Register Page</title>
  <style>
    body {
      margin: 0;
      padding: 0;
      font-family: Arial, sans-serif;
      background: #f4f4f4;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
    }
    .container {
      width: 300px;
      padding: 20px;
      background: #fff;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
      border-radius: 5px;
    }
    input {
      width: 100%;
      padding: 10px;
      margin: 10px 0;
      border: 1px solid #ccc;
      border-radius: 5px;
      box-sizing: border-box;
    }
    button {
      width: 100%;
      padding: 10px;
      background: #007bff;
      color: #fff;
      border: none;
      border-radius: 5px;
      cursor: pointer;
    }
    button:hover {
      background: #0056b3;
    }
  </style>
</head>
<body>
<div class="container">
  <h2>用户注册</h2>
  <form action="http://localhost:8082/project04/Register" method="get">
  <input type="text" name="registerUser" placeholder="用户名">
  <input type="text" name="registerPhone" placeholder="电话号码">
  <input type="password" name="registerPassword" placeholder="密码">
    <input type="password" name="registerPasswordTWO" placeholder="再次输入密码">
  <button type="submit">点击注册</button>
  </form>
</div>
</body>
<script>
  document.querySelector('form').addEventListener('submit', function(event) {
    var password1 = document.querySelector('input[type="password"]').value;
    var password2 = document.querySelectorAll('input[type="password"]')[1].value;

    if (password1 !== password2) {
      event.preventDefault();
      alert('两次输入的密码不相同，请重新输入');
    }
  });
</script>
</html>
