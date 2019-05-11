/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import getdata.Checkmail;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Users;
import tools.MaHoa;

/**
 *
 * @author admin
 */
public class UserServlet extends HttpServlet {
    Checkmail checkmail = new Checkmail();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
        String userError = "";
        String passError = "";
        if(email.equals("")){
            userError = "Vui long nhap email !";
        }
        else if(checkmail.check(email)==true){
                userError = "Email đã được đăng kí";
        }
        if(userError.length() > 0){
            request.setAttribute("userError", userError);
        }
        if(pass.equals("")){
            passError = "Vui long nhap mat khau !";
        }
        if(passError.length() > 0){
            request.setAttribute("passError", passError);
        }
        request.setAttribute("email", email);
        request.setAttribute("pass", pass);
        String url= "/register.jsp";
        try {
            if(userError.length()==0 && passError.length()==0){
                Date id = new Date();
                Users user = new Users(email, MaHoa.maHoaDL(pass), false);
                checkmail.insert(user);
                url="/index.jsp";
            }
            else{
                url = "/register.jsp";
            }
            RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
            rd.forward(request, response);
        } catch (Exception e) {
        }
//        String command = request.getParameter("command");
//        String url = "";
//        Users user = new Users();
//        HttpSession session = request.getSession();
//        switch (command) {
//            case "insert":
//                user.setUserEmail(request.getParameter("email"));
//                user.setUserPass(request.getParameter("pass"));
//                user.setUserRole(false);
//                checkmail.insert(user);
//                session.setAttribute("user", user);
//                url = "/index.jsp";
//                break;
//            case "login":
//                user = checkmail.checkLogin(request.getParameter("email"),request.getParameter("pass"));
//                if(user !=null){
//                    session.setAttribute("user", user);
//                    url="/index.jsp";
//                }
//                else{
//                    request.setAttribute("Error", "Error email or password");
//                    url="/login.jsp";
//                }
//                break;
//        }
//        RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
//        rd.forward(request, response);
//
    }
}
