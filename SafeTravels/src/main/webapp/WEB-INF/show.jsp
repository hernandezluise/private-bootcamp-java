<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
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
<title>Safe Travels</title>
</head>
<body>
<h1>Expense Details</h1>
<p><a href="/expenses">Go back</a></p>
<table>
    <tbody>
		<tr>
			<td>Expense Name:</td>
			<td>${expense.expenseName}</td>
		</tr>
		<tr>
			<td>Expense Description:</td>
			<td>${expense.description}</td>
		</tr>
		<tr>
			<td>Vendor:</td>
			<td>${expense.vendor}</td>
		</tr>
		<tr>
			<td>Amount Spent:</td>
			<td>${expense.amount}</td>
		</tr>	
    </tbody>
</table>
</body>
</html>