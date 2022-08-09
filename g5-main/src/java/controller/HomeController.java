/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ProductCategoryDAO;
import dao.HomeDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.ProductCategory;
import model.Product;

/**
 *
 * @author LAPTOP D&N
 */
@WebServlet(name = "HomeController", urlPatterns = {"/home"})
public class HomeController extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        try {
            HomeDAO pDao = new HomeDAO();
            ProductCategoryDAO cDao = new ProductCategoryDAO();
            try {
                List<ProductCategory> list = cDao.getAllCategories();
                request.setAttribute("cateList", list);
            } catch (Exception e) {
            }
            try {
                List<Product> list = pDao.getTop6();
                request.setAttribute("top6", list);
            } catch (Exception e) {
                throw e;
            }
            try {
                List<Product> list = pDao.getTop3Recom(0,3);
                request.setAttribute("top3Recom1", list);
            } catch (Exception e) {
                throw e;
            }
            try {
                List<Product> list = pDao.getTop3Recom(3, 3);
                request.setAttribute("top3Recom2", list);
            } catch (Exception e) {
            }
            request.getRequestDispatcher("HomePage.jsp").forward(request, response);
        } catch (Exception e) {
        }

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
