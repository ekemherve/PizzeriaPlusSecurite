<%@ include file="../include/importTags.jsp" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%--<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>--%>
<!DOCTYPE HTML>
<html>
<head>
    <meta http-equiv="Content-Type" content="type=text/html; charset=UTF-8">
    <meta username="viewport" content="width=device-width, initial-scale=1">

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

    <link type="text/css" href="<spring:url value='/css/template.css' />" rel="stylesheet">
    <title>${titre}</title>
</head>
<body>

    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
            <a class="navbar-brand" href="${pageContext.request.contextPath}/home">PizzaLand</a>
            <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
                <li class="nav-item active">
                    <a class="nav-link" href="${pageContext.request.contextPath}/home">Home <span class="sr-only">(current)</span></a>
                </li>
            </ul>

            <div class="col-3">
                <sec:authorize access="isAuthenticated()">
                    <ul class="nav navbar-nav">
                        <li style="color: cadetblue"><sec:authentication property="principal.username"/></li>
                    </ul>
                </sec:authorize>
            </div>

            <ul class="nav navbar-nav navbar-right">
                <li>
                    <sec:authorize access="isAuthenticated()">
                        <ul class="nav navbar-nav">
                            <%--<li style="color: cadetblue"><sec:authentication property="principal.username"/></li>--%>
                            <li><a href="${pageContext.request.contextPath}/logout" class ="btn btn-warning btn-sm">Logout</a></li>
                        </ul>
                    </sec:authorize>
                    <sec:authorize access="!isAuthenticated()">
                        <%--<ul class="nav navbar-nav">--%>
                            <li><a href="${pageContext.request.contextPath}/login" class ="btn btn-warning btn-sm">Login</a></li>
                        <%--</ul>--%>
                    </sec:authorize>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath}/panier"  class ="btn btn-primary btn-sm">
                        <i class="fa fa-shopping-cart" aria-hidden="true"></i>
                        Shopping Cart
                        <span class="badge">
          				<c:out value="${panier != null ? panier.quantiteTotal : 0}"></c:out>
          			</span>
                    </a>
                </li>
            </ul>
        </div>
    </nav>

<div class="container-fluid">
        <tiles:insertAttribute name="main-content"/>

</div>

    <%--<div class="footer">--%>
        <%--<p class="copyright">Copyright @ 2018-2020 Web Application. All rights reserved.</p>--%>
        <%--<p class="site">Website developped by Herve</p>--%>
    <%--</div>--%>
</body>
</html>