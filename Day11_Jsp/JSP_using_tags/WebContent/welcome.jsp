<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<h1><c:out value="${loginTitlePage}"/></h1>
<h4><c:out value="${fromServlet}"/></h4>

<ol>
<c:forEach items="${sessionScope.nameList}" var="eachName">
<li>${eachName}</li>

</c:forEach>
</ol>
<% 
out.println(session.isNew());
out.println(session.getId());
%>


</body>
</html>