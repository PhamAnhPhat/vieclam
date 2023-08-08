<%-- 
    Document   : createJob
    Created on : Aug 6, 2023, 5:11:04 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
            <form action="/action_page.php" style="width: 800px;margin-left: 200px;">
                <div class="mb-3 mt-3">
                    <label for="email" class="form-label">Tên công việc</label>
                    <input type="email" class="form-control" id="account" placeholder="Enter email" name="email">
                </div>
                <div class="mb-3">  
                    <label for="pwd" class="form-label">Tên công ty</label>
                    <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pswd">
                </div>
                <div class="mb-3">
                    <label for="pwd" class="form-label"></label>
                    <input type="password" class="form-control" id="pass" placeholder="Enter password" name="pswd">
                </div>
                <div class="mb-3">
                    <label for="pwd" class="form-label">Mức lương</label>
                    <input type="password" class="form-control" id="pass" placeholder="Enter password" name="pswd">
                </div>
                <div class="mb-3">
                    <label for="pwd" class="form-label">Số lượng tuyển dụng</label>
                    <input type="password" class="form-control" id="pass" placeholder="Enter password" name="pswd">
                </div>
                <div class="mb-3">
                    <label for="pwd" class="form-label">Tuổi</label>
                    <input type="password" class="form-control" id="pass" placeholder="Enter password" name="pswd">
                </div>
                <div class="mb-3">
                    <label for="pwd" class="form-label">Thành phố</label>
                    <select class="form-select">
                        <option>1</option>
                        <option>2</option>
                        <option>3</option>
                        <option>4</option>
                    </select>
                </div>
                 <div class="mb-3">
                    <label for="pwd" class="form-label">Quận/huyện</label>
                    <select class="form-select">
                        <option>1</option>
                        <option>2</option>
                        <option>3</option>
                        <option>4</option>
                    </select>
                </div>
                <div class="mb-3">
                    <label for="pwd" class="form-label">Nghề nghiệp tuyển dụng</label>
                    <select class="form-select">
                        <option>1</option>
                        <option>2</option>
                        <option>3</option>
                        <option>4</option>
                    </select>
                </div>
                <div class="mb-3">
                    <label for="pwd" class="form-label">Trình độ học vấn</label>
                    <select class="form-select">
                        <option>1</option>
                        <option>2</option>
                        <option>3</option>
                        <option>4</option>
                    </select>
                </div>
                 <div class="mb-3">
                    <label for="pwd" class="form-label">Loại công việc</label>
                    <select class="form-select">
                        <option>1</option>
                        <option>2</option>
                        <option>3</option>
                        <option>4</option>
                    </select>
                </div>

                <button type="submit" class="btn btn-primary">Submit</button>
            </form>

        </div>
    </body>
</html>
