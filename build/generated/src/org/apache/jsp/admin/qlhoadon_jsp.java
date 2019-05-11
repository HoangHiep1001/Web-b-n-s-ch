package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import model.Bill;
import getdata.BillDao;

public final class qlhoadon_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>QL Hóa Đơn</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            BillDao get = new BillDao();
            ArrayList<Bill> listbill = get.getListBill();
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("            <div id=\"wrapper\">\n");
      out.write("                <div id=\"leftBar\">\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write(" \n");
      out.write("            </div>\n");
      out.write("            <div id=\"rightContent\">\n");
      out.write("                <h3>Quản lí hóa đơn</h3>\n");
      out.write("                <div class=\"informasi\">\n");
      out.write("                    Quản lí hóa đơn\n");
      out.write("                </div>\n");
      out.write("                <table class=\"data\">\n");
      out.write("                    <tr class=\"data\">\n");
      out.write("                        <th class=\"data\" width=\"30px\">No</th>\n");
      out.write("                        <th class=\"data\">Mã hóa đơn</th>\n");
      out.write("                        <th class=\"data\">ID khách hàng</th>\n");
      out.write("                        <th class=\"data\">Tổng hóa đơn</th>\n");
      out.write("                        <th class=\"data\">Thanh toán</th>\n");
      out.write("                        <th class=\"data\">Địa chỉ</th>\n");
      out.write("                        <th class=\"data\">Ngày tạo</th>\n");
      out.write("                        <th class=\"data\" width=\"75px\">Tùy chọn</th>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        int dem = 0;
                        for (Bill b : listbill) {
                            dem++;

                    
      out.write("\n");
      out.write("                    <tr class=\"data\">\n");
      out.write("                        <td class=\"data\" width=\"30px\">");
      out.print(dem);
      out.write("</td>\n");
      out.write("                        <td class=\"data\">");
      out.print(b.getBillID());
      out.write("</td>\n");
      out.write("                        <td class=\"data\">");
      out.print(b.getUserID());
      out.write("a</td>\n");
      out.write("                        <td class=\"data\">");
      out.print(b.getTotal());
      out.write("</td>\n");
      out.write("                        <td class=\"data\">");
      out.print(b.getPayment());
      out.write("</td>\n");
      out.write("                        <td class=\"data\">");
      out.print(b.getAddress());
      out.write("</td>\n");
      out.write("                        <td class=\"data\">");
      out.print(b.getDate());
      out.write("</td>\n");
      out.write("                        <td class=\"data\" width=\"75px\">\n");
      out.write("                    <center>\n");
      out.write("                        <a href=\"#\"><img src=\"mos-css/img/oke.png\"></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("                        <a href=\"#\"><img src=\"mos-css/img/detail.png\"></a>\n");
      out.write("                    </center>\n");
      out.write("                    </td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
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
