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
<form:form action="/doorglassdesign" method="post">
	<c:forEach var="doorglassdesign" items="${doorglassdesigns}">
		<a href="/doorglasstype/${doorglassdesign.doorglassdesignid}">${doorglassdesign.doorglassdesignname}</a>
	</c:forEach>
</form:form>
</body>
</html>