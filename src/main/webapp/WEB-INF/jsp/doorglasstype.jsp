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
<form:form action="/doorglasstype" method="post">
	<c:forEach var="doorglasstype" items="${doorglasstypes}">
		<a href="/doorglasscoating/${doorglasstype.doorglasstypeid}">${doorglasstype.doorglasstypename}</a>
	</c:forEach>
</form:form>
</body>
</html>