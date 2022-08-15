<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
    <head>
		<link rel="stylesheet" href="/css/style.css">
        <meta charset="UTF-8">
		
        <title>House hunter dashboard</title>
    </head>
<body>
	<div class ="container">
<div class = navbar>
    <h1>Welcome,${s.userName}</h1>
    <a href="/logout">logout</a>
</div>
<div>
<h2>List of available houses.</h2>

		<table>
			<tr>
				<th>address</th>
				<th>Listed on</th>
				<th>added by</th>
				<th>price</th>
			</tr>
			<c:forEach var="h" items="${h }">
				<tr>
					<td> <a  href="/listings/${h.id}"> ${h.addres}</a></td>
					<td>${h.createdAt}</td>
					<td>${h.user.userName}</td>
					<td>${h.price}</td>
				</tr>
			</c:forEach>
			
		</table>
	</div>
	<a href="/listting/new"> <button class="button">add a list</button></a>
</div>
</body>
</html>
