/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ProductCategoryDAO;
import dao.ProductDAO;
import dao.ProductFeedbackDAO;
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
import model.Product;
import model.ProductCategory;
import model.ProductFeedback;

/**
 *
 * @author dangd
 */
@WebServlet(name = "ProductDetail", urlPatterns = {"/productDetail"})
public class ProductDetailController extends HttpServlet {

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
//        processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        try {

            String id = request.getParameter("id");
            ProductDAO pDao = new ProductDAO();
            ProductCategoryDAO cDao = new ProductCategoryDAO();
            ProductFeedbackDAO fDao = new ProductFeedbackDAO();
            try {
                List<ProductCategory> list = cDao.allCategory();
                request.setAttribute("listC", list);
            } catch (Exception e) {
            }
            try {
                Product product = pDao.getProductByID(id);
                request.setAttribute("productDetail", product);
            } catch (Exception e) {
                throw e;
            }
            try {
                List<Product> list = pDao.getTop3Recom(0, 3);
                request.setAttribute("top3Recom1", list);
            } catch (Exception e) {
                throw e;
            }
            try {
                List<Product> list = pDao.getTop3Recom(3, 3);
                request.setAttribute("top3Recom2", list);
            } catch (Exception e) {
            }
            try {
                List<ProductFeedback> productFeedback = fDao.getFeedbackByProductID(id);
                request.setAttribute("productFeedback", productFeedback);
            } catch (Exception e) {
                throw e;
            }

            request.getRequestDispatcher("ProductDetail.jsp").forward(request, response);
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
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        try {

            String id = request.getParameter("id");
            ProductDAO pDao = new ProductDAO();
            ProductCategoryDAO cDao = new ProductCategoryDAO();
            ProductFeedbackDAO fDao = new ProductFeedbackDAO();
            try {
                List<ProductCategory> list = cDao.allCategory();
                request.setAttribute("listC", list);
            } catch (Exception e) {
            }
            try {
                Product product = pDao.getProductByID(id);
                request.setAttribute("productDetail", product);
            } catch (Exception e) {
                throw e;
            }
            try {
                List<Product> list = pDao.getTop3Recom(0, 3);
                request.setAttribute("top3Recom1", list);
            } catch (Exception e) {
                throw e;
            }
            try {
                List<Product> list = pDao.getTop3Recom(3, 3);
                request.setAttribute("top3Recom2", list);
            } catch (Exception e) {
            }
            try {
                List<ProductFeedback> productFeedback = fDao.getFeedbackByProductID(id);
                request.setAttribute("productFeedback", productFeedback);
            } catch (Exception e) {
                throw e;
            }

            request.getRequestDispatcher("ProductDetail.jsp").forward(request, response);
        } catch (Exception e) {
        }
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
