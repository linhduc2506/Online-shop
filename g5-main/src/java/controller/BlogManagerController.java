/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.BlogDAO;
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
import model.Blog;
import model.BlogCategory;
import model.User;

/**
 *
 * @author LAPTOP D&N
 */
@WebServlet(name = "BlogManagerController", urlPatterns = {"/blogmanager"})
public class BlogManagerController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

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
        HttpSession session = request.getSession();
        
        if (session == null || session.getAttribute("acc") == null) {
            response.sendRedirect(request.getContextPath() + "/login");
            return;
        }
            
        User userId = (User) session.getAttribute("acc");
        int id = userId.getId();
        
        List<Blog> listBlog = null;
        List<BlogCategory> listBlogCategory = null;
        try {
            listBlog = BlogDAO.getAllBlog();
            listBlogCategory = BlogDAO.getAllBlogCategory();
        } catch (SQLException ex) {
            Logger.getLogger(BlogManagerController.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.setAttribute("listBlog", listBlog);
        request.setAttribute("listBlogCategory", listBlogCategory);
        request.getRequestDispatcher("BlogManager2.jsp").forward(request, response);
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
        String txtSearch = request.getParameter("table_search");

        List<Blog> listBlog = null;
        List<BlogCategory> listBlogCategory = null;
        try {
            listBlog = BlogDAO.search(txtSearch);
            listBlogCategory = BlogDAO.getAllBlogCategory();
        } catch (SQLException ex) {
            Logger.getLogger(BlogManagerController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        request.setAttribute("listBlog", listBlog);
        request.setAttribute("listBlog", listBlog);
        request.setAttribute("listBlogCategory", listBlogCategory);
        request.getRequestDispatcher("BlogManager2.jsp").forward(request, response);
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
