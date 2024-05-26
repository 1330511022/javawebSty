<%--
  Created by IntelliJ IDEA.
  User: 22222222222222222222
  Date: 2023/11/1
  Time: 22:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Goodbye</title>
    <style>
        body {
            background-color: #f2f2f2;
             background: url(img.jpg) no-repeat center  fixed;
            font-family: Arial, sans-serif;
        }

        .container {
            max-width: 600px;
            margin: 0 auto;
            padding: 20px;
            text-align: center;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }

        h1 {
            color: #333;
            font-size: 28px;
        }

        p {
            color: #666;
            font-size: 18px;
            margin-top: 20px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>谢谢您的投票!</h1>
        <h2>您投了${data}一票！</h2>
        <p>祝您生活愉快！！</p>
    </div>
</body>
</html>