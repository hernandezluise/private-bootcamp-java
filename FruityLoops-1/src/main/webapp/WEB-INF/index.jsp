<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fruity Loops</title>
</head>
<body>
	
	<h1>Fruit Store</h1>
	
	<div>
		<table>
		<tr>
			<th> Name </th>
			<th> Price </th>
			
		</tr>
		
		<c:forEach var="fruit" items="${fruits}">
<%-- 			<c:if test="${ fruit.name.indexOf("G") != -1 }" >  --%>

			<tr>
				<td> ${fruit.name } </td>
				<td> ${fruit.price } </td>
			</tr>

<%-- 			<c:out value="${fruit.name.indexOf("G") }"></c:out>  --%>
<%-- 			</c:if> --%>
		</c:forEach>
		</table>
	</div>
</body>
</html> 