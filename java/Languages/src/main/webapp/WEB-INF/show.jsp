<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>${lang.name}</title>
    </head>
<body>
    <a href="/languages">dashboard</a>
    <p>${lang.name}</p>
    <p>${lang.creator}</p>
    <p>${lang.ver}</p>
    
                <form action="/languages/${lang.id}" method="post">
                <input type="hidden" name="_method" value="delete">
                <input type="submit" value="delete">
                </form>
                <form action="/languages/edit/${lang.id}" method="post">
                <input type="submit" value="edit">
                </form>
</body>
</html>
