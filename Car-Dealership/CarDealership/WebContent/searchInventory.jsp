<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Inventory</title>
</head>
<body>

Please select an option:

<br><br>

<h3>Show All, New or Used</h3>

<form class="container" action="ShowInventoryServlet" method="post">
<div class="form-check">
  <input class="form-check-input" type="radio" name="newORused" id="New" value="New" checked>

  <label class="form-check-label" for="New">
    New
  </label>
</div>
<div class="form-check">
  <input class="form-check-input" type="radio" name="newORused" id="Used" value="Used">
  <label class="form-check-label" for="Used">
    Used
  </label>
</div>
<div class="form-check">
  <input class="form-check-input" type="radio" name="newORused" id="All" value="All">
  <label class="form-check-label" for="All">
   All
  </label>
</div>
<br><br>
<div class="form-group">
	<label for="searchInput">Input a search parameter(may also leave blank)</label>
	<input type="text" class="form-control" name="searchInput" id="searchInput" placeholder="ie: color">
</div>
<br><br>
<br><br>
<button type="submit" class="btn btn-default">Submit</button>
</form>

<form action="ShowInventoryServlet"></form>




</form>
</body>
</html>