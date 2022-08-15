<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>View Listing</title>
        <link rel="stylesheet" href="/css/style.css">
    </head>
<body>
	<div class="container">

		<div class="navbar">
			<h1>${h.addres }</h1>
			<a href="/home">dashboard</a>
		</div>
		<div>
			<p>address: ${h.addres}</p>
    	<p>Listing date: ${h.createdAt}</p>
    	<p>price: ${h.price}</p>	
    </div>
    <div>
		<p>Notes: </p>
		<div
			style="height: 100px; width: 960px; overflow: auto; border: 1px solid; padding: 2%">
		
			<c:forEach items="${n}" var="n">
			<p>add by ${n.user.userName}</p>
			<p>${n.note}</p>
		</c:forEach>
    </div>
	

		</div>
    	
    	<div>
    	<p>Add Note:</p>
    	<form:form action="/join/${h.id}" method="post" modelAttribute="Note">
			<p>
				<form:label path="note">Add a note</form:label>
				<form:input path="note"/>
				<form:errors path ="note"/>
			</p>
	<div>
			<input type="submit" value="Add" >
	<c:if test="${h.user.id == u}"></c:if>
	<a href="/listings/${h.id}/edit">edit</a>
	<a href="/delete/${h.id }">delete</a>
	</div>
    	</form:form>
	</div>
</div>
</body>
</html>