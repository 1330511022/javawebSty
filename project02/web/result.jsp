<%--
  Created by IntelliJ IDEA.
  User: 22222222222222222222
  Date: 2023/11/4
  Time: 9:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="com.javaweb.users.Candidate" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>选票结果</title>
    <style>
       <style>
              /* 表格样式 */
              table {
                  border-collapse: collapse;
                  width: 100%;
              }

              th, td {
                  border: 1px solid black;
                  padding: 10px;
                  text-align: center;
              }

              th {
                  background-color: #f2f2f2;
              }

              /* 标题样式 */
              h1 {
                  text-align: center;
                  margin-top: 20px;
              }
          </style>
    </style>
</head>
<body>
    <h1>选票结果</h1>
    <table>
        <tr>
            <th>姓名</th>
            <th>选票</th>
        </tr>
        <%
            List<Candidate> candidates = (List<Candidate>) request.getAttribute("candidates");
            for (Candidate candidate : candidates) {
        %>
        <tr>
            <td><%= candidate.getName() %></td>
            <td><%= candidate.getVotes() %></td>
        </tr>
        <% } %>
    </table>
</body>
</html>
