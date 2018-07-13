<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="USA_amaravathi.*"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>


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
height:30px;
	 background-color: antiquewhite;
}

</style>


</head>

<body style="background-image: url('http://www.allinallsales.com/image/3.jpg')">
<div class="div">


	<%
 		Cust_Interface ci = Cust_Factory.getObj("demo");

		UserState u = UserState.Active;
		
 		if(request.getParameter("userID")==""  || request.getParameter("password")==""|| request.getParameter("firstname")==""|| request.getParameter("lastname")==""|| request.getParameter("email")==""){
			out.println("<h1>please enter valid values-  </h1>");
		}
		else{

			Customer c = new Customer (request.getParameter("userID")  , request.getParameter("password"), request.getParameter("firstname"), request.getParameter("lastname"), request.getParameter("email"), u);
			boolean b = ci.Register(c);
	 		if(b==true){
	 			out.println("<h1>  Successful  </h1>");
				out.println("<a href=\"Home.html\"> <button id=button> Successfull, go to Home  </button></a>" );
					
	 		}
	 		else{
	 			out.println("<h1>execution status - unsuccessful -- user id already exists  </h1>");
	 		}
		
		} 

	%>

</div>
</body>
</html>