package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class forgotPassword_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("       \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto:400,700\">\n");
      out.write("        <title>Forgot Password</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                color: #999;\n");
      out.write("                /*background: url('img/bg-01_1.jpg');*/\n");
      out.write("                font-family: 'Roboto', sans-serif;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("            .form-control {\n");
      out.write("                border-color: #eee;\n");
      out.write("                min-height: 41px;\n");
      out.write("                box-shadow: none !important;\n");
      out.write("            }\n");
      out.write("            .form-control:focus {\n");
      out.write("                border-color: #5cd3b4;\n");
      out.write("            }\n");
      out.write("            .form-control, .btn {        \n");
      out.write("                border-radius: 3px;\n");
      out.write("            }\n");
      out.write("            .signup-form {\n");
      out.write("                width: 500px;\n");
      out.write("                margin: 0 auto;\n");
      out.write("                padding: 30px 0;\n");
      out.write("            }\n");
      out.write("            .signup-form h2 {\n");
      out.write("                color: #333;\n");
      out.write("                margin: 0 0 30px 0;\n");
      out.write("                display: inline-block;\n");
      out.write("                padding: 0 30px 10px 0;\n");
      out.write("                border-bottom: 3px solid #5cd3b4;\n");
      out.write("            }\n");
      out.write("            .signup-form form {\n");
      out.write("                color: #999;\n");
      out.write("                border-radius: 3px;\n");
      out.write("                margin-bottom: 15px;\n");
      out.write("                background: #fff;\n");
      out.write("                box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\n");
      out.write("                padding: 30px;\n");
      out.write("            }\n");
      out.write("            .signup-form .form-group row {\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("            }\n");
      out.write("            .signup-form label {\n");
      out.write("                font-weight: normal;\n");
      out.write("                font-size: 14px;\n");
      out.write("                line-height: 2;\n");
      out.write("            }\n");
      out.write("            .signup-form input[type=\"checkbox\"] {\n");
      out.write("                position: relative;\n");
      out.write("                top: 1px;\n");
      out.write("            }\n");
      out.write("            .signup-form .btn {        \n");
      out.write("                font-size: 16px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                background: #5cd3b4;\n");
      out.write("                border: none;\n");
      out.write("                margin-top: 20px;\n");
      out.write("                min-width: 140px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .signup-form .btn:hover, .signup-form .btn:focus {\n");
      out.write("                background: #41cba9;\n");
      out.write("                outline: none !important;\n");
      out.write("            }\n");
      out.write("            .signup-form a {\n");
      out.write("                color: #5cd3b4;\n");
      out.write("                text-decoration: underline;\n");
      out.write("            }\n");
      out.write("            .signup-form a:hover {\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("            .signup-form form a {\n");
      out.write("                color: #5cd3b4;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\t\n");
      out.write("            .signup-form form a:hover {\n");
      out.write("                text-decoration: underline;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"signup-form\" >\n");
      out.write("        <!--begin of menu-->\n");
      out.write("\n");
      out.write("        <!--end of menu-->\n");
      out.write("        <div >\n");
      out.write("            <form action=\"ForgotPasswordController\" method=\"POST\" class=\"form-horizontal\" style=\"color: black\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-8 offset-4\">\n");
      out.write("                        <h2>ForgotPassword</h2>\n");
      out.write("                        <p style=\"color:greenyellow\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\t\t\t\n");
      out.write("\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <label class=\"col-form-label col-4\">Name</label>\n");
      out.write("                    <div class=\"col-8\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"name\" required=\"required\" style=\"border-color: black\">\n");
      out.write("                    </div>        \t\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <label class=\"col-form-label col-4\">Email</label>\n");
      out.write("                    <div class=\"col-8\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"email\" required=\"required\" style=\"border-color: black\">\n");
      out.write("                    </div>        \t\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"form-group row\">\n");
      out.write("                    <div class=\"col-8 offset-4\">\n");
      out.write("                        <p><label class=\"form-check-label\"><input type=\"checkbox\" required=\"required\"> I accept the <a href=\"#\">Terms of Use</a> &amp; <a href=\"#\">Privacy Policy</a>.</label></p>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary btn-lg\">Send</button>\n");
      out.write("                        <p style=\"color:red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.err}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("\n");
      out.write("                    </div>  \n");
      out.write("                </div> \t\n");
      out.write("            </form>\n");
      out.write("            <div class=\"form-group row\">\n");
      out.write("                <div class=\"col-8 offset-4\">\n");
      out.write("                    <button type=\"\" class=\"btn btn-primary btn-lg\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/home\" style=\"color:white\">Home</a></button>\n");
      out.write("                </div>  \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
