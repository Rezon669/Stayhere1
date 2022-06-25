<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Thankyou</title>
<link rel="stylesheet" type="text/css" href="css/thankyou.css"/>
</head>
<body>
<h2>Thank you <%= request.getParameter("name") %>...! your details are recorded...</h2>
<h2><a  href="/home"> Click here  </a>to go back to home page <br></br></h2>
</body>
</html>