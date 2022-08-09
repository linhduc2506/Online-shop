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
import model.Blog;
import model.User;
import utility.PasswordAuthentication;

/**
 *
 * @author LAPTOP D&N
 */
public class UserDAO {

    static public User findByUsername(String username, String email) {
        String query = "SELECT * from Users\n"
                + "WHERE username = ? and email= ?";

        try {
            Connection conn = JDBCConnection.getJDBCConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, email);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("username"));
                return new User(rs.getInt("id"),
                        rs.getString("email"),
                        rs.getString("username"),
                        rs.getString("profile"),
                        rs.getString("role"),
                        rs.getString("address"),
                        rs.getString("phone"),
                        rs.getString("gender"),
                        rs.getString("status"),
                        rs.getString("password"),
                        rs.getString("avatar"),
                        rs.getString("shortDescription")
                );
            }
        } catch (Exception e) {
        }
        return null;
    }

    public User Login(String username, String password) {
        String query = "select * from Users where username = ? and password = ?";

        try {
            Connection conn = JDBCConnection.getJDBCConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new User(rs.getInt("id"),
                        rs.getString("email"),
                        rs.getString("username"),
                        rs.getString("profile"),
                        rs.getString("role"),
                        rs.getString("address"),
                        rs.getString("phone"),
                        rs.getString("gender"),
                        rs.getString("status"),
                        rs.getString("password"),
                        rs.getString("avatar"),
                        rs.getString("shortDescription")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public User Login2(String username, String password) throws Exception {
        String query = "select * from Users \n"
                + "INNER JOIN Roles ON Users.role = Roles.id \n"
                + "where username = ? and password = ?";

        try {
            Connection conn = JDBCConnection.getJDBCConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new User(rs.getInt("id"),
                        rs.getString("email"),
                        rs.getString("username"),
                        rs.getString("profile"),
                        rs.getString("role"),
                        rs.getString("address"),
                        rs.getString("phone"),
                        rs.getString("gender"),
                        rs.getString("status"),
                        rs.getString("password"),
                        rs.getString("avatar"),
                        rs.getString("shortDescription")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static User findById(int userid) {
        String query = "select * from Users where id=?";

        try {
            Connection conn = JDBCConnection.getJDBCConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, userid);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new User(rs.getInt("id"),
                        rs.getString("email"),
                        rs.getString("username"),
                        rs.getString("profile"),
                        rs.getString("role"),
                        rs.getString("address"),
                        rs.getString("phone"),
                        rs.getString("gender"),
                        rs.getString("status"),
                        rs.getString("password"),
                        rs.getString("avatar"),
                        rs.getString("shortDescription")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    static public User findByUsername2(String username) {
        String query = "SELECT * from Users\n "
                + "INNER JOIN Roles ON Users.role = Roles.id \n"
                + "WHERE username = ?";

        try {
            Connection conn = JDBCConnection.getJDBCConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, username);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("username"));
                return new User(rs.getInt("id"),
                        rs.getString("email"),
                        rs.getString("username"),
                        rs.getString("profile"),
                        rs.getString("role"),
                        rs.getString("address"),
                        rs.getString("phone"),
                        rs.getString("gender"),
                        rs.getString("status"),
                        rs.getString("password"),
                        rs.getString("avatar"),
                        rs.getString("shortDescription")
                );
            }
        } catch (Exception e) {
        }

        return null;
    }

    public static User add(String email, String username, String password, int role) {
        try {
            String query = "INSERT INTO Users (email, username, password, role) VALUES (?, ?, ?, ?)";

            Connection conn = JDBCConnection.getJDBCConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, email);
            ps.setString(2, username);
            ps.setString(3, password);
            ps.setInt(4, role);

            ps.executeUpdate();

        } catch (Exception e) {
        }

        return null;
    }

    static public User checkExistUser(String username) {
        String query = "SELECT * from Users\n "
                + "INNER JOIN Roles ON Users.role = Roles.id \n"
                + "WHERE username = ?";

        try {
            Connection conn = JDBCConnection.getJDBCConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("username"));
                return new User(rs.getInt("id"),
                        rs.getString("email"),
                        rs.getString("username"),
                        rs.getString("profile"),
                        rs.getString("role"),
                        rs.getString("address"),
                        rs.getString("phone"),
                        rs.getString("gender"),
                        rs.getString("status"),
                        rs.getString("password"),
                        rs.getString("avatar"),
                        rs.getString("shortDescription")
                );
            }
        } catch (Exception e) {
        }
        return null;
    }

    public void changePass(String password, int userId) {
        String query = " update Users set password = ? where id = ? ";
        try {
            Connection conn = JDBCConnection.getJDBCConnection();
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1, password);
            st.setInt(2, userId);
            st.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static public int total() throws SQLException {
        String query = "select COUNT(*) from Users";

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

    static public List<User> paging(int page) throws SQLException {
        List<User> list = new ArrayList<>();
        String query = "SELECT * FROM Users \n"
                + "inner join Roles on Users.id = Roles.id \n"
                + "LIMIT ?, 6;";

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = null;

        try {
            conn = JDBCConnection.getJDBCConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, ((page - 1) * 6));
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new User(rs.getInt("id"),
                        rs.getString("email"),
                        rs.getString("username"),
                        rs.getString("profile"),
                        rs.getString("role"),
                        rs.getString("address"),
                        rs.getString("phone"),
                        rs.getString("gender"),
                        rs.getString("status"),
                        rs.getString("password"),
                        rs.getString("avatar"),
                        rs.getString("shortDescription")));
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
    
    static public User updateProfile(String phone, String gender, String status, String shortDescription, String profile, String avatar, String address, int id) throws SQLException {
        String query = "UPDATE Users set  phone=?, gender=?, status=?, shortDescription=?, profile=?, avatar=?, address=?  where id = ?";

        PreparedStatement ps = null;
        Connection conn = null;

        try {
            conn = JDBCConnection.getJDBCConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, phone);
            ps.setString(2, gender);
            ps.setString(3, status);
            ps.setString(4, shortDescription);
            ps.setString(5, profile);
            ps.setString(6, avatar);
            ps.setString(7, address);
            ps.setInt(8, id);
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

    public static void main(String[] args) throws Exception {
        User u = UserDAO.findById(1); 
        System.out.println(u);
    }
}
