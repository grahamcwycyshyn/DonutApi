<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1><strong>Donut</strong></h1>
	<p>Name: ${ details.name }</p>
	<p>Calories: ${ details.calories }</p>
	<p>Extras:
	<ul>
	<c:forEach var="extra" items="${ details.extras }">
		<li>${ extra }</li>
	</c:forEach>
	</ul>
	</p>
	<p><a href="/">Back to list</a></p>
</body>
</html>