<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>HI</h1> Your Order is:
	<form>
		<c:forEach var="item" items="${orderitems}">
			<img src="/static/Images/${item}"  alt="${item}">
		</c:forEach>
	</form>

</body>
</html>