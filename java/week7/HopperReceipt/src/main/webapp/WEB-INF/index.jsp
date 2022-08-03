<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<head>
 <meta charset="UTF-8">
<title>First JSP</title>
</head>
<body>
<h1>Customer Name: <c:out value= "${name}"/></h1>
<p>item name: <c:out value= "${item}"/></p>
<p>price: <c:out value= "${price}"/></p>
<p>Description: <c:out value= "${des}"/></p>
<p>Vendor: <c:out value= "${ven}"/></p>
</body>
</head>
