<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Demo JSP</title>
        <link rel="stylesheet" href="/css/style.css">
    </head>
<body>
    <table class="table">
        <tr>
            <th>id</th>
            <th>title</th>
            <th>language</th>
            <th>#Pages</th>
        </tr>
        <c:forEach items="${books}" var="b">
        <tr>
				
                <td>${b.id}</td>
                <td>${b.title}</td>
                <td>${b.language}</td>
                <td>${b.numberOfPages}</td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
