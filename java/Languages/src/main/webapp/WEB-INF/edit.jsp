<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>languages</title>
    </head>
    <body>
    <h1>language</h1>
    <form:form action="/languages/${lang.id}" method="post" modelAttribute="lang">
        <input type="hidden" name="_method" value="put">
        <p>
            <form:label path="name">Name</form:label>
            <form:input path="name"/>
            <form:errors path="name"/>
            
        </p>
        <p>
            <form:label path ="creator">creator</form:label>
            <form:input path ="creator"/>
            <form:errors path="creator"/>
        </p>
        <p>
            <form:label path = "ver">Version</form:label>
            <form:input path = "ver"/>
            <form:errors path="ver"/>
        </p>
        <input type="submit" value="Submit">
    </form:form>
</body>
</html>
