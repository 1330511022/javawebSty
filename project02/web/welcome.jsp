<%--
  Created by IntelliJ IDEA.
  User: 22222222222222222222
  Date: 2023/11/1
  Time: 21:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome!</title>
    <style>
        body {
            background-color: #f2f2f2;
             background: url(img.jpg) no-repeat center  fixed;
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }

        .container {
            width: 400px;
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

        p {
            text-align: center;
            color: #666;
            margin-top: 20px;
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
        <h1>欢迎${data1}</h1>
        <h2>登入时间:<%= session.getAttribute("logindate") %></h2>
        <p>谢谢您参与此次投票！.</p>
        <a href="votesystem.jsp" class="button">点击进入投票系统！</a>
    </div>
</body>
</html>
