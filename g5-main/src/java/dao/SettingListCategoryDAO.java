/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.SettingListCategory;

/**
 *
 * @author dangd
 */
public class SettingListCategoryDAO {
    static public List<SettingListCategory> allCategory() throws SQLException {
        List<SettingListCategory> list = new ArrayList<SettingListCategory>();

        String query = "SELECT * FROM settinglistcategory order by id asc";

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = null;

        try {
            conn = JDBCConnection.getJDBCConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new SettingListCategory(rs.getInt("id"), rs.getString("name")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        }

        return list;
    }
    
    public static void main(String[] args) {
        List<SettingListCategory> list = null;
        try {
            list = SettingListCategoryDAO.allCategory();
        } catch (SQLException ex) {
            Logger.getLogger(SettingListCategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (SettingListCategory o : list) {
            System.out.println(o);
        }
    }
}
