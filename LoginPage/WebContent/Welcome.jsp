<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">

img {
	opacity: 0.5;
}

.button {
	background-color: transparent; /* Green */
	border: none;
	color: white;
	padding: 16px 32px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
	margin: 4px 2px;
	transition-duration: 0.4s;
	cursor: pointer;
	border: none;
}

.button2 {
	color: black;
	border: 2px solid #008CBA;
}

.button2:hover {
	background-color: #008CBA;
	color: white;
	box-shadow: 0 12px 16px 0 rgba(0, 0, 0, 0.24), 0 17px 50px 0
		rgba(0, 0, 0, 0.19);
}

h1 {
	color: #483d8b;
	text-align:center;
	text-transform: uppercase;
	
}

#form
{
	background-image: url("${pageContext.request.contextPath}/resources/images/hotel7.jpg");
	background-repeat: no-repeat;
	background-size:100% 200%;
}

#htab {
    
   margin: 50px 1000px 75px 10px;
  <%-- border: 1px solid black;--%>
    opacity: 0.9;
}

td {
    text-align: left;
    padding: 8px;
}

<%--tr:nth-child(odd) {background-color: #E0FFFF;}
tr:nth-child(even) {background-color: #E0FFFF;}--%>

input{
 
    padding: 8px 10px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
    align:center;
}

input[type=submit]:hover {
    background-color: #E0FFFF;
}
p  {

    color: #FFFAF0;
    font-family: verdana;
    font-size: 160%;
}
</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body id="form">
	 <h1>welcome to hotel booking management system</h1>
	<form action="frmlogin" method="post">
		<table  id="htab">
			<tr>
				<td><b>UserId</b><input type="text" name="uid" align="right" placeholder="Enter your userID"/></td>
				<td><b>Password</b><input type="password" name="pass" align="right" placeholder="Enter your password"/></td>
			</tr>
			<tr>
				<td><input type="submit" align="middle" value="Login" /></td>
			</tr>
			
		</table>
		<h3 style="color: red">${msg}</h3>
	</form>
	
<p style="position: fixed; bottom: 0; width:100%">Planning a vacation or business trip, and haven't found a hotel yet?<br/>
 Then use our web portal to find a hotel, which suits you in every way. </p>	
</body>
</html>