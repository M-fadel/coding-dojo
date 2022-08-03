<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Read share</title>
    </head>
<body>
    <a href="/logout">logout</a>
    <p>Hello,${s.userName}. Welcome to..</p>
    <h1>The Book Broker</h1>
    <a href="/add">add a book to my shelf</a>
    <p>Books from everyone's shelves.</p>
    <table>
    <tr>
    <th>ID</th>
    <th>Title</th>
    <th>Author Name</th>
    <th>owned By</th>
    <th>Actions</th>
    </tr>
    
    <c:forEach var="b" items="${book}" >
    <c:if test="${ b.bUser.id !=s.id}">
    <tr>
    	<td>${b.id}</td>
    	<td> <a href="/books/${b.id}">${b.title}</a> </td>
    	<td>${b.author}</td>
    	<td>${b.user.userName}</td>
    	<c:if test="">
    	</c:if>
    	<c:choose>
    		<c:when test="${s.id == b.user.id}">
    			<td>
    				<a href="/edit/${b.id}">edit</a>
    				<a href="/delete/${b.id}">delete</a>
    			</td>
    		</c:when>    
    		<c:otherwise>
    		<td>
      	  <a href="/borrow/${b.id}">borrow</a>
    			</td> 
    		</c:otherwise>
		</c:choose>
    </tr>
    </c:if>
    </c:forEach>
    </table>
    
    
    <table>
    <tr>
    <th>ID</th>
    <th>Title</th>
    <th>Author Name</th>
    <th>owned By</th>
    <th>Actions</th>
    </tr>
     <c:forEach var="b" items="${book}" >
    <c:if test="${ b.bUser.id ==s.id}">
    <tr>
    	<td>${b.id}</td>
    	<td> <a href="/books/${b.id}">${b.title}</a> </td>
    	<td>${b.author}</td>
    	<td>${b.user.userName}</td>
    			<td>
    				<a href="/return/${b.id}">return</a>
    			</td>
    </tr>
    </c:if>
    </c:forEach>
    
    </table>
    
</body>
</html>
