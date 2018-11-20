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
<h1>The short list</h1>
<table>
<th>
	<tr>
		<th scope="col">Name</th>
		<th scope="col">Invented</th>
		<th scope="col">Year</th>
	</tr>
</th>
			<c:forEach var="person" items="${ tiny }">
				<tr>
					<td>${ person.name} </td>
					<td>${ person.invented }</td>
					<td>${ person.year }</td>
				</tr>
			</c:forEach>
</table>

</body>
</html>