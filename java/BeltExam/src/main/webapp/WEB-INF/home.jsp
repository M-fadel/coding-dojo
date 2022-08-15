<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Project manager dashboard</title>
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
	<c:forEach var="show" items="${show}">
	<tr>
	 	<td><a href="shows/${show.id}">${show.title}</a></td>
	 	<td>${show.network}</td>
	</tr>
	</c:forEach>
	
	</table>
	<a href="/Shows/new"><button>add a show</button></a>
			
	</div>
</body>
</html>
