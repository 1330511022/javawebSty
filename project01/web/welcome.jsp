<%--
  Created by IntelliJ IDEA.
  User: 22222222222222222222
  Date: 2023/10/28
  Time: 21:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>欢迎用户</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f4f4f4;
      padding: 20px;
    }

    h1 {
      color: #333333;
      text-align: center;
    }

    p {
      color: #666666;
      margin-bottom: 20px;
    }

    .container {
      max-width: 400px;
      margin: 0 auto;
      background-color: #fff;
      padding: 20px;
      border-radius: 5px;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }
  </style>
</head>
<body>
  <div class="container">
    <h1>欢迎用户${data1}</h1>
    <p>感谢您选择我们的服务！</p>
    <p>在这里，您可以享受我们为您精心准备的各种功能。</p>
    <a href="index.jsp">进入商城！</a>
  </div>
</body>
</html>