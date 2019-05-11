/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import getdata.GetBookByCategory;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Book;
import model.Cart;
import model.Item;

/**
 *
 * @author admin
 */
public class CartServlet extends HttpServlet {
    private GetBookByCategory getbook = new GetBookByCategory();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String command = request.getParameter("command");
        String book_id = request.getParameter("book_id");
        Cart cart = (Cart) session.getAttribute("cart");
        Long bookID = Long.parseLong(book_id);
        try {
            Book book = getbook.getdetailBook(bookID);
            switch(command){
                case "plus":
                    if(cart.getCartItems().containsKey(bookID))
                        cart.insertBook(bookID, new Item(book,cart.getCartItems().get(bookID).getNumber()));
                    else{
                        cart.insertBook(bookID, new Item(book,1));
                    }
                    break;
                case "remove":
                    cart.subtocart(bookID, new Item(book,cart.getCartItems().get(bookID).getNumber()));
                    break;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CartServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        session.setAttribute("cart", cart);
        response.sendRedirect("/WebBook/index.jsp");
    }
    
}
