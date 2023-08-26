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
    <c:url value="/InfoUser" var="action" />



    <se:authorize access="hasRole('ROLE_ADMIN')or hasRole('ROLE_USER') or hasRole('ROLE_EMP')">
        <c:forEach items="${USER}" var="j">

            <a  class="btn btn-success"  href="<c:url value="/InfoUser/${j.id}" />">Thông tin hồ sơ</a>
        </c:forEach>

    </se:authorize>

    <form:form action="${action}"  method="post" modelAttribute="info">

        <c:if test="${info.id ==null}">
            <div>Vui lòng ấn nút để xem thông </div>
        </c:if>
        <c:if test="${info.id !=null}">
            <form:errors path="*" element="div"  cssClass="alert alert-danger" />
            <form:hidden path="id" />
            <form:hidden path="password" />
            <form:hidden path="roleID" />
            <form:hidden path="avatar"/>
            <form:hidden path="file"/>
            <div class="mb-3 mt-3">
                <label for="email" class="form-label">Tên đăng nhập</label>
                <form:input type="text" path="username" class="form-control" 
                            id="username" placeholder="Tên đăng nhập"/>
            </div> 

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
                        <c:choose>
                            <c:when test="${m.nameMajor==info.nganhNghe}">
                                <option value="${m.nameMajor}" selected>${m.nameMajor}</option>
                            </c:when>
                            <c:otherwise>
                                <option value="${m.nameMajor}" >${m.nameMajor}</option>
                            </c:otherwise>
                        </c:choose>

                    </c:forEach>
                </form:select>
            </div>
            <button type="submit" class="btn btn-primary"> Lưu thông tin </button>
        </c:if>

        <a  class="btn btn-success" href="<c:url value="/" />">Trở về</a>
    </form:form>

</div>


