<%--
  Created by IntelliJ IDEA.
  User: 22222222222222222222
  Date: 2023/10/27
  Time: 20:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
	<head>
		<meta charset="utf-8">
		<title>登录</title>
		<style>
			body{
			background: url("1.jpg");
		}
		form{
			width: 350px;
			height: 200px;
			margin: 0 auto;
			border: 2px solid firebrick;
			border-radius: 10px;
			background-color: aliceblue;
		}
		input{
			width:300px;
			height: 30px;
			border: 1px solid;
			border-radius: 5px;
			margin-bottom: 10px;
		}
		.user{
			padding-top: 20px;
			text-align: center;
		}
		.footer input{
			width: 50px;
			height: 50px;
			border: 1px solid rgba(255 255,255,0.5);
		}
		.footer{
			text-align: center;
		}
		input:focus{
			background-color: rgba(0, 0, 0, 0.5);
		}
		.btn:hover{
			background-color: rgba(0, 0, 0, 0.2);
			border: 2px;
		}</style>
	</head>
	<body>
		<form action="http://localhost:8082/project01/LoginServlet" method="get">
			<div class="user">
			<input type="text" name="LoginUsername"  placeholder="用户名">
			<input type="password" name="LoginPassword" placeholder="密码">
			<input type="text" name="LoginEmail" placeholder="邮箱">
			</div>
			<div class="footer">
			<input type="submit" value="登录" class="btn">
			<a href='/project01/register.jsp' class="btn">注册</a>
			</div>
		</form>

	</body>
</html>