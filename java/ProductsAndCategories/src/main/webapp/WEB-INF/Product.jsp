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
    <h1>New Product</h1>
    <form:form action="/add/product" method="post" modelAttribute="Products">
    <p>
    <form:label path="name">name</form:label>
    <form:input path="name"/>
    </p>
    <p>
    <form:label path="description">Description</form:label>
    <form:input path="description"/>
    </p>
    <p>
    <form:label path="price">Price</form:label>
    <form:input path="price"/>
    </p>
    <input type="submit" value="submit">
    </form:form>
</body>
</html>