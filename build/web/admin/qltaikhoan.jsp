<%-- 
    Document   : qltaikhoan
    Created on : Apr 22, 2019, 5:17:02 PM
    Author     : admin
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Users"%>
<%@page import="getdata.Checkmail"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>QL Tài Khoản</title>
    </head>
    <body>
        <%
            Checkmail get = new Checkmail();
            ArrayList<Users> listuser = get.getListUser();
        %>
        <jsp:include page="header.jsp"></jsp:include>
            <div id="wrapper">
                <div id="leftBar">
                <jsp:include page="menu.jsp"></jsp:include> 
                </div>
                <div id="rightContent">
                    <h3>Quản lí tài khoản</h3>
                    <div class="informasi">
                        Quản lí tài khoản
                    </div>
                    <table class="data">
                        <tr class="data">
                            <th class="data" width="30px">No</th>
                            <th class="data">Mã khách hàng</th>
                            <th class="data">Email</th>
                            <th class="data" width="75px">Tùy chọn</th>
                        </tr>
                        <%
                        int dem = 0;
                        for (Users u : listuser) {
                            dem++;

                    %>
                        <tr class="data">
                            <td class="data" width="30px"><%=dem%></td>
                            <td class="data"><%=u.getUserId()%></td>
                            <td class="data"><%=u.getUserEmail()%></td>
                            <td class="data" width="75px">
                        <center>
                            <a href="#">Sửa</a>&nbsp;&nbsp; | &nbsp;&nbsp;
                            <a href="#">Xóa</a>
                        </center>
                        </td>
                        </tr>
                        <%}%>
                    </table>
                </div>
    </body>
</html>
