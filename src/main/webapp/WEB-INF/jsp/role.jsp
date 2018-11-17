<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
    <title>${titre}</title>
    <link type="text/css" href="<spring:url value='/css/home.css' />" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row">

        <form:form action="${pageContext.request.contextPath}/roles" modelAttribute="role" method="post">

            <div class="form-group">
                <form:label path="roleEnum">Role</form:label>
                <form:select path="roleEnum">
                    <form:options items="${roles}" itemValue="roleEnum" id="roleEnum" />
                </form:select>
                <form:button type = "submit" class="btn btn-primary"  >Submit</form:button>
            </div>

        </form:form>

    </div>

</div>
</body>
</html>