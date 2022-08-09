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
import model.ProductFeedback;

/**
 *
 * @author dangd
 */
public class ProductFeedbackDAO {

    static public List<ProductFeedback> getFeedbackByProductID(String productID) throws SQLException {
        List<ProductFeedback> list = new ArrayList<ProductFeedback>();

        String query = "select feedbacklists.id, feedbacklists.userID, feedbacklists.productID, feedbacklists.rateStar, feedbacklists.cmt, feedbacklists.status, users.avatar AS avatar, users.username AS username \n"
                + "from feedbacklists \n"
                + "join products on products.id = feedbacklists.productID\n"
                + "join users on feedbacklists.userID = users.id\n"
                + "where products.id = ?";

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = null;

        try {
            conn = JDBCConnection.getJDBCConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, productID);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new ProductFeedback(
                        rs.getInt("id"),
                        rs.getInt("userID"),
                        rs.getInt("productID"),
                        rs.getInt("rateStar"),
                        rs.getString("cmt"),
                        rs.getBoolean("status"),
                        rs.getString("avatar"),
                        rs.getString("username")
                ));
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
        List<ProductFeedback> list = null;
        try {
            list = ProductFeedbackDAO.getFeedbackByProductID("1");
        } catch (SQLException ex) {
            Logger.getLogger(ProductFeedbackDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (ProductFeedback o : list) {
            System.out.println(o);
        }
    }

}
