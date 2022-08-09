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
import model.Product;
import model.User;

/**
 *
 * @author huynq
 */
public class HomeDAO {

    public List<Product> getTop6() throws Exception {
        JDBCConnection db = new JDBCConnection();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String query = "select * from Products \n"
                    + "order by id desc limit 6";
            List<Product> list = new ArrayList<>();
            conn = db.getJDBCConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("quantity"),
                        rs.getDouble("price"),
                        rs.getInt("category"),
                        rs.getString("thumbnail"),
                        rs.getString("description"),
                        rs.getString("unit"),
                        rs.getInt("creatorId")
                );
                list.add(p);
            }
            return list;
        } catch (Exception e) {
            throw e;
        }
    }
    public List<Product> getTop3Recom(int start, int quantity) throws Exception {
        JDBCConnection db = new JDBCConnection();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String query = "select * from Products \n"
                    + "order by id asc limit ?,?";
            List<Product> list = new ArrayList<>();
            conn = db.getJDBCConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, start);
            ps.setInt(2, quantity);
            rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("quantity"),
                        rs.getDouble("price"),
                        rs.getInt("category"),
                        rs.getString("thumbnail"),
                        rs.getString("description"),
                        rs.getString("unit"),
                        rs.getInt("creatorId"));
                list.add(p);
            }
            return list;
        } catch (Exception e) {
            throw e;
        }
    }
    public static void main(String[] args) throws Exception {
        List<Product> list = new ArrayList<>();
        HomeDAO p = new HomeDAO();
        list = p.getTop3Recom(0, 3);
        System.out.println(list.size());
    }
}
