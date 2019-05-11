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
public class ChiTietHD {
    private int billdetailID;
    private int billID;
    private int bookID;
    private double price;
    private int quantity;

    public ChiTietHD() {
    }

    public ChiTietHD(int billdetailID, int billID, int bookID, double price, int quantity) {
        this.billdetailID = billdetailID;
        this.billID = billID;
        this.bookID = bookID;
        this.price = price;
        this.quantity = quantity;
    }

    public int getBilldetailID() {
        return billdetailID;
    }

    public void setBilldetailID(int billdetailID) {
        this.billdetailID = billdetailID;
    }

    public int getBillID() {
        return billID;
    }

    public void setBillID(int billID) {
        this.billID = billID;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
