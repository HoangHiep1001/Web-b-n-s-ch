<%-- 
    Document   : sanpham
    Created on : Apr 22, 2019, 5:47:24 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sản phẩm</title>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
            <div id="wrapper">
                <div id="leftBar">
                <jsp:include page="menu.jsp"></jsp:include>
            </div>
            <div id="rightContent">
                <h3>Form</h3>

                <div class="informasi">
                    Quản lí sản phẩm
                </div>

                <table width="95%">
                    <tr><td><b>Tên sản phẩm:</b></td><td><input type="text" class="panjang"></td></tr>
                    <tr><td><b>Danh mục:</b></td><td>
                            <select class="sedang">
                                <option selected>-- pilihan --</option>
                                <option value="">Pilihan</option>
                            </select>
                        </td></tr>
                    <tr><td width="125px"><b>Số lượng:</b></td><td><input type="text" class="pendek"></td></tr>
                    <tr><td><b>Mô tả:</b></td><td><textarea></textarea></td></tr>
                    <tr><td width="125px"><b>Giá bán:</b></td><td><input type="text" class="pendek"></td></tr>
                    <tr><td></td><td>
                            <input type="button" class="button" value="Lưu dữ liệu">
                        </td></tr>
                </table>
            </div>
            <div class="clear"></div>
        </div>
    </body>
</html>
