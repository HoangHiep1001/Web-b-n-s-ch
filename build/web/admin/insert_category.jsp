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
        <title>Danh mục</title>

    </head>
    <body>
        <%
            String err = "";
            if (request.getAttribute("err") != null) {
                err = (String) request.getAttribute("err");
            }
        %>
        <jsp:include page="header.jsp"></jsp:include>
            <div id="wrapper">
                <div id="leftBar">
                <jsp:include page="menu.jsp"></jsp:include>
                </div>
                <div id="rightContent">
                    <h3>Thêm danh mục</h3>

                    <div class="informasi">
                        Quản lí danh mục
                    </div>
                    <form action="/WebBook/DanhmucServlet" method="post">
                        <table width="95%">
                            <p style="color: red"><%=err%></p>
                        <td><b>Tên danh mục:</b></td>
                        <td><input type="text" class="panjang" name="tenDanhmuc"></td>
                        <tr><td>
                                <input type="hidden" name="command" value="insert">
                                <input type="submit" class="button" value="Lưu dữ liệu">
                            </td>
                        </tr>
                        </div>
                        <div class="clear"></div>
                        </div>
                    </table>
                </form>
                </body>
                </html>
