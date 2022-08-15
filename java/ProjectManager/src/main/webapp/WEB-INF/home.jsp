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
    <div class="navbar">
<div>
    
    <h1>Welcome,${s.userName}</h1>
    <a href="/logout">logout</a>
</div>
<div>
    <form action="/new/project">
    <button >+new project</button>
</form>
</div>
    </div>
<div>
<div>
    
    <p>all projects</p>
    <table>
        <tr>
            <th>project</th>
            <th>Team Lead</th>
            <th>Due Date</th>
            <th>Action</th>
        </tr>
        <c:forEach var="p" items="${without}">
            
                <c:if test="${p.user.userName!= s.userName}">
            <tr>
                <td>${p.title}</td>
                <td>${p.user.userName }</td>
                <td>${p.dueDate}</td>
                <td><a href="/join/${p.id}">join</a></td>
                
            </tr>
	                </c:if>
        </c:forEach>
            
    </table>
</div>
<div>

    <p>Your projects</p>
    
    <table>
    <tr>
        <th>project</th>
        <th>Team Lead</th>
        <th>Due Date</th>
        <th>Action</th>
    </tr>
       <c:forEach var="p" items="${with}">
            
            <tr>
            
                <td><a href ="/Project/${p.id}">${p.title}</a></td>
                <td>${p.user.userName }</td>
                <td>${p.dueDate}</td>
                <c:if test="${p.user.userName == s.userName}">
                <td><a href="/edit/${p.id}">Edit</a></td>
                </c:if>
                <c:if test="${p.user.userName != s.userName}">
                <td><a href="/leave/${p.id}">leave</a></td>
                </c:if>
                
            </tr>
        </c:forEach>
    </table>
    
</div>
</div>
</body>
</html>
