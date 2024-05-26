<%--
  Created by IntelliJ IDEA.
  User: 22222222222222222222
  Date: 2023/11/4
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新闻页面</title>
    <style>body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
    }

    header {
        background-color: #333;
        color: #fff;
        padding: 20px;
        text-align: center;
    }

    .news-container {
        display: flex;
        flex-wrap: wrap;
        justify-content: space-around;
        margin: 20px;
    }

    .news {
        background-color: #f5f5f5;
        border-radius: 5px;
        box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        margin-bottom: 20px;
        padding: 20px;
        width: 300px;
    }

    .news h2 {
        color: #333;
        font-size: 18px;
        margin-bottom: 10px;
    }

    .news p {
        color: #666;
        font-size: 14px;
        line-height: 1.5;
        margin-bottom: 0;
    }
    </style>
</head>
<body>
<header>
    <h1>体育新闻</h1>
</header>

<div class="news-container">
    <div class="news">
       <h2>${data1}</h2>
       <h3>${data2}</h3>
       <h4>${data3}</h4>
       <p>${data4}</p>
    </div>

    <div class="news">
       <h2>${dataA}</h2>
       <h3>${dataB}</h3>
       <h4>${dataC}</h4>
       <p>${dataD}</p>
    </div>

    <div class="news">
        <h2>${dataQ}</h2>
        <h3>${dataW}</h3>
        <h4>${dataE}</h4>
        <p>${dataR}</p>
    </div>
</div>
</body>
</html>