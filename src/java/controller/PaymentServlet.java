/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import getdata.BillDao;
import getdata.BillDetailDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Bill;
import model.Cart;
import model.ChiTietHD;
import model.Item;

/**
 *
 * @author admin
 */
public class PaymentServlet extends HttpServlet {
    private final BillDetailDao billd = new BillDetailDao();
    private final BillDao billdao = new BillDao();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String address = request.getParameter("address");
        String payment = request.getParameter("payment");
        HttpSession session = request.getSession();
        Cart cart = (Cart) session.getAttribute("cart");
        try {
            int ID = (int) new Date().getTime();
            Bill bill = new Bill();
            bill.setBillID(ID);
            bill.setUserID((int) new Date().getTime());
            bill.setTotal(cart.priceBook());
            bill.setPayment(payment);
            bill.setAddress(address);
            bill.setDate(new Timestamp(new Date().getTime()));
            ;
            billdao.insertBill(bill);
            for (Map.Entry<Long, Item> list : cart.getCartItems().entrySet()) {
                billd.insertBillDetail(new ChiTietHD((int) new Date().getTime(), ID, 
                        list.getValue().getBook().getBook_id(),
                        list.getValue().getBook().getBookPrice(),
                        list.getValue().getNumber()));
            }
            cart = new Cart();
            session.setAttribute("cart", cart);
        } catch (Exception e) {
        }
        response.sendRedirect("/ShopBook/index.jsp");

    }

}
