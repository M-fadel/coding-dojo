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
            <tr>
                
                <p>loop here</p>
            </tr>
            
    </table>
</div>
<div>

    <p>Your projects</p>
    <table>
        <th>project</th>
        <th>Team Lead</th>
        <th>Due Date</th>
        <th>Action</th>
    </table>
</div>
</div>
</body>
</html>
