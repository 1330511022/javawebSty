<%--
  Created by IntelliJ IDEA.
  User: 22222222222222222222
  Date: 2023/11/1
  Time: 22:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
  <title>投票系统</title>
  <style>
    body {
      background-color: #f2f2f2;
      background: url(img.jpg) no-repeat center  fixed;
      font-family: Arial, sans-serif;
      margin: 0;
      padding: 0;
    }

    .container {
      width: 500px;
      margin: 100px auto;
      background-color: #fff;
      border-radius: 5px;
      box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
      padding: 20px;
    }

    h1 {
      text-align: center;
      color: #333;
    }

    .option {
      margin-top: 20px;
    }

    .option label {
      display: block;
      margin-bottom: 10px;
      color: #666;
    }

    .option input[type="radio"] {
      margin-right: 5px;
    }

    .button {
      display: block;
      width: 120px;
      margin: 20px auto;
      padding: 10px;
      text-align: center;
      color: #fff;
      background-color: #007bff;
      border-radius: 5px;
      text-decoration: none;
    }

    .button:hover {
      background-color: #0056b3;
    }
  </style>
</head>
<body>
<div class="container">
  <h1>投票系统</h1>
  <form action="http://localhost:8082/project02/VoteServlet" method="get">
    <div class="option">
      <label>
        <input type="radio" name="vote" value="1">
        王艳兵 -----特长：弹吉他
      </label>
      <label>
        <input type="radio" name="vote" value="2">
        李二牛 -----特长：弹钢琴
      </label>
      <label>
        <input type="radio" name="vote" value="3">
        何晨光  -----特长：拉二胡
      </label>

    </div>
    <input type="submit" class="button" value="投票"></form>
</div>
</body>
</html>