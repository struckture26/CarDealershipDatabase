<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>

<link rel="sytlesheet" type="text/css" href="./styles/styles.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>

<h2>Enter Employee Name</h2>

<form class="container" action="AddEmployeeServlet" method="post">
<!-- <div class="form-group">
	<label for="employeeID">Employee ID</label>
	<input type="text" class="form-control" name="employeeID" id="employeeID" placeholder="Employee ID">
</div> -->

<div class="form-group">
	<label for="firstName">First Name</label>
	<input type="text" class="form-control" name="firstName" id="firstName" placeholder="First Name">
</div>

<div class="form-group">
	<label for="lastName">Last Name</label>
	<input type="text" class="form-control" name="lastName"  id="lastName" placeholder="Last Name">
</div>



<button type="submit" class="btn btn-default">Submit</button>
</form>





</body>
</html>