/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getdata;

import connect.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Book;

/**
 *
 * @author admin
 */
public class GetBookByCategory {
    // get book from category_id
    public ArrayList<Book> getBook(long category_id) throws SQLException {
        ArrayList<Book> libook = new ArrayList<>();
        Connection connection = ConnectDB.getConnection();
        String sql = "SELECT * FROM book WHERE category_id = '" + category_id + "'";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Book book = new Book();
            book.setBook_id(rs.getInt("book_id"));
            book.setBookPrice(rs.getDouble("book_price"));
            book.setBook_name(rs.getString("book_name"));
            book.setBook_img(rs.getString("book_img"));
            book.setBook_des(rs.getString("book_des"));
            libook.add(book);
        }
        return libook;
    }
    public ArrayList<Book> getlistBook() throws SQLException {
        ArrayList<Book> libook = new ArrayList<>();
        Connection connection = ConnectDB.getConnection();
        String sql = "SELECT * FROM book";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Book book = new Book();
            book.setBook_id(rs.getInt("book_id"));
            book.setBookPrice(rs.getDouble("book_price"));
            book.setBook_name(rs.getString("book_name"));
            book.setBook_img(rs.getString("book_img"));
            book.setBook_des(rs.getString("book_des"));
            libook.add(book);
        }
        return libook;
    }
    // thêm mới dữ liệu
    public boolean insertCategory(Book b) {
        Connection connection = ConnectDB.getConnection();
        String sql = "insert into book values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareCall(sql);
            ps.setInt(1,b.getBook_id());
            ps.setInt(2, b.getCategory_id());
            ps.setString(3, b.getBook_name());
            ps.setString(4, b.getBook_img());
            ps.setDouble(5, b.getBookPrice());
            ps.setString(6, b.getBook_des());
            ps.setInt(7, b.getBook_number());
            return ps.executeUpdate() == 1;
        } catch (Exception e) {
        }
        return false;

    }
    // get detail book
    public Book getdetailBook(long book_id) throws SQLException {
        Connection connection = ConnectDB.getConnection();
        String sql = "SELECT * FROM book WHERE book_id='" + book_id + "'";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        Book sach = new Book();
        while (rs.next()) {
            sach.setBook_id(rs.getInt("book_id"));
            sach.setBookPrice(rs.getDouble("book_price"));
            sach.setBook_name(rs.getString("book_name"));
            sach.setBook_img(rs.getString("book_img"));
            sach.setBook_des(rs.getString("book_des"));
            sach.setCategory_id(rs.getInt("category_id"));
            sach.setBook_number(rs.getInt("book_number"));
        }
        return sach;
    }
    // lay ra cac product co cung danh muc
    public ArrayList<Book> getSameCategory(long book_id) throws SQLException{
        ArrayList<Book> libook = new ArrayList<>();
        GetBookByCategory get = new GetBookByCategory();
        Connection connection = ConnectDB.getConnection();
        String sql = "SELECT * FROM book WHERE category_id='"+get.getdetailBook(book_id).getCategory_id()+"'";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Book book = new Book();
            book.setBook_id(rs.getInt("book_id"));
            book.setBookPrice(rs.getDouble("book_price"));
            book.setBook_name(rs.getString("book_name"));
            book.setBook_img(rs.getString("book_img"));
            book.setBook_des(rs.getString("book_des"));
            libook.add(book);
        }
        return libook;
    }
    public static void main(String[] args) throws SQLException {
        GetBookByCategory get = new GetBookByCategory();
        System.out.println(get.getdetailBook(2).getCategory_id());
        for(Book book:get.getSameCategory(2)){
            System.out.println(book.getBook_name());
        }
    }
}
