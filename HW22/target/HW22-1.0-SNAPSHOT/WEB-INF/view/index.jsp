<%--
  Created by IntelliJ IDEA.
  User: Sokolov
  Date: 21.06.2020
  Time: 22:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Student DB</title>
</head>
<body>
<div style="text-align: center;">
    <h1>Student DB</h1>
    <h2>
        <a href="/new">Add Student</a>
        &nbsp;&nbsp;&nbsp;
        <a href="/list">List Student</a>

    </h2>
</div>
<div align="center">
    <table border="1" width="100%" class="table table-hover table-inverse">
        <caption><h2>List Student</h2></caption>
        <tr>
            <th>Cod_Student</th>
            <th>Full_name</th>
            <th>Group</th>
            <th>Year_of_receipt</th>
            <th>Delleted</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="student" items="${st}">
            <tr>
                <td><c:out value="${student.getCod_Student()}"/></td>
                <td><c:out value="${student.getFull_name()}"/></td>
                <td><c:out value="${student.getGroup()}"/></td>
                <td><c:out value="${student.getYear_of_receipt()}"/></td>
                <td><c:out value="${student.isIsdelleted()}"/></td>
                <td>
                    <a href="/delete?id=<c:out value='${student.getCod_Student()}' />">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>