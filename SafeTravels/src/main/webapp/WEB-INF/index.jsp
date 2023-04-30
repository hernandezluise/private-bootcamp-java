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
	<h1>Safe Travels</h1>
	<table class="table table-striped table-bordered">
		<thead>
			<tr>
				<th>Expense</th>
				<th>Vendor</th>
				<th>Amount</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="expense" items="${expenses}">
				<tr>
					<td><a href="/expenses/${expense.id }">${expense.expenseName}</a></td>
					<td>${expense.vendor}</td>
					<td>${expense.amount}</td>
					<td><a href="/expenses/edit/${expense.id}">edit</a>
					 <a href="/expenses/delete/${expense.id}">delete</a>
					 </td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div>
		<h1>Add an expense:</h1>
		<form:form action="/expenses/new" method="post" modelAttribute="expense">

			<div>
				<form:label path="expenseName">Expense Name: </form:label>
				<form:errors path="expenseName" />
				<form:input  path="expenseName" />
			</div>

			<div>
				<form:label path="vendor">Vendor: </form:label>
				<form:errors path="vendor"  />
				<form:input path="vendor" />
			</div>

			<div>
				<form:label path="amount">Amount: </form:label>
				<form:errors path="amount" />
				<form:input type="number step"
					path="amount" />
			</div>

			<div>
				<form:label path="description">Description: </form:label>
				<form:errors path="description"  />
				<form:textarea  path="description" />
			</div>

			<div>
				<input type="submit" value="Submit" />
			</div>

		</form:form>
	</div>
</body>
</html>