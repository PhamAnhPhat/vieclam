<%-- 
    Document   : index
    Created on : Aug 6, 2023, 9:51:28 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
                <a class="navbar-brand" href="<c:url value="/"/>">Work</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavbar">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="mynavbar">
                    <ul class="navbar-nav me-auto">
                        <li class="nav-item">
                            <a class="nav-link" href="<c:url value="/"/>">Trang chủ</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="javascript:void(0)">Hồ sơ</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="<c:url value="/SignUp" />">Đăng ký</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="<c:url value="login" />">Đăng nhập</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        
        <ul class="nav nav-pills" style = "background-color : cornflowerblue " >
            <li class="nav-item">
                <div class="nav-link" style="background-color: greenyellow">
                    <img src="https://img.icons8.com/?size=512&id=h75QzKozczfv&format=png" style=" height :30px">
                    <a style = " color: darkmagenta ; font-size: 20px ; font-weight: 900" >
                        Lọc
                    </a>

                </div>
            </li>
            <li class="nav-item dropdown">
                <div class="nav-link dropdown-toggle" data-bs-toggle="dropdown">
                    <img src="https://img.icons8.com/?size=1x&id=Fed3w16hj37u&format=png" style=" height :30px">
                    <a href="#" style="text-decoration: none  ; color: linen ; font-size: 20px ; font-weight: 700" >
                        Thành phố
                    </a>
                    <ul class="dropdown-menu">

                        <c:forEach items="${Cities}" var="city">
                            <li><a class="dropdown-item" href="#">${city.nameCity}</a></li>
                            </c:forEach>
                    </ul>

                </div>
            </li>

            <li class="nav-item dropdown" >
                <div class="nav-link dropdown-toggle" data-bs-toggle="dropdown">
                    <img src="https://img.icons8.com/?size=512&id=qSDZIF4neVDE&format=png" style=" height :30px">
                    <a href="#" style="text-decoration: none  ; color: linen ; font-size: 20px;font-weight: 700" >
                        Quận
                    </a>
                    <ul class="dropdown-menu">
                        <c:forEach items="${quans}" var="x">
                            <li><a class="dropdown-item" href="#">${x.nameDistrict}</a></li>
                            </c:forEach>
                    </ul>

                </div>
            </li>
            <li class="nav-item dropdown" >
                <div class="nav-link dropdown-toggle" data-bs-toggle="dropdown">
                    <img src="https://img.icons8.com/?size=512&id=ScAViD0I8h4B&format=png" style=" height :30px">
                    <a href="#" style="text-decoration: none  ; color: linen ; font-size: 20px;font-weight: 700" >
                        Nghề nghiệp
                    </a>
                    <ul class="dropdown-menu">
                        <c:forEach items="${majors}" var="m">
                            <li><a class="dropdown-item" href="#">${m.nameMajor}</a></li>
                            </c:forEach>
                    </ul>

                </div>
            </li>
            <li class="nav-item dropdown">
                <div class="nav-link dropdown-toggle" data-bs-toggle="dropdown">
                    <img src="https://img.icons8.com/?size=512&id=9489&format=png" style=" height :30px">
                    <a href="#" style="text-decoration: none  ; color: linen ; font-size: 20px;font-weight: 700" >
                        Hình thức
                    </a>
                    <ul class="dropdown-menu">
                        <c:forEach items="${types}" var="t">
                            <li><a class="dropdown-item" href="#">${t.nameType}</a></li>
                            </c:forEach>

                    </ul>

                </div>
            </li>
            <li class="nav-item dropdown" >
                <div class="nav-link dropdown-toggle" data-bs-toggle="dropdown">
                    <img src="https://img.icons8.com/?size=512&id=11225&format=png" style=" height :30px">
                    <a href="#" style="text-decoration: none  ; color: linen ; font-size: 20px;font-weight: 700" >
                        Học vấn
                    </a>
                    <ul class="dropdown-menu">
                        <c:forEach items="${edus}" var="e">
                            <li><a class="dropdown-item" href="#">${e.typeEducation}</a></li>
                            </c:forEach>
                    </ul>

                </div>
            </li>
            <li style="margin:auto ; width: 550px">
                <form class="d-flex">
                    <input class="form-control me-auto" type="text" placeholder="Nhập tên công ty cần tìm .....">
                </form>
            </li>
        </ul>
        <h2 style="margin-left:400px;">DANH SÁCH VIỆC LÀM</h2>
        <ul class="pagination" style="margin-left:400px;">
            <c:forEach begin="1" end="${counts}" var="i">
                <c:url value="/" var="pageUrl">
                    <c:param name="page" value="${i}"></c:param>
                </c:url>
                <li class="page-item"><a class="page-link" href="${pageUrl}">${i}</a></li>
            </c:forEach>
            
         
        </ul>
        <div class="container" style="margin-top:30px;width:800px;" >
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Công việc</th>
                        <th>Mức lương</th>
                        <th>Số lượng</th>
                        <th>Tuổi</th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${jobs}" var="j">
                        <tr>
                            <td>${j.id}</td>
                            <td>${j.nameJob}</td>
                            <td>${j.salary}</td>
                            <td>${j.soLuongTuyenDung}</td>
                            <td>${j.age}</td>
                            <td>  <a href="#" class="btn btn-success">Xem công việc</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>

        <!--<div class="container mt-3">
          <h2>Textarea</h2>
          <p>Use the .form-control class to style textareas as well:</p>
          <form action="/action_page.php">
            <div class="mb-3 mt-3">
              <label for="comment">Comments:</label>
              <textarea class="form-control" rows="5" id="comment" name="text"></textarea>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
          </form>
        </div>
                
                <div class="form-check">
          <input type="radio" class="form-check-input" id="radio1" name="optradio" value="option1" checked>Option 1
          <label class="form-check-label" for="radio1"></label>
        </div>
        <div class="form-check">
          <input type="radio" class="form-check-input" id="radio2" name="optradio" value="option2">Option 2
          <label class="form-check-label" for="radio2"></label>
        </div>
        <div class="form-check">
          <input type="radio" class="form-check-input" disabled>Option 3
          <label class="form-check-label"></label>
        </div>-->

    </body>



</html>
