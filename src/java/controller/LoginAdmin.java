/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import getdata.Checkmail;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import tools.MaHoa;

/**
 *
 * @author admin
 */
public class LoginAdmin extends HttpServlet {
    Checkmail checkmail = new Checkmail();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getParameter("command").equals("logout")) {
            HttpSession session = request.getSession();
            session.invalidate();
            response.sendRedirect("/ShopBook/admin/login.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
        String err = "";
        if (email.equals("") || pass.equals("")) {
            err = "Vui long nhap day du thong tin";
        } else {
            if (checkmail.checkLoginAdmin(email, MaHoa.maHoaDL(pass)) == true) {
                err = "Tai khoan hoac mat khau khong chinh xac";
            }
        }
        if (err.length() > 0) {
            request.setAttribute("err", err);
        }
        String url = "/admin/login.jsp";
        try {
            if (err.length() > 0) {
                HttpSession session = request.getSession();
                session.setAttribute("email", email);
                url = "/admin/index.jsp";
            } else {
                url = "/admin/login.jsp";
            }
            RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
            rd.forward(request, response);
        } catch (Exception e) {
        }
    }
}
