<%-- 
    Document   : login
    Created on : Apr 23, 2019, 8:41:34 AM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta http-equiv="Copyright" content="arirusmanto.com">
        <meta name="description" content="Admin">
        <meta name="keywords" content="Admin Page">
        <meta name="author" content="Ari Rusmanto">
        <meta name="language" content="Bahasa Indonesia">

        <link rel="shortcut icon" href="stylesheet/img/devil-icon.png"> <!--Pemanggilan gambar favicon-->
        <link rel="stylesheet" type="text/css" href="mos-css/mos-style.css"> <!--pemanggilan file css-->
    </head>
    <body>
        <div id="header">
            <div class="inHeaderLogin"></div>
        </div>

        <div id="loginForm">
            <div class="headLoginForm">
                Login Administrator
            </div>
            <div class="fieldLogin">
                <form method="POST" action="/WebBook/LoginAdmin">
                    <label>Username</label><br>
                    <input type="text" name="email" class="login"><br>
                    <label>Password</label><br>
                    <input type="password" name="pass" class="login"><br>
                    <input type="submit" class="button" value="Login">
                </form>
            </div>
        </div>
    </body>
</html>
