<%-- 
    Document   : checkout
    Created on : Apr 1, 2019, 4:51:57 PM
    Author     : admin
--%>

<%@page import="model.Cart"%>
<%@page import="model.Users"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>checkout</title>
    </head>
    <body>
        <%
            
            if(session.getAttribute("email")==null){
                response.sendRedirect("/ShopBook/login.jsp");
            }
            else{
                Cart cart = (Cart) session.getAttribute("cart");
            if (cart == null) {
                cart = new Cart();
                session.setAttribute("cart", cart);
            }
            %>
        <jsp:include page="header.jsp"></jsp:include>
            <div class="container">
                <div class="account">
                    <h2 class="account-in">Account</h2>
                    <form action="PaymentServlet" method="POST">
                        <div>			
                            <span>Address*</span>
                            <input type="text" name="address" placeholder="Nhập đia chỉ giao hàng"> 
                        </div>			
                        <div> 	
                            <span>Payment*</span>
                            <select name="payment">
                                <option value="Thanh toan khi nhan hang">Thanh toán khi nhận hàng</option>
                                <option value="Thanh toan online">Thanh toán online</option>
                            </select>    
                        </div>
                        <input type="submit" value="Checkout"> 
                    </form>
                </div>
            </div>
        <jsp:include page="footer.jsp"></jsp:include>
        <%}%>
    </body>
</html>
