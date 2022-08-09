/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Cart;
import model.Carts;
import model.Product;

/**
 *
 * @author dangd
 */
@WebServlet(name = "CartController", urlPatterns = {"/cart"})
public class CartController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CartController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CartController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session =request.getSession(true);
        Carts cart;
        cart = null;
        Object o=session.getAttribute("cart");
        //co roi
        if(o!=null){
            cart=(Carts)o;
        }else{
            cart=new Carts();
        }
            String tnum=request.getParameter("num").trim();
            String id=request.getParameter("id");
            int num,idInt;
            Product p = null;
            try{
               idInt=Integer.parseInt(id);
               ProductDAO pdb=new ProductDAO();
            try {
                p=ProductDAO.getProductByID(id);
            } catch (SQLException ex) {
                Logger.getLogger(CartController.class.getName()).log(Level.SEVERE, null, ex);
            }
               int realnum=p.getQuantity();
               num=Integer.parseInt(tnum);
               if((num==-1) &&(cart.getQuantityById(idInt)<=1)){
                   cart.removeCart(idInt);
               }else{ 
                 if((num==1)&& cart.getQuantityById(idInt)>=realnum){
                     num=0;
                 } 
                 double price=p.getPrice();
                 Cart t=new Cart(p,num, price);  
                 cart.addCart(t);
               }      
            }catch(NumberFormatException e){
                System.out.println(e);
            }
        List<Cart> list=cart.getCarts();
        session.setAttribute("cart", cart);
        session.setAttribute("size", list.size());
        request.getRequestDispatcher("Cart.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session =request.getSession(true);
        Carts cart=null;
        Object o=session.getAttribute("cart");
        //co roi
        if(o!=null){
            cart=(Carts)o;
        }else{
            cart=new Carts();
        }
        int id=Integer.parseInt(request.getParameter("id"));
        cart.removeCart(id);
        
        List<Cart> list=cart.getCarts();
        
        session.setAttribute("cart", cart);
        session.setAttribute("size", list.size());
        request.getRequestDispatcher("Cart.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
