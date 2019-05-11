/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getdata;

import connect.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Bill;
import model.ChiTietHD;

/**
 *
 * @author admin
 */
public class BillDetailDao {
    public void insertBillDetail(ChiTietHD billdetail) throws SQLException{
        Connection connection = ConnectDB.getConnection();
        String sql = "INSERT INTO billdetail VALUE(?,?,?,?,?)";
            PreparedStatement ps = connection.prepareCall(sql);
            ps.setInt(1, billdetail.getBilldetailID());
            ps.setInt(2, billdetail.getBillID());
            ps.setInt(3, billdetail.getBookID());
            ps.setDouble(4, billdetail.getPrice());
            ps.setInt(5, billdetail.getQuantity());
            ps.executeUpdate();
    }
}
