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
import model.SettingList;

/**
 *
 * @author dangd
 */
public class SettingListDAO {

    static public SettingList getSettingByID(String id) throws SQLException {
        String query = "select * from settingList\n"
                + "where id = ?";

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = null;

        try {
            conn = JDBCConnection.getJDBCConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new SettingList(
                        rs.getInt("id"),
                        rs.getString("stype"),
                        rs.getString("svalue"),
                        rs.getString("sorder"),
                        rs.getString("sclass"),
                        rs.getString("sstatus")
                );
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

        return null;
    }
    
    static public int total() throws SQLException {
        String query = "select COUNT(*) from settingList";

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = null;

        try {
            conn = JDBCConnection.getJDBCConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
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

        return 0;
    }
    
    static public List<SettingList> paging(int page) throws SQLException {
        List<SettingList> list = new ArrayList<>();
        String query = "SELECT * FROM settingList LIMIT ?, 6;";

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = null;

        try {
            conn = JDBCConnection.getJDBCConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, ((page - 1) * 6));
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new SettingList(rs.getInt("id"),
                        rs.getString("stype"),
                        rs.getString("svalue"),
                        rs.getString("sorder"),
                        rs.getString("sclass"),
                        rs.getString("sstatus")));
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
    
    static public List<SettingList> search(String txtSearch) throws SQLException {
        List<SettingList> list = new ArrayList<>();
        String query = "SELECT * FROM settinglist where settinglist.stype like ? or settinglist.svalue like ? or settinglist.sorder like ?";

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = null;

        try {
            conn = JDBCConnection.getJDBCConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + txtSearch + "%");
            ps.setString(2, "%" + txtSearch + "%");
            ps.setString(3, "%" + txtSearch + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new SettingList(rs.getInt("id"),
                        rs.getString("stype"),
                        rs.getString("svalue"),
                        rs.getString("sorder"),
                        rs.getString("sclass"),
                        rs.getString("sstatus")));
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
//        SettingList s = null;       
//        try {
//            s = SettingListDAO.getSettingByID("1");
//        } catch (SQLException ex) {
//            Logger.getLogger(SettingListDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }        
//        System.out.println(s);

        List<SettingList> list = null;
        try {
            list = SettingListDAO.search("change");
        } catch (SQLException ex) {
            Logger.getLogger(SettingListDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (SettingList o : list) {
            System.out.println(o);
        }
    }

}
