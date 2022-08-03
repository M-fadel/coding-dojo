<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>languages</title>
    </head>
    <body>
    <h1>Hello World</h1>
    <table>
        <tr>
            <th>Name</th>
            <th>Creator</th>
            <th>Version</th>
            <th>actions</th>
        </tr>
        <c:forEach items="${lang}" var="e">
        <tr>

            <td>${e.name}</td>
            <td>${e.creator}</td>
            <td>${e.ver}</td>
        </tr>
        </c:forEach>
    </table>
    <form:form action="/languages" method="post" modelAttribute="L">
    	<form:label path="name">Name: </form:label>
    	<form:input path="name"/>
        <input type="submit" value="Submit"/>
    </form:form>
   
 

</body>
</html>
