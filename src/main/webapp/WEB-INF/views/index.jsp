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
	<h1><strong>Donuts</strong></h1>
	<ul>
	<c:forEach var="donut" items="${ list }">
		<li><a href="/details?id=${ donut.id }">${ donut.name }</a></li>
	</c:forEach>
	</ul>
</body>
</html>