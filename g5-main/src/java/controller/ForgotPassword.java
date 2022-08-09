/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.UserDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Email;
import model.EmailUtil;
import model.User;

/**
 *
 * @author LAPTOP D&N
 */
@WebServlet(name = "ForgetPassword", urlPatterns = {"/forgot"})
public class ForgotPassword extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("forgotPassword.jsp").forward(request, response);
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
        try {
            String emailAddress = request.getParameter("email");
            String username = request.getParameter("name");
            UserDAO udao = new UserDAO();
            User user = udao.findByUsername(username, emailAddress);
            if (user == null) {
                request.setAttribute("err", "Name or Email  incorrect!!");
            } else {
                Email email = new Email();
                email.setFrom("hoangtungda0110@gmail.com");// mail
                email.setFromPassword("tung_2001");//password mail
                email.setTo(emailAddress);
                email.setSubject("Forgot password!!");
                StringBuilder sb = new StringBuilder();
                sb.append("Dear ").append(username).append("<br>");
                sb.append("Your are used the forgot password fuction<br>");
                sb.append("Your password is:<b>").append(user.getHashedPassword()).append("</b>").append("<br>");
                sb.append("Regards<br>");
                sb.append("Administrator auto tool");
                
                email.setContent(sb.toString());
                EmailUtil etil= new EmailUtil();
                etil.send(email);
                request.setAttribute("message", "Email sent to the email Address."
                        +"Please check your new password ");
            }
        } catch (MessagingException e) {
            request.setAttribute("error", e.getMessage());
        }
        request.getRequestDispatcher("forgotPassword.jsp").forward(request, response);
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
