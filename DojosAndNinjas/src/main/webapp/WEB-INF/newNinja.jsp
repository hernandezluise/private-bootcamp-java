<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<!DOCTYPE html>
<html> 
<head>
<meta charset="UTF-8">
<title>Dojos and Ninjas</title>
</head>
<body>
<h1>New Ninja</h1>
<div class="form">


<form:form action="/ninjas" method="post" modelAttribute="ninja">
    <div>
        <form:label path="dojos">Dojo:</form:label>
        
        <form:select path="dojos">
        
        	<c:forEach var="eachDojo" items="${dojos}">
	        
	        	<option value="${eachDojo.id}"><c:out value="${eachDojo.dojoName}"/></option>
	        
        	</c:forEach>
        	
        </form:select>
    </div>

    <div>
        <form:label path="firstName">First Name:</form:label>
        <form:input path="firstName"/>
    </div>
    
    <div>
        <form:label path="lastName">Last Name:</form:label>
        <form:input path="lastName"/>
    </div>
    <div>
        <form:label path="age">Age:</form:label>
        <form:input path="age"/>
    </div>
    
    
    
    <input type="submit" value="Submit"/>
    
</form:form>
</div>
</body>
</html>