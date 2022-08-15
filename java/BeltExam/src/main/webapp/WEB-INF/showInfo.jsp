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
<div class = "navbar">
<div>
    <h1>${s.title }</h1>
</div>
<div>
<a href="/shows">back to dashboard</a>
</div>
</div>

<div class ="container">
<div>   
<p>Posted by: ${s.user.userName}</p>
<p>Network: ${s.network}</p>
<p>Description:${s.dis}</p>
<a href="/edit/${s.id}"><button>Edit</button></a>
<table>
<tr>
<th>name</th>
<th>Rating</th>
</tr>
<c:forEach var="r" items="${r}">
 <c:if test="${r.show.id==s.id }">
<tr>
<td>${r.raters }</td>
<td>${r.rating }</td>
</tr>
	 </c:if>
</c:forEach>

</table>
<form:form action="/rate/${r.id}" method="post" modelAttribute="Ratings">
<label>Leave a rating</label>	
<form:input path="rating"/>
<form:errors path ="rating"/>
<input type="submit" value="Rate!">
</form:form>
<form action="/delete/${s.id}" method="post">
<input type="hidden" name="_method" value="delete" /> 
<input type="submit" value="Delete">
</form>
</div>


</div>
    
</body>
</html>