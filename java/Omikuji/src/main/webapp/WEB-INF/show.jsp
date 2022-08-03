<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <div>
        
        <p>in <c:out value= "${number}"></c:out> years, you will live in 
        <c:out value= "${City}"></c:out> with<c:out value= "${name}"></c:out>
        as your roommate, selling <c:out value= "${hobby}"></c:out> for a living 
        the next time you see <c:out value= "${name}"></c:out>you will have good luck
        also, <c:out value= "${note}"></c:out>
</p>.<c:out value= "${note}"></c:out>
    </div>
    <div><a href="/omikuji ">go back</a></div>
</body>
</html>