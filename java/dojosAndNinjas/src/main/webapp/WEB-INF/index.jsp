<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Demo JSP</title>
    </head>
<body>
    <h1>${dojo.name}</h1>
    <table>
    <tr>
        <th>Fist name</th>
        <th>Last name</th>
        <Th>Age</Th>
    </tr>
    <tr>
        <c:forEach items="${n}" var="n">
            <td>${n.fName}</td>
            <td>${n.lName}</td>
            <td>${n.age}</td>
        </c:forEach>

    </tr>
</table>
</body>
</html>
