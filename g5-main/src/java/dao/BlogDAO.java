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
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Blog;
import model.BlogCategory;

/**
 *
 * @author LAPTOP D&N
 */
public class BlogDAO extends JDBCConnection {

    static public int total() throws SQLException {
        String query = "select COUNT(*) from Blogs";

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

    static public List<Blog> paging(int page) throws SQLException {
        List<Blog> list = new ArrayList<>();
        String query = "SELECT * FROM Blogs \n"
                + "inner join users on blogs.authorId = users.id \n"
                + "LIMIT ?, 3;";

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = null;

        try {
            conn = JDBCConnection.getJDBCConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, ((page - 1) * 3));
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Blog(rs.getInt("id"),
                        rs.getString("image"),
                        rs.getString("title"),
                        rs.getDate("createdAt"),
                        rs.getString("content"),
                        rs.getInt("category"),
                        rs.getInt("authorid")));
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

    static public List<Blog> getBlogbyCategory(String id) throws SQLException {
        List<Blog> list = new ArrayList<>();
        String query = "SELECT * FROM Blogs \n"
                + "inner join users on blogs.authorId = users.id \n"
                + "WHERE category = ?";

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = null;

        try {
            conn = JDBCConnection.getJDBCConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Blog(rs.getInt("id"),
                        rs.getString("image"),
                        rs.getString("title"),
                        rs.getDate("createdAt"),
                        rs.getString("content"),
                        rs.getInt("category"),
                        rs.getInt("authorid")));
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

    static public Blog getBlogByID(int id) throws SQLException {
        String query = "select * from Blogs \n"
                + "inner join users on blogs.authorId = users.id \n"
                + "where blogs.id=?";

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = null;

        try {
            conn = JDBCConnection.getJDBCConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Blog(rs.getInt("id"),
                        rs.getString("image"),
                        rs.getString("title"),
                        rs.getDate("createdAt"),
                        rs.getString("content"),
                        rs.getInt("category"),
                        rs.getInt("authorId"));
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

    static public List<Blog> getBlogbyAuthorID(int id) throws SQLException {
        List<Blog> list = new ArrayList<>();

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = null;

        String query = "SELECT * FROM Blogs WHERE authorId = ? ORDER BY id DESC";
        try {
            conn = JDBCConnection.getJDBCConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Blog(rs.getInt("id"),
                        rs.getString("image"),
                        rs.getString("title"),
                        rs.getDate("createdAt"),
                        rs.getString("content"),
                        rs.getInt("category"),
                        rs.getInt("authorid")));
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

    static public List<BlogCategory> getAllBlogCategory() throws SQLException {
        List<BlogCategory> list = new ArrayList<BlogCategory>();

        String query = "SELECT * FROM BlogCategories";
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = null;
        try {
            conn = JDBCConnection.getJDBCConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new BlogCategory(rs.getInt("id"), rs.getString("name")));
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

    static public Blog addBlog(String image, String title, Date createdAt, String content, String category, int authorId) throws SQLException {
        PreparedStatement ps = null;
        Connection conn = null;

        try {

            String query = "INSERT INTO Blogs (image, title, createdAt, content, category, authorId) VALUES (?, ?, ?, ?, ?, ?)";

            conn = JDBCConnection.getJDBCConnection();
            ps = conn.prepareStatement(query);

            ps.setString(1, image);
            ps.setString(2, title);
            ps.setDate(3, createdAt);
            ps.setString(4, content);
            ps.setString(5, category);
            ps.setInt(6, authorId);
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

    public void deleteBlog(int cid) throws SQLException{
        String query = "delete from Blogs where id = ?";

        PreparedStatement ps = null;
        Connection conn = null;

        try {
            conn = JDBCConnection.getJDBCConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, cid);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }
    
    static public List<Blog> search(String txtSearch) throws SQLException {
        List<Blog> list = new ArrayList<>();
        String query = "SELECT * FROM Blogs where Blogs.title like ? or Blogs.content like ?";

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
                list.add(new Blog(rs.getInt("id"),
                        rs.getString("image"),
                        rs.getString("title"),
                        rs.getDate("createdAt"),
                        rs.getString("content"),
                        rs.getInt("category"),
                        rs.getInt("authorid")));
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
    
    static public List<Blog> getAllBlog() throws SQLException {
        List<Blog> list = new ArrayList<>();

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = null;

        String query = "SELECT * FROM Blogs ORDER BY id DESC";
        try {
            conn = JDBCConnection.getJDBCConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Blog(rs.getInt("id"),
                        rs.getString("image"),
                        rs.getString("title"),
                        rs.getDate("createdAt"),
                        rs.getString("content"),
                        rs.getInt("category"),
                        rs.getInt("authorid")));
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
    
    static public void updateBlog(String image, String title, String content, String category, String id) throws SQLException {
        String query="UPDATE Blogs set image=?, title=?, content=?, category=?  where id = ?";
        
        Connection conn = null;
        PreparedStatement ps = null;
        
        try {
            conn = JDBCConnection.getJDBCConnection();
            ps = conn.prepareStatement(query);
            
            ps.setString(1, image);
            ps.setString(2, title);
            ps.setString(3, content);
            ps.setString(4, category);
            ps.setString(5, id);
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
    
    static public List<Blog> SortBy(String txtSearch) throws SQLException {
        List<Blog> list = new ArrayList<>();
        String query = "select * from blogs order by ? desc";

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conn = null;

        try {
            conn = JDBCConnection.getJDBCConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + txtSearch + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Blog(rs.getInt("id"),
                        rs.getString("image"),
                        rs.getString("title"),
                        rs.getDate("createdAt"),
                        rs.getString("content"),
                        rs.getInt("category"),
                        rs.getInt("authorid")));
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
        try {
            System.out.println(BlogDAO.total());
        } catch (SQLException ex) {
            Logger.getLogger(BlogDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
