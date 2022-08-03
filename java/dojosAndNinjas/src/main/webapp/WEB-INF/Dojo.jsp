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
    <h1>Hello World</h1>
    <form:form action = "/create" method="post" modelAttribute = "dojo">
    <p>
        <form:label path = "name"> Name</form:label>
        <form:errors path = "name"/>
        <form:input path = "name"/>
        <input type="submit" value="create">
    </p>
    
    </form:form>
</body>
</html>
