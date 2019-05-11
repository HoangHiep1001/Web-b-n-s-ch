<%-- 
    Document   : content
    Created on : Apr 22, 2019, 5:02:19 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>content</title>
    </head>
    <body>
        <div id="wrapper">
            <div id="leftBar">
                <jsp:include page="menu.jsp"></jsp:include>
            </div>
            <div id="rightContent">
                <h3>Dashboard</h3>
                <div class="quoteOfDay">
                    <b>Quote of the day :</b><br>
                    <i style="color: #5b5b5b;">"If you think you can, you really can"</i>
                </div>
                <div class="shortcutHome">
                    <a href=""><img src="mos-css/img/posting.png"><br>Tambah Posting</a>
                </div>
                <div class="shortcutHome">
                    <a href=""><img src="mos-css/img/photo.png"><br>Upload Foto</a>
                </div>
                <div class="shortcutHome">
                    <a href=""><img src="mos-css/img/halaman.png"><br>Tambah Halaman</a>
                </div>
                <div class="shortcutHome">
                    <a href=""><img src="mos-css/img/template.png"><br>Pengaturan Template</a>
                </div>
                <div class="shortcutHome">
                    <a href=""><img src="mos-css/img/quote.png"><br>Tambah QOD</a>
                </div>
                <div class="shortcutHome">
                    <a href=""><img src="mos-css/img/bukutamu.png"><br>Data Buku Tamu</a>
                </div>

                <div class="clear"></div>

            </div>
            <div class="clear"></div>

        </div>
    </body>
</html>
