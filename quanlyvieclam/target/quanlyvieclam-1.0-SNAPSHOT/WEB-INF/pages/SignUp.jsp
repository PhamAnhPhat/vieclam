<%-- 
    Document   : SignUp
    Created on : Aug 6, 2023, 10:33:44 AM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
    </head>
    <body>


        <nav class="navbar navbar-expand-sm navbar-dark bg-dark">
            <div class="container-fluid">
                <a class="navbar-brand" href="javascript:void(0)">Work</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavbar">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="mynavbar">
                    <ul class="navbar-nav me-auto">
                        <li class="nav-item">
                            <a class="nav-link" href="<c:url value="/" />">Trang chủ</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="javascript:void(0)">Hồ sơ</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="<c:url value="/SignUp" />">Đăng ký</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="<c:url value="/login" />">Đăng nhập</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <div class="container">
            <h2 style="margin-left: 500px;">ĐĂNG KÝ TÀI KHOẢN</h2>
            <c:url value="/SignUp" var="action"/>
            <form:form action="${action}" method="post" modelAttribute="user"  enctype="multipart/form-data">
                <form:errors path="*" element="div" cssClass="alert alert-danger" />
                <form:hidden path="id" />
                <form:hidden path="avatar" />
                <div class="mb-3 mt-3">
                    <label for="username" class="form-label">Tài khoản</label>
                    <form:input type="text" path="username" class="form-control" 
                                id="username" placeholder="Nhập tài khoản"/>
                </div>  
                <div class="mb-3 mt-3">
                    <label for="password" class="form-label">Nhập mật khẩu</label>
                    <form:input type="pwd" path="password" class="form-control" 
                                id="password" placeholder="Nhập mật khẩu"/>
                </div>  

                <div class="mb-3">
                    <label for="roleID" class="form-label">Vị trí</label>
                    <form:select class="form-select" id="roleID" name="roleID" path="roleID">
                        <c:forEach items="${roless}" var="r">
                            <option value="${r.id}">${r.nameRole}</option>
                        </c:forEach>
                    </form:select>
                </div>
                <div class="mb-3">
                    <label for="pwd" class="form-label">Avatar</label>
                    <form:input type="file" class="form-control" 
                                path="file" id="file"  />
                </div>
                <c:if test="${not empty message}">
                    <div class="alert alert-danger">
                        ${message}
                    </div>
                </c:if>

                <button type="submit" class="btn btn-primary">Submit</button>
            </form:form>


        </div>

    </body>
</html>
