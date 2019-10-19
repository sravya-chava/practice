<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Door Frames</title>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<link href="static/css/bootstrap.min.css" rel="stylesheet">
		<script src="static/js/bootstrap.min.js"></script>	
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
		<link rel="stylesheet" href="plugins/bootstrap/css/bootstrap.min.css">
	</head>
	<body>
		<div class="row">
			<c:forEach var="doorframe" items="${doorframes}">${doorframe.doorframeid}
				<div class="col-md-3">
					<a href="/doorwidth/${doorframe.doorframeid}"><img src="/static/Images/${doorframe.doorframename}" hspace=20></a>
				</div>
			</c:forEach>
		</div>
	</body>
</html>