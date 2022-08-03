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
      <h1>${c.name}</h1>
    <div>
    <h2>products</h2>
   	<ul>
    	<c:forEach var="i" items="${with}">
    	<li>${i.name}</li>
    	</c:forEach>
    	</ul>
    </div>
    <div>
     <form action="/catejoin/${c.id}" method="post">
    <select name ="pID">
    <c:forEach var="i" items="${without}">
    <option value="${i.id}">${i.name}</option>
    </c:forEach>
    </select>
    <input type="submit" value="add">
    </form>
    </div>
</body>
</html>