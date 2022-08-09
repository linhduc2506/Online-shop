/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Blog;
import model.Customer;

/**
 *
 * @author LAPTOP D&N
 */
public class CustomerDAO {

    static public int total() throws SQLException {
        String query = "select COUNT(*) from Customers";

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

    static public List<Customer> paging(int page) throws SQLException {
        List<Customer> list = new ArrayList<>();
        String query = "SELECT * FROM Customers \n"
                + "inner join users on Customers.creatorId = users.id \n"
                + "LIMIT ?, 10;";

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = null;

        try {
            conn = JDBCConnection.getJDBCConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, ((page - 1) * 10));
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Customer(
                        rs.getInt("id"),
                        rs.getString("email"),
                        rs.getString("fullname"),
                        rs.getString("address"),
                        rs.getString("phone"),
                        rs.getString("Gender"),
                        rs.getDate("createdAt"),
                        rs.getInt("creatorId"),
                        rs.getBoolean("act")));
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

    public void deleteCustomer(int cid) {
        String query = "delete from Customers where id = ?";

        PreparedStatement ps = null;
        Connection conn = null;

        try {
            System.out.println(cid);
            conn = JDBCConnection.getJDBCConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, cid);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static public List<Customer> search(String txtSearch) throws SQLException {
        List<Customer> list = new ArrayList<>();
        String query = "SELECT * FROM Customers where Customers.email like ? or Customers.fullname like ? or Customers.phone like ?";

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
                list.add(new Customer(
                        rs.getInt("id"),
                        rs.getString("email"),
                        rs.getString("fullname"),
                        rs.getString("address"),
                        rs.getString("phone"),
                        rs.getString("Gender"),
                        rs.getDate("createdAt"),
                        rs.getInt("creatorId"),
                        rs.getBoolean("act")));
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
    
    static public Customer getCustomerByID(int id) throws SQLException {
        String query = "select * from Customers \n"
                + "inner join users on Customers.creatorId = users.id \n"
                + "where Customers.id=?";

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = null;

        try {
            conn = JDBCConnection.getJDBCConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Customer(
                        rs.getInt("id"),
                        rs.getString("email"),
                        rs.getString("fullname"),
                        rs.getString("address"),
                        rs.getString("phone"),
                        rs.getString("Gender"),
                        rs.getDate("createdAt"),
                        rs.getInt("creatorId"),
                        rs.getBoolean("act"));
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
    
    static public void updateCustomer(String email, String fullname, String address, String phone, String Gender, int creatorId, boolean act, int id) throws SQLException {
        String query="UPDATE Customers set email=?, fullname=?, address=?, phone=?, Gender=?, creatorId=?, act=? where id = ?";
        
        Connection conn = null;
        PreparedStatement ps = null;
        
        try {
            conn = JDBCConnection.getJDBCConnection();
            ps = conn.prepareStatement(query);
            
            ps.setString(1, email);
            ps.setString(2, fullname);
            ps.setString(3, address);
            ps.setString(4, phone);
            ps.setString(5, Gender);
            ps.setInt(6, creatorId);
            ps.setBoolean(7, act);
            ps.setInt(8, id);
            ps.executeUpdate();
           
        } catch (Exception e){
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
    
    static public Blog addCustomer(String email, String fullname, String address, String phone, String Gender, Date createdAt, int creatorId, boolean act) throws SQLException {
        PreparedStatement ps = null;
        Connection conn = null;

        try {

            String query = "INSERT INTO Customers (email, fullname, address, phone, Gender, createdAt, creatorId, act) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            conn = JDBCConnection.getJDBCConnection();
            ps = conn.prepareStatement(query);

            ps.setString(1, email);
            ps.setString(2, fullname);
            ps.setString(3, address);
            ps.setString(4, phone);
            ps.setString(5, Gender);
            ps.setDate(6, createdAt);
            ps.setInt(7, creatorId);
            ps.setBoolean(8, act);
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

        return null;
    }

    public static void main(String[] args) throws SQLException {
        List<Customer> list = CustomerDAO.paging(1);
        for (Customer cus : list) {
            System.out.println(cus);
        }
    }
}
