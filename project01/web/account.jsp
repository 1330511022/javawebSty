<%--
  Created by IntelliJ IDEA.
  User: 22222222222222222222
  Date: 2023/10/27
  Time: 17:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored ="false" %>
<html>
  <head>
    <title>用户界面</title>
    <style>body {
               font-family: Arial, sans-serif;
               background-color: #f0f0f0;
               background: url("1.jpg");
           }
           .container {
               max-width: 400px;
               height: 300px;
               margin: 50px auto;
               padding: 20px;
               background-color: #fff;
               box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
           }
           h1 {
               text-align: center;
               margin-bottom: 20px;
           }</style>
  </head>
 <body>
 <div class="container">
     <h1>欢迎，<span id="username"><%= session.getAttribute("loginuser") %></span>！</h1>
     <p>邮箱：<span id="email"><%= session.getAttribute("loginemail") %></span></p>
     <p>登录时间：<span id="loginTime"><%= session.getAttribute("logindate") %></span></p>
     <p><a href='/project01/index.jsp'>返回主页</a></p>
     <form action="http://localhost:8082/project01/logout" method="post">
      <input type="submit" value="退出">
      </form>

 </div>
 </body>
</html>
