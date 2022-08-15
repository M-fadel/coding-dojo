<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Listing</title>
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
    <div class="container">

        <div class="navbar">
            
            <h1>Edit Listing</h1>
            <a href="/home">dashboard</a>
        </div>
        <form:form action="/${h.id}/edit" method="post"  modelAttribute="house">
            <p>
                <form:label path="addres">address</form:label>
                <form:input path="addres"/>
                <form:errors path="addres"/>
                
            </p>
            <p>
                <form:label path="price">price</form:label>
                <form:input path="price"/>
                <form:errors path="price"/>
    
    </p>
    <p>
        <form:label path="createdAt">Listing Date</form:label>
        <form:input path="createdAt"  type = "date" />
        <form:errors path="createdAt"/>
        
    </p>
    <div>
    <input type="submit" value="submit">
    
<a href="/delete/${house.id }">delete</a>
    </div>
</form:form>
</div>
</body>
</html>