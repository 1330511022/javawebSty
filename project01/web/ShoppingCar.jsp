<%--
  Created by IntelliJ IDEA.
  User: 22222222222222222222
  Date: 2023/10/26
  Time: 22:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
  <head>
    <title>购物车</title>
    <style>
            body {
                font-family: Arial, sans-serif;
            }
            h1 {
                text-align: center;
            }
            table {
                width: 100%;
                border-collapse: collapse;
                margin-top: 20px;
            }
            th, td {
                border: 1px solid #ccc;
                padding: 8px;
                text-align: left;
            }
            th {
                background-color: #f2f2f2;
            }
        </style>
  </head>
  <body><h1><%= session.getAttribute("loginuser") %>的购买记录</h1>
       <table border="1">
               <tr>
                   <th>商品名称</th>
                   <th>商品价格</th>
                   <th>购买者</th>
               </tr>
               <c:forEach var="record" items="${purchaseRecords}">
                   <tr>
                       <td>${record.productName}</td>
                       <td>${record.productPrice}</td>
                       <td>${record.username}</td>
                   </tr>
               </c:forEach>
           </table>
  </body>
</html>
