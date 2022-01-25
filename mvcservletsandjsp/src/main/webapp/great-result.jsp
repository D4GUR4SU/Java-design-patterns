<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Great Number</title>
</head>
<body>
	<%
		int result = (Integer) request.getAttribute("great-result");
		out.println("The gratest number is: " + result);
	%>
</body>
</html>