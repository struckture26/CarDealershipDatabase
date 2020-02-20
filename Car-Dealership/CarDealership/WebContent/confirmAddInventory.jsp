<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>    
<%@ page import="com.user.Vehicle" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<% ArrayList<Vehicle> vehicles =
(ArrayList<Vehicle>)session.getAttribute("vehicles");; %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inventory</title>
</head>
<body>

<a href="index.jsp">Main Page</a>

<br><br>
<br><br>

<c:if test="${vehicles != null}">
<table class="table">
  <thead>
    <tr>
      <th scope="col">Condition |</th>
      <th scope="col">Year |</th>
      <th scope="col">Make |</th>
      <th scope="col">Model |</th>
      <th scope="col">Sale Price |</th>
      <th scope="col">Description |</th>
      
    </tr>
  </thead>
  <tbody>
  <c:forEach var="vehicle" items="${vehicles}">
	<tr>
  		
  		<td><c:out value="${vehicle.toString1()}"/></td>
  		<td><c:out value="${vehicle.year}"/></td>
  		<td><c:out value="${vehicle.make}"/></td>
  		<td><c:out value="${vehicle.model}"/></td>
  		<td><c:out value="${vehicle.salePrice}"/></td>
  		<td><c:out value="${vehicle.descriptionOfVehicle}"/></td>
  	</tr>
  </c:forEach>

  </tbody>
</table>
</c:if>

</body>
</html>