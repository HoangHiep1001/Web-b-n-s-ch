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
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Users;

/**
 *
 * @author admin
 */
public class Checkmail {

    public ArrayList<Users> getListUser() throws SQLException {
        Connection connection = ConnectDB.getConnection();
        String sql = "SELECT * FROM user";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Users> list = new ArrayList();
        while (rs.next()) {
            Users u = new Users();
            u.setUserId(rs.getInt("userId"));
            u.setUserEmail(rs.getString("userEmail"));
            list.add(u);
        }
        return list;
    }

    public boolean check(String userEmail) {
        Connection connection = ConnectDB.getConnection();
        String sql = "select userEmail from user where userEmail= '" + userEmail + "'";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return true;
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    // insert an email to db
    public void insert(Users u) {
        Connection connection = ConnectDB.getConnection();
        String sql = "INSERT INTO user VALUE(?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, u.getUserId());
            ps.setString(2, u.getUserEmail());
            ps.setString(3, u.getUserPass());
            ps.setBoolean(4, u.isUserRole());
            ps.executeUpdate();
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(Checkmail.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // thêm dữ liệu mới
    public boolean insertCategory(Users u) {
        Connection connection = ConnectDB.getConnection();
        String sql = "insert into user values(?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareCall(sql);
            ps.setInt(1, u.getUserId());
            ps.setString(2, u.getUserEmail());
            return ps.executeUpdate() == 1;
        } catch (Exception e) {
        }
        return false;

    }

    // check mail khi login
    public boolean checkLogin(String email, String password) {
        Connection con = ConnectDB.getConnection();
        String sql = "select * from user where userEmail='" + email + "' and userPass='" + password + "'";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public static final String username = "admin";
    public static final String pass  = "123456"; 
// check login admin


    public boolean checkLoginAdmin(String ten, String password) {
        if ("admin".equals(ten) && "123456".equals(password)) {
			return true;
		} else {
			return false;
		}
    }
//    public boolean checkLogin(String email, String password) {
//        Connection con = ConnectDB.getConnection();
//        String sql = "SELECT * FROM user WHERE userEmail='" + email + "' AND userPass='" + password + "'";
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            while(rs.next()){
//                return true;
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return false;
//    }
}
