<%-- 
    Document   : BlogDetail
    Created on : Jan 11, 2022, 9:26:50 PM
    Author     : LAPTOP D&N
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Blog | E-Shopper</title>
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
                                            <li><a href="blog-single.html">Blog Single</a></li>
                                            <li><a href="blog-single.html">Create Blog</a></li>
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

        <section>
            <div class="container">
                <div class="row">
                    <div class="col-sm-3">
                        <div class="left-sidebar">
                            <h2>Category</h2>

                            <div class="brands_products"><!--brands_products-->
                                <div class="brands-name">
                                    <ul class="nav nav-pills nav-stacked">
                                        <c:forEach var="o" items="${listC}">
                                            <li><a href="blogCategory?id=${o.id}"> <span class="pull-right"></span>${o.name}</a></li>
                                        </c:forEach>
                                    </ul>
                                </div>
                            </div><!--/brands_products-->

                            <div class="shipping text-center"><!--shipping-->
                                <img src="contents/images/home/shipping.jpg" alt="" />
                            </div><!--/shipping-->
                        </div>
                    </div>
                    
                    <div class="col-sm-9">
                        <div class="blog-post-area">
                            <h2 class="title text-center">Latest From our Blog</h2>
                            <div class="single-blog-post">
                                <h3>${blogdetail.title}</h3>
                                <div class="post-meta">
                                    <ul>
                                        <li><i class="fa fa-user"></i>${user2.username}</li>
                                        <li><i class="fa fa-clock-o"></i> 1:33 pm</li>
                                        <li><i class="fa fa-calendar"></i> ${blogdetail.createdAt}</li>
                                    </ul>
                                    <span>
                                        <i class="fa fa-star"></i>
                                        <i class="fa fa-star"></i>
                                        <i class="fa fa-star"></i>
                                        <i class="fa fa-star"></i>
                                        <i class="fa fa-star-half-o"></i>
                                    </span>
                                </div>
                                <a href="">
                                    <img src="${blogdetail.image}" alt="">
                                </a>
                                <p>
                                    ${blogdetail.content}
                                </p> <br>

                                <p>
                                    ${blogdetail.content}
                                </p> <br>

                                <p>
                                    ${blogdetail.content}
                                </p>
                                <div class="pager-area">
                                    <ul class="pager pull-right">
                                        <li><a href="#">Pre</a></li>
                                        <li><a href="#">Next</a></li>
                                    </ul>
                                </div>
                            </div>
                        </div><!--/blog-post-area-->

                        <div class="rating-area">
                            <ul class="ratings">
                                <li class="rate-this">Rate this item:</li>
                                <li>
                                    <i class="fa fa-star color"></i>
                                    <i class="fa fa-star color"></i>
                                    <i class="fa fa-star color"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                </li>
                                <li class="color">(6 votes)</li>
                            </ul>
                            <ul class="tag">
                                <li>TAG:</li>
                                <li><a class="color" href="">Pink <span>/</span></a></li>
                                <li><a class="color" href="">T-Shirt <span>/</span></a></li>
                                <li><a class="color" href="">Girls</a></li>
                            </ul>
                        </div><!--/rating-area-->

                        <div class="socials-share">
                            <a href=""><img src="contents/images/blog/socials.png" alt=""></a>
                        </div><!--/socials-share-->

                        <div class="media commnets">
                            <a class="pull-left" href="#">
                                <img class="media-object" src="images/blog/man-one.jpg" alt="">
                            </a>
                            <div class="media-body">
                                <h4 class="media-heading">Annie Davis</h4>
                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.  Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
                                <div class="blog-socials">
                                    <ul>
                                        <li><a href=""><i class="fa fa-facebook"></i></a></li>
                                        <li><a href=""><i class="fa fa-twitter"></i></a></li>
                                        <li><a href=""><i class="fa fa-dribbble"></i></a></li>
                                        <li><a href=""><i class="fa fa-google-plus"></i></a></li>
                                    </ul>
                                    <a class="btn btn-primary" href="">Other Posts</a>
                                </div>
                            </div>
                        </div><!--Comments-->
                        <div class="response-area">
                            <h2>3 RESPONSES</h2>
                            <ul class="media-list">
                                <li class="media">

                                    <a class="pull-left" href="#">
                                        <img class="media-object" src="contents/images/blog/man-two.jpg" alt="">
                                    </a>
                                    <div class="media-body">
                                        <ul class="sinlge-post-meta">
                                            <li><i class="fa fa-user"></i>Janis Gallagher</li>
                                            <li><i class="fa fa-clock-o"></i> 1:33 pm</li>
                                            <li><i class="fa fa-calendar"></i> DEC 5, 2013</li>
                                        </ul>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.  Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
                                        <a class="btn btn-primary" href=""><i class="fa fa-reply"></i>Replay</a>
                                    </div>
                                </li>
                                <li class="media second-media">
                                    <a class="pull-left" href="#">
                                        <img class="media-object" src="contents/images/blog/man-three.jpg" alt="">
                                    </a>
                                    <div class="media-body">
                                        <ul class="sinlge-post-meta">
                                            <li><i class="fa fa-user"></i>Janis Gallagher</li>
                                            <li><i class="fa fa-clock-o"></i> 1:33 pm</li>
                                            <li><i class="fa fa-calendar"></i> DEC 5, 2013</li>
                                        </ul>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.  Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
                                        <a class="btn btn-primary" href=""><i class="fa fa-reply"></i>Replay</a>
                                    </div>
                                </li>
                                <li class="media">
                                    <a class="pull-left" href="#">
                                        <img class="media-object" src="contents/images/blog/man-four.jpg" alt="">
                                    </a>
                                    <div class="media-body">
                                        <ul class="sinlge-post-meta">
                                            <li><i class="fa fa-user"></i>Janis Gallagher</li>
                                            <li><i class="fa fa-clock-o"></i> 1:33 pm</li>
                                            <li><i class="fa fa-calendar"></i> DEC 5, 2013</li>
                                        </ul>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.  Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
                                        <a class="btn btn-primary" href=""><i class="fa fa-reply"></i>Replay</a>
                                    </div>
                                </li>
                            </ul>					
                        </div><!--/Response-area-->
                        <div class="replay-box">
                            <div class="row">
                                <div class="col-sm-8">
                                    <div class="text-area">
                                        <div class="blank-arrow">
                                            <label>Your Name</label>
                                        </div>
                                        <span>*</span>
                                        <textarea name="message" rows="11"></textarea>
                                        <a class="btn btn-primary" href="">post comment</a>
                                    </div>
                                </div>
                            </div>
                        </div><!--/Repaly Box-->
                    </div>	
                </div>
            </div>
        </section>                                    

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
