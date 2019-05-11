<%-- 
    Document   : qlsanpham
    Created on : Apr 22, 2019, 5:26:02 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>QL Sản Phẩm</title>
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
            <div id="wrapper">
                <div id="leftBar">
                <jsp:include page="menu.jsp"></jsp:include> 
            </div>
            <div id="rightContent">
                <h3>Quản lí sản phẩm</h3>
                </br>
                <a href="sanpham.jsp" class="button">Thêm mới sản phẩm</a>
                <div class="informasi">
                    Quản lí sản phẩm
                </div>
                <table class="data">
                    <tr class="data">
                        <th class="data" width="30px">No</th>
                        <th class="data">Mã sản phẩm</th>
                        <th class="data">Tên sản phẩm</th>
                        <th class="data">Số lượng</th>
                        <th class="data">Đơn giá</th>
                        <th class="data" width="75px"></th>
                    </tr>
                    <tr class="data">
                        <td class="data" width="30px">1</td>
                        <td class="data">Data Anda</td>
                        <td class="data">Data Anda</td>
                        <td class="data">Data Anda</td>
                        <td class="data">Data Anda</td>
                        <td class="data" width="75px">
                    <center>
                        <a href="#"><img src="mos-css/img/oke.png"></a>&nbsp;&nbsp;&nbsp;
                        <a href="#"><img src="mos-css/img/detail.png"></a>
                    </center>
                    </td>
                    </tr>
                    <tr class="data">
                        <td class="data" width="30px">2</td>
                        <td class="data">Data Anda</td>
                        <td class="data">Data Anda</td>
                        <td class="data">Data Anda</td>
                        <td class="data">Data Anda</td>
                        <td class="data" width="75px">
                    <center>
                        <a href="#"><img src="mos-css/img/oke.png"></a>&nbsp;&nbsp;&nbsp;
                        <a href="#"><img src="mos-css/img/detail.png"></a>
                    </center>
                    </td>
                    </tr>
                </table>
            </div>
    </body>
</html>
