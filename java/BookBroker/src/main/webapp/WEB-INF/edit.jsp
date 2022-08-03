<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>change your Entry</title>
    </head>
    <a href="/books">back to the shelves</a>
<body>
    <h1>a</h1>
    <form:form action="/edit/${book.id}" method="post" modelAttribute="book">
    <input type="hidden" name="_method" value="put">
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
    <input type="hidden" name="_method" value="put">
    </form:form>
</body>
</html>