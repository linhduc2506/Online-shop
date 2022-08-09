package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class BlogManager2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_end_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_forEach_var_end_begin.release();
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Director | Simple Tables</title>\n");
      out.write("        <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>\n");
      out.write("        <meta name=\"description\" content=\"Developed By M Abdur Rokib Promy\">\n");
      out.write("        <meta name=\"keywords\" content=\"Admin, Bootstrap 3, Template, Theme, Responsive\">\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <!-- bootstrap 3.0.2 -->\n");
      out.write("        <link href=\"contents/css2/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <!-- font Awesome -->\n");
      out.write("        <link href=\"contents/css2/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <!-- Ionicons -->\n");
      out.write("        <link href=\"contents/css2/ionicons.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <!-- google font -->\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Lato' rel='stylesheet' type='text/css'>\n");
      out.write("        <!-- Theme style -->\n");
      out.write("        <link href=\"contents/css2/style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("        <style>\n");
      out.write("            img {\n");
      out.write("                width: 200px;\n");
      out.write("                height: 120px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"skin-black\">\n");
      out.write("        <!-- header logo: style can be found in header.less -->\n");
      out.write("        <header class=\"header\">\n");
      out.write("            <a href=\"index.html\" class=\"logo\">\n");
      out.write("                <!-- Add the class icon to your logo image or logo icon to add the margining -->\n");
      out.write("                Director\n");
      out.write("            </a>\n");
      out.write("            <!-- Header Navbar: style can be found in header.less -->\n");
      out.write("            <nav class=\"navbar navbar-static-top\" role=\"navigation\">\n");
      out.write("                <!-- Sidebar toggle button-->\n");
      out.write("                <a href=\"#\" class=\"navbar-btn sidebar-toggle\" data-toggle=\"offcanvas\" role=\"button\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </a>\n");
      out.write("                <div class=\"navbar-right\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <!-- Messages: style can be found in dropdown.less-->\n");
      out.write("                        <li class=\"dropdown messages-menu\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                <i class=\"fa fa-envelope\"></i>\n");
      out.write("                                <span class=\"label label-success\">4</span>\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <li class=\"header\">You have 4 messages</li>\n");
      out.write("                                <li>\n");
      out.write("                                    <!-- inner menu: contains the actual data -->\n");
      out.write("                                    <ul class=\"menu\">\n");
      out.write("                                        <li><!-- start message -->\n");
      out.write("                                            <a href=\"#\">\n");
      out.write("                                                <div class=\"pull-left\">\n");
      out.write("                                                    <img src=\"img/avatar3.png\" class=\"img-circle\" alt=\"User Image\"/>\n");
      out.write("                                                </div>\n");
      out.write("                                                <h4>\n");
      out.write("                                                    Support Team\n");
      out.write("                                                    <small><i class=\"fa fa-clock-o\"></i> 5 mins</small>\n");
      out.write("                                                </h4>\n");
      out.write("                                                <p>Why not buy a new awesome theme?</p>\n");
      out.write("                                            </a>\n");
      out.write("                                        </li><!-- end message -->\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"#\">\n");
      out.write("                                                <div class=\"pull-left\">\n");
      out.write("                                                    <img src=\"img/avatar2.png\" class=\"img-circle\" alt=\"user image\"/>\n");
      out.write("                                                </div>\n");
      out.write("                                                <h4>\n");
      out.write("                                                    Director Design Team\n");
      out.write("                                                    <small><i class=\"fa fa-clock-o\"></i> 2 hours</small>\n");
      out.write("                                                </h4>\n");
      out.write("                                                <p>Why not buy a new awesome theme?</p>\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"#\">\n");
      out.write("                                                <div class=\"pull-left\">\n");
      out.write("                                                    <img src=\"img/avatar.png\" class=\"img-circle\" alt=\"user image\"/>\n");
      out.write("                                                </div>\n");
      out.write("                                                <h4>\n");
      out.write("                                                    Developers\n");
      out.write("                                                    <small><i class=\"fa fa-clock-o\"></i> Today</small>\n");
      out.write("                                                </h4>\n");
      out.write("                                                <p>Why not buy a new awesome theme?</p>\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"#\">\n");
      out.write("                                                <div class=\"pull-left\">\n");
      out.write("                                                    <img src=\"img/avatar2.png\" class=\"img-circle\" alt=\"user image\"/>\n");
      out.write("                                                </div>\n");
      out.write("                                                <h4>\n");
      out.write("                                                    Sales Department\n");
      out.write("                                                    <small><i class=\"fa fa-clock-o\"></i> Yesterday</small>\n");
      out.write("                                                </h4>\n");
      out.write("                                                <p>Why not buy a new awesome theme?</p>\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li>\n");
      out.write("                                            <a href=\"#\">\n");
      out.write("                                                <div class=\"pull-left\">\n");
      out.write("                                                    <img src=\"img/avatar.png\" class=\"img-circle\" alt=\"user image\"/>\n");
      out.write("                                                </div>\n");
      out.write("                                                <h4>\n");
      out.write("                                                    Reviewers\n");
      out.write("                                                    <small><i class=\"fa fa-clock-o\"></i> 2 days</small>\n");
      out.write("                                                </h4>\n");
      out.write("                                                <p>Why not buy a new awesome theme?</p>\n");
      out.write("                                            </a>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"footer\"><a href=\"#\">See All Messages</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"dropdown tasks-menu\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                <i class=\"fa fa-tasks\"></i>\n");
      out.write("                                <span class=\"label label-danger\">9</span>\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("\n");
      out.write("                                <li class=\"header\">You have 9 tasks</li>\n");
      out.write("                                <li>\n");
      out.write("                                    <!-- inner menu: contains the actual data -->\n");
      out.write("                                    <ul class=\"menu\">\n");
      out.write("                                        <li><!-- Task item -->\n");
      out.write("                                            <a href=\"#\">\n");
      out.write("                                                <h3>\n");
      out.write("                                                    Design some buttons\n");
      out.write("                                                    <small class=\"pull-right\">20%</small>\n");
      out.write("                                                </h3>\n");
      out.write("                                                <div class=\"progress progress-striped xs\">\n");
      out.write("                                                    <div class=\"progress-bar progress-bar-success\" style=\"width: 20%\" role=\"progressbar\" aria-valuenow=\"20\" aria-valuemin=\"0\" aria-valuemax=\"100\">\n");
      out.write("                                                        <span class=\"sr-only\">20% Complete</span>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </a>\n");
      out.write("                                        </li><!-- end task item -->\n");
      out.write("                                        <li><!-- Task item -->\n");
      out.write("                                            <a href=\"#\">\n");
      out.write("                                                <h3>\n");
      out.write("                                                    Create a nice theme\n");
      out.write("                                                    <small class=\"pull-right\">40%</small>\n");
      out.write("                                                </h3>\n");
      out.write("                                                <div class=\"progress progress-striped xs\">\n");
      out.write("                                                    <div class=\"progress-bar progress-bar-danger\" style=\"width: 40%\" role=\"progressbar\" aria-valuenow=\"20\" aria-valuemin=\"0\" aria-valuemax=\"100\">\n");
      out.write("                                                        <span class=\"sr-only\">40% Complete</span>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </a>\n");
      out.write("                                        </li><!-- end task item -->\n");
      out.write("                                        <li><!-- Task item -->\n");
      out.write("                                            <a href=\"#\">\n");
      out.write("                                                <h3>\n");
      out.write("                                                    Some task I need to do\n");
      out.write("                                                    <small class=\"pull-right\">60%</small>\n");
      out.write("                                                </h3>\n");
      out.write("                                                <div class=\"progress progress-striped xs\">\n");
      out.write("                                                    <div class=\"progress-bar progress-bar-info\" style=\"width: 60%\" role=\"progressbar\" aria-valuenow=\"20\" aria-valuemin=\"0\" aria-valuemax=\"100\">\n");
      out.write("                                                        <span class=\"sr-only\">60% Complete</span>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </a>\n");
      out.write("                                        </li><!-- end task item -->\n");
      out.write("                                        <li><!-- Task item -->\n");
      out.write("                                            <a href=\"#\">\n");
      out.write("                                                <h3>\n");
      out.write("                                                    Make beautiful transitions\n");
      out.write("                                                    <small class=\"pull-right\">80%</small>\n");
      out.write("                                                </h3>\n");
      out.write("                                                <div class=\"progress progress-striped xs\">\n");
      out.write("                                                    <div class=\"progress-bar progress-bar-warning\" style=\"width: 80%\" role=\"progressbar\" aria-valuenow=\"20\" aria-valuemin=\"0\" aria-valuemax=\"100\">\n");
      out.write("                                                        <span class=\"sr-only\">80% Complete</span>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </a>\n");
      out.write("                                        </li><!-- end task item -->\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"footer\">\n");
      out.write("                                    <a href=\"#\">View all tasks</a>\n");
      out.write("                                </li>\n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <!-- User Account: style can be found in dropdown.less -->\n");
      out.write("                        <li class=\"dropdown user user-menu\">\n");
      out.write("\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                <i class=\"fa fa-user\"></i>\n");
      out.write("                                <span>Jane Doe <i class=\"caret\"></i></span>\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"dropdown-menu dropdown-custom dropdown-menu-right\">\n");
      out.write("                                <li class=\"dropdown-header text-center\">Account</li>\n");
      out.write("\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <i class=\"fa fa-clock-o fa-fw pull-right\"></i>\n");
      out.write("                                        <span class=\"badge badge-success pull-right\">10</span> Updates</a>\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <i class=\"fa fa-envelope-o fa-fw pull-right\"></i>\n");
      out.write("                                        <span class=\"badge badge-danger pull-right\">5</span> Messages</a>\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-magnet fa-fw pull-right\"></i>\n");
      out.write("                                        <span class=\"badge badge-info pull-right\">3</span> Subscriptions</a>\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-question fa-fw pull-right\"></i> <span class=\n");
      out.write("                                                                                                      \"badge pull-right\">11</span> FAQ</a>\n");
      out.write("                                </li>\n");
      out.write("\n");
      out.write("                                <li class=\"divider\"></li>\n");
      out.write("\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <i class=\"fa fa-user fa-fw pull-right\"></i>\n");
      out.write("                                        Profile\n");
      out.write("                                    </a>\n");
      out.write("                                    <a data-toggle=\"modal\" href=\"#modal-user-settings\">\n");
      out.write("                                        <i class=\"fa fa-cog fa-fw pull-right\"></i>\n");
      out.write("                                        Settings\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("\n");
      out.write("                                <li class=\"divider\"></li>\n");
      out.write("\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\"><i class=\"fa fa-ban fa-fw pull-right\"></i> Logout</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <div class=\"wrapper row-offcanvas row-offcanvas-left\">\n");
      out.write("            <!-- Left side column. contains the logo and sidebar -->\n");
      out.write("            <aside class=\"left-side sidebar-offcanvas\">\n");
      out.write("                <!-- sidebar: style can be found in sidebar.less -->\n");
      out.write("                <section class=\"sidebar\">\n");
      out.write("                    <!-- Sidebar user panel -->\n");
      out.write("                    <div class=\"user-panel\">\n");
      out.write("                        <div class=\"pull-left image\">\n");
      out.write("                            <img src=\"img/avatar3.png\" class=\"img-circle\" alt=\"User Image\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"pull-left info\">\n");
      out.write("                            <p>Hello, Jane</p>\n");
      out.write("\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-circle text-success\"></i> Online</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- search form -->\n");
      out.write("                    <form action=\"#\" method=\"get\" class=\"sidebar-form\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <input type=\"text\" name=\"q\" class=\"form-control\" placeholder=\"Search...\"/>\n");
      out.write("                            <span class=\"input-group-btn\">\n");
      out.write("                                <button type='submit' name='seach' id='search-btn' class=\"btn btn-flat\"><i class=\"fa fa-search\"></i></button>\n");
      out.write("                            </span>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                    <ul class=\"sidebar-menu\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"index.html\">\n");
      out.write("                                <i class=\"fa fa-dashboard\"></i> <span>Dashboard</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"general.html\">\n");
      out.write("                                <i class=\"fa fa-gavel\"></i> <span>General</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"basic_form.html\">\n");
      out.write("                                <i class=\"fa fa-globe\"></i> <span>Basic Elements</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li class=\"active\">\n");
      out.write("                            <a href=\"CustomerList\">\n");
      out.write("                                <i class=\"fa fa-glass\"></i> <span>Customer</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        \n");
      out.write("                        <li class=\"active\">\n");
      out.write("                            <a href=\"blogmanager\">\n");
      out.write("                                <i class=\"fa fa-glass\"></i> <span>Blog Manager</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </section>\n");
      out.write("                <!-- /.sidebar -->\n");
      out.write("            </aside>\n");
      out.write("\n");
      out.write("            <!-- Right side column. Contains the navbar and content of the page -->\n");
      out.write("            <aside class=\"right-side\">\n");
      out.write("\n");
      out.write("                <!-- Main content -->\n");
      out.write("                <section class=\"content\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-xs-12\">\n");
      out.write("                            <div class=\"panel\">\n");
      out.write("                                <header class=\"panel-heading\">\n");
      out.write("                                    Responsive Hover Table\n");
      out.write("\n");
      out.write("                                </header>\n");
      out.write("                                <!-- <div class=\"box-header\"> -->\n");
      out.write("                                <!-- <h3 class=\"box-title\">Responsive Hover Table</h3> -->\n");
      out.write("\n");
      out.write("                                <!-- </div> -->\n");
      out.write("                                <div class=\"panel-body table-responsive\">\n");
      out.write("\n");
      out.write("                                    <div>\n");
      out.write("                                        <select name=\"SortBt\">\n");
      out.write("                                            <option><a href=\"\"></a></option>\n");
      out.write("                                            <option><a href=\"#\">Type</a></option>\n");
      out.write("                                            <option><a href=\"#\">Status</a></option> \n");
      out.write("                                        </select>\n");
      out.write("                                        <input type=\"submit\" value=\"Submit\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"box-tools m-b-15\">\n");
      out.write("                                        <div class=\"input-group\">\n");
      out.write("                                            <form action=\"CustomerSearch\" method=\"post\" class=\"searchMethod\">\n");
      out.write("                                                <div>\n");
      out.write("                                                    <input type=\"text\" name=\"table_search\" class=\"form-control input-sm pull-right\" style=\"width: 150px;\" placeholder=\"Search\"/>\n");
      out.write("                                                </div>\n");
      out.write("                                            </form>\n");
      out.write("\n");
      out.write("                                            <div class=\"input-group-btn\">\n");
      out.write("                                                <button class=\"btn btn-sm btn-default\"><i class=\"fa fa-search\"></i></button>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <table class=\"table table-hover\">\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>ID</th>\n");
      out.write("                                            <th>Name</th>\n");
      out.write("                                            <th>Email</th>\n");
      out.write("                                            <th>Address</th>\n");
      out.write("                                            <th>Change</th>\n");
      out.write("                                        </tr>\n");
      out.write("\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    </table>\n");
      out.write("                                    <br>\n");
      out.write("                                    <br>\n");
      out.write("\n");
      out.write("                                    <div><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/addblog\">Add New Setting</a></div>    \n");
      out.write("                                </div><!-- /.box-body -->\n");
      out.write("                            </div><!-- /.box -->\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </section><!-- /.content -->\n");
      out.write("\n");
      out.write("                <div class=\"pagination\">\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </aside><!-- /.right-side -->\n");
      out.write("        </div><!-- ./wrapper -->\n");
      out.write("        \n");
      out.write("        <div id=\"addEmployeeModal\" class=\"modal fade\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <form action=\"addblog\" method=\"post\">\n");
      out.write("                        <div class=\"modal-header\">\t\t\t\t\t\t\n");
      out.write("                            <h4 class=\"modal-title\">Add New Blog</h4>\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-body\">\t\t\t\t\t\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Title</label>\n");
      out.write("                                <input name=\"title\" type=\"text\" class=\"form-control\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Image</label>\n");
      out.write("                                <input name=\"image\" type=\"text\" class=\"form-control\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Content</label>\n");
      out.write("                                <textarea name=\"content\" class=\"form-control\" required></textarea>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Category</label>\n");
      out.write("                                <select name=\"category\" class=\"form-select\" aria-label=\"Default select example\">\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-footer\">\n");
      out.write("                            <input type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\" value=\"Cancel\">\n");
      out.write("                            <input type=\"submit\" class=\"btn btn-success\" value=\"Add\">\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- jQuery 2.0.2 -->\n");
      out.write("        <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!-- Director App -->\n");
      out.write("        <script src=\"js/Director/app.js\" type=\"text/javascript\"></script>\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                // Activate tooltip\n");
      out.write("                $('[data-toggle=\"tooltip\"]').tooltip();\n");
      out.write("\n");
      out.write("                // Select/Deselect checkboxes\n");
      out.write("                var checkbox = $('table tbody input[type=\"checkbox\"]');\n");
      out.write("                $(\"#selectAll\").click(function () {\n");
      out.write("                    if (this.checked) {\n");
      out.write("                        checkbox.each(function () {\n");
      out.write("                            this.checked = true;\n");
      out.write("                        });\n");
      out.write("                    } else {\n");
      out.write("                        checkbox.each(function () {\n");
      out.write("                            this.checked = false;\n");
      out.write("                        });\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("                checkbox.click(function () {\n");
      out.write("                    if (!this.checked) {\n");
      out.write("                        $(\"#selectAll\").prop(\"checked\", false);\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listBlog}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("                                       \n");
          out.write("                                            <tr>\n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.createdAt}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                                <td>\n");
          out.write("                                                    <a href=\"editblog?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"  class=\"edit\" data-toggle=\"modal\">Update</a>\n");
          out.write("                                                    <a href=\"deleteblog?cid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"delete\" data-toggle=\"modal\" onclick=\"return confirm(\n");
          out.write("                                                                    'Are you sure want to delete this ticket?')\">Delete</a>\n");
          out.write("                                                </td>\n");
          out.write("                                            </tr>\n");
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

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setBegin(1);
    _jspx_th_c_forEach_1.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${endPage}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_c_forEach_1.setVar("o");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <a href=\"CustomerList?page=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write(' ');
          if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                    ");
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
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currentPage == o}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("class=\"current\"");
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

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listBlogCategory}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("o");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                    ");
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
}
