<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body {
	style =background-image: url('http://www.allinallsales.com/image/3.jpg');
	background-repeat: no-repeat;
	background-size: cover;
}

body {
	style =background-image:
		url('https://www.quietrev.com/wp-content/uploads/2015/10/Want-to-Make-Friends-Some-Ways-to-Make-Yourself-Likable_SOURCE_stocksy.jpg');
	background-repeat: no-repeat;
	background-size: cover;
}

#button {
	font-size: xx-large;
	font-weight: bolder;
	font-family: inherit;
	height: 50px;
	margin-top: 5%;
	width: 220px;
	color: darkred;
	border-radius: 20px;
	background-color: rosybrown;
}

.div {
	color: darkred;
	text-transform: uppercase;
	font-size: x-large;
	font-weight: bold;
	text-align: center;
	font-style: italic;
	font-family: cursive;
}

h2 {
	background-color: rosybrown;
}

input {
	border-radius: 20px;
	width: 300px;
	height: 30px;
	background-color: antiquewhite;
}
</style>

</head>
<body
	style="background-image: url('https://www.quietrev.com/wp-content/uploads/2015/10/Want-to-Make-Friends-Some-Ways-to-Make-Yourself-Likable_SOURCE_stocksy.jpg')">

	<div class="div">
		<h2>Update Profile</h2>



		<form action="updation.jsp">

			<br> First Name:<br> <input type="text" name="firstname"
				value=<%=session.getAttribute("fname")%>> <br> <br>
			Last Name:<br> <input type="text" name="lastname"
				value=<%=session.getAttribute("lname")%>> <br> <br>
			Email:<br> <input type="text" name="email"
				value=<%=session.getAttribute("email")%>> <br> <br>
			<input id="button" type="submit" value="UPDATE">
		</form>
<% session.setAttribute("userID",session.getAttribute("userId")); %>
		<p>Click "UPDATE" button to update Profile"</p>
	</div>
</body>
</html>