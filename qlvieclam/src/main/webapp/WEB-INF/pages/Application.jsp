<%-- 
    Document   : Application
    Created on : Aug 19, 2023, 9:02:57 AM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:url value="/Application" var="action" />
<form:form action="${action}"  method="post" modelAttribute="app" enctype="multipart/form-data">


    <div class="mb-3">
        <label for="file" class="form-label">Nộp File CV</label>
        <form:input type="file" path="file" class="form-control" 
                    id="file" />
    </div>
    
    <div class="mb-3 mt-3">
        <label for="tuoi" class="form-label">Họ</label>      
        <form:input type="text" path="ho" class="form-control" 
                    id="ho" placeholder="Nhập họ"/>
    </div>

    <div class="mb-3 mt-3">
        <label for="ho" class="form-label">Tên</label>      
        <form:input type="text" path="ten" class="form-control" 
                    id="ten" placeholder="Nhập tên"/>
    </div>

    <div class="mb-3 mt-3">
        <label for="email" class="form-label">Email</label>      
        <form:input type="text" path="email" class="form-control" 
                    id="email" placeholder="Nhập Email"/>
    </div>

    <div class="mb-3 mt-3">
        <label for="sdt" class="form-label">Số điện thoại</label>      
        <form:input type="text" path="sdt" class="form-control" 
                    id="sdt" placeholder="Nhập số điện thoại"/>
    </div>

    
      <div  class="mb-3 mt-3">
        <label for="ngheNghiep" class="form-label">Chuyên ngành hiện tại</label>      
        <form:input type="text" path="ngheNghiep" class="form-control" 
                    id="ngheNghiep" placeholder="Nhập chuyên ngành "/>
    </div>
    
      <div  class="mb-3 mt-3">
        <label for="trinhDoHocVan" class="form-label">Trình độ học vấn</label>      
        <form:input type="text" path="trinhDoHocVan" class="form-control" 
                    id="trinhDoHocVan" placeholder="Nhập trình độ học vấn "/>
    </div>
    
      <div  class="mb-3 mt-3">
        <label for="addressUser" class="form-label">Địa chỉ</label>      
        <form:input type="text" path="addressUser" class="form-control" 
                    id="addressUser" placeholder="Nhập địa chỉ "/>
    </div>

        <div  class="mb-3 mt-3">
        <label for="namKinhNghiem" class="form-label">Số năm kinh nghiệm</label>      
        <form:input type="text" path="namKinhNghiem" class="form-control" 
                    id="namKinhNghiem" placeholder="Nhập năm kinh nghiệm "/>
    </div>
        
    <div  class="mb-3 mt-3">
        <label for="tuoi" class="form-label">Tuổi</label>      
        <form:input type="text" path="tuoi" class="form-control" 
                    id="tuoi" placeholder="Nhập tuổi"/>
    </div>
        <button type="submit" class="btn btn-primary">Nộp</button>
</form:form>