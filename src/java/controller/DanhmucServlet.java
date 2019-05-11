/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import getdata.GetCategory;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Category;

/**
 *
 * @author admin
 */
public class DanhmucServlet extends HttpServlet {

    GetCategory get = new GetCategory();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String command = request.getParameter("command");
        String category_id = request.getParameter("category_id");
        String url = "";
        try {
            switch (command) {
                case "delete":
                    get.deleteCategory((int) Long.parseLong(category_id));
                    url = "/admin/qldanhmuc.jsp";
                    break;
            }
        } catch (Exception e) {
        }
        RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String command = request.getParameter("command");
        String tenDanhmuc = request.getParameter("tenDanhmuc");
        String url = " ";
        String err = "";
        if (tenDanhmuc.equals("")) {
            err = "Vui lòng nhập tên danh mục!";
            request.setAttribute("err", err);
        }
        try {
            if (err.length() == 0) {
                switch (command) {
                    case "insert":
                        get.insertCategory(new Category((int) new Date().getTime(), tenDanhmuc));
                        url = "/admin/qldanhmuc.jsp";
                        break;
                    case "update":
                        get.updateCategory(new Category((int) Long.parseLong(request.getParameter("category_id")), tenDanhmuc));
                        url = "/admin/qldanhmuc.jsp";
                        break;
                }
            } else {
                url = "/admin/insert_category.jsp";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
        rd.forward(request, response);
    }

}
