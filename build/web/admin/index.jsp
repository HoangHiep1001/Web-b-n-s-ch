<%-- 
    Document   : index
    Created on : Apr 22, 2019, 4:57:02 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>index</title>
         <c:set var="root" value="${pageContext.request.contextPath}"/>
        <link href="${root}/css/bootstrap.css" rel='stylesheet' type='text/css' />
        <script src="${root}/js/jquery-1.11.1.min.js"></script>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
        <jsp:include page="content.jsp"></jsp:include>
        <%--<jsp:include page="footer.jsp"></jsp:include>--%>
        
    </body>
</html>
