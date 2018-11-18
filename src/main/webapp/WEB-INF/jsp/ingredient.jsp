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
            <div class="card-header ">Encoding stock</div>
            <div class="card-body ">
                <h5 class="card-title">Register Your Ingredients</h5>
                <div class="row">
                    <form:form method="post" action="${pageContext.request.contextPath}/ingredient"
                               modelAttribute="ingredient">

                        <div class="form-group">
                            <form:label path="name"><label>Name</label></form:label>
                            <form:input path="name" cssClass="form-control"></form:input>
                        </div>
                        <div class="form-group">
                            <form:label path="stock"><label>Quantity</label></form:label>
                            <form:input path="stock" min = "1" type ="number" value = "1" cssClass="form-control"></form:input>
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