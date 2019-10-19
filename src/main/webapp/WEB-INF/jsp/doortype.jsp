<!DOCTYPE HTML>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<link href="static/css/bootstrap.min.css" rel="stylesheet">
		<script src="static/js/bootstrap.min.js"></script>	
		<link href="static/css/style.css" rel="stylesheet">
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
		<link rel="stylesheet" href="plugins/bootstrap/css/bootstrap.min.css">
		<title>Welcome to Patio-Doors</title>
   </head>
  
  <body>
		<div class="row">
			<c:forEach var="doortype" items="${doortypes}">  
				<div class="col-md-4">
		  	     <a href="/doorframe/${doortype.doortypeid}"><img style="width:300px;height:300px" src="static/Images/${doortype.doortypename}.jpg" hspace=20/></a>	
			    	${doortype.doortypeid}
		      	 <h2>${doortype.doortypename}<span class="text-muted"><br>Decorate your Home.</span></h2>
			  	</div>
			</c:forEach>
		</div>
	</body>
</html>

