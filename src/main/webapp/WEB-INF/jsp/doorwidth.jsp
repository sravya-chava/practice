<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Door widths</title>
</head>
<body>
<form:form action="/doorheight" method="post">
	<c:forEach var="doorwidth" items="${doorwidths}">
		<a href="/doorheight/${doorwidth.doorwidth}">${doorwidth.doorwidth}</a>
	</c:forEach>
</form:form>
</body>
</html>