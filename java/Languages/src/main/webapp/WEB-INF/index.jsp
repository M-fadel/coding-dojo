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
    <h1>Hello World</h1>
    <table>
        <tr>
            <th>Name</th>
            <th>Creator</th>
            <th>Version</th>
            <th>actions</th>
        </tr>
        <c:forEach items="${lang}" var="e">
        <tr>
            <td><a href="languages/${e.id}">${e.name}</a></td>
            <td>${e.creator}</td>
            <td>${e.ver}</td> 

            <td>
                <form action="/languages/${e.id}" method="post">
                    <input type="hidden" name="_method" value="delete">
                    <input type="submit" value="delete">
                </form>
            </td>
            <td>
                <form action="/languages/edit/${e.id}">
                    <input type="submit" value="edit">
                </form>
                
            </td>  
        </tr>
        </c:forEach>
    </table>
    <form:form action="languages" method="post" modelAttribute="L">
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
