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
<div class ="navbar">
    <h1>Project Details</h1>
<a href="/home">Back to Dashboard</a>
</div>
<div>
<p> Project: ${p.title}</p>
<p>Description: ${p.des}</p>
<p>Due date ${p.dueDate}</p>
<a href="/tasks">See tasks!</a>
</div>
</body>
</html>