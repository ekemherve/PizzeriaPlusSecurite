<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>${titre}</title>
    <link type="text/css" href="<spring:url value='/css/signup.css' />" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row bg-blue">
        <div class="card text-white bg-info">
            <div class="card-header ">Sign up</div>
            <div class="card-body ">
                <h5 class="card-title">Enter your credentials</h5>
                <div class="row">
                    <form:form method="post" action="${pageContext.request.contextPath}/signup"
                               modelAttribute="currentUser">

                        <div class="form-group">
                            <form:label path="username"><label>Username</label></form:label>
                            <form:input path="username" cssClass="form-control"></form:input>
                        </div>
                        <div class="form-row">
                            <div class="form-group col-md-6">
                                <form:label path="firstname"><label>Firstname</label></form:label>
                                <form:input path="firstname" cssClass="form-control"></form:input>
                            </div>
                            <div class="form-group col-md-6">
                                <form:label path="lastname"><label>Firstname</label></form:label>
                                <form:input path="lastname" cssClass="form-control"></form:input>
                            </div>
                        </div>

                        <div class="form-group">
                            <form:label path="email"><label>Email</label></form:label>
                            <form:input type="email" path="email" cssClass="form-control"></form:input>
                        </div>

                        <div class="form-row">
                            <div class="form-group col-md-6">
                                <form:label path="password">Password</form:label>
                                <form:password path="password" cssClass="form-control"></form:password>
                            </div>
                            <div class="form-group col-md-6">
                                <form:label path="passwordConfirmed">ConfirmPassword</form:label>
                                <form:input path="passwordConfirmed" type="password" csslass="form-control"/>
                            </div>
                        </div>

                        <button id="submitform" type="submit" class="btn btn-primary  offset-5">Submit</button>
                    </form:form>

                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>