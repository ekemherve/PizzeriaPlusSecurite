<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
    <title>${titre}</title>
    <link type="text/css" href="<spring:url value='/css/login.css' />" rel="stylesheet">
</head>
<body>

<div class="container">
    <div class="row" id="pwd-container">
        <div class="col-md-4"></div>

        <div class="col-md-4">
            <section class="login-form">
                <form:form method="post" modelAttribute="user" role="login">
                    <img src="http://i.imgur.com/RcmcLv4.png" class="img-responsive" alt="" />
                    <form:input path="username" placeholder="Email" cssClass="form-control input-lg" />

                    <form:password path="password" class="form-control input-lg" placeholder="Password" required="true" />

                    <button type="submit" name="go" class="btn btn-lg btn-primary btn-block">Sign in</button>
                    <div>
                        <a href="${pageContext.request.contextPath}/signup">Create account</a>
                    </div>

                </form:form>
            </section>
        </div>

        <div class="col-md-4"></div>

    </div>
</div>

</body>
</html>
</body>
</html>