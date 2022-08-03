<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>PokeBook</title>
    </head>
<body>
    <table>
        <tr>
            <th>Expense</th>
            <th>Vendor</th>
            <th>Amount</th>
        </tr>
        
            <!-- <p>${allExpenses.get(1)}</p> -->
            <c:forEach items="${allExpenses}" var="e">
                <tr> 
                        <td><a href="/show/${e.id}">${e.EName}</a></td>
                        <td>${e.vendore}</td>
                        <td>${e.amount}</td>
                        <td><a href="/edit/${e.id}">Edit</a></td>
                        <td>
                            <form action="/delete/${e.id}" method="post">
                                <!-- <input type="hidden" name="_method" value="delete"> -->
                                <input type="submit" value="Delete">
                            </form>
                    </td>
                    </tr>
                </c:forEach>
        
    </table>
    <h2>Track an Expense</h2>
    <form:form action="/add" method="post" modelAttribute="Expense">
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
            <form:label path = "des">Description</form:label>
            <form:textarea cols="30" rows="10" path = "des"/>
            <form:errors path = "des"/>
            
        </p>
        <input type="submit" value="Submit"/>
    </form:form>

    <!-- <form action="/add" method="POST">
        <div>
            <label for="Name">Expense Name: </label>
            <input type="text" name="Name">
        </div>
        <div>
            <label for="Vendor">Vendor: </label>
            <input type="text" name="Vendor">
        </div>
        <div>
            <label for="Amount">Amount</label>
            <input type="number" name="Amount" value="0">
        </div>
        <div>
            <label for="des">Description: </label>
            <textarea name="des" cols="30" rows="10"></textarea>
        </div>
        <input type="submit" value="add">
    </form> -->
</body>
</html>
