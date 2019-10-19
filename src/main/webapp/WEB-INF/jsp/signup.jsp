<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up</title>
  <jsp:include page="/WEB-INF/jsp/common/header.jsp" />
</head>
<body data-spy="scroll" data-target=".navbar-fixed-top">
<div class="container">
    <div class="row main">
        <div class="panel-heading">
            <div class="panel-title text-center">
                <h1 class="title">Sign Up</h1>
                <hr />
            </div>
        </div>
        <div class="main-login main-center">
            <form:form class="form-horizontal" method="post" action="signup" modelAttribute="user">
            <input type="hidden" name="person" value="${person}"/>
                <div class="form-group">
                    <label for="firstName" class="cols-sm-2 control-label">First Name</label>
                    <div class="cols-sm-10">
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                            <form:input class="form-control" value="${user.firstName}" id="firstName" path="firstName"  placeholder="Enter your first name" required="required"/>
                        </div>
                    </div>
                </div>

                <div class="form-group">
                    <label for="lastName" class="cols-sm-2 control-label">Last Name</label>
                    <div class="cols-sm-10">
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
                            <form:input class="form-control" value="${user.lastName}" id="lastName" path="lastName"  placeholder="Enter your last name" required="required"/>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <label for="phone" class="cols-sm-2 control-label">Phone</label>
                    <div class="cols-sm-10">
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-phone fa" aria-hidden="true"></i></span>
                            <form:input class="form-control" value="${user.phone}" id="phone" name="phone" path="phone"  placeholder="xxx-xxx-xxxx" required="required"/>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <label for="email" class="cols-sm-2 control-label">Your Email</label>
                    <c:if test="${emailExists}">
                           <span class="bg-danger pull-right">Email already exists</span>
                    </c:if>
                    <div class="cols-sm-10">
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
                            <form:input class="form-control" value="${user.email}" id="email" path="email"  placeholder="Enter your Email" required="required"/>
                        </div>
                    </div>
                    <c:if test="${(person == 'distributor') || (person == 'directdealer') ||(person=='indirectdealer')}">
	                    <div class="form-group">
	                    <label for="mailingaddress" class="cols-sm-2 control-label">Your Mailing Address</label>
	                    <div class="cols-sm-10">
	                        <div>
	                            <span class="input-group-addon"><i aria-hidden="true"></i></span>
	                            <form:input class="form-control input-group" value="${user.mailingstreet}" id="mailingstreet" path="mailingstreet"  placeholder="Enter your Mailing Street" required="required"/>
	                        </div>
	                        <div>
	                            <form:input class="form-control" value="${user.mailingapt}" id="mailingapt" path="mailingapt"  placeholder="Enter your Mailing Apt" required="required"/>
	                        </div>
	                        <div>
	                            <form:input class="form-control" value="${user.mailingcity}" id="mailingcity" path="mailingcity"  placeholder="Enter your Mailing City" required="required"/>
	                            <form:input class="form-control" value="${user.mailingstate}" id="mailingstate" path="mailingstate"  placeholder="Enter your Mailing State" required="required"/>
	                        	<form:input class="form-control" value="${user.mailingstreet}" id="mailingzipcode" path="mailingzipcode"  placeholder="Enter your Mailing Zipcode" required="required"/>
	                        </div>
	                    </div>
	                    </div>
                    	<div class="checkbox">
                            <label>
                                <input id="isshippingaddress" type="checkbox" onclick="showme('shipping')"/>Check if Shipping address is same as mailing address?
                            </label>
                        </div>
                    <div class="form-group" id="shipping">
	                    <label for="shippingaddress" class="cols-sm-2 control-label">Your Shipping Address</label>
	                    <div class="cols-sm-10">
	                        <div class="input-group">
	                            <span class="input-group-addon"><i aria-hidden="true"></i></span>
	                            <form:input class="form-control" value="${user.shippingstreet}" id="shippingstreet" path="shippingstreet"  placeholder="Enter your shipping Street" required="required"/>
	                        </div>
	                        <div>
	                            <form:input class="form-control" value="${user.shippingapt}" id="shippingapt" path="shippingapt"  placeholder="Enter your shipping Apt" required="required"/>
	                        </div>
	                        <div>
	                            <form:input class="form-control" value="${user.shippingcity}" id="shippingcity" path="shippingcity"  placeholder="Enter your shipping City" required="required"/>
	                        </div>
	                        <div>
	                            <form:input class="form-control" value="${user.shippingstate}" id="shippingstate" path="shippingstate"  placeholder="Enter your shipping State" required="required"/>
	                        </div>
	                        <div>
	                        	<form:input class="form-control" value="${user.shippingstreet}" id="shippingzipcode" path="shippingzipcode"  placeholder="Enter your shipping Zipcode" required="required"/>
	                        </div>
	                    </div>
	                 </div>
	                 
                    </c:if>
                </div>
                <div class="form-group">
                	<c:if test="usernameExists">
                	<span class="bg-danger pull-right">Username already exists</span>
                	</c:if>
                    <label for="username" class="cols-sm-2 control-label">Username</label>
                    <div class="cols-sm-10">
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-users fa" aria-hidden="true"></i></span>
                            <form:input class="form-control" value="${user.username}" id="username" path="username"  placeholder="Enter your Username" required="required"/>
                        </div>
                    </div>
                </div>

                <div class="form-group">
                    <label for="password" class="cols-sm-2 control-label">Password</label>
                    <div class="cols-sm-10">
                        <div class="input-group">
                            <span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
                            <form:password class="form-control" path="password" id="password" placeholder="Enter your Password" required="required"/>
                        </div>
                        <div class="checkbox">
                            <label>
                                <input id="showPassword" type="checkbox" />Show Password
                            </label>
                        </div>
                    </div>
                </div>

                <div class="form-group ">
                    <button type="submit" class="btn btn-primary btn-lg btn-block login-button">Create!</button>
                </div>
                
                <hr />
                
				<div class="form-group ">
                    <a  class="btn btn-info btn-lg btn-block login-button" href="/">Cancel</a>
                </div>
                
                <script type="text/javascript">
					function showme(shipping){
						document.getElementById('shipping').display=none;
					}
                </script>
            </form:form>
        </div>
    </div>
</div>
</body>
</html>	