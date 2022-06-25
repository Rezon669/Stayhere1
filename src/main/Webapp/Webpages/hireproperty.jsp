<%@page import="com.stayhere.app.Rentproperty" %>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>hire-property</title>
<link rel="stylesheet" type="text/css" href="css/hireproperty.css"/>
</head>
<body>

<h2>Available Properties for Rent/Lease</h2><br>

<p><a  href="/home"> Click here </a>to go back to home page <br></br></p>

<table border="2">

		<th>Name</th>
		<th>Phone no</th>
		<th>Email</th>
		<th>Property type</th>
		<th>Structure</th>
		<th>Maintanence charges</th>
		<th>Drinking water</th>
		<th>Normal water</th>
		<th>Parking facility</th>
		<th>Electricity</th>
		<th>Amount</th>
		<th>Description</th>
		<th>Dr no</th>
		<th>Area</th>
		<th>City</th>
		<th>State</th>
		<th>Country</th>
		<th>Pincode</th>
 <%
 List<Rentproperty> s = (List<Rentproperty>)request.getAttribute("rlist");
 for(int c=0; c<s.size(); c++){
	 out.print("<tr> ");
	 out.print("<td>"+ s.get(c).getName() + "</td>");
	 out.print("<td>"+ s.get(c).getPhno() + "</td>");
	 out.print("<td>"+ s.get(c).getEmail() + "</td>");
	 out.print("<td>"+ s.get(c).getPropertytype() + "</td>");
	 out.print("<td>"+ s.get(c).getStructure() + "</td>");
	 out.print("<td>"+ s.get(c).getMaintaincharges() + "</td>");
	 out.print("<td>"+ s.get(c).getDrinkingwater() + "</td>");
	 out.print("<td>"+ s.get(c).getNormalwater() + "</td>");
	 out.print("<td>"+ s.get(c).getParking() + "</td>");
	 out.print("<td>"+ s.get(c).getElectricity() + "</td>");
	 out.print("<td>"+ s.get(c).getRentamount() + "</td>");
	 out.print("<td>"+ s.get(c).getDescription() + "</td>");
	 out.print("<td>"+ s.get(c).getDoorno() + "</td>");
	 out.print("<td>"+ s.get(c).getArea() + "</td>");
	 out.print("<td>"+ s.get(c).getCity() + "</td>");
	 out.print("<td>"+ s.get(c).getState() + "</td>");
	 out.print("<td>"+ s.get(c).getCountry() + "</td>");
	 out.print("<td>"+ s.get(c).getPincode() + "</td>" );
	 
	 out.print(" <tr>");
	
 }

 %>
 

</body>
</html>