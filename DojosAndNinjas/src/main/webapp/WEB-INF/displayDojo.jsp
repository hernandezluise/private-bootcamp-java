<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Formatting (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true"%>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dojos and Ninjas</title>
</head>
<body>
	<h1>
		<c:out value="${dojos.dojoName }" /> Ninjas
	</h1>
	<table class="table">
		<thead>
			<tr>
				<th>First Name</th>
				<th>Last Name
				<th>Age</th>

			</tr>
		</thead>
		<tbody>
			<c:forEach var="ninja" items="${dojos.ninjas }">

				<tr>
					<td><c:out value="${ninja.firstName }" /></td>
					<td><c:out value="${ninja.lastName }"></c:out></td>
					<td><c:out value="${ninja.age }"></c:out></td>

				</tr>

			</c:forEach>

		</tbody>
	</table>
</body>
</html>