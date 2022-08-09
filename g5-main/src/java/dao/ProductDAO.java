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
import model.Product;
import model.ProductWithCateName;

/**
 *
 * @author dangd
 */
public class ProductDAO {

    static public List<Product> searchByName(String txtSearch) throws SQLException {
        List<Product> list = new ArrayList<Product>();

        String query = "SELECT * FROM products where products.name like ? or products.description like ?";

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = null;

        try {
            conn = JDBCConnection.getJDBCConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + txtSearch + "%");
            ps.setString(2, "%" + txtSearch + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("quantity"),
                        rs.getDouble("price"),
                        rs.getInt("category"),
                        rs.getString("thumbnail"),
                        rs.getString("description"),
                        rs.getString("unit"),
                        rs.getInt("creatorId")
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

    static public List<Product> getProductByCreatorID(int creatorId) throws SQLException {
        List<Product> list = new ArrayList<Product>();

        String query = "select * from products where products.creatorId = ?";

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = null;

        try {
            conn = JDBCConnection.getJDBCConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, creatorId);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("quantity"),
                        rs.getDouble("price"),
                        rs.getInt("category"),
                        rs.getString("thumbnail"),
                        rs.getString("description"),
                        rs.getString("unit"),
                        rs.getInt("creatorId")
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

    static public Product getProductByID(String id) throws SQLException {
        String query = "select * from products\n"
                + "inner join users on products.creatorId = users.id\n"
                + "where products.id = ?";

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = null;

        try {
            conn = JDBCConnection.getJDBCConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Product(
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

    static public Product getLatestProductByID() throws SQLException {
        String query = "select * from Products\n"
                + "order by id desc\n"
                + "limit 1";

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = null;

        try {
            conn = JDBCConnection.getJDBCConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Product(
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
        String query = "select COUNT(*) from Products ";

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

    static public List<Product> paging(int page) throws SQLException {
        List<Product> list = new ArrayList<>();
        String query = "SELECT * FROM products LIMIT ?, 6;";

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = null;

        try {
            conn = JDBCConnection.getJDBCConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, ((page - 1) * 6));
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("quantity"),
                        rs.getDouble("price"),
                        rs.getInt("category"),
                        rs.getString("thumbnail"),
                        rs.getString("description"),
                        rs.getString("unit"),
                        rs.getInt("creatorId")));
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

    static public List<ProductWithCateName> paging2(int page) throws SQLException {
        List<ProductWithCateName> list = new ArrayList<>();
        String query = "SELECT products.id, products.thumbnail, products.name, productcategories.name AS productCateName, products.quantity, products.price\n"
                + "FROM products join productcategories on products.category = productcategories.id\n"
                + "order by id asc\n"
                + "LIMIT ?, 4 ";

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = null;

        try {
            conn = JDBCConnection.getJDBCConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, ((page - 1) * 4));
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new ProductWithCateName(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("quantity"),
                        rs.getDouble("price"),
                        rs.getString("productCateName"),
                        rs.getString("thumbnail")));
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

    static public List<ProductWithCateName> searchByName2(String txtSearch) throws SQLException {
        List<ProductWithCateName> list = new ArrayList<>();
        String query = "SELECT products.id, products.thumbnail, products.name, productcategories.name AS productCateName, products.quantity, products.price\n"
                + "FROM products join productcategories on products.category = productcategories.id\n"
                + "where products.name like ? or productcategories.name like ? or products.thumbnail like ?";

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
                list.add(new ProductWithCateName(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("quantity"),
                        rs.getDouble("price"),
                        rs.getString("productCateName"),
                        rs.getString("thumbnail")));
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

    public static void addProduct(String name, String quantity, String price, String category, String thumbnail, String description) throws SQLException {
        String query = "INSERT INTO Products (name, quantity, price, category, thumbnail, description, creatorId)\n"
                + "VALUES (?, ?, ?, ?, ?, ?, 1)";

        JDBCConnection db = new JDBCConnection();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = db.getJDBCConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, quantity);
            ps.setString(3, price);
            ps.setString(4, category);
            ps.setString(5, thumbnail);
            ps.setString(6, description);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        }

    }

    public static void deleteProduct(int deleteID) throws SQLException {
//        String deleteAssociatedFeedbackQuery = "delete from ProductFeedbacks "
//                + "where orderProductId in "
//                + "(select id from OrderProduct where productId = ?)";
//
//        String deleteAssociatedOrderProductQuery = "delete from OrderProduct "
//                + "where productId = ?";

        String deleteProductQuery = "delete from Products "
                + "where id = ?";

//        PreparedStatement orderProductPS = null;
//        PreparedStatement feedbackPS = null;
        PreparedStatement productPS = null;
        JDBCConnection db = new JDBCConnection();
        Connection conn = null;
        try {
            conn = db.getJDBCConnection();

//            feedbackPS = conn.prepareStatement(deleteAssociatedFeedbackQuery);
//            orderProductPS = conn.prepareStatement(deleteAssociatedOrderProductQuery);
            productPS = conn.prepareStatement(deleteProductQuery);

//            feedbackPS.setInt(1, deleteID);
//            orderProductPS.setInt(1, deleteID);
            productPS.setInt(1, deleteID);

//            feedbackPS.executeUpdate();
//            orderProductPS.executeUpdate();
            productPS.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//            if (orderProductPS != null) {
//                orderProductPS.close();
//            }
//            if (feedbackPS != null) {
//                feedbackPS.close();
//            }
            if (productPS != null) {
                productPS.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    public static void editProduct(String name, String quantity, String price, String category, String thumbnail, String description, String id) throws SQLException {
        String query = "UPDATE products set name=?, quantity=?, price=?, category=?, thumbnail=?,  description=? where id = ?";

        JDBCConnection db = new JDBCConnection();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = db.getJDBCConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, quantity);
            ps.setString(3, price);
            ps.setString(4, category);
            ps.setString(5, thumbnail);
            ps.setString(6, description);
            ps.setString(7, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    public static void main(String[] args) {
//        List<Product> list = null;
//        try {
//            list = ProductDAO.searchByName("mauris");
//        } catch (SQLException ex) {
//            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        for (Product o : list) {
//            System.out.println(o);
//        }

//        List<Product> list = null;
//        try {
//            list = ProductDAO.paging(1);
//        } catch (SQLException ex) {
//            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        for (Product o : list) {
//            System.out.println(o);
//        }
//        List<ProductWithCateName> list2 = null;
//        try {
//            list2 = ProductDAO.paging2(3);
//        } catch (SQLException ex) {
//            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        for (ProductWithCateName o : list2) {
//            System.out.println(o);
//        }
//
//        try {
//            ProductDAO.deleteProduct(17);
//        } catch (SQLException ex) {
//            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
        List<ProductWithCateName> list = null;

        try {
            list = ProductDAO.searchByName2("china");
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (ProductWithCateName o : list) {
            System.out.println(o);
        }
    }
}
