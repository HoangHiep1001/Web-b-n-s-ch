<%-- 
    Document   : qlhoadon
    Created on : Apr 22, 2019, 5:26:02 PM
    Author     : admin
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Bill"%>
<%@page import="getdata.BillDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>QL Hóa Đơn</title>
    </head>
    <body>
        <%
            BillDao get = new BillDao();
            ArrayList<Bill> listbill = get.getListBill();
        %>
        <jsp:include page="header.jsp"></jsp:include>
            <div id="wrapper">
                <div id="leftBar">
                <jsp:include page="menu.jsp"></jsp:include> 
            </div>
            <div id="rightContent">
                <h3>Quản lí hóa đơn</h3>
                <div class="informasi">
                    Quản lí hóa đơn
                </div>
                <table class="data">
                    <tr class="data">
                        <th class="data" width="30px">No</th>
                        <th class="data">Mã hóa đơn</th>
                        <th class="data">ID khách hàng</th>
                        <th class="data">Tổng hóa đơn</th>
                        <th class="data">Thanh toán</th>
                        <th class="data">Địa chỉ</th>
                        <th class="data">Ngày tạo</th>
                        <th class="data" width="75px">Tùy chọn</th>
                    </tr>
                    <%
                        int dem = 0;
                        for (Bill b : listbill) {
                            dem++;

                    %>
                    <tr class="data">
                        <td class="data" width="30px"><%=dem%></td>
                        <td class="data"><%=b.getBillID()%></td>
                        <td class="data"><%=b.getUserID()%></td>
                        <td class="data"><%=b.getTotal()%></td>
                        <td class="data"><%=b.getPayment()%></td>
                        <td class="data"><%=b.getAddress()%></td>
                        <td class="data"><%=b.getDate()%></td>
                        <td class="data" width="75px">
                    <center>
                        <a href="#"><img src="mos-css/img/oke.png"></a>&nbsp;&nbsp;&nbsp;
                        <a href="#"><img src="mos-css/img/detail.png"></a>
                    </center>
                    </td>
                    </tr>
                    <%}%>
                </table>
            </div>
    </body>
</html>
