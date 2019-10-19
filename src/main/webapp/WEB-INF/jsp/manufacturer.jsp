<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Manufacturer</title>

  <!-- Bootstrap core CSS -->
  <link href="/static/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="/static/css/shop-homepage.css" rel="stylesheet">
  <jsp:include page="/WEB-INF/jsp/common/header.jsp" />

</head>

<body>
  <div class="container">
    <div class="row">
      <div class="col-lg-4">
        <h1 class="my-6"></h1>
        <div class="list-group">
          </br>
          </br>
          </br>
          </br>
          <a href="/signup?person=salesmanager" class="list-group-item">Sales Manager</a>
          <a href="/signup?person=salesperson" class="list-group-item">Sales Person</a>
          <a href="/signup?person=distributor" class="list-group-item">Distributor</a>
          <a href="/signup?person=directdealer" class="list-group-item">Direct Dealer</a>
          <a href="/products" class="list-group-item">Products</a>
        </div>
     </div>
    </div>
  </div>
<div class="m 0"><jsp:include page="/WEB-INF/jsp/common/footer.jsp" /></div>
</body>

</html>
