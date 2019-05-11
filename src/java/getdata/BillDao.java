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
import model.Bill;

/**
 *
 * @author admin
 */
public class BillDao {
   public ArrayList<Bill> getListBill() throws SQLException {
        Connection connection = ConnectDB.getConnection();
        String sql = "SELECT * FROM bill";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Bill> list = new ArrayList();
        while (rs.next()) {
            Bill bill = new Bill();
            bill.setBillID(rs.getInt("billID"));
            bill.setUserID(rs.getInt("userID"));
            bill.setTotal(rs.getDouble("total"));
            bill.setPayment(rs.getString("payment"));
            bill.setAddress(rs.getString("address"));
            bill.setDate(rs.getTimestamp("date"));
            list.add(bill);
        }
        return list;
    }

    public void insertBill(Bill bill) throws SQLException {
        Connection connection = ConnectDB.getConnection();
        String sql = "INSERT INTO bill VALUE(?,?,?,?,?,?)";
        PreparedStatement ps = connection.prepareCall(sql);
        ps.setInt(1, bill.getBillID());
        ps.setInt(2, bill.getUserID());
        ps.setDouble(3, bill.getTotal());
        ps.setString(4, bill.getPayment());
        ps.setString(5, bill.getAddress());
        ps.setTimestamp(6, bill.getDate());
        ps.executeUpdate();
}
}
