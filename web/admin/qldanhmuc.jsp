<%-- 
    Document   : qldanhmuc
    Created on : Apr 22, 2019, 5:26:02 PM
    Author     : admin
--%>

<%@page import="model.Category"%>
<%@page import="java.util.ArrayList"%>
<%@page import="getdata.GetCategory"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>QL Danh mục</title>
        
    </head>
    <body>
        <%
            GetCategory get = new GetCategory();
            ArrayList<Category> listcategory = get.getListCategory();
        %>
        <jsp:include page="header.jsp"></jsp:include>
            <div id="wrapper">
                <div id="leftBar">
                <jsp:include page="menu.jsp"></jsp:include> 
                </div>
                <div id="rightContent">
                    <h3>Quản lí danh mụcc</h3>
                    </br>
                    <a href="/WebBook/admin/insert_category.jsp" class="button">Thêm mới danh mục</a>
                    <div class="informasi">
                        Quản lí danh mục
                    </div>
                    <table class="data">
                        <tr class="data">
                            <th class="data" width="30px">No</th>
                            <th class="data">ID danh mục</th>
                            <th class="data"> Tên danh mục</th>
                            <th class="data" width="75px">Tùy chọn</th>
                        </tr>
                    <%
                        int dem = 0;
                        for (Category category : listcategory) {
                            dem++;

                    %>
                    <tr class="data">
                        <td class="data" width="30px"><%=dem%></td>
                        <td class="data"><%=category.getCategory_id()%></td>
                        <td class="data"><%=category.getCategory_name()%></td>
                        <td class="data" width="75px">
                    <center>
                        <a href="/WebBook/admin/update_category.jsp?command=update&category_id=<%=category.getCategory_id()%>">Sửa</a>&nbsp;&nbsp; | &nbsp;&nbsp;
                        <a href="/WebBook/DanhmucServlet?command=delete&category_id=<%=category.getCategory_id()%>">Xóa</a>
                    </center>
                    </td>
                    </tr>
                    <%}%>
                </table>
            </div>
    </body>
</html>
