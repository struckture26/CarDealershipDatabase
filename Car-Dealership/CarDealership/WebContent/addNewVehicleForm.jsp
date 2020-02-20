<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Vehicle to Inventory</title>

<link rel="sytlesheet" type="text/css" href="./styles/styles.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>

<h2>Please complete the form below:</h2>

<br><br>

<form class="container" action="AddInventoryServlet" method="post">
<div class="checkbox">
	<label>
		<input type="checkbox" name="usedVehicle" id="usedVehicle" >Used Vehicle
	</label>
</div>
<div class="form-group">
	<label for="vinNumber">VIN</label>
	<input type="text" class="form-control" name="vinNumber" id="vinNumber" placeholder="VIN">
</div>
<div class="form-group">
	<label for="year">Year</label>
	<input type="text" class="form-control" name="year" id="year" placeholder="YYYY">
</div>

<div class="form-group">
	<label for="make">Make</label>
	<input type="text" class="form-control" name="make" id="make" placeholder="Acura, Ford, Chevrolet, etc.">
</div>

<div class="form-group">
	<label for="model">Model</label>
	<input type="text" class="form-control" name="model" id="model" placeholder="TLX, F150, Cruz">
</div>

<div class="form-group">
	<label for="salePrice">Sale Price</label>
	<input type="text" class="form-control" name="salePrice" id="salePrice" placeholder="$xx,xxx.xx">
</div>
<div class="form-group">
	<label for="descriptionOfVehicle">Description</label>
	<input type="text" class="form-control" name="descriptionOfVehicle" id="descriptionOfVehicle">
</div>
<button type="submit" class="btn btn-default">Submit</button>
</form>

<form action="AddInventoryServlet"></form>

</body>
</html>