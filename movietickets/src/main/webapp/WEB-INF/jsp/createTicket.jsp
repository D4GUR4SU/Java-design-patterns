<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Tickect</title>
</head>
<body>

	<form action="createTicket" method="post">
		Movie Name: <input type="text" name="movieName" />
		Screen: <input type="text" name="screenNo" />
		Seat Nº: <input type="text" name="seatNo" />
		
		<input type="submit" value="purchase" />
	</form>
	
	<p style="background-color: green;">
		${msg}
	</p>

</body>
</html>