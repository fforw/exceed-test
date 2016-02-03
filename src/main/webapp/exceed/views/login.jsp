<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<sec:authentication var="user" property="principal" />
<c:choose>
    <c:when test="${user != 'anonymousUser'}">
        <c:set var="userName" value="${user.username}"/>
    </c:when>
    <c:otherwise>
        <c:set var="userName" value="Anonymous"/>
    </c:otherwise>
</c:choose>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>${alias} - local login</title>

    <!-- Bootstrap -->
    <link id="application-styles" href="${contextPath}/style/${appName}.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="${contextPath}/res/${appName}/js/html5shiv.min.js"></script>
    <script src="${contextPath}/res/${appName}/js/respond.min.js"></script>
    <![endif]-->
    <meta name="token" content="${_csrf.token}"/>
    <meta name="token-type" content="${_csrf.headerName}"/>

    <script src="${contextPath}/res/${appName}/js/${applicationScope.reactVersion}"></script>
    <script src="${contextPath}/res/${appName}/js/${applicationScope.reactDOMVersion}"></script>
    <script src="${contextPath}/res/${appName}/js/main.js"></script>
    <script src="${contextPath}/app.js"></script>
</head>
<body data-context-path="${contextPath}">
<div class="container">
    <h1>Login</h1>
    <form action="${pageContext.request.contextPath}/login_check" method="POST">
        <div class="row">
            <div class="col-md-6">
                <div class="form-group">
                    <label for="loginField">Username</label>
                    <input id="loginField" type="text" class="form-control" name="username">
                </div>
                <div class="form-group">
                    <label for="pwField">Username</label>
                    <input id="pwField" type="password" class="form-control" name="password">
                </div>
                <div class="checkbox">
                    <label>
                        <input type="checkbox" name="remember-me"> Remember me on this computer.
                    </label>
                </div>
                <input class="btn btn-primary" type="submit" value="Login">
            </div>
        </div>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
    </form>
</div>
<footer>
    <hr>
    <c:choose>
        <c:when test="${userName == 'Anonymous'}">
            <a class="btn btn-link" href="${contextPath}/login">Login</a>
            <a class="btn btn-link" href="${contextPath}/signup">Signup</a>
        </c:when>
        <c:otherwise>
            <form class="form-inline" action="${contextPath}/logout" method="POST">
                <input type="submit" class="btn btn-link" value="Logout: ${userName}">
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
            </form>
        </c:otherwise>

    </c:choose>
</footer>
</body>
</html>
