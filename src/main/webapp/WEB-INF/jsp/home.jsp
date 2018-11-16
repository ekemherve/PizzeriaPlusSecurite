<%@ page language="java" contentType="text/html ; charset=UTF-8" pageEncoding="UTF-8" %>
<%--<%@ include file="include/importTags.jsp" %>--%>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="type=text/html ; charset=UTF-8"/>
        <title>${titre}</title>
    </head>
    <body>

        <div class="container">
            <div class="row">
                <div id="home" class="col-4 offset-5">
                    <a href="${pageContext.request.contextPath}/login" >Login</a>
                    or
                    <a href="${pageContext.request.contextPath}/signup" >Sign up</a>
                </div>
            </div>
        </div>

    </body>
</html>