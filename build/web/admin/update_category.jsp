<%-- 
    Document   : update_category
    Created on : Apr 23, 2019, 7:46:20 AM
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
                    <h3>Update danh mục</h3>

                    <div class="informasi">
                        Update danh mục
                    </div>
                    <form action="/WebBook/DanhmucServlet" method="post">
                        <table width="95%">
                            <p style="color: red"><%=err%></p>
                        <td><b>Tên danh mục:</b></td>
                        <td><input type="text" class="panjang" name="tenDanhmuc"></td>
                        <tr><td>
                                <input type="hidden" name="command" value="update">
                                <input type="hidden" name="category_id" value="<%=request.getParameter("category_id")%>">
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
