<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="/doorhandlecolor" method="post">
	<c:forEach var="doorhandlecolor" items="${doorhandlecolors}">
		<a href="/predrill/${doorhandlecolor.doorhandlecolorid}">${doorhandlecolor.doorhandlecolorname}</a>
	</c:forEach>
</form:form>
</body>
</html>