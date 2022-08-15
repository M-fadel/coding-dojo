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
<h1>new project</h1>
<form:form action="/edit/${Project.id}" method="post" modelAttribute="Project">
<p>
<form:label  path="title"></form:label>
<form:input  path="title"/>
<form:errors path="title"></form:errors>
</p>
<p>
<form:label  path="des"></form:label>
<form:input  path="des"/>
<form:errors path="des"></form:errors>
</p>
<p>
<form:label  path="dueDate"></form:label>
<form:input  path="dueDate" type = "date"/>
<form:errors path="dueDate"></form:errors>
</p>
<input type="submit" value="submit">
</form:form>

</body>
</html>
