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
import model.Category;

/**
 *
 * @author admin
 */
public class GetCategory {
    public ArrayList<Category> getListCategory() throws SQLException {
        Connection connection = ConnectDB.getConnection();
        String sql = "SELECT * FROM category";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Category> list = new ArrayList();
        while (rs.next()) {
            Category category = new Category();
            category.setCategory_id(rs.getInt("category_id"));
            category.setCategory_name(rs.getString("Category_name"));
            list.add(category);
        }
        return list;
    }

    // thêm dữ liệu mới
    public boolean insertCategory(Category c) {
        Connection connection = ConnectDB.getConnection();
        String sql = "insert into category values(?,?)";
        try {
            PreparedStatement ps = connection.prepareCall(sql);
            ps.setInt(1, c.getCategory_id());
            ps.setString(2, c.getCategory_name());
            return ps.executeUpdate() == 1;
        } catch (Exception e) {
        }
        return false;

    }

    // update data
    public boolean updateCategory(Category c) {
        Connection con = ConnectDB.getConnection();
        String sql = "update category set category_name = ? where category_id=?";
        try {
            PreparedStatement ps = con.prepareCall(sql);
            ps.setString(1, c.getCategory_name());
            ps.setInt(2, c.getCategory_id());
            return ps.executeUpdate() == 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    //delete data
    public boolean deleteCategory(int category_id) {
        Connection connection = ConnectDB.getConnection();
        String sql = "delete from category where category_id=?";
        try {
            PreparedStatement ps = connection.prepareCall(sql);
            ps.setInt(1, category_id);
            return ps.executeUpdate() == 1;
        } catch (Exception e) {
        }
        return false;
    }

    public static void main(String[] args) throws SQLException {
        GetCategory gt = new GetCategory();
        gt.deleteCategory(5);
}
}
