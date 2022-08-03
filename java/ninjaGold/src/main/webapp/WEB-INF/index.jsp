<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Ninja gold</title>
<link rel="stylesheet" href="/css/style.css">

</head>
<body>
	<div class="wrapper">
		<div>
			<p>your Gold</p>
			<input type="text" value=<c:out value= "${yourGold}"></c:out>>
		</div>
		<div class="questList">
			<div class=quest>
				<form action="/addGold" class="card" method="post">

					<input type="hidden" name="quest" value=farm>
					<p>farm</p>
					<p>earns 10-20 gold</p>
					<input type="submit" value="Find gold">
				</form>
			</div>
			<div class=quest>
				<form action="/addGold" class="card" method="post">

					<input type="hidden" name="quest" value="cave">
					<p>cave</p>
					<p>earns 10-20 gold</p>
					<input type="submit" value="Find gold">

				</form>
			</div>
			<div class=quest>
				<form action="/addGold" class="card" method="post">

					<input type="hidden" name="quest" value="house">
					<p>house</p>
					<p>earns 10-20 gold</p>
					<input type="submit" value="Find gold">
				</form>
			</div>
			<div class=quest class="card">
				<form action="/addGold" method="post">

					<input type="hidden" name="quest" value="gamble">
					<p>Casino</p>
					<p>earns 0-50 gold</p>
					<input type="submit" value="Find gold">

				</form>
			</div>
		</div>

		<div
			style="height: 100px; width: 960px; overflow: auto; border: 1px solid; padding: 2%">
		<p>Activities:</p>
			<c:forEach items="${logg}" var="log">
				<p>${log}</p>
			</c:forEach>


		</div>



	</div>
</body>
</html>