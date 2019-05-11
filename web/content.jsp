<%-- 
    Document   : content
    Created on : Apr 1, 2019, 4:16:03 PM
    Author     : admin
--%>

<%@page import="model.Cart"%>
<%@page import="model.Book"%>
<%@page import="java.util.ArrayList"%>
<%@page import="getdata.GetBookByCategory"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>content</title>
    </head>
    <body>
        <%
            GetBookByCategory get = new GetBookByCategory();
            ArrayList<Book> listbook = get.getlistBook();
        %>
        <div class="container">
            <div class="content">
                <div class="content-top">
                    <h3 class="future">Content</h3>
                    <div class="content-top-in">
                        <%
                            for (Book p:listbook) {
                        %>
                        <div class="col-md-3 md-col">
                            <div class="col-md">
                                
                                <a href="single.jsp"single?book_id=<%=p.getBook_id()%>"><img  src="<%=p.getBook_img()%>" alt="<%=p.getBook_des()%>" /></a>	
                                <div class="top-content">
                                    <h5><a href="single.jsp?book_id=<%=p.getBook_id()%>"><%=p.getBook_name()%>e</a></h5>
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
    </body>
</html>
