<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>output.jsp</title>
</head>

<body bgcolor="#F6358A" text="0000A0"> 

	<h1>Your first and last name is:</h1>
	
	<% 
		//GET PARAMS
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		
		//PRINT
		out.print(firstName + " " + lastName + "<br><br>");
		out.println("Very Simple: MVC pattern ;-) JavaEE " + "<br><br>");
	%>
	
	<h1>A cleaner output with lines and columns is:</h1>
	
	<%//TABLE %>
	<table>
		<tr>
			<td>First name: </td> <td><%=firstName%></td>
		</tr>	
		<tr>
			<td>Last name: </td> <td><%=lastName%></td>
		</tr>
	</table>
	

</body>
</html>