package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class BlogDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/contents/compontents/Import.jsp");
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
      out.write("        <title>Blog | E-Shopper</title>\n");
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
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
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
      out.write("                                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    <li><a href=\"\"><i class=\"fa fa-star\"></i> Wishlist</a></li>\n");
      out.write("                                    <li><a href=\"checkout.html\"><i class=\"fa fa-crosshairs\"></i> Checkout</a></li>\n");
      out.write("                                    <li><a href=\"cart.html\"><i class=\"fa fa-shopping-cart\"></i> Cart</a></li>\n");
      out.write("                                        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
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
      out.write("                                            <li><a href=\"blog-single.html\">Create Blog</a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </li> \n");
      out.write("                                    <li><a href=\"404.html\">404</a></li>\n");
      out.write("                                    <li><a href=\"contact-us.html\">Contact</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-3\">\n");
      out.write("                            <div class=\"search_box pull-right\">\n");
      out.write("                                <input type=\"text\" placeholder=\"Search\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div><!--/header-bottom-->\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <section>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-3\">\n");
      out.write("                        <div class=\"left-sidebar\">\n");
      out.write("                            <h2>Category</h2>\n");
      out.write("\n");
      out.write("                            <div class=\"brands_products\"><!--brands_products-->\n");
      out.write("                                <div class=\"brands-name\">\n");
      out.write("                                    <ul class=\"nav nav-pills nav-stacked\">\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div><!--/brands_products-->\n");
      out.write("\n");
      out.write("                            <div class=\"price-range\"><!--price-range-->\n");
      out.write("                                <h2>Price Range</h2>\n");
      out.write("                                <div class=\"well\">\n");
      out.write("                                    <input type=\"text\" class=\"span2\" value=\"\" data-slider-min=\"0\" data-slider-max=\"600\" data-slider-step=\"5\" data-slider-value=\"[250,450]\" id=\"sl2\" ><br />\n");
      out.write("                                    <b>$ 0</b> <b class=\"pull-right\">$ 600</b>\n");
      out.write("                                </div>\n");
      out.write("                            </div><!--/price-range-->\n");
      out.write("\n");
      out.write("                            <div class=\"shipping text-center\"><!--shipping-->\n");
      out.write("                                <img src=\"contents/images/home/shipping.jpg\" alt=\"\" />\n");
      out.write("                            </div><!--/shipping-->\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"col-sm-9\">\n");
      out.write("                        <div class=\"blog-post-area\">\n");
      out.write("                            <h2 class=\"title text-center\">Latest From our Blog</h2>\n");
      out.write("                            <div class=\"single-blog-post\">\n");
      out.write("                                <h3>Girls Pink T Shirt arrived in store</h3>\n");
      out.write("                                <div class=\"post-meta\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li><i class=\"fa fa-user\"></i> Mac Doe</li>\n");
      out.write("                                        <li><i class=\"fa fa-clock-o\"></i> 1:33 pm</li>\n");
      out.write("                                        <li><i class=\"fa fa-calendar\"></i> DEC 5, 2013</li>\n");
      out.write("                                    </ul>\n");
      out.write("                                    <span>\n");
      out.write("                                        <i class=\"fa fa-star\"></i>\n");
      out.write("                                        <i class=\"fa fa-star\"></i>\n");
      out.write("                                        <i class=\"fa fa-star\"></i>\n");
      out.write("                                        <i class=\"fa fa-star\"></i>\n");
      out.write("                                        <i class=\"fa fa-star-half-o\"></i>\n");
      out.write("                                    </span>\n");
      out.write("                                </div>\n");
      out.write("                                <a href=\"\">\n");
      out.write("                                    <img src=\"contents/images/blog/blog-one.jpg\" alt=\"\">\n");
      out.write("                                </a>\n");
      out.write("                                <p>\n");
      out.write("                                    Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.</p> <br>\n");
      out.write("\n");
      out.write("                                <p>\n");
      out.write("                                    Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.</p> <br>\n");
      out.write("\n");
      out.write("                                <p>\n");
      out.write("                                    Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt.</p> <br>\n");
      out.write("\n");
      out.write("                                <p>\n");
      out.write("                                    Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem.\n");
      out.write("                                </p>\n");
      out.write("                                <div class=\"pager-area\">\n");
      out.write("                                    <ul class=\"pager pull-right\">\n");
      out.write("                                        <li><a href=\"#\">Pre</a></li>\n");
      out.write("                                        <li><a href=\"#\">Next</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div><!--/blog-post-area-->\n");
      out.write("\n");
      out.write("                        <div class=\"rating-area\">\n");
      out.write("                            <ul class=\"ratings\">\n");
      out.write("                                <li class=\"rate-this\">Rate this item:</li>\n");
      out.write("                                <li>\n");
      out.write("                                    <i class=\"fa fa-star color\"></i>\n");
      out.write("                                    <i class=\"fa fa-star color\"></i>\n");
      out.write("                                    <i class=\"fa fa-star color\"></i>\n");
      out.write("                                    <i class=\"fa fa-star\"></i>\n");
      out.write("                                    <i class=\"fa fa-star\"></i>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"color\">(6 votes)</li>\n");
      out.write("                            </ul>\n");
      out.write("                            <ul class=\"tag\">\n");
      out.write("                                <li>TAG:</li>\n");
      out.write("                                <li><a class=\"color\" href=\"\">Pink <span>/</span></a></li>\n");
      out.write("                                <li><a class=\"color\" href=\"\">T-Shirt <span>/</span></a></li>\n");
      out.write("                                <li><a class=\"color\" href=\"\">Girls</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div><!--/rating-area-->\n");
      out.write("\n");
      out.write("                        <div class=\"socials-share\">\n");
      out.write("                            <a href=\"\"><img src=\"contents/images/blog/socials.png\" alt=\"\"></a>\n");
      out.write("                        </div><!--/socials-share-->\n");
      out.write("\n");
      out.write("                        <div class=\"media commnets\">\n");
      out.write("                            <a class=\"pull-left\" href=\"#\">\n");
      out.write("                                <img class=\"media-object\" src=\"images/blog/man-one.jpg\" alt=\"\">\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"media-body\">\n");
      out.write("                                <h4 class=\"media-heading\">Annie Davis</h4>\n");
      out.write("                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.  Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>\n");
      out.write("                                <div class=\"blog-socials\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li><a href=\"\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("                                        <li><a href=\"\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("                                        <li><a href=\"\"><i class=\"fa fa-dribbble\"></i></a></li>\n");
      out.write("                                        <li><a href=\"\"><i class=\"fa fa-google-plus\"></i></a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                    <a class=\"btn btn-primary\" href=\"\">Other Posts</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div><!--Comments-->\n");
      out.write("                        <div class=\"response-area\">\n");
      out.write("                            <h2>3 RESPONSES</h2>\n");
      out.write("                            <ul class=\"media-list\">\n");
      out.write("                                <li class=\"media\">\n");
      out.write("\n");
      out.write("                                    <a class=\"pull-left\" href=\"#\">\n");
      out.write("                                        <img class=\"media-object\" src=\"contents/images/blog/man-two.jpg\" alt=\"\">\n");
      out.write("                                    </a>\n");
      out.write("                                    <div class=\"media-body\">\n");
      out.write("                                        <ul class=\"sinlge-post-meta\">\n");
      out.write("                                            <li><i class=\"fa fa-user\"></i>Janis Gallagher</li>\n");
      out.write("                                            <li><i class=\"fa fa-clock-o\"></i> 1:33 pm</li>\n");
      out.write("                                            <li><i class=\"fa fa-calendar\"></i> DEC 5, 2013</li>\n");
      out.write("                                        </ul>\n");
      out.write("                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.  Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>\n");
      out.write("                                        <a class=\"btn btn-primary\" href=\"\"><i class=\"fa fa-reply\"></i>Replay</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"media second-media\">\n");
      out.write("                                    <a class=\"pull-left\" href=\"#\">\n");
      out.write("                                        <img class=\"media-object\" src=\"contents/images/blog/man-three.jpg\" alt=\"\">\n");
      out.write("                                    </a>\n");
      out.write("                                    <div class=\"media-body\">\n");
      out.write("                                        <ul class=\"sinlge-post-meta\">\n");
      out.write("                                            <li><i class=\"fa fa-user\"></i>Janis Gallagher</li>\n");
      out.write("                                            <li><i class=\"fa fa-clock-o\"></i> 1:33 pm</li>\n");
      out.write("                                            <li><i class=\"fa fa-calendar\"></i> DEC 5, 2013</li>\n");
      out.write("                                        </ul>\n");
      out.write("                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.  Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>\n");
      out.write("                                        <a class=\"btn btn-primary\" href=\"\"><i class=\"fa fa-reply\"></i>Replay</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"media\">\n");
      out.write("                                    <a class=\"pull-left\" href=\"#\">\n");
      out.write("                                        <img class=\"media-object\" src=\"contents/images/blog/man-four.jpg\" alt=\"\">\n");
      out.write("                                    </a>\n");
      out.write("                                    <div class=\"media-body\">\n");
      out.write("                                        <ul class=\"sinlge-post-meta\">\n");
      out.write("                                            <li><i class=\"fa fa-user\"></i>Janis Gallagher</li>\n");
      out.write("                                            <li><i class=\"fa fa-clock-o\"></i> 1:33 pm</li>\n");
      out.write("                                            <li><i class=\"fa fa-calendar\"></i> DEC 5, 2013</li>\n");
      out.write("                                        </ul>\n");
      out.write("                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.  Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>\n");
      out.write("                                        <a class=\"btn btn-primary\" href=\"\"><i class=\"fa fa-reply\"></i>Replay</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\t\t\t\t\t\n");
      out.write("                        </div><!--/Response-area-->\n");
      out.write("                        <div class=\"replay-box\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-sm-8\">\n");
      out.write("                                    <div class=\"text-area\">\n");
      out.write("                                        <div class=\"blank-arrow\">\n");
      out.write("                                            <label>Your Name</label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <span>*</span>\n");
      out.write("                                        <textarea name=\"message\" rows=\"11\"></textarea>\n");
      out.write("                                        <a class=\"btn btn-primary\" href=\"\">post comment</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div><!--/Repaly Box-->\n");
      out.write("                    </div>\t\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>                                    \n");
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
      out.write("        <!-- Js Plugins -->\n");
      out.write("        <script src=\"contents/js/jquery.js\"></script>\n");
      out.write("        <script src=\"contents/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"contents/js/jquery.scrollUp.min.js\"></script>\n");
      out.write("        <script src=\"contents/js/price-range.js\"></script>\n");
      out.write("        <script src=\"contents/js/jquery.prettyPhoto.js\"></script>\n");
      out.write("        <script src=\"contents/js/main.js\"></script>                                    \n");
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
        out.write("                                        <li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/profile\"><i class=\"fa fa-user\"></i> Hello ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${acc.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a></li>\n");
        out.write("                                        ");
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
        out.write("                                        <li><a href=\"Login.jsp\" class=\"active\"><i class=\"fa fa-lock\"></i> Login</a></li>\n");
        out.write("                                        ");
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
        out.write("                                        <li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/logout\" class=\"active\"><i class=\"fa fa-lock\"></i> Logout</a></li>\n");
        out.write("                                        ");
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
    _jspx_th_c_forEach_0.setVar("o");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listC}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <li><a href=\"blogCategory?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"> <span class=\"pull-right\"></span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\n");
          out.write("                                        ");
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
}
