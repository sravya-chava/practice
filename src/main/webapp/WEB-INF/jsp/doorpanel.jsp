<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Door Panel</title>
</head>
<body>
<form:form action="/doorpanel" method="post">
	<c:forEach var="doorpanel" items="${doorpanels}">
		<a href="/doorhanding/${doorpanel.doorpanelid}">${doorpanel.doorpanelname}</a>
	</c:forEach>
</form:form>
</body>
</html>