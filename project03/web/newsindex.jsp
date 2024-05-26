<%--
  Created by IntelliJ IDEA.
  User: 22222222222222222222
  Date: 2023/11/4
  Time: 12:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>新闻向导</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <h1>请选择你想要查看的新闻分类</h1>
    <select id="newsCategory">
        <option value="娱乐新闻">娱乐新闻</option>
        <option value="体育新闻">体育新闻</option>
        <option value="科技新闻">科技新闻</option>
        <!-- 其他新闻分类 -->
    </select>
    <button onclick="getNews()">查看新闻</button>
    <div id="newsContent"> </div>
    <script src="scripts.js"></script>
</body>
</html>