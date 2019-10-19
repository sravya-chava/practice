<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>Log In</title>
	 <jsp:include page="/WEB-INF/jsp/common/header.jsp"></jsp:include>    
</head>
<body>
<!-- Login Section -->
    <img class="img-responsive" src="/static/Images/banner.png" alt="banner"/>
    <div class="container">
        <div class="row ">
            <div class="main-center ">
            	<c:if test="${param.error}">
            		<h1>Invalid username and secret.</h1>
            	</c:if>
              
                <form class="form-signin" action="login" method="post">
                    <h2 class="form-signin-heading">Please sign in</h2>
                    <div class="form-group">
                        <label for="username" class="sr-only">Username</label>
                        <input type="text" roleId="username" class="form-control" placeholder="Username" name="username"
                               id="username"
                               required="required" autofocus="autofocus"/>
                    </div>
                    <div class="form-group">
                        <label for="password" class="sr-only">Password</label>
                        <input type="password" roleId="inputPassword" class="form-control" placeholder="Password"
                               id="password"
                               name="password" required="required"/>
                    </div>
                    <div class="form-group">
                        <input type="checkbox" name="remember-me" id="remember-me"/> &nbsp; Remember me
                    </div>
                    <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
                </form>
                <hr />     
                <div class="form-group ">
                    <a type="submit" class="btn btn-info btn-lg btn-block login-button" href="/signup">Sign up!</a>
                </div>
            </div>
        </div>
    </div>
</body>
</html>