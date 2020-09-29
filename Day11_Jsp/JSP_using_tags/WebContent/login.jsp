<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<%-- <% 
String abc = (String)request.getAttribute("loginTitlePage");
out.println("Using Scriplet" + abc);

<% --%>

<% 
out.println(session.isNew());
out.println(session.getId());
%>

<h1><c:out value="${loginTitlePage}"/></h1>

<%
session.invalidate();
%> 
<a href="WelcomeServlet">WELCOME PAGE</a>
</body>
</html>