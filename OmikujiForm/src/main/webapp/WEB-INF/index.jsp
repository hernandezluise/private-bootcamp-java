<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">

<html>
<head>
<meta charset="UTF-8">
<title>Omikuji Form</title>
</head>
<body>
	<h1>Send an Omikuji</h1>
	
	<form class="form-control" action="/processForm" method="post">
	
	<div>
		<label> Pick any number from 5 to 25:</label>
		<input type="number" name="number"/> 
	</div>
	<div>
		<label> Enter the name of any city:</label>
		<input type="text" name="cityName">
	</div>
	<div>
		<label>Enter the name of any real person:</label>
		<input type="text" name="personName" />
	</div> 
	<div>
		<label>Enter professional endeavor or hobby:</label>
		<input type="text" name="professionalHobby"/>
	</div>
	<div>
		<label>Enter any type of living thing:</label>
		<input type="text" name="livingThing"/>
	</div>
	<div>
		<label>Say something nice to someone: </label> </br>
		<textarea name="message" cols="30" rows="15"></textarea>
	</div>
	
		<p>Send and show a friend! </p>
		
		<input type="submit" value="Send" />
	</form>
</body> 
</html>  