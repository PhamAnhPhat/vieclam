<%-- 
    Document   : SignUp
    Created on : Aug 19, 2023, 1:25:02 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div class="container">
    <c:url value="/SignUp" var="action" />
    <form:form action="${action}"  method="post" modelAttribute="signup" enctype="multipart/form-data">
        <form:errors path="*" element="div"  cssClass="alert alert-danger" />
        <form:hidden path="id" />
        <form:hidden path="avatar"/>
        <form:hidden path="file"/>
        <div class="mb-3 mt-3">
            <label for="email" class="form-label">Tên đăng nhập</label>
            <form:input type="text" path="username" class="form-control" 
                        id="username" placeholder="Tên đăng nhập"/>
        </div> 
        <div class="mb-3 mt-3">
            <label for="email" class="form-label">Mật khẩu</label>
            <form:input type="text" path="password" class="form-control" 
                        id="password" placeholder="Mật khẩu"/>
        </div> 
<!--        <div class="mb-3 mt-3">
            <label for="email" class="form-label">Nhập lại mật khẩu</label>
            <form:input type="text" path="confirmPwd" class="form-control" 
                        id="confirmPwd" placeholder="Nhập lại mật khẩu"/>
        </div>-->
        <div class="mb-3 mt-3">
            <label for="email" class="form-label">Họ</label>
            <form:input type="text" path="ho" class="form-control" 
                        id="ho" placeholder="Nhập họ và lót"/>
        </div> 
        <div class="mb-3 mt-3">
            <label for="ten" class="form-label">Tên</label>
            <form:input type="text" path="ten" class="form-control" 
                        id="ten" placeholder="Nhập tên"/>
        </div> 



        <div  class="mb-3 mt-3">
            <label for="ngheNghiep" class="form-label">Chuyên ngành hiện tại</label>      
            <form:select class="form-select" id="nganhNghe" name="nganhNghe" path="nganhNghe">
                <c:forEach items="${MAJOR}" var="m">
                    <option value="${m.nameMajor}" >${m.nameMajor}</option>
                </c:forEach>
            </form:select>
        </div>

        <div class="mb-3">
            <label for="roleID" class="form-label">Vị trí</label>
            <form:select class="form-select" id="roleID" name="roleID" path="roleID">
                <c:forEach items="${roless}" var="r">
                    <option value="${r.id}">${r.nameRole}</option>
                </c:forEach>
            </form:select>
        </div>
        <c:if test="${not empty message}">
            <div class="alert alert-danger">
                ${message}
            </div>
        </c:if>
        <div class="mb-3">
        <label for="file" class="form-label">Ảnh minh hoạ</label>
        <form:input type="file" path="file" class="form-control" 
                    id="file" />
    </div>
        <button type="submit"  class="btn btn-primary"> Đăng ký</button>
    </form:form>

</div>
<script>
  
</script>
