<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="include/importTags.jsp"%>
<%--<%@include file="include/importLinks.jsp.jsp"%>--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
    <title>${titre}</title>
    <link type="text/css" href="<spring:url value='/css/signup.css' />" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-lg-6">
            <form:form method="post" action="${pageContext.request.contextPath}/indcription" modelAttribute="currentUser">
                <div class="form-group">
                    <form:label path="username"><label>Username</label></form:label>
                    <form:input path="username" cssClass="form-control"></form:input>
                </div>
                <div class="form-group">
                    <form:label path="firstname"><label>Firstname</label></form:label>
                    <form:input path="firstname" cssClass="form-control"></form:input>
                </div>
                <div class="form-group">
                    <form:label path="lastname"><label>Firstname</label></form:label>
                    <form:input path="lastname" cssClass="form-control"></form:input>
                </div>
                <div class="form-group">
                    <form:label path="email"><label>Email</label></form:label>
                    <form:input type = "email" path="email" cssClass="form-control"></form:input>
                </div>
                <div class="form-group">
                    <form:label path="password">Password</form:label>
                    <form:password path="password" cssClass="form-control"></form:password>
                </div>
                <div class="form-group">
                    ConfirmPassword
                    <input type="password" class="form-control" />
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form:form>
        </div>

    </div>

</div>
</body>
</html>
</div>
</body>
</html>