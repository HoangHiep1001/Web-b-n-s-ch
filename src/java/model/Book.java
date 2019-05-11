/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author admin
 */
public class Book {
    private int book_id;
    private int category_id;
    private String book_name;
    private String book_img;
    private double bookPrice;
    private String book_des;
    private int book_number;

    public String getBook_des() {
        return book_des;
    }

    public void setBook_des(String book_des) {
        this.book_des = book_des;
    }

    public Book() {
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public int getBook_number() {
        return book_number;
    }

    public void setBook_number(int book_number) {
        this.book_number = book_number;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_img() {
        return book_img;
    }

    public void setBook_img(String book_img) {
        this.book_img = book_img;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    @Override
    public String toString() {
        return "Book{" + "book_id=" + book_id + ", category_id=" + category_id + ", book_name=" + book_name + ", book_img=" + book_img + ", bookPrice=" + bookPrice + ", book_des=" + book_des + '}';
    }
    
    
}
