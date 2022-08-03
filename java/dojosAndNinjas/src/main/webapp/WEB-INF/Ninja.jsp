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
    <h1>Hello World</h1>
    <form:form action="/ninjas/create" method="post" modelAttribute = "ninja">
        <p>
            <p>${dojo}</p>
            <form:select path = "dojo">
            
                <c:forEach  var="dojo" items="${dojo}">
                    <form:option value="${dojo.id}" path="dojo">
                <c:out value="${dojo.name}"/>
                </form:option>

                </c:forEach>
            </form:select>
        <p>
            <form:label path = "fName"> First Name</form:label>
            <form:errors path = "fName"/>
            <form:input path = "fName"/>
            
        </p>
        <p>
            <form:label path = "lName"> Last Name</form:label>
            <form:errors path = "lName"/>
            <form:input path = "lName"/>
            
        </p>
        <p>
            <form:label path = "age"> Age</form:label>
            <form:errors path = "age"/>
            <form:input path = "age"/>
        </p>
        <input type="submit" value="create">
    </form:form>
</body>
</html>
