<%--
  Created by IntelliJ IDEA.
  User: Sokolov
  Date: 22.06.2020
  Time: 21:21
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
    <c:if test="${student == null}">
    <form action="insert" method="post">
        </c:if>
        <table border="1" cellpadding="5">
            <caption>
                <h2>
                    <c:if test="${student == null}">
                        Add Student
                    </c:if>
                </h2>
            </caption>
            <c:if test="${student != null}">
                <input type="hidden" name="Cod_student" value="<c:out value='${student.Cod_student}' />" />
            </c:if>
            <tr>
                <th>Full_name: </th>
                <td>
                    <input type="text" name="Full_name" size="45"
                           value="<c:out value='${student.Full_name}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>group: </th>
                <td>
                    <input type="number" name="group" size="5"
                           value="<c:out value='${student.group}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Year_of_receipt(input only year): </th>
                <td>
                    <input type="text" name="Year_of_receipt" size="5"
                           value="<c:out value='${student.Year_of_receipt}' />"
                    />
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Save" />
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>