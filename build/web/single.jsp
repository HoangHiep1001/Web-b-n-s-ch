<%-- 
    Document   : single
    Created on : Apr 1, 2019, 4:46:46 PM
    Author     : admin
--%>

<%@page import="model.Book"%>
<%@page import="getdata.GetBookByCategory"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>single</title>
    </head>
    <body>
        <%
            GetBookByCategory getbook = new GetBookByCategory();
            Book book = new Book();
            String book_id = "";
            if (request.getParameter("book_id") != null) {
                book_id = request.getParameter("book_id");
                book = getbook.getdetailBook(Long.parseLong(book_id));
            }
        %>
        <jsp:include page="header.jsp"></jsp:include>
            <div class="single">
                <div class="col-md-9 top-in-single">
                    <div class="col-md-5 single-top">	
                        <ul id="etalage">
                            <li>
                                <a href="optionallink.html">
                                    <img class="etalage_thumb_image img-responsive" src="<%=book.getBook_img()%>" alt="" >
                            </a>
                        </li>
                    </ul>

                </div>	
                <div class="col-md-7 single-top-in">
                    <div class="single-para">
                        <h4><%=book.getBook_name()%></h4>
                        <div class="para-grid">
                            <span  class="add-to"><%=book.getBookPrice()%></span>
                            <a href="#" class="hvr-shutter-in-vertical cart-to">Add to Cart</a>					
                            <div class="clearfix"></div>
                        </div>
                            <h5>Số lượng còn lại:<%=book.getBook_number()%></h5>
                        <div class="available">
                            <h6>Available Options :</h6>
                            <ul>
                                <li>Color:
                                    <select>
                                        <option>Silver</option>
                                        <option>Black</option>
                                        <option>Dark Black</option>
                                        <option>Red</option>
                                    </select></li>
                                <li>Size:<select>
                                        <option>Large</option>
                                        <option>Medium</option>
                                        <option>small</option>
                                        <option>Large</option>
                                        <option>small</option>
                                    </select></li>
                                <li>Quality:<select>
                                        <option>1</option>
                                        <option>2</option>
                                        <option>3</option>
                                        <option>4</option>
                                        <option>5</option>
                                    </select></li>
                            </ul>
                        </div>
                        <p><%=book.getBook_des()%></p>

                    </div>
                </div>
                <div class="clearfix"> </div>
                <div class="content-top-in">
                    <%
                        for (Book list : getbook.getSameCategory(book.getBook_id())) {

                    %>
                    <div class="col-md-4 top-single">
                        <div class="col-md">
                            <img  src="<%=list.getBook_img()%>" alt="<%=list.getBook_des()%>" />	
                            <div class="top-content">
                                <h5><%=list.getBook_name()%></h5>
                                <div class="white">
                                    <a href="#" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2">ADD TO CART</a>
                                    <p class="dollar"><span class="in-dollar">$</span><span><%=list.getBookPrice()%></span></p>
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
            <div class="col-md-3">
                <div class="single-bottom">
                    <h4>Categories</h4>
                    <ul>
                        <li><a href="#"><i> </i>Fusce feugiat</a></li>
                        <li><a href="#"><i> </i>Mascot Kitty</a></li>
                        <li><a href="#"><i> </i>Fusce feugiat</a></li>
                        <li><a href="#"><i> </i>Mascot Kitty</a></li>
                        <li><a href="#"><i> </i>Fusce feugiat</a></li>
                    </ul>
                </div>
                <div class="single-bottom">
                    <h4>Product Categories</h4>
                    <ul>
                        <li><a href="#"><i> </i>feugiat(5)</a></li>
                        <li><a href="#"><i> </i>Fusce (4)</a></li>
                        <li><a href="#"><i> </i> feugiat (4)</a></li>
                        <li><a href="#"><i> </i>Fusce (4)</a></li>
                        <li><a href="#"><i> </i> feugiat(2)</a></li>
                    </ul>
                </div>
                <div class="single-bottom">
                    <h4>Product Categories</h4>
                    <div class="product">
                        <img class="img-responsive fashion" src="images/st1.jpg" alt="">
                        <div class="grid-product">
                            <a href="#" class="elit">Consectetuer adipiscing elit</a>
                            <span class="price price-in"><small>$500.00</small> $400.00</span>
                        </div>
                        <div class="clearfix"> </div>
                    </div>
                    <div class="product">
                        <img class="img-responsive fashion" src="images/st2.jpg" alt="">
                        <div class="grid-product">
                            <a href="#" class="elit">Consectetuer adipiscing elit</a>
                            <span class="price price-in"><small>$500.00</small> $400.00</span>
                        </div>
                        <div class="clearfix"> </div>
                    </div>
                    <div class="product">
                        <img class="img-responsive fashion" src="images/st3.jpg" alt="">
                        <div class="grid-product">
                            <a href="#" class="elit">Consectetuer adipiscing elit</a>
                            <span class="price price-in"><small>$500.00</small> $400.00</span>
                        </div>
                        <div class="clearfix"> </div>
                    </div>
                </div>
            </div>
            <div class="clearfix"> </div>
        </div>
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
