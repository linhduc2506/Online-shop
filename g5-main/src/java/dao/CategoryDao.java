/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Category;
import model.Product;

/**
 *
 * @author huynq
 */
public class CategoryDao {

    public List<Category> getAllCategories() throws Exception {
        JDBCConnection db = new JDBCConnection();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM shop.productcategories\n"
                    + "order by id";
            List<Category> list = new ArrayList<>();
            conn = db.getJDBCConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Category c = new Category(rs.getInt("id"),
                        rs.getString("name"));
                list.add(c);
            }
            return list;
        } catch (Exception e) {
            throw e;
        }
    }
}
