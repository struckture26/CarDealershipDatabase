<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.util.*" %>    

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    <%@ page import="com.user.Employee" %>
    
<% ArrayList<Employee> employees = (ArrayList<Employee>)session.getAttribute("employees"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Confirmation</title>
</head>
<body>

<h2>Employee Confirmation</h2>

<a href="index.jsp">Main Page</a>

<c:if test="${employees != null}">
<table class="table">
  <thead>
    <tr>
      <th scope="col">Employee ID |</th><br>
      <th scope="col">First Name |</th><br>
      <th scope="col">Last Name |</th><br>

      
    </tr>
  </thead>
  <tbody>
  <c:forEach var="employee" items="${employees}">
	<tr>
  		
  		<td><c:out value="${employee.employeeID}"/></td>
  		<td><c:out value="${employee.firstName}"/></td>
  		<td><c:out value="${employee.lastName}"/></td>

  	</tr>
  </c:forEach>

  </tbody>
</table>
</c:if>

</body>
</html>