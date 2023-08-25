<%-- 
    Document   : InfoUser
    Created on : Aug 24, 2023, 3:00:54 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="se" uri="http://www.springframework.org/security/tags" %>
<div class="container">
    <h2 style="margin-left: 400px;"> THÔNG TIN CÁ NHÂN</h2>
    <c:url value="/InfoUser" var="action" />
    <form:form action="${action}"  method="post" modelAttribute="USER" enctype="multipart/form-data">
        
    </form:form>
</div>
