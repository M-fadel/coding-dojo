<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Omikuji!</title>
</head>
<body>
    <h1>Send to Omikuji!</h1>
    <form action="/send" method="POST">
        <div>
            <label for="Pick">pick a number from 5 to 25</label>
            <input type="number" name="pick" value="5" min="5" max="25">
        </div>
        <div>
            <label for="city">Enter a city</label>
            <input type="text" name="city" >
        </div>
        <div>
            <label for="name">Enter a name of any real person</label>
            <input type="text" name="name">
        </div>
        <div>
            <label for="hoppy">Enter a professional endeavor or hobby</label>
            <input type="text" name="hobby">
        </div>
        <div>
            <label for="creature">enter a name of a living thing</label>
            <input type="text" name="creature" >
        </div>
        <div>
            <label for="note">Say something nice to someone</label>
            <textarea name="note" id="" cols="30" rows="10"></textarea>
        </div>
        <p>send and show a friend</p>
        <input type="submit" value="send">
    </form>
</body>
</html>