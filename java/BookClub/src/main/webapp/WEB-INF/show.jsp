<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Read Share</title>
        
    </head>
<body>
<a href="/books">back to the shelves</a>
    <h1>${book.title}</h1>
    <p>${book.user.userName} read ${book.title} by ${book.author}</p>
    <p>hear are ${book.user.userName}'s thoughts:</p>
    <p>${book.thoughts}</p>
</body>
</html>