<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h2>Edit Expense</h2>
    
    <form:form action="/update/${e.id}" method="post" modelAttribute="e">
        <input type="hidden" name="_method" value="put">
        <p>
            <form:label path ="EName">Name</form:label>
            <form:input path ="EName"/>
            <form:errors path ="EName"/>
        </p>
        <p>
            <form:label path ="vendore">Vendor</form:label>
            <form:errors path ="vendore"/>
            <form:input path ="vendore"/>
        </p>
        <p>
            <form:label path ="Amount">Amount</form:label>
            <form:input type="number" path ="Amount"/>
            <form:errors path ="Amount"/>
        </p>
        <p>
            <form:label path = "Des">Description</form:label>
            <form:textarea cols="30" rows="10" path = "Des"/>
            <form:errors path = "Des"/>
            
        </p>
        <input type="submit" value="Submit"/>
    </form:form>

</body>
</html>