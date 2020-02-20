<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Car Dealership Vehicles Database</title>	

<link rel="sytlesheet" type="text/css" href="./styles/styles.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>

<h2>Welcome to Car Dealership Vehicles Database</h2>
<br>
<br>

Please select an option:
<br><br>


<h3>Add Entry:</h3>
<a class="btn btn-primary" href="addNewVehicleForm.jsp" role="button">Inventory</a>
<br><br>
<a class="btn btn-primary" href="addNewEmployeeForm.jsp" role="button">Employee</a>
<br><br>
<br><br>

<h3>Update Entry:</h3>
<form action="UpdateInventory" id="UpdateInventory">
<input class="btn btn-primary" type="submit" value="Inventory">
</form>
<br>
<form action="UpdateEmployee" id="UpdateEmployee">
<input class="btn btn-primary" type="submit" value="Employee">
</form>
<br><br>
<br><br>

<h3>Search Entry:</h3>
<a class="btn btn-primary" href="searchInventory.jsp" role="button">Inventory</a>
<br><br>
<a class="btn btn-primary" href="searchEmployee.jsp" role="button">Employee</a>
<br><br>
<br><br>
<h3>Reports:</h3>
<input class="btn btn-primary" type="submit" value="Reports">



</body>
</html>