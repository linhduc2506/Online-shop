package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Feedback;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author huynq
 */
public class FeedbackListDAO {

    public List<Feedback> getAll() throws Exception {
        JDBCConnection db = new JDBCConnection();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM shop.feedbacklists";
            List<Feedback> list = new ArrayList<>();
            conn = db.getJDBCConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Feedback f = new Feedback(
                        rs.getInt("id"),
                        rs.getString("username"),
                        rs.getString("productname"),
                        rs.getInt("rateStar"),
                        rs.getString("cmt"),
                        true);
                list.add(f);
            }
            return list;
        } catch (Exception e) {
            throw e;
        }
    }

    public int count(String txt, String rateStar) throws Exception {
        JDBCConnection db = new JDBCConnection();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String query = "SELECT COUNT(*) FROM shop.feedbacklists where productname like ?";
            if (!rateStar.equals("")) {
                query += "and rateStar = ?";
            }
            conn = db.getJDBCConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + txt + "%");
            if (!rateStar.equals("")) {
                ps.setString(2, rateStar);
            }
            rs = ps.executeQuery();
            int count = 0;
            while (rs.next()) {
                count = rs.getInt(1);
            }
            return count;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public List<Feedback> getFeedbackList(String product, String rateStar, int pageIndex, int pageSize) throws Exception {
        JDBCConnection db = new JDBCConnection();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int from = pageSize * (pageIndex - 1);
        System.out.println("product" + product);
        System.out.println("rateStar" + rateStar);
        System.out.println("from" + from);
        System.out.println("pageSize" + pageSize);
        try {
            String query = "with r as (SELECT *,   \n"
                    + "    ROW_NUMBER() OVER(order by productname ASC, rateStar desc) AS rn \n"
                    + "FROM shop.feedbacklists where productname like ? and rateStar like ? )\n"
                    + "select * from r where rn limit ?,?";
            List<Feedback> list = new ArrayList<>();
            conn = db.getJDBCConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + product + "%");
            ps.setString(2, "%" + rateStar + "%");
            ps.setInt(3, from);
            ps.setInt(4, pageSize);
            rs = ps.executeQuery();
            while (rs.next()) {
                Feedback f = new Feedback(
                        rs.getInt("id"),
                        rs.getString("username"),
                        rs.getString("productname"),
                        rs.getInt("rateStar"),
                        rs.getString("cmt"),
                        true);
                list.add(f);
            }
            return list;
        } catch (Exception e) {
            throw e;
        }
    }
    

    public static void main(String[] args) throws Exception {
        FeedbackListDAO f = new FeedbackListDAO();
        System.out.println(f.getFeedbackList("White Dress", "5", 2, 3).size());
    }

    
}
