<%-- 
    Document   : product
    Created on : Apr 1, 2019, 4:41:15 PM
    Author     : admin
--%>

<%@page import="model.Cart"%>
<%@page import="model.Book"%>
<%@page import="getdata.GetBookByCategory"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Products</title>
    </head>
    <body>
        <%
            GetBookByCategory getbook = new GetBookByCategory();
            String category_id = "";
            if (request.getParameter("category") != null) {
                category_id = request.getParameter("category");
            }
            Cart cart = (Cart) session.getAttribute("cart");
            if(cart==null){
                cart = new Cart();
                session.setAttribute("cart", cart);
            }
            
        %>
        <jsp:include page="header.jsp"></jsp:include>

            <br /><br />
            <!---->
            <div class="container">
                <div class="content">
                    <div class="content-top">
                        <h3 class="future">FEATURED</h3>
                        <div class="content-top-in">

                        <%
                            for (Book p : getbook.getBook(Long.parseLong(category_id))) {
                        %>

                        <div class="col-md-3 md-col">
                            <div class="col-md">
                                <a href="single.jsp?book_id=<%=p.getBook_id()%>"><img  src="<%=p.getBook_img()%>" alt="<%=p.getBook_des()%>" /></a>	
                                <div class="top-content">
                                    <h5><a href="single.jsp?book_id=<%=p.getBook_id()%>"><%=p.getBook_name()%></a></h5>
                                    <div class="white">
                                        <a href="CartServlet?command=plus&book_id=<%=p.getBook_id()%>" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2 ">ADD TO CART</a>
                                        <p class="dollar"><span class="in-dollar">$</span><span><%=p.getBookPrice()%></span></p>
                                        <div class="clearfix"></div>
                                    </div>

                                </div>							
                            </div>
                        </div>

                        <%
                            }
                        %>


                        <div class="clearfix"></div>
                    </div>
                </div>
                <!---->


                <ul class="start">
                    <li ><a href="#"><i></i></a></li>
                    <li><span>1</span></li>
                    <li class="arrow"><a href="#">2</a></li>
                    <li class="arrow"><a href="#">3</a></li>
                    <li class="arrow"><a href="#">4</a></li>
                    <li class="arrow"><a href="#">5</a></li>
                    <li ><a href="#"><i  class="next"> </i></a></li>
                </ul>
            </div>
        </div>

        <jsp:include page="footer.jsp"></jsp:include>

    </body>
</body>
</html>
