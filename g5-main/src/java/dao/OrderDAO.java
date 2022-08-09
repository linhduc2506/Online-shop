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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.Cart;
import model.Carts;
import model.Order;
import model.OrderProduct;
import model.Product;

/**
 *
 * @author Admin
 */
public class OrderDAO extends Model {

    public void addOrder(int id, Carts carts) throws Exception {
        LocalDate curDate = java.time.LocalDate.now();
        String date = curDate.toString();
        PreparedStatement ps = null;
        Connection conn = null;
        try {
            conn = JDBCConnection.getJDBCConnection();
            //add vào bảng Order
            String sql = "INSERT INTO Orders (buyerId, createdAt, updatedAt, status) VALUES(?,?,?,?)";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1, id);
            st.setString(2, date);
            st.setString(3, date);
            st.setInt(4, 1);
            st.executeUpdate();

            //lấy ra id của Order vừa add
            String sql1 = "select * from Orders \n"
                    + "order by id desc\n"
                    + "limit 1";
            PreparedStatement st1 = conn.prepareStatement(sql1);
            ResultSet rs = st1.executeQuery();

            //add vào bảng OrderProduct
            if (rs.next()) {
                int oid = rs.getInt(1);
                for (Cart i : carts.getCarts()) {
                    String sql2 = "INSERT INTO OrderProduct (orderId, productId, quantity) VALUES(?,?,?)";
                    PreparedStatement st2 = conn.prepareStatement(sql2);
                    st2.setInt(1, oid);
                    st2.setInt(2, i.getProduct().getId());
                    st2.setInt(3, i.getQuantity());
                    st2.executeUpdate();
                }
            }
            //update so luong trong bang Product sau khi ban
            String sql3 = "update Products set quantity = quantity - ? "
                    + "where id = ?";
            PreparedStatement st3 = conn.prepareStatement(sql3);
            for (Cart i : carts.getCarts()) {
                st3.setInt(1, i.getQuantity());
                st3.setInt(2, i.getProduct().getId());
                st3.executeUpdate();
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    static public List<Order> getOrderByUserid(int userId) {
        List<Order> list = new ArrayList<>();
        String query = "select * from Orders\n"
                + "where buyerId =?";
        try {
            Connection conn = JDBCConnection.getJDBCConnection();
            PreparedStatement ps = conn.prepareStatement(query);

            ps.setInt(1, userId);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Order(
                        rs.getInt("id"),
                        rs.getInt("buyerId"),
                        rs.getString("createdAt"),
                        rs.getString("updatedAt"),
                        rs.getInt("status")));
            }
        } catch (Exception e) {
        }
        return list;
    }

    static public List<Product> getProductByBuyerId(int buyerId) {
        List<Product> list = new ArrayList<>();
        String query = "select Products.id, Products.name, Products.quantity, Products.price, Products.category, Products.thumbnail, Products.description, Products.unit, Orders.id as orderId\n"
                + "from Orders join OrderProduct on Orders.id = OrderProduct.orderId\n"
                + "join Products on OrderProduct.productId = Products.id\n"
                + "where Orders.buyerId = ?";
        try {
            Connection conn = JDBCConnection.getJDBCConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, buyerId);

            ResultSet rs = ps.executeQuery();
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
                        rs.getInt("orderId")//khong dung creatorId nen luu tam orderId vao bien nay
                ));
            }
        } catch (Exception e) {
        }

        return list;
    }

    static public List<OrderProduct> getOrderProductByBuyerId(int buyerId) {
        List<OrderProduct> list = new ArrayList<>();
        String query = "select orderproduct.* from orders join orderproduct on orders.id = orderproduct.orderId\n"
                + "where orders.buyerId = ?";
        try {
            Connection conn = JDBCConnection.getJDBCConnection();
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, buyerId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new OrderProduct(rs.getInt("id"),
                        rs.getInt("orderId"),
                        rs.getInt("productId"),
                        rs.getInt("quantity")));
            }
        } catch (Exception e) {
        }

        return list;
    }

    public static void main(String[] args) {
//        List<OrderStats> list = OrderDAO.revenueByMonth(1);
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i).getDate() + ": " + list.get(i).getTotal());
//        }
//        List<Product> pr = OrderDAO.getProductByBuyerId(1);
//        for(int i=0;i<pr.size();i++){
//            System.out.println(pr.get(i).getCreatorId() + pr.get(i).getName());
//        }
        List<OrderProduct> list = OrderDAO.getOrderProductByBuyerId(2);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list);
        }
    }
}
