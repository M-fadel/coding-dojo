<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Edit my task</title>
    </head>
<body>
<div class =navebar>
    <h1>create a task</h1>
</div>
<div class = container>
	<form:form action="/shows/${Show.id}/edit" method="post" modelAttribute="Show">
		
	<p>
	<form:label path="title">Title</form:label>
	<form:input path="title"/>
	<form:errors path = "title"/>
</p>
<p>
	<form:label path="network">Network</form:label>
	<form:input path="network"/>
	<form:errors path = "network"/>
</p>
<p>
	<form:label path="dis">Description</form:label>
	<form:textarea path="dis"/>
	<form:errors path = "dis"/>
</p>

<input type="submit" value="submit">

</form:form>
</div>
</body>
</html>	