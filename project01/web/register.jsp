<%--
  Created by IntelliJ IDEA.
  User: 22222222222222222222
  Date: 2023/10/27
  Time: 20:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>注册</title>
<style>body{
       	background: url("1.jpg");
       }
       form{
       	width: 70%;
       	margin: 0 auto;
       }
       form ul{
       	background-color: aliceblue;
       	width: 630px;
       	height: 500px;
       	list-style: none;
       	border: 2px solid rebeccapurple;
       	border-radius: 10px;
       	margin: 0;
       	padding: 0;
       	text-align: center;
       }
       form ul li{
       	padding: 12px;
       	border-bottom: 2px solid silver;
       }
       form span{
       	width: 150px;
       	display: inline-block;
       }
       form li:first-child,form li:last-child{
       	border-bottom: 3px solid firebrick ;
       }
       .u input,a{
       	width: 220px;
       	height: 20px;
       	padding: 8px;
       }
        form .sum{
       	text-align: center;
       	padding-top: 20px;
       }
       .sum input,a{
       	width: 200px;
       	height: 50px;
       	background-color:cornflowerblue;
       	border: 5px solid firebrick;
       	border-radius: 10px;
       	font-size: 20px;
       }
       .largest-div {
       	width: 50%; /* 或者固定宽度 */
       	height: 50%; /* 或者固定高度 */
       	margin: auto;
       }</style>
</head>
<body>

<div class="largest-div" >
    <form action="http://localhost:8082/project01/RegisterServlet" method="get"  >
        <ul>
            <li class="u">
                <h2>用户注册</h2>
            </li>
            <li class="u">
                <span>用户名:</span>
                <input type="text" name="registerUser" placeholder="请输入用户名">
            </li>
            <li class="u">
                <span>邮箱地址:</span>
                <input type="text" name="registerEmail" placeholder="例如:xxxxxx@xx.com">
            </li>
            <li class="u">
                <span>密码:</span>
                <input type="password" name="registerPassword" id="1" placeholder="请输入密码">
            </li>
            <li class="u">
                <span>请确认密码:</span>
                <input type="password" name="registerPasswordTWO" id="2" placeholder="请输入密码">
            </li>
            <li class="sum">
                <input type="submit" value="注册">
            </li>
        </ul>
    </form>
</div>
<script>
    //var  document.getElementById("1").value
    var password  = 1;
    document.querySelector('form').addEventListener('submit', function(event) {
        var password = document.querySelector('input[name="registerPassword"]').value;
        var confirmPassword = document.querySelector('input[name="registerPasswordTWO"]').value;
        if(password !== confirmPassword) {
            alert('两次输入的密码不一致，请重新输入!');
            event.preventDefault(); // 阻止表单提交
            return false;
        }
    });
    console.log(password)




</script>


</body>
</html>