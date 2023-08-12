<%-- 
    Document   : createJob
    Created on : Aug 6, 2023, 5:11:04 PM
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
                            <a class="nav-link" href="javascript:void(0)">Trang chủ</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="javascript:void(0)">Đăng tin tuyển dụng</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="javascript:void(0)">Đánh giá</a>
                        </li>
                         <li class="nav-item">
                            <a class="nav-link" href="javascript:void(0)">Tìm ứng viên</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
         <div class="container">
            <h2 style="margin-left: 500px;">FORM TẠO VIỆC LÀM</h2>
            <c:url value="/createJob" var="action"/>

            <form:form action="${action}" method="post" modelAttribute="job" >
                 <div class="mb-3 mt-3">
                    <label for="email" class="form-label">Tên công việc</label>
                    <form:input type="text" path="nameJob" class="form-control" 
                                id="nameJob" placeholder="Tên công việc"/>
                </div>  
                <div class="mb-3">
                    <label for="pwd" class="form-label">Mức lương</label>
                    <form:input type="text" path="salary" class="form-control" 
                                id="salary" placeholder="Nhập mức lương"/>
              
                </div>
                <div class="mb-3">
                    <label for="pwd" class="form-label">Số lượng tuyển dụng</label>
                     <form:input type="text" path="SoLuongTuyenDung" class="form-control" 
                                id="SoLuongTuyenDung" placeholder="Nhập số lượng tuyển dụng"/>
                
                </div>
                <div class="mb-3">
                    <label for="pwd" class="form-label">Tuổi</label>
                    <form:input type="text" path="Age" class="form-control" 
                                id="Age" placeholder="Nhập độ tuổi cần tuyển"/>
                </div>
                  <div class="mb-3">
                    <label for="pwd" class="form-label">Kinh nghiệm</label>
                    <form:input type="text" path="KinhNghiem" class="form-control" 
                                id="KinhNghiem" placeholder="Nhập độ số năm kinh nghiệm"/>
                </div>
                <div class="mb-3">
                    <label for="pwd" class="form-label">Thành phố</label>
                    <form:select class="form-select" id="city" name="city" path="cityID">
                        <c:forEach items="${Cities}" var="ct">
                            <option value="${ct.id}">${ct.nameCity}</option>
                        </c:forEach>
                    </form:select>
                    
            
                </div>
                 <div class="mb-3">
                    <label for="pwd" class="form-label">Quận/huyện</label>
                      <form:select class="form-select" id="district" name="district" path="districID">
                        <c:forEach items="${quans}" var="q">
                            <option value="${q.id}">${q.nameDistrict}</option>
                        </c:forEach>
                    </form:select>
                </div>
                <div class="mb-3">
                    <label for="pwd" class="form-label">Nghề nghiệp tuyển dụng</label>
                     <form:select class="form-select" id="district" name="district" path="majorID">
                        <c:forEach items="${majors}" var="m">
                            <option value="${m.id}">${m.nameMajor}</option>
                        </c:forEach>
                    </form:select>
                </div>
                <div class="mb-3">
                    <label for="pwd" class="form-label">Trình độ học vấn</label>
                     <form:select class="form-select" id="edu" name="edu" path="EducationID">
                        <c:forEach items="${edus}" var="e">
                            <option value="${e.id}">${e.typeEducation}</option>
                        </c:forEach>
                    </form:select>
                </div>
                 <div class="mb-3">
                    <label for="pwd" class="form-label">Loại công việc</label>
                     <form:select class="form-select" id="typejob" name="typejob" path="typeJobID">
                        <c:forEach items="${types}" var="t">
                            <option value="${t.id}">${t.nameType}</option>
                        </c:forEach>
                    </form:select>
                </div>

                <button type="submit" class="btn btn-primary">Submit</button>
            </form:form>


        </div>
    </body>
</html>
