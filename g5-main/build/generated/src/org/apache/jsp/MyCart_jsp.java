package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MyCart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/contents/compontents/Footer.jsp");
  }

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header id=\"header\"><!--header-->\n");
      out.write("            <div class=\"header_top\"><!--header_top-->\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <div class=\"contactinfo\">\n");
      out.write("                                <ul class=\"nav nav-pills\">\n");
      out.write("                                    <li><a href=\"\"><i class=\"fa fa-phone\"></i> +2 95 01 88 821</a></li>\n");
      out.write("                                    <li><a href=\"\"><i class=\"fa fa-envelope\"></i> info@domain.com</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <div class=\"social-icons pull-right\">\n");
      out.write("                                <ul class=\"nav navbar-nav\">\n");
      out.write("                                    <li><a href=\"\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("                                    <li><a href=\"\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("                                    <li><a href=\"\"><i class=\"fa fa-linkedin\"></i></a></li>\n");
      out.write("                                    <li><a href=\"\"><i class=\"fa fa-dribbble\"></i></a></li>\n");
      out.write("                                    <li><a href=\"\"><i class=\"fa fa-google-plus\"></i></a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div><!--/header_top-->\n");
      out.write("\n");
      out.write("            <div class=\"header-middle\"><!--header-middle-->\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-4\">\n");
      out.write("                            <div class=\"logo pull-left\">\n");
      out.write("                                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/home\"><img src=\"contents/images/home/logo.png\" alt=\"\" /></a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"btn-group pull-right\">\n");
      out.write("                                <div class=\"btn-group\">\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-default dropdown-toggle usa\" data-toggle=\"dropdown\">\n");
      out.write("                                        USA\n");
      out.write("                                        <span class=\"caret\"></span>\n");
      out.write("                                    </button>\n");
      out.write("                                    <ul class=\"dropdown-menu\">\n");
      out.write("                                        <li><a href=\"\">Canada</a></li>\n");
      out.write("                                        <li><a href=\"\">UK</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"btn-group\">\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-default dropdown-toggle usa\" data-toggle=\"dropdown\">\n");
      out.write("                                        DOLLAR\n");
      out.write("                                        <span class=\"caret\"></span>\n");
      out.write("                                    </button>\n");
      out.write("                                    <ul class=\"dropdown-menu\">\n");
      out.write("                                        <li><a href=\"\">Canadian Dollar</a></li>\n");
      out.write("                                        <li><a href=\"\">Pound</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-8\">\n");
      out.write("                            <div class=\"shop-menu pull-right\">\n");
      out.write("                                <ul class=\"nav navbar-nav\">\n");
      out.write("                                    <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc != null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/profile\"><i class=\"fa fa-user\"></i> Hello ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${acc.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></li>\n");
      out.write("                                        </c:if>\n");
      out.write("                                    <li><a href=\"\"><i class=\"fa fa-star\"></i> Wishlist</a></li>\n");
      out.write("                                    <li><a href=\"checkout.html\"><i class=\"fa fa-crosshairs\"></i> Checkout</a></li>\n");
      out.write("                                    <li><a href=\"Cart.jsp\"><i class=\"fa fa-shopping-cart\"></i> Cart</a></li>\n");
      out.write("                                        <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc == null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                        <li><a href=\"Login.jsp\" class=\"active\"><i class=\"fa fa-lock\"></i> Login</a></li>\n");
      out.write("                                        </c:if>\n");
      out.write("                                        <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc != null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/logout\" class=\"active\"><i class=\"fa fa-lock\"></i> Logout</a></li>\n");
      out.write("                                        </c:if>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div><!--/header-middle-->\n");
      out.write("\n");
      out.write("            <div class=\"header-bottom\"><!--header-bottom-->\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-9\">\n");
      out.write("                            <div class=\"navbar-header\">\n");
      out.write("                                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("                                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                                    <span class=\"icon-bar\"></span>\n");
      out.write("                                    <span class=\"icon-bar\"></span>\n");
      out.write("                                    <span class=\"icon-bar\"></span>\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mainmenu pull-left\">\n");
      out.write("                                <ul class=\"nav navbar-nav collapse navbar-collapse\">\n");
      out.write("                                    <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/home\">Home</a></li>\n");
      out.write("                                    <li class=\"dropdown\"><a href=\"#\">Shop<i class=\"fa fa-angle-down\"></i></a>\n");
      out.write("                                        <ul role=\"menu\" class=\"sub-menu\">\n");
      out.write("                                            <li><a href=\"shop.html\">Products</a></li>\n");
      out.write("                                            <li><a href=\"product-details.html\">Product Details</a></li> \n");
      out.write("                                            <li><a href=\"checkout.html\">Checkout</a></li> \n");
      out.write("                                            <li><a href=\"cart.html\">Cart</a></li> \n");
      out.write("                                            <li><a href=\"login.html\" class=\"active\">Login</a></li> \n");
      out.write("                                        </ul>\n");
      out.write("                                    </li> \n");
      out.write("                                    <li class=\"dropdown\"><a href=\"#\">Blog<i class=\"fa fa-angle-down\"></i></a>\n");
      out.write("                                        <ul role=\"menu\" class=\"sub-menu\">\n");
      out.write("                                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/blog\">Blog List</a></li>\n");
      out.write("                                            <li><a href=\"blog-single.html\">Blog Single</a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </li> \n");
      out.write("                                    <li><a href=\"404.html\">404</a></li>\n");
      out.write("                                    <li><a href=\"contact-us.html\">Contact</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-3\">\n");
      out.write("                            <form action=\"#\" method=\"\">\n");
      out.write("                                <div class=\"search_box pull-right\">\n");
      out.write("                                    <input type=\"text\" placeholder=\"Search\" name=\"search\"/>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div><!--/header-bottom-->\n");
      out.write("        </header>\n");
      out.write("                                            \n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<footer id=\"footer\"><!--Footer-->\n");
      out.write("    <div class=\"footer-top\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-2\">\n");
      out.write("                    <div class=\"companyinfo\">\n");
      out.write("                        <h2><span>e</span>-shopper</h2>\n");
      out.write("                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,sed do eiusmod tempor</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-7\">\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <div class=\"video-gallery text-center\">\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div class=\"iframe-img\">\n");
      out.write("                                    <img src=\"contents/images/home/iframe1.png\" alt=\"\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"overlay-icon\">\n");
      out.write("                                    <i class=\"fa fa-play-circle-o\"></i>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                            <p>Circle of Hands</p>\n");
      out.write("                            <h2>24 DEC 2014</h2>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <div class=\"video-gallery text-center\">\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div class=\"iframe-img\">\n");
      out.write("                                    <img src=\"contents/images/home/iframe2.png\" alt=\"\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"overlay-icon\">\n");
      out.write("                                    <i class=\"fa fa-play-circle-o\"></i>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                            <p>Circle of Hands</p>\n");
      out.write("                            <h2>24 DEC 2014</h2>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <div class=\"video-gallery text-center\">\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div class=\"iframe-img\">\n");
      out.write("                                    <img src=\"contents/images/home/iframe3.png\" alt=\"\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"overlay-icon\">\n");
      out.write("                                    <i class=\"fa fa-play-circle-o\"></i>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                            <p>Circle of Hands</p>\n");
      out.write("                            <h2>24 DEC 2014</h2>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <div class=\"video-gallery text-center\">\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <div class=\"iframe-img\">\n");
      out.write("                                    <img src=\"contents/images/home/iframe4.png\" alt=\"\" />\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"overlay-icon\">\n");
      out.write("                                    <i class=\"fa fa-play-circle-o\"></i>\n");
      out.write("                                </div>\n");
      out.write("                            </a>\n");
      out.write("                            <p>Circle of Hands</p>\n");
      out.write("                            <h2>24 DEC 2014</h2>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <div class=\"address\">\n");
      out.write("                        <img src=\"contents/images/home/map.png\" alt=\"\" />\n");
      out.write("                        <p>505 S Atlantic Ave Virginia Beach, VA(Virginia)</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"footer-widget\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-2\">\n");
      out.write("                    <div class=\"single-widget\">\n");
      out.write("                        <h2>Service</h2>\n");
      out.write("                        <ul class=\"nav nav-pills nav-stacked\">\n");
      out.write("                            <li><a href=\"\">Online Help</a></li>\n");
      out.write("                            <li><a href=\"\">Contact Us</a></li>\n");
      out.write("                            <li><a href=\"\">Order Status</a></li>\n");
      out.write("                            <li><a href=\"\">Change Location</a></li>\n");
      out.write("                            <li><a href=\"\">FAQ???s</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-2\">\n");
      out.write("                    <div class=\"single-widget\">\n");
      out.write("                        <h2>Quock Shop</h2>\n");
      out.write("                        <ul class=\"nav nav-pills nav-stacked\">\n");
      out.write("                            <li><a href=\"\">T-Shirt</a></li>\n");
      out.write("                            <li><a href=\"\">Mens</a></li>\n");
      out.write("                            <li><a href=\"\">Womens</a></li>\n");
      out.write("                            <li><a href=\"\">Gift Cards</a></li>\n");
      out.write("                            <li><a href=\"\">Shoes</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-2\">\n");
      out.write("                    <div class=\"single-widget\">\n");
      out.write("                        <h2>Policies</h2>\n");
      out.write("                        <ul class=\"nav nav-pills nav-stacked\">\n");
      out.write("                            <li><a href=\"\">Terms of Use</a></li>\n");
      out.write("                            <li><a href=\"\">Privecy Policy</a></li>\n");
      out.write("                            <li><a href=\"\">Refund Policy</a></li>\n");
      out.write("                            <li><a href=\"\">Billing System</a></li>\n");
      out.write("                            <li><a href=\"\">Ticket System</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-2\">\n");
      out.write("                    <div class=\"single-widget\">\n");
      out.write("                        <h2>About Shopper</h2>\n");
      out.write("                        <ul class=\"nav nav-pills nav-stacked\">\n");
      out.write("                            <li><a href=\"\">Company Information</a></li>\n");
      out.write("                            <li><a href=\"\">Careers</a></li>\n");
      out.write("                            <li><a href=\"\">Store Location</a></li>\n");
      out.write("                            <li><a href=\"\">Affillate Program</a></li>\n");
      out.write("                            <li><a href=\"\">Copyright</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3 col-sm-offset-1\">\n");
      out.write("                    <div class=\"single-widget\">\n");
      out.write("                        <h2>About Shopper</h2>\n");
      out.write("                        <form action=\"#\" class=\"searchform\">\n");
      out.write("                            <input type=\"text\" placeholder=\"Your email address\" />\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-default\"><i class=\"fa fa-arrow-circle-o-right\"></i></button>\n");
      out.write("                            <p>Get the most recent updates from <br />our site and be updated your self...</p>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"footer-bottom\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <p class=\"pull-left\">Copyright ?? 2013 E-SHOPPER Inc. All rights reserved.</p>\n");
      out.write("                <p class=\"pull-right\">Designed by <span><a target=\"_blank\" href=\"http://www.themeum.com\">Themeum</a></span></p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"contents/js/jquery.js\"></script>\n");
      out.write("        <script src=\"contents/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"contents/js/jquery.scrollUp.min.js\"></script>\n");
      out.write("        <script src=\"contents/js/price-range.js\"></script>\n");
      out.write("        <script src=\"contents/js/jquery.prettyPhoto.js\"></script>\n");
      out.write("        <script src=\"contents/js/main.js\"></script>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function buy(id, quantity) {\n");
      out.write("                var m = document.f.num.value;\n");
      out.write("                if (m > quantity) {\n");
      out.write("                alert(\"Khong du hang\");\n");
      out.write("                    return;\n");
      out.write("                } else {\n");
      out.write("                document.f.action = \"addtocart?id=\" + id;\n");
      out.write("                    document.f.submit();\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>                                    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
