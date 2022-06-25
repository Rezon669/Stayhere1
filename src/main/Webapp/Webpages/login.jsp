<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>stayhere-login</title>
<link rel="stylesheet" type="text/css" href="css/login.css"/>

</head>
<body>

 
<h2>Login Page</h2><br>    
    <div class="login">    
    <form id="login" method="post" action="loginvalidation">    
        <label><b>User Name <br>    
        </b>    
        </label>    
        <input type="text" name="name" id="Uname" placeholder=" Enter you username" autofocus>    
        <br><br>    
        <label><b>Password <br>    
        </b>    
        </label>    
        <input type="Password" name="password" id="Upass" placeholder=" Enter your password">    
     
   <br><br> 
   
 <input type="checkbox" id="check">    
        <span>Remember me</span>    
        <br><br>
  <input type ="submit" name ="log" id="log" value="Log in">     
   <br>    
<a id="link" href="/create">Create account</a>
    <br>
    <br>

<a id="link" href="/forgotpassword"> Forgot Password</a>    


    </form> 
    </div>              
</body>
</html>