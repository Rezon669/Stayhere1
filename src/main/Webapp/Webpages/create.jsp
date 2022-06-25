<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>stayhere/createaccount</title>
<link rel="stylesheet" type="text/css" href="css/create.css"/>
</head>
<body>
<body>    
    <h2>Enter your Details to Create Account</h2><br>    
    <div class="login">    
    <form id="login" method="post" action ="createaccount">   
   
        <label><b>User Name <br>    
        </b>    
        </label>    
        <input type="text" name="name" id="uname" placeholder=" Enter your username">    
        <br><br>
        <label><b>Email id     <br>
        </b>    
        </label>    
        <input type="text" name="email" id="uemail" placeholder="Enter your emailid">    
        <br><br> 
        <label><b>Phone no <br>    
        </b>    
        </label>    
        <input type="text" name="phno" id="uphno" placeholder="Enter your phone no">    
        <br><br>    
        <label><b>Password   <br>  
        </b>    
        </label>    
        <input type="Password" name="password" id="pass" placeholder=" Enter password">    
        <br><br>
<label><b>Confirm Password     
        </b>    
        </label>    
        <input type="Password" name="reenterpassword" id="repass" placeholder="Reenter password">    
        <br><br>
   <h4>Please, check once before click on Create Account</h4>
        <input type="submit" name="log" id="log" value="Create account" >
      
        <br><br>    
        <input type="checkbox" id="check">    
        <span>Remember me</span>   
    </form>     
</div>    
</body>    
</html>

