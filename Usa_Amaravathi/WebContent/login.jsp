<%@page import="org.apache.jasper.tagplugins.jstl.core.Param"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="USA_amaravathi.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Login Page </title>

<style type="text/css">
body {
	style=background-image: url('http://www.allinallsales.com/image/3.jpg');
	background-repeat: no-repeat;
	background-size: cover;
}
body {
	style =background-image: url('https://www.quietrev.com/wp-content/uploads/2015/10/Want-to-Make-Friends-Some-Ways-to-Make-Yourself-Likable_SOURCE_stocksy.jpg');
	background-repeat: no-repeat;
	background-size: cover;
}
#button{font-size: xx-large;
    font-weight: bolder;
    font-family: inherit;
    height: 50px;
    margin-top : 5%;
    width: 220px;
	color: darkred;
	border-radius: 20px;
	background-color: rosybrown;
    }
.div 	{
	color: darkred;
	text-transform: uppercase;
	font-size: x-large;
	font-weight : bold;
	text-align: center;
	font-style: italic;
	font-family: cursive;
	
}

h2{
background-color: rosybrown;
 
}
input {
border-radius: 20px;
width:300px;
height:35px;
	 background-color: antiquewhite;
	 color: darkred;
	text-transform: uppercase;
	font-size: x-large;
	font-weight : bold;
	text-align: center;
	font-style: italic;
	font-family: cursive;
	
}

</style>

</head>

<body style="background-image: url('https://www.quietrev.com/wp-content/uploads/2015/10/Want-to-Make-Friends-Some-Ways-to-Make-Yourself-Likable_SOURCE_stocksy.jpg')">
<div class="div">
	<%
	
	
	if(request.getParameter("userID")=="" || request.getParameter("password")==""){

			out.println("<h1> input should not be empty </h1>");	

	}
	else{
		Cust_Interface ci = Cust_Factory.getObj("demo");


		
		boolean b = ci.validateUser(request.getParameter("userID"), request.getParameter("password"));
		
 		if(b==true){
 			out.println("<h1> Successfully logged in </h1>" );	
 			 out.println("<a href=\"profile.jsp\" > <input id = \"button \" type=\"submit\" value=\"View Profile\"></a>" ); 
 			//out.println("<form   action=\"profile.jsp\">  <input type=\"hidden\" name=\"userId\" value  = "  + "${Param.userID} "+ " ><input type=\"submit\" value=\"View Profile\"> </form>" );
 			String name=request.getParameter("userID");
			session.setAttribute("Name",name);	
 		
 		}
 		else
 		{
 			out.println("<h1> No user With specified Userid or Password, please register by clicking following register button  </h1>" );	
 			out.println("<a href=\"Index.html\" > <input type=\"submit\" value=\"Register\"></a>" );
 		}

	}
 				
	%>

</div>
</body>
</html>