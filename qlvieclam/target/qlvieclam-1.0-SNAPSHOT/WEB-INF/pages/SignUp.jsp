<%-- 
    Document   : SignUp
    Created on : Aug 19, 2023, 1:25:02 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<form>
    <div class="form-floating mb-3 mt-3">
        <input type="text" class="form-control" id="username" placeholder="Tên đăng nhập" name="username">
        <label for="username">Tên đăng nhập</label>
    </div>

    <div class="form-floating mt-3 mb-3">
        <input type="password" class="form-control" id="pwd" placeholder="Mật khẩu" name="password">
        <label for="pwd">Mật khẩu</label>
    </div>
    
    <div class="form-floating mt-3 mb-3">
        <input type="submit" value="Đăng nhập" class="btn btn-danger" />
    </div>
</form>