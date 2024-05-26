<%--
  Created by IntelliJ IDEA.
  User: 22222222222222222222
  Date: 2023/11/4
  Time: 12:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎页面</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            background: url(img.jpg);
            margin: 0;
            padding: 0;
        }

        .container {
            max-width: 600px;
            margin: 50px auto;
            background-color: #fff;
            padding: 30px;
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            text-align: center;
        }

        h1 {
            font-size: 2rem;
            color: #333;
            margin-bottom: 20px;
        }

        p {
            font-size: 1rem;
            line-height: 1.5;
            color: #666;
            margin-bottom: 20px;
        }

        a {
            display: inline-block;
            background-color: #007bff;
            color: #fff;
            text-decoration: none;
            padding: 10px 20px;
            border-radius: 5px;
            font-size: 1rem;
            transition: background-color 0.3s ease;
        }

        a:hover {
            background-color: #0056b3;
        }

        @keyframes welcomeAnimation {
            0% {
                transform: scale(1);
            }
            50% {
                transform: scale(1.1);
            }
            100% {
                transform: scale(1);
            }
        }

        .welcomeAnimation {
            animation: welcomeAnimation 2s infinite;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>你好${data}欢迎来到网上新闻网！</h1>
        <p>这里有全球各地最新的新闻，最引人注目的新闻！</p>
        <a href="newsindex.jsp" class="welcomeAnimation">立即访问</a>
    </div>
</body>
</html>