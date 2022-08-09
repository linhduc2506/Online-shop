<%-- 
    Document   : AddBlog
    Created on : Jan 17, 2022, 9:40:35 AM
    Author     : LAPTOP D&N
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Blog | E-Shopper</title>
        <%@include file="contents/compontents/Import.jsp"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    </head>
    <body>
        <header id="header"><!--header-->
            <div class="header_top"><!--header_top-->
                <div class="container">
                    <div class="row">
                        <div class="col-sm-6">
                            <div class="contactinfo">
                                <ul class="nav nav-pills">
                                    <li><a href=""><i class="fa fa-phone"></i> +2 95 01 88 821</a></li>
                                    <li><a href=""><i class="fa fa-envelope"></i> info@domain.com</a></li>
                                </ul>
                            </div>
                        </div>
                        <div class="col-sm-6">
                            <div class="social-icons pull-right">
                                <ul class="nav navbar-nav">
                                    <li><a href=""><i class="fa fa-facebook"></i></a></li>
                                    <li><a href=""><i class="fa fa-twitter"></i></a></li>
                                    <li><a href=""><i class="fa fa-linkedin"></i></a></li>
                                    <li><a href=""><i class="fa fa-dribbble"></i></a></li>
                                    <li><a href=""><i class="fa fa-google-plus"></i></a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div><!--/header_top-->

            <div class="header-middle"><!--header-middle-->
                <div class="container">
                    <div class="row">
                        <div class="col-sm-4">
                            <div class="logo pull-left">
                                <a href="${pageContext.request.contextPath}/home"><img src="contents/images/home/logo.png" alt="" /></a>
                            </div>
                            <div class="btn-group pull-right">
                                <div class="btn-group">
                                    <button type="button" class="btn btn-default dropdown-toggle usa" data-toggle="dropdown">
                                        USA
                                        <span class="caret"></span>
                                    </button>
                                    <ul class="dropdown-menu">
                                        <li><a href="">Canada</a></li>
                                        <li><a href="">UK</a></li>
                                    </ul>
                                </div>

                                <div class="btn-group">
                                    <button type="button" class="btn btn-default dropdown-toggle usa" data-toggle="dropdown">
                                        DOLLAR
                                        <span class="caret"></span>
                                    </button>
                                    <ul class="dropdown-menu">
                                        <li><a href="">Canadian Dollar</a></li>
                                        <li><a href="">Pound</a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-8">
                            <div class="shop-menu pull-right">
                                <ul class="nav navbar-nav">
                                    <c:if test="${sessionScope.acc != null}">
                                        <li><a href="${pageContext.request.contextPath}/profile"><i class="fa fa-user"></i> Hello ${acc.username}</a></li>
                                        </c:if>
                                    <li><a href=""><i class="fa fa-star"></i> Wishlist</a></li>
                                    <li><a href="checkout.html"><i class="fa fa-crosshairs"></i> Checkout</a></li>
                                    <li><a href="cart.html"><i class="fa fa-shopping-cart"></i> Cart</a></li>
                                        <c:if test="${sessionScope.acc == null}">
                                        <li><a href="Login.jsp" class="active"><i class="fa fa-lock"></i> Login</a></li>
                                        </c:if>
                                        <c:if test="${sessionScope.acc != null}">
                                        <li><a href="${pageContext.request.contextPath}/logout" class="active"><i class="fa fa-lock"></i> Logout</a></li>
                                        </c:if>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div><!--/header-middle-->

            <div class="header-bottom"><!--header-bottom-->
                <div class="container">
                    <div class="row">
                        <div class="col-sm-9">
                            <div class="navbar-header">
                                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                                    <span class="sr-only">Toggle navigation</span>
                                    <span class="icon-bar"></span>
                                    <span class="icon-bar"></span>
                                    <span class="icon-bar"></span>
                                </button>
                            </div>
                            <div class="mainmenu pull-left">
                                <ul class="nav navbar-nav collapse navbar-collapse">
                                    <li><a href="${pageContext.request.contextPath}/home">Home</a></li>
                                    <li class="dropdown"><a href="#">Shop<i class="fa fa-angle-down"></i></a>
                                        <ul role="menu" class="sub-menu">
                                            <li><a href="shop.html">Products</a></li>
                                            <li><a href="product-details.html">Product Details</a></li> 
                                            <li><a href="checkout.html">Checkout</a></li> 
                                            <li><a href="cart.html">Cart</a></li> 
                                            <li><a href="login.html" class="active">Login</a></li> 
                                        </ul>
                                    </li> 
                                    <li class="dropdown"><a href="#">Blog<i class="fa fa-angle-down"></i></a>
                                        <ul role="menu" class="sub-menu">
                                            <li><a href="${pageContext.request.contextPath}/blog">Blog List</a></li>
                                                <c:if test="${sessionScope.acc != null}">
                                                <li><a href="${pageContext.request.contextPath}/addblog">Add Blog</a></li>
                                                </c:if>
                                        </ul>
                                    </li> 
                                    <li><a href="404.html">404</a></li>
                                    <li><a href="contact-us.html">Contact</a></li>
                                </ul>
                            </div>
                        </div>
                        <div class="col-sm-3">
                            <div class="search_box pull-right">
                                <input type="text" placeholder="Search"/>
                            </div>
                        </div>
                    </div>
                </div>
            </div><!--/header-bottom-->
        </header>

        <div class="container">
            <!--begin of menu-->

            <!--end of menu-->
            <!--begin of form-->
            <form class="col-sm-12" action="addblog" method="post">
                <h2>Create new Blog</h2>
                <select name="category">
                    <c:forEach items="${listC}" var="o">
                        <option value="${o.id}">${o.name}</option>                        
                    </c:forEach>
                </select>
                <div class="form-group">
                    <label for="exampleFormControlInput1">Link image</label>
                    <input name="image" type="text" class="form-control" id="exampleFormControlInput1" >
                </div>
                <div class="form-group">
                    <label for="exampleFormControlTextarea1">Tittle</label>
                    <textarea name="title" class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
                </div>
                <div class="form-group">
                    <label for="exampleFormControlTextarea1">Content</label>
                    <textarea name="content" class="form-control" id="exampleFormControlTextarea1" rows="10"></textarea>
                </div>

                <button type="submit" class="btn btn-primary">Create</button>
            </form>
            <!--end of form-->
        </div>

        <%@include file="contents/compontents/Footer.jsp"%>

        <!-- Js Plugins -->
        <script src="contents/js/jquery.js"></script>
        <script src="contents/js/bootstrap.min.js"></script>
        <script src="contents/js/jquery.scrollUp.min.js"></script>
        <script src="contents/js/price-range.js"></script>
        <script src="contents/js/jquery.prettyPhoto.js"></script>
        <script src="contents/js/main.js"></script> 

    </body>
</html>
