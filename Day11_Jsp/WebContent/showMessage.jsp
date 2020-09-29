<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- Scirplet --%>
<% out.println("Welcome to JSP") ; %>
<%-- declaration --%>
<%! String city = "Pune"; %>
<% out.println("Welcome to" + city); %>

<% double marks = 90; %>
<%-- expression --%>
<%=marks %>
</body>
</html>