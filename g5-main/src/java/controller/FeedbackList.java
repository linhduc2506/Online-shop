/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.CategoryDao;
import dao.FeedbackListDAO;
import dao.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Category;
import model.Feedback;
import model.Product;

/**
 *
 * @author huynq
 */
public class FeedbackList extends HttpServlet {

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
            out.println("<title>Servlet FeedbackList</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet FeedbackList at " + request.getContextPath() + "</h1>");
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
//        processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        try {
            ProductDAO pDao = new ProductDAO();
            CategoryDao cDao = new CategoryDao();
            FeedbackListDAO fDAO = new FeedbackListDAO();
            //pagging
            try {

                String product = request.getParameter("product");
                String rateStar = request.getParameter("rate");
                String pageIndex = request.getParameter("index");
//                if (product==null) product = "";
//                if (rateStar == null) rateStar = "";
                if (pageIndex == null) {
                    pageIndex = "1";
                }
                int index = Integer.parseInt(pageIndex);
                int total = fDAO.count(product, rateStar);
                int pageSize = 3;
                int maxPage = total / pageSize;
                if (total % pageSize != 0) {
                    maxPage++;
                }
                if (index > maxPage) {
                    index = maxPage;
                }
                try {
                    List<Feedback> list = fDAO.getFeedbackList(product, rateStar, index, pageSize);
                    request.setAttribute("feedbackList", list);
                } catch (Exception e) {
                }
                request.setAttribute("maxPage", maxPage);
                request.setAttribute("product", product);
                request.setAttribute("index", index);
                request.setAttribute("rateStar", rateStar);
            } catch (Exception e) {
            }
            try {
                List<Category> list = cDao.getAllCategories();
                request.setAttribute("cateList", list);
            } catch (Exception e) {
            }
            try {
                List<Product> list = pDao.getAll();
                request.setAttribute("productList", list);
            } catch (Exception e) {
            }
            request.getRequestDispatcher("FeedBackList.jsp").forward(request, response);
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
        processRequest(request, response);
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
