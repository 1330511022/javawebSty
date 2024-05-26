<%--
  Created by IntelliJ IDEA.
  User: 22222222222222222222
  Date: 2023/11/1
  Time: 21:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
 <html>
<head>
  <title>投票人注册系统</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f1f1f1;
       background: url(img.jpg) no-repeat center  fixed;
      margin: 0;
      padding: 0;
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

    h1 {
      text-align: center;
      color: #333;
    }

    label {
      display: block;
      margin-bottom: 5px;
      color: #666;
    }

    input[type="text"],
    input[type="email"],
    input[type="password"] {
      width: 100%;
      padding: 10px;
      border: 1px solid #ccc;
      border-radius: 3px;
      box-sizing: border-box;
    }

    input[type="submit"] {
      background-color: #4CAF50;
      color: #fff;
      padding: 10px 20px;
      border: none;
      border-radius: 3px;
      cursor: pointer;
      width: 100%;
    }

    input[type="submit"]:hover {
      background-color: #45a049;
    }
  </style>
</head>
<body>
  <div class="container">
    <h1>投票人注册系统</h1>
    <form action="http://localhost:8082/project02/Register" method="get">
      <label for="name">用户名:</label>
      <input type="text" name="registeusername" required>

      <label for="email">姓名:</label>
      <input type="text" name="registername" required>

      <label for="password">密码:</label>
      <input type="password" name="registerpassword" required>
      <input type="submit" value="注册">
    </form>
  </div>
</body>
</html>
