<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
    <title>${titre}</title>
    <link type="text/css" href="<spring:url value='/css/home.css' />" rel="stylesheet">
</head>
<body>
<div class="container">


    <div class="jumbotron">
        <h1 class="display-4 mb-5">Welcome to best Pizzaland</h1>
        <p class="lead">
            We have many pizza, from the traditional to our homemade pizza and of course your own custom pizza. Enjoy it !!
        </p>
        <hr class="my-5">

        <p class="lead">
            <a class="btn btn-primary btn-lg mt-4" href="${pageContext.request.contextPath}/pizzas" role="button">Command</a>
        </p>

        <div class="row">
            <div  style="margin: 1em auto">
                <a href="${pageContext.request.contextPath}/login" >Login</a>
                or
                <a href="${pageContext.request.contextPath}/signup" >Sign up</a>
            </div>
        </div>
    </div>

</div>
</body>
</html>