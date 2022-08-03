<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>counter</title>
</head>
<body>
    <h1>You hav visited <a href="/your_server">http://your_server/</a> <c:out value= "${count}"></c:out>
    times</h1>
    <a href="/your_server">Test another visit?</a>
</body>
</html>