<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>The complete list</h1>
<table>
<th>
	<tr>
	<th>First Name</th>
	<th>Last Name</th>
	<th>Innovation</th>
	<th>Year</th>
	</tr>
</th>
	<c:forEach var="person" items="${ complete }">
	<tr>
		<td>${ person.firstName} </td>
		<td>${ person.lastName }</td>
		<td>${ person.innovation }</td>
		<td>${ person.year }</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>