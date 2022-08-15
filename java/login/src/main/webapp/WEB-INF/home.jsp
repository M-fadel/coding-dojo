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
<div class = navebar>
    <h1>Welcome,${s.userName}</h1>
    <p>this is your dashboard. nothing to see here yet.</p>
    <a href="/logout">logout</a>
</div>
	<div class ="container">
	<table>
	<tr>
	<th>Show</th>
	<th>Network</th>
	<th>Average Rating</th>
	</tr>
	<tr>
	 	<h2>loop here</h2>
	</tr>
	
	</table>
	</div>
</body>
</html>
