package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/contents/compontents/Import.jsp");
    _jspx_dependants.add("/contents/compontents/Header.jsp");
    _jspx_dependants.add("/contents/compontents/Footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("        <title>Home | E-Shopper</title>\n");
      out.write("        ");
      out.write("\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<meta name=\"description\" content=\"\">\n");
      out.write("<meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("<link href=\"contents/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"contents/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"contents/css/prettyPhoto.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"contents/css/price-range.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"contents/css/animate.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"contents/css/main.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"contents/css/responsive.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("<script src=\"js/html5shiv.js\"></script>\n");
      out.write("<script src=\"js/respond.min.js\"></script>\n");
      out.write("<![endif]-->       \n");
      out.write("\n");
      out.write("<link rel=\"shortcut icon\" href=\"images/ico/favicon.ico\">\n");
      out.write("<link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"contents/images/ico/apple-touch-icon-144-precomposed.png\">\n");
      out.write("<link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"contents/images/ico/apple-touch-icon-114-precomposed.png\">\n");
      out.write("<link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"contents/images/ico/apple-touch-icon-72-precomposed.png\">\n");
      out.write("<link rel=\"apple-touch-icon-precomposed\" href=\"contents/images/ico/apple-touch-icon-57-precomposed.png\">");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<header id=\"header\"><!--header-->\n");
      out.write("    <div class=\"header_top\"><!--header_top-->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <div class=\"contactinfo\">\n");
      out.write("                        <ul class=\"nav nav-pills\">\n");
      out.write("                            <li><a href=\"\"><i class=\"fa fa-phone\"></i> +2 95 01 88 821</a></li>\n");
      out.write("                            <li><a href=\"\"><i class=\"fa fa-envelope\"></i> info@domain.com</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <div class=\"social-icons pull-right\">\n");
      out.write("                        <ul class=\"nav navbar-nav\">\n");
      out.write("                            <li><a href=\"\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("                            <li><a href=\"\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("                            <li><a href=\"\"><i class=\"fa fa-linkedin\"></i></a></li>\n");
      out.write("                            <li><a href=\"\"><i class=\"fa fa-dribbble\"></i></a></li>\n");
      out.write("                            <li><a href=\"\"><i class=\"fa fa-google-plus\"></i></a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div><!--/header_top-->\n");
      out.write("\n");
      out.write("    <div class=\"header-middle\"><!--header-middle-->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                    <div class=\"logo pull-left\">\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/home\"><img src=\"contents/images/home/logo.png\" alt=\"\" /></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"btn-group pull-right\">\n");
      out.write("                        <div class=\"btn-group\">\n");
      out.write("                            <button type=\"button\" class=\"btn btn-default dropdown-toggle usa\" data-toggle=\"dropdown\">\n");
      out.write("                                USA\n");
      out.write("                                <span class=\"caret\"></span>\n");
      out.write("                            </button>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li><a href=\"\">Canada</a></li>\n");
      out.write("                                <li><a href=\"\">UK</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"btn-group\">\n");
      out.write("                            <button type=\"button\" class=\"btn btn-default dropdown-toggle usa\" data-toggle=\"dropdown\">\n");
      out.write("                                DOLLAR\n");
      out.write("                                <span class=\"caret\"></span>\n");
      out.write("                            </button>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li><a href=\"\">Canadian Dollar</a></li>\n");
      out.write("                                <li><a href=\"\">Pound</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-8\">\n");
      out.write("                    <div class=\"shop-menu pull-right\">\n");
      out.write("                        <ul class=\"nav navbar-nav\">\n");
      out.write("                            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            <li><a href=\"\"><i class=\"fa fa-star\"></i> Wishlist</a></li>\n");
      out.write("                            <li><a href=\"checkout.html\"><i class=\"fa fa-crosshairs\"></i> Checkout</a></li>\n");
      out.write("                            <li><a href=\"Cart.jsp\"><i class=\"fa fa-shopping-cart\"></i> Cart</a></li>\n");
      out.write("                            ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div><!--/header-middle-->\n");
      out.write("\n");
      out.write("    <div class=\"header-bottom\"><!--header-bottom-->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-9\">\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("                            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"mainmenu pull-left\">\n");
      out.write("                        <ul class=\"nav navbar-nav collapse navbar-collapse\">\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/home\">Home</a></li>\n");
      out.write("                            <li class=\"dropdown\"><a href=\"#\">Shop<i class=\"fa fa-angle-down\"></i></a>\n");
      out.write("                                <ul role=\"menu\" class=\"sub-menu\">\n");
      out.write("                                    <li><a href=\"shop.html\">Products</a></li>\n");
      out.write("                                    <li><a href=\"product-details.html\">Product Details</a></li> \n");
      out.write("                                    <li><a href=\"checkout.html\">Checkout</a></li> \n");
      out.write("                                    <li><a href=\"cart.html\">Cart</a></li> \n");
      out.write("                                    <li><a href=\"login.html\" class=\"active\">Login</a></li> \n");
      out.write("                                </ul>\n");
      out.write("                            </li> \n");
      out.write("                            <li class=\"dropdown\"><a href=\"#\">Blog<i class=\"fa fa-angle-down\"></i></a>\n");
      out.write("                                <ul role=\"menu\" class=\"sub-menu\">\n");
      out.write("                                    <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/blog\">Blog List</a></li>\n");
      out.write("                                    <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/addblog\">Add Blog</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li> \n");
      out.write("                            <li><a href=\"404.html\">404</a></li>\n");
      out.write("                            <li><a href=\"contact-us.html\">Contact</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <div class=\"search_box pull-right\">\n");
      out.write("                        <input type=\"text\" placeholder=\"Search\"/>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div><!--/header-bottom-->\n");
      out.write("</header>\n");
      out.write("                            \n");
      out.write("\n");
      out.write("\n");
      out.write("        <section id=\"slider\"><!--slider-->\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-12\">\n");
      out.write("                        <div id=\"slider-carousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                            <ol class=\"carousel-indicators\">\n");
      out.write("                                <li data-target=\"#slider-carousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                                <li data-target=\"#slider-carousel\" data-slide-to=\"1\"></li>\n");
      out.write("                                <li data-target=\"#slider-carousel\" data-slide-to=\"2\"></li>\n");
      out.write("                            </ol>\n");
      out.write("\n");
      out.write("                            <div class=\"carousel-inner\">\n");
      out.write("                                <div class=\"item active\">\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <h1><span>E</span>-SHOPPER</h1>\n");
      out.write("                                        <h2>Free E-Commerce Template</h2>\n");
      out.write("                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-default get\">Get it now</button>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <img src=\"contents/images/home/girl1.jpg\" class=\"girl img-responsive\" alt=\"\" />\n");
      out.write("                                        <img src=\"contents/images/home/pricing.png\"  class=\"pricing\" alt=\"\" />\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"item\">\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <h1><span>E</span>-SHOPPER</h1>\n");
      out.write("                                        <h2>100% Responsive Design</h2>\n");
      out.write("                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-default get\">Get it now</button>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <img src=\"contents/images/home/girl2.jpg\" class=\"girl img-responsive\" alt=\"\" />\n");
      out.write("                                        <img src=\"contents/images/home/pricing.png\"  class=\"pricing\" alt=\"\" />\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"item\">\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <h1><span>E</span>-SHOPPER</h1>\n");
      out.write("                                        <h2>Free Ecommerce Template</h2>\n");
      out.write("                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>\n");
      out.write("                                        <button type=\"button\" class=\"btn btn-default get\">Get it now</button>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <img src=\"contents/images/home/girl3.jpg\" class=\"girl img-responsive\" alt=\"\" />\n");
      out.write("                                        <img src=\"contents/images/home/pricing.png\" class=\"pricing\" alt=\"\" />\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <a href=\"#slider-carousel\" class=\"left control-carousel hidden-xs\" data-slide=\"prev\">\n");
      out.write("                                <i class=\"fa fa-angle-left\"></i>\n");
      out.write("                            </a>\n");
      out.write("                            <a href=\"#slider-carousel\" class=\"right control-carousel hidden-xs\" data-slide=\"next\">\n");
      out.write("                                <i class=\"fa fa-angle-right\"></i>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section><!--/slider-->\n");
      out.write("\n");
      out.write("        <section>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <div class=\"left-sidebar\">\n");
      out.write("                            <h2>Category</h2>\n");
      out.write("                            <div class=\"panel-group category-products\" id=\"accordian\"><!--category-productsr-->\n");
      out.write("                                <!--                                <div class=\"panel panel-default\">\n");
      out.write("                                                                    <div class=\"panel-heading\">\n");
      out.write("                                                                        <h4 class=\"panel-title\">\n");
      out.write("                                                                            <a data-toggle=\"collapse\" data-parent=\"#accordian\" href=\"#sportswear\">\n");
      out.write("                                                                                <span class=\"badge pull-right\"><i class=\"fa fa-plus\"></i></span>\n");
      out.write("                                                                                Sportswear\n");
      out.write("                                                                            </a>\n");
      out.write("                                                                        </h4>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <div id=\"sportswear\" class=\"panel-collapse collapse\">\n");
      out.write("                                                                        <div class=\"panel-body\">\n");
      out.write("                                                                            <ul>\n");
      out.write("                                                                                <li><a href=\"#\">Nike </a></li>\n");
      out.write("                                                                                <li><a href=\"#\">Under Armour </a></li>\n");
      out.write("                                                                                <li><a href=\"#\">Adidas </a></li>\n");
      out.write("                                                                                <li><a href=\"#\">Puma</a></li>\n");
      out.write("                                                                                <li><a href=\"#\">ASICS </a></li>\n");
      out.write("                                                                            </ul>\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                                <div class=\"panel panel-default\">\n");
      out.write("                                                                    <div class=\"panel-heading\">\n");
      out.write("                                                                        <h4 class=\"panel-title\">\n");
      out.write("                                                                            <a data-toggle=\"collapse\" data-parent=\"#accordian\" href=\"#mens\">\n");
      out.write("                                                                                <span class=\"badge pull-right\"><i class=\"fa fa-plus\"></i></span>\n");
      out.write("                                                                                Mens\n");
      out.write("                                                                            </a>\n");
      out.write("                                                                        </h4>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <div id=\"mens\" class=\"panel-collapse collapse\">\n");
      out.write("                                                                        <div class=\"panel-body\">\n");
      out.write("                                                                            <ul>\n");
      out.write("                                                                                <li><a href=\"#\">Fendi</a></li>\n");
      out.write("                                                                                <li><a href=\"#\">Guess</a></li>\n");
      out.write("                                                                                <li><a href=\"#\">Valentino</a></li>\n");
      out.write("                                                                                <li><a href=\"#\">Dior</a></li>\n");
      out.write("                                                                                <li><a href=\"#\">Versace</a></li>\n");
      out.write("                                                                                <li><a href=\"#\">Armani</a></li>\n");
      out.write("                                                                                <li><a href=\"#\">Prada</a></li>\n");
      out.write("                                                                                <li><a href=\"#\">Dolce and Gabbana</a></li>\n");
      out.write("                                                                                <li><a href=\"#\">Chanel</a></li>\n");
      out.write("                                                                                <li><a href=\"#\">Gucci</a></li>\n");
      out.write("                                                                            </ul>\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                \n");
      out.write("                                                                <div class=\"panel panel-default\">\n");
      out.write("                                                                    <div class=\"panel-heading\">\n");
      out.write("                                                                        <h4 class=\"panel-title\">\n");
      out.write("                                                                            <a data-toggle=\"collapse\" data-parent=\"#accordian\" href=\"#womens\">\n");
      out.write("                                                                                <span class=\"badge pull-right\"><i class=\"fa fa-plus\"></i></span>\n");
      out.write("                                                                                Womens\n");
      out.write("                                                                            </a>\n");
      out.write("                                                                        </h4>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <div id=\"womens\" class=\"panel-collapse collapse\">\n");
      out.write("                                                                        <div class=\"panel-body\">\n");
      out.write("                                                                            <ul>\n");
      out.write("                                                                                <li><a href=\"#\">Fendi</a></li>\n");
      out.write("                                                                                <li><a href=\"#\">Guess</a></li>\n");
      out.write("                                                                                <li><a href=\"#\">Valentino</a></li>\n");
      out.write("                                                                                <li><a href=\"#\">Dior</a></li>\n");
      out.write("                                                                                <li><a href=\"#\">Versace</a></li>\n");
      out.write("                                                                            </ul>\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>-->\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </div><!--/category-products-->\n");
      out.write("\n");
      out.write("                            <!--                            <div class=\"brands_products\">brands_products\n");
      out.write("                                                            <h2>Brands</h2>\n");
      out.write("                                                            <div class=\"brands-name\">\n");
      out.write("                                                                <ul class=\"nav nav-pills nav-stacked\">\n");
      out.write("                                                                    <li><a href=\"#\"> <span class=\"pull-right\">(50)</span>Acne</a></li>\n");
      out.write("                                                                    <li><a href=\"#\"> <span class=\"pull-right\">(56)</span>Grüne Erde</a></li>\n");
      out.write("                                                                    <li><a href=\"#\"> <span class=\"pull-right\">(27)</span>Albiro</a></li>\n");
      out.write("                                                                    <li><a href=\"#\"> <span class=\"pull-right\">(32)</span>Ronhill</a></li>\n");
      out.write("                                                                    <li><a href=\"#\"> <span class=\"pull-right\">(5)</span>Oddmolly</a></li>\n");
      out.write("                                                                    <li><a href=\"#\"> <span class=\"pull-right\">(9)</span>Boudestijn</a></li>\n");
      out.write("                                                                    <li><a href=\"#\"> <span class=\"pull-right\">(4)</span>Rösch creative culture</a></li>\n");
      out.write("                                                                </ul>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>/brands_products-->\n");
      out.write("\n");
      out.write("                            <div class=\"price-range\"><!--price-range-->\n");
      out.write("                                <h2>Price Range</h2>\n");
      out.write("                                <div class=\"well text-center\">\n");
      out.write("                                    <input type=\"text\" class=\"span2\" value=\"\" data-slider-min=\"0\" data-slider-max=\"600\" data-slider-step=\"5\" data-slider-value=\"[250,450]\" id=\"sl2\" ><br />\n");
      out.write("                                    <b class=\"pull-left\">$ 0</b> <b class=\"pull-right\">$ 600</b>\n");
      out.write("                                </div>\n");
      out.write("                            </div><!--/price-range-->\n");
      out.write("\n");
      out.write("                            <div class=\"shipping text-center\"><!--shipping-->\n");
      out.write("                                <img src=\"contents/images/home/shipping.jpg\" alt=\"\" />\n");
      out.write("                            </div><!--/shipping-->\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-sm-9 padding-right\">\n");
      out.write("                        <div class=\"features_items\"><!--features_items-->\n");
      out.write("                            <h2 class=\"title text-center\">Features Items</h2>\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </div><!--features_items-->\n");
      out.write("\n");
      out.write("                        <!--                        <div class=\"category-tab\">category-tab\n");
      out.write("                                                    <div class=\"col-sm-12\">\n");
      out.write("                                                        <ul class=\"nav nav-tabs\">\n");
      out.write("                                                            <li class=\"active\"><a href=\"#tshirt\" data-toggle=\"tab\">T-Shirt</a></li>\n");
      out.write("                                                            <li><a href=\"#blazers\" data-toggle=\"tab\">Blazers</a></li>\n");
      out.write("                                                            <li><a href=\"#sunglass\" data-toggle=\"tab\">Sunglass</a></li>\n");
      out.write("                                                            <li><a href=\"#kids\" data-toggle=\"tab\">Kids</a></li>\n");
      out.write("                                                            <li><a href=\"#poloshirt\" data-toggle=\"tab\">Polo shirt</a></li>\n");
      out.write("                                                        </ul>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"tab-content\">\n");
      out.write("                                                        <div class=\"tab-pane fade active in\" id=\"tshirt\" >\n");
      out.write("                                                            <div class=\"col-sm-3\">\n");
      out.write("                                                                <div class=\"product-image-wrapper\">\n");
      out.write("                                                                    <div class=\"single-products\">\n");
      out.write("                                                                        <div class=\"productinfo text-center\">\n");
      out.write("                                                                            <img src=\"contents/images/home/gallery1.jpg\" alt=\"\" />\n");
      out.write("                                                                            <h2>$56</h2>\n");
      out.write("                                                                            <p>Easy Polo Black Edition</p>\n");
      out.write("                                                                            <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("                                                                        </div>\n");
      out.write("                        \n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <div class=\"col-sm-3\">\n");
      out.write("                                                                <div class=\"product-image-wrapper\">\n");
      out.write("                                                                    <div class=\"single-products\">\n");
      out.write("                                                                        <div class=\"productinfo text-center\">\n");
      out.write("                                                                            <img src=\"contents/images/home/gallery2.jpg\" alt=\"\" />\n");
      out.write("                                                                            <h2>$56</h2>\n");
      out.write("                                                                            <p>Easy Polo Black Edition</p>\n");
      out.write("                                                                            <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("                                                                        </div>\n");
      out.write("                        \n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <div class=\"col-sm-3\">\n");
      out.write("                                                                <div class=\"product-image-wrapper\">\n");
      out.write("                                                                    <div class=\"single-products\">\n");
      out.write("                                                                        <div class=\"productinfo text-center\">\n");
      out.write("                                                                            <img src=\"contents/images/home/gallery3.jpg\" alt=\"\" />\n");
      out.write("                                                                            <h2>$56</h2>\n");
      out.write("                                                                            <p>Easy Polo Black Edition</p>\n");
      out.write("                                                                            <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("                                                                        </div>\n");
      out.write("                        \n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <div class=\"col-sm-3\">\n");
      out.write("                                                                <div class=\"product-image-wrapper\">\n");
      out.write("                                                                    <div class=\"single-products\">\n");
      out.write("                                                                        <div class=\"productinfo text-center\">\n");
      out.write("                                                                            <img src=\"contents/images/home/gallery4.jpg\" alt=\"\" />\n");
      out.write("                                                                            <h2>$56</h2>\n");
      out.write("                                                                            <p>Easy Polo Black Edition</p>\n");
      out.write("                                                                            <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("                                                                        </div>\n");
      out.write("                        \n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                        \n");
      out.write("                                                        <div class=\"tab-pane fade\" id=\"blazers\" >\n");
      out.write("                                                            <div class=\"col-sm-3\">\n");
      out.write("                                                                <div class=\"product-image-wrapper\">\n");
      out.write("                                                                    <div class=\"single-products\">\n");
      out.write("                                                                        <div class=\"productinfo text-center\">\n");
      out.write("                                                                            <img src=\"contents/images/home/gallery4.jpg\" alt=\"\" />\n");
      out.write("                                                                            <h2>$56</h2>\n");
      out.write("                                                                            <p>Easy Polo Black Edition</p>\n");
      out.write("                                                                            <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("                                                                        </div>\n");
      out.write("                        \n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <div class=\"col-sm-3\">\n");
      out.write("                                                                <div class=\"product-image-wrapper\">\n");
      out.write("                                                                    <div class=\"single-products\">\n");
      out.write("                                                                        <div class=\"productinfo text-center\">\n");
      out.write("                                                                            <img src=\"contents/images/home/gallery3.jpg\" alt=\"\" />\n");
      out.write("                                                                            <h2>$56</h2>\n");
      out.write("                                                                            <p>Easy Polo Black Edition</p>\n");
      out.write("                                                                            <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("                                                                        </div>\n");
      out.write("                        \n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <div class=\"col-sm-3\">\n");
      out.write("                                                                <div class=\"product-image-wrapper\">\n");
      out.write("                                                                    <div class=\"single-products\">\n");
      out.write("                                                                        <div class=\"productinfo text-center\">\n");
      out.write("                                                                            <img src=\"contents/images/home/gallery2.jpg\" alt=\"\" />\n");
      out.write("                                                                            <h2>$56</h2>\n");
      out.write("                                                                            <p>Easy Polo Black Edition</p>\n");
      out.write("                                                                            <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("                                                                        </div>\n");
      out.write("                        \n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <div class=\"col-sm-3\">\n");
      out.write("                                                                <div class=\"product-image-wrapper\">\n");
      out.write("                                                                    <div class=\"single-products\">\n");
      out.write("                                                                        <div class=\"productinfo text-center\">\n");
      out.write("                                                                            <img src=\"contents/images/home/gallery1.jpg\" alt=\"\" />\n");
      out.write("                                                                            <h2>$56</h2>\n");
      out.write("                                                                            <p>Easy Polo Black Edition</p>\n");
      out.write("                                                                            <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("                                                                        </div>\n");
      out.write("                        \n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                        \n");
      out.write("                                                        <div class=\"tab-pane fade\" id=\"sunglass\" >\n");
      out.write("                                                            <div class=\"col-sm-3\">\n");
      out.write("                                                                <div class=\"product-image-wrapper\">\n");
      out.write("                                                                    <div class=\"single-products\">\n");
      out.write("                                                                        <div class=\"productinfo text-center\">\n");
      out.write("                                                                            <img src=\"contents/images/home/gallery3.jpg\" alt=\"\" />\n");
      out.write("                                                                            <h2>$56</h2>\n");
      out.write("                                                                            <p>Easy Polo Black Edition</p>\n");
      out.write("                                                                            <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("                                                                        </div>\n");
      out.write("                        \n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <div class=\"col-sm-3\">\n");
      out.write("                                                                <div class=\"product-image-wrapper\">\n");
      out.write("                                                                    <div class=\"single-products\">\n");
      out.write("                                                                        <div class=\"productinfo text-center\">\n");
      out.write("                                                                            <img src=\"contents/images/home/gallery4.jpg\" alt=\"\" />\n");
      out.write("                                                                            <h2>$56</h2>\n");
      out.write("                                                                            <p>Easy Polo Black Edition</p>\n");
      out.write("                                                                            <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("                                                                        </div>\n");
      out.write("                        \n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <div class=\"col-sm-3\">\n");
      out.write("                                                                <div class=\"product-image-wrapper\">\n");
      out.write("                                                                    <div class=\"single-products\">\n");
      out.write("                                                                        <div class=\"productinfo text-center\">\n");
      out.write("                                                                            <img src=\"contents/images/home/gallery1.jpg\" alt=\"\" />\n");
      out.write("                                                                            <h2>$56</h2>\n");
      out.write("                                                                            <p>Easy Polo Black Edition</p>\n");
      out.write("                                                                            <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("                                                                        </div>\n");
      out.write("                        \n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <div class=\"col-sm-3\">\n");
      out.write("                                                                <div class=\"product-image-wrapper\">\n");
      out.write("                                                                    <div class=\"single-products\">\n");
      out.write("                                                                        <div class=\"productinfo text-center\">\n");
      out.write("                                                                            <img src=\"contents/images/home/gallery2.jpg\" alt=\"\" />\n");
      out.write("                                                                            <h2>$56</h2>\n");
      out.write("                                                                            <p>Easy Polo Black Edition</p>\n");
      out.write("                                                                            <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("                                                                        </div>\n");
      out.write("                        \n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                        \n");
      out.write("                                                        <div class=\"tab-pane fade\" id=\"kids\" >\n");
      out.write("                                                            <div class=\"col-sm-3\">\n");
      out.write("                                                                <div class=\"product-image-wrapper\">\n");
      out.write("                                                                    <div class=\"single-products\">\n");
      out.write("                                                                        <div class=\"productinfo text-center\">\n");
      out.write("                                                                            <img src=\"contents/images/home/gallery1.jpg\" alt=\"\" />\n");
      out.write("                                                                            <h2>$56</h2>\n");
      out.write("                                                                            <p>Easy Polo Black Edition</p>\n");
      out.write("                                                                            <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("                                                                        </div>\n");
      out.write("                        \n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <div class=\"col-sm-3\">\n");
      out.write("                                                                <div class=\"product-image-wrapper\">\n");
      out.write("                                                                    <div class=\"single-products\">\n");
      out.write("                                                                        <div class=\"productinfo text-center\">\n");
      out.write("                                                                            <img src=\"contents/images/home/gallery2.jpg\" alt=\"\" />\n");
      out.write("                                                                            <h2>$56</h2>\n");
      out.write("                                                                            <p>Easy Polo Black Edition</p>\n");
      out.write("                                                                            <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("                                                                        </div>\n");
      out.write("                        \n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <div class=\"col-sm-3\">\n");
      out.write("                                                                <div class=\"product-image-wrapper\">\n");
      out.write("                                                                    <div class=\"single-products\">\n");
      out.write("                                                                        <div class=\"productinfo text-center\">\n");
      out.write("                                                                            <img src=\"contents/images/home/gallery3.jpg\" alt=\"\" />\n");
      out.write("                                                                            <h2>$56</h2>\n");
      out.write("                                                                            <p>Easy Polo Black Edition</p>\n");
      out.write("                                                                            <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("                                                                        </div>\n");
      out.write("                        \n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <div class=\"col-sm-3\">\n");
      out.write("                                                                <div class=\"product-image-wrapper\">\n");
      out.write("                                                                    <div class=\"single-products\">\n");
      out.write("                                                                        <div class=\"productinfo text-center\">\n");
      out.write("                                                                            <img src=\"contents/images/home/gallery4.jpg\" alt=\"\" />\n");
      out.write("                                                                            <h2>$56</h2>\n");
      out.write("                                                                            <p>Easy Polo Black Edition</p>\n");
      out.write("                                                                            <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("                                                                        </div>\n");
      out.write("                        \n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                        \n");
      out.write("                                                        <div class=\"tab-pane fade\" id=\"poloshirt\" >\n");
      out.write("                                                            <div class=\"col-sm-3\">\n");
      out.write("                                                                <div class=\"product-image-wrapper\">\n");
      out.write("                                                                    <div class=\"single-products\">\n");
      out.write("                                                                        <div class=\"productinfo text-center\">\n");
      out.write("                                                                            <img src=\"contents/images/home/gallery2.jpg\" alt=\"\" />\n");
      out.write("                                                                            <h2>$56</h2>\n");
      out.write("                                                                            <p>Easy Polo Black Edition</p>\n");
      out.write("                                                                            <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("                                                                        </div>\n");
      out.write("                        \n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <div class=\"col-sm-3\">\n");
      out.write("                                                                <div class=\"product-image-wrapper\">\n");
      out.write("                                                                    <div class=\"single-products\">\n");
      out.write("                                                                        <div class=\"productinfo text-center\">\n");
      out.write("                                                                            <img src=\"contents/images/home/gallery4.jpg\" alt=\"\" />\n");
      out.write("                                                                            <h2>$56</h2>\n");
      out.write("                                                                            <p>Easy Polo Black Edition</p>\n");
      out.write("                                                                            <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("                                                                        </div>\n");
      out.write("                        \n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <div class=\"col-sm-3\">\n");
      out.write("                                                                <div class=\"product-image-wrapper\">\n");
      out.write("                                                                    <div class=\"single-products\">\n");
      out.write("                                                                        <div class=\"productinfo text-center\">\n");
      out.write("                                                                            <img src=\"contents/images/home/gallery3.jpg\" alt=\"\" />\n");
      out.write("                                                                            <h2>$56</h2>\n");
      out.write("                                                                            <p>Easy Polo Black Edition</p>\n");
      out.write("                                                                            <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("                                                                        </div>\n");
      out.write("                        \n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <div class=\"col-sm-3\">\n");
      out.write("                                                                <div class=\"product-image-wrapper\">\n");
      out.write("                                                                    <div class=\"single-products\">\n");
      out.write("                                                                        <div class=\"productinfo text-center\">\n");
      out.write("                                                                            <img src=\"contents/images/home/gallery1.jpg\" alt=\"\" />\n");
      out.write("                                                                            <h2>$56</h2>\n");
      out.write("                                                                            <p>Easy Polo Black Edition</p>\n");
      out.write("                                                                            <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
      out.write("                                                                        </div>\n");
      out.write("                        \n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>/category-tab-->\n");
      out.write("\n");
      out.write("                        <div class=\"recommended_items\"><!--recommended_items-->\n");
      out.write("                            <h2 class=\"title text-center\">recommended items</h2>\n");
      out.write("\n");
      out.write("                            <div id=\"recommended-item-carousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                                <div class=\"carousel-inner\">\n");
      out.write("                                    <div class=\"item active\">\t\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"item\">\t\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <a class=\"left recommended-item-control\" href=\"#recommended-item-carousel\" data-slide=\"prev\">\n");
      out.write("                                    <i class=\"fa fa-angle-left\"></i>\n");
      out.write("                                </a>\n");
      out.write("                                <a class=\"right recommended-item-control\" href=\"#recommended-item-carousel\" data-slide=\"next\">\n");
      out.write("                                    <i class=\"fa fa-angle-right\"></i>\n");
      out.write("                                </a>\t\t\t\n");
      out.write("                            </div>\n");
      out.write("                        </div><!--/recommended_items-->\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
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
      out.write("                            <li><a href=\"\">FAQ’s</a></li>\n");
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
      out.write("                <p class=\"pull-left\">Copyright © 2013 E-SHOPPER Inc. All rights reserved.</p>\n");
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
      out.write("        </script> \n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/profile\"><i class=\"fa fa-user\"></i> Hello ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${acc.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a></li>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <li><a href=\"Login.jsp\" class=\"active\"><i class=\"fa fa-lock\"></i> Login</a></li>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/logout\" class=\"active\"><i class=\"fa fa-lock\"></i> Logout</a></li>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cateList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("i");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <div class=\"panel panel-default\">\n");
          out.write("                                        <div class=\"panel-heading\">\n");
          out.write("                                            <h4 class=\"panel-title\"><a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h4>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${top6}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("i");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <div class=\"col-sm-4\">\n");
          out.write("                                    <div class=\"product-image-wrapper\">\n");
          out.write("                                        <div class=\"single-products\">\n");
          out.write("                                            <div class=\"productinfo text-center\">\n");
          out.write("                                                <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.thumbnail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" />\n");
          out.write("                                                <h2>$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h2>\n");
          out.write("                                                <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                                <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
          out.write("                                            </div>\n");
          out.write("                                            <div class=\"product-overlay\">\n");
          out.write("                                                <div class=\"overlay-content\">\n");
          out.write("                                                    <h2>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h2>\n");
          out.write("                                                    <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                                    <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
          out.write("                                                </div>\n");
          out.write("                                            </div>\n");
          out.write("                                        </div>\n");
          out.write("                                        <div class=\"choose\">\n");
          out.write("                                            <form name=\"f\" action=\"\" method=\"POST\">\n");
          out.write("                                                <ul class=\"nav nav-pills nav-justified\">\n");
          out.write("                                                    <li><button type=\"submit\" onclick=\"buy('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("', '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("')\" class=\"btn\">\n");
          out.write("                                                            Add to Wishlist <i class = \"fa fa-shopping-cart\"></i>\n");
          out.write("                                                        </button>\n");
          out.write("                                                    </li>\n");
          out.write("                                                    <li><button type=\"submit\" onclick=\"buy('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("', '");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${detail.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("')\" class=\"btn\">\n");
          out.write("                                                            Add to Cart <i class = \"fa fa-shopping-cart\"></i>\n");
          out.write("                                                        </button>\n");
          out.write("                                                    </li>\n");
          out.write("                                                </ul>\n");
          out.write("                                            </form>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${top3Recom1}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("i");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <div class=\"col-sm-4\">\n");
          out.write("                                                <div class=\"product-image-wrapper\">\n");
          out.write("                                                    <div class=\"single-products\">\n");
          out.write("                                                        <div class=\"productinfo text-center\">\n");
          out.write("                                                            <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.thumbnail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" />\n");
          out.write("                                                            <h2>$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h2>\n");
          out.write("                                                            <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                                            <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
          out.write("                                                        </div>\n");
          out.write("\n");
          out.write("                                                    </div>\n");
          out.write("                                                </div>\n");
          out.write("                                            </div>\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${top3Recom2}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_3.setVar("i");
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <div class=\"col-sm-4\">\n");
          out.write("                                                <div class=\"product-image-wrapper\">\n");
          out.write("                                                    <div class=\"single-products\">\n");
          out.write("                                                        <div class=\"productinfo text-center\">\n");
          out.write("                                                            <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.thumbnail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" />\n");
          out.write("                                                            <h2>$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h2>\n");
          out.write("                                                            <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                                            <a href=\"#\" class=\"btn btn-default add-to-cart\"><i class=\"fa fa-shopping-cart\"></i>Add to cart</a>\n");
          out.write("                                                        </div>\n");
          out.write("\n");
          out.write("                                                    </div>\n");
          out.write("                                                </div>\n");
          out.write("                                            </div>\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }
}
