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
    <th>Posted By</th>
    <th>Actions</th>
    </tr>
    <c:forEach var="b" items="${book}" >
    <tr>
    <td>${b.id}</td>
    <td> <a href="/books/${b.id}">${b.title}</a> </td>
    <td>${b.author}</td>
    <td>${b.user.userName}</td>
    </tr>
    </c:forEach>
    </table>
</body>
</html>
