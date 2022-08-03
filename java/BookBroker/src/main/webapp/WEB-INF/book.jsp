<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Book share</title>
    </head>
    <a href="/books">back to the shelves</a>
<body>
    <h1>add a book to your shelf</h1>
    <form:form action="/add" method="post" modelAttribute="book">
    <p>
    <form:label path="title">Title</form:label>
    <form:input path="title"/>
    <form:errors path="title"/>
    </p>
    <p>
    <form:label path="author">Author</form:label>
    <form:input path="author"/>
    <form:errors path="author"/>
    </p>
    <p>
    <form:label path="thoughts">Thoughts</form:label>
    <form:textarea path="thoughts"/>
    <form:errors path ="thoughts"/>
    
     <input type="submit" value="submit">
    </p>
    
    </form:form>
</body>
</html>