/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LAPTOP D&N
 */
public class JDBCConnection {
    
    public static Connection getJDBCConnection(){
        
        final String url = "jdbc:mysql://localhost:3306/shop?allowPublicKeyRetrieval=true&useSSL=false";
        final String user = "sa";
        final String password ="1234";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public static void main(String[] args) {
        Connection conn = getJDBCConnection();
        if(conn != null){
            System.out.println("Ket noi thanh cong");
        }else{
            System.out.println("That Bai");
        }
    }
}
