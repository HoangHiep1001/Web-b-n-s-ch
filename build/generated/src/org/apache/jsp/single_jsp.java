package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Book;
import getdata.GetBookByCategory;

public final class single_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>single</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            GetBookByCategory getbook = new GetBookByCategory();
            Book book = new Book();
            String book_id = "";
            if (request.getParameter("book_id") != null) {
                book_id = request.getParameter("book_id");
                book = getbook.getdetailBook(Long.parseLong(book_id));
            }
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("            <div class=\"single\">\n");
      out.write("                <div class=\"col-md-9 top-in-single\">\n");
      out.write("                    <div class=\"col-md-5 single-top\">\t\n");
      out.write("                        <ul id=\"etalage\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"optionallink.html\">\n");
      out.write("                                    <img class=\"etalage_thumb_image img-responsive\" src=\"");
      out.print(book.getBook_img());
      out.write("\" alt=\"\" >\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                </div>\t\n");
      out.write("                <div class=\"col-md-7 single-top-in\">\n");
      out.write("                    <div class=\"single-para\">\n");
      out.write("                        <h4>");
      out.print(book.getBook_name());
      out.write("</h4>\n");
      out.write("                        <div class=\"para-grid\">\n");
      out.write("                            <span  class=\"add-to\">");
      out.print(book.getBookPrice());
      out.write("</span>\n");
      out.write("                            <a href=\"#\" class=\"hvr-shutter-in-vertical cart-to\">Add to Cart</a>\t\t\t\t\t\n");
      out.write("                            <div class=\"clearfix\"></div>\n");
      out.write("                        </div>\n");
      out.write("                            <h5>Số lượng còn lại:");
      out.print(book.getBook_number());
      out.write("</h5>\n");
      out.write("                        <div class=\"available\">\n");
      out.write("                            <h6>Available Options :</h6>\n");
      out.write("                            <ul>\n");
      out.write("                                <li>Color:\n");
      out.write("                                    <select>\n");
      out.write("                                        <option>Silver</option>\n");
      out.write("                                        <option>Black</option>\n");
      out.write("                                        <option>Dark Black</option>\n");
      out.write("                                        <option>Red</option>\n");
      out.write("                                    </select></li>\n");
      out.write("                                <li>Size:<select>\n");
      out.write("                                        <option>Large</option>\n");
      out.write("                                        <option>Medium</option>\n");
      out.write("                                        <option>small</option>\n");
      out.write("                                        <option>Large</option>\n");
      out.write("                                        <option>small</option>\n");
      out.write("                                    </select></li>\n");
      out.write("                                <li>Quality:<select>\n");
      out.write("                                        <option>1</option>\n");
      out.write("                                        <option>2</option>\n");
      out.write("                                        <option>3</option>\n");
      out.write("                                        <option>4</option>\n");
      out.write("                                        <option>5</option>\n");
      out.write("                                    </select></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <p>");
      out.print(book.getBook_des());
      out.write("</p>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clearfix\"> </div>\n");
      out.write("                <div class=\"content-top-in\">\n");
      out.write("                    ");

                        for (Book list : getbook.getSameCategory(book.getBook_id())) {

                    
      out.write("\n");
      out.write("                    <div class=\"col-md-4 top-single\">\n");
      out.write("                        <div class=\"col-md\">\n");
      out.write("                            <img  src=\"");
      out.print(list.getBook_img());
      out.write("\" alt=\"");
      out.print(list.getBook_des());
      out.write("\" />\t\n");
      out.write("                            <div class=\"top-content\">\n");
      out.write("                                <h5>");
      out.print(list.getBook_name());
      out.write("</h5>\n");
      out.write("                                <div class=\"white\">\n");
      out.write("                                    <a href=\"#\" class=\"hvr-shutter-in-vertical hvr-shutter-in-vertical2\">ADD TO CART</a>\n");
      out.write("                                    <p class=\"dollar\"><span class=\"in-dollar\">$</span><span>");
      out.print(list.getBookPrice());
      out.write("</span></p>\n");
      out.write("                                    <div class=\"clearfix\"></div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\t\t\t\t\t\t\t\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-3\">\n");
      out.write("                <div class=\"single-bottom\">\n");
      out.write("                    <h4>Categories</h4>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"#\"><i> </i>Fusce feugiat</a></li>\n");
      out.write("                        <li><a href=\"#\"><i> </i>Mascot Kitty</a></li>\n");
      out.write("                        <li><a href=\"#\"><i> </i>Fusce feugiat</a></li>\n");
      out.write("                        <li><a href=\"#\"><i> </i>Mascot Kitty</a></li>\n");
      out.write("                        <li><a href=\"#\"><i> </i>Fusce feugiat</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"single-bottom\">\n");
      out.write("                    <h4>Product Categories</h4>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"#\"><i> </i>feugiat(5)</a></li>\n");
      out.write("                        <li><a href=\"#\"><i> </i>Fusce (4)</a></li>\n");
      out.write("                        <li><a href=\"#\"><i> </i> feugiat (4)</a></li>\n");
      out.write("                        <li><a href=\"#\"><i> </i>Fusce (4)</a></li>\n");
      out.write("                        <li><a href=\"#\"><i> </i> feugiat(2)</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"single-bottom\">\n");
      out.write("                    <h4>Product Categories</h4>\n");
      out.write("                    <div class=\"product\">\n");
      out.write("                        <img class=\"img-responsive fashion\" src=\"images/st1.jpg\" alt=\"\">\n");
      out.write("                        <div class=\"grid-product\">\n");
      out.write("                            <a href=\"#\" class=\"elit\">Consectetuer adipiscing elit</a>\n");
      out.write("                            <span class=\"price price-in\"><small>$500.00</small> $400.00</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"> </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"product\">\n");
      out.write("                        <img class=\"img-responsive fashion\" src=\"images/st2.jpg\" alt=\"\">\n");
      out.write("                        <div class=\"grid-product\">\n");
      out.write("                            <a href=\"#\" class=\"elit\">Consectetuer adipiscing elit</a>\n");
      out.write("                            <span class=\"price price-in\"><small>$500.00</small> $400.00</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"> </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"product\">\n");
      out.write("                        <img class=\"img-responsive fashion\" src=\"images/st3.jpg\" alt=\"\">\n");
      out.write("                        <div class=\"grid-product\">\n");
      out.write("                            <a href=\"#\" class=\"elit\">Consectetuer adipiscing elit</a>\n");
      out.write("                            <span class=\"price price-in\"><small>$500.00</small> $400.00</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"> </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clearfix\"> </div>\n");
      out.write("        </div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
