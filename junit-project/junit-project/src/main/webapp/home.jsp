<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addEntry">
		<div>Add or Update a new journal entry :</div>
		<br>
		<div>Id:</div>
		<input type="text" name="id"><br>
		<div>Title:</div>
		<input type="text" name="title"><br>
		<div>Category:</div>
		<input type="text" name="category"> <br> <br> <input
			type="submit"> <br>
	</form>
	<br>
	<br>
	<form action="getEntry">
		<div>Get a specific journal entry by id :</div>
		<br> <input type="text" name="id"> <br> <br> <input
			type="submit"> <br>
	</form>
	<br>
	<br>
	<form action="getAllEntries">
		<div>Get all journal entries:</div>
		<br>
		<input type="submit">
	</form>
	<br>
	<br>
	<form action="deleteEntry">
		<div>Delete a specific journal entry by id:</div>
		<br> <input type="text" name="id"> <br> <br> <input
			type="submit"> <br>
	</form>
</body>
</html>