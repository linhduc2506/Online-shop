<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Shop | E-Shopper</title>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@page contentType="text/html" pageEncoding="UTF-8"%>
        <%@include file="contents/compontents/Import.jsp"%>
    </head><!--/head-->

    <body>
        <%@include file="contents/compontents/Header.jsp"%>

        <section>
            <div class="container">
                <div class="row">
                    <div class="col-sm-3">
                        <div class="left-sidebar">										
                            <div class="brands_products"><!--brands_products-->
                                <h2>Brands</h2>
                                <div class="brands-name">
                                    <ul class="nav nav-pills nav-stacked">
                                        <c:forEach var="o" items="${listC}">                                                                              
                                            <li><a href="productCategory?id=${o.id}"> <span class="pull-right"></span>${o.name}</a></li>
                                                </c:forEach>
                                    </ul>
                                </div>
                            </div><!--/brands_products-->

                            <!--                            <div class="price-range">price-range
                                                            <h2>Price Range</h2>
                                                            <div class="well">
                                                                <input type="text" class="span2" value="" data-slider-min="0" data-slider-max="600" data-slider-step="5" data-slider-value="[250,450]" id="sl2" ><br />
                                                                <b>$ 0</b> <b class="pull-right">$ 600</b>
                                                            </div>
                                                        </div>/price-range-->

                            <div class="shipping text-center"><!--shipping-->
                                <img src="images/home/shipping.jpg" alt="" />
                            </div><!--/shipping-->

                        </div>
                    </div>

                    <div class="col-sm-9 padding-right">
                        <div class="product-details"><!--product-details-->
                            <div class="col-sm-5">
                                <div class="view-product">
                                    <img src="${productDetail.thumbnail}" alt="" />
                                    <h3>ZOOM</h3>
                                </div>
                                <div id="similar-product" class="carousel slide" data-ride="carousel">

                                </div>

                            </div>
                            <div class="col-sm-7">
                                <div class="product-information"><!--/product-information-->
                                    <img src="contents/images/product-details/new.jpg" class="newarrival" alt="" />
                                    <h2>${productDetail.name}</h2>
                                    <p>Web ID: ${productDetail.id}</p>
                                    <p>Category: ${productDetail.category}</p>
                                    <img src="contents/images/product-details/rating.png" alt="" />
                                    <span>
                                        <span>${productDetail.price}</span>
                                        <label>Quantity:</label>
                                        <input type="text" value="${productDetail.quantity}" />
                                        <form name="f" action="" method="POST">
                                             <input type="number" name="num" min="0" value="1" class="purchase-box">
                                            <button type="submit" onclick="buy('${productDetail.id}','${productDetail.quantity}')" class="btn btn-fefault cart">
                                                <i class="fa fa-shopping-cart"></i>
                                                Add to cart
                                            </button>
                                        </form>
                                    </span>
                                    <p><b>Description:</b> ${productDetail.description}</p>
                                    <p><b>Availability:</b> In Stock</p>
                                    <p><b>Condition:</b> New</p>
                                    <p><b>Brand:</b> E-SHOPPER</p>
                                    <a href=""><img src="contents/images/product-details/share.png" class="share img-responsive"  alt="" /></a>
                                </div><!--/product-information-->
                            </div>
                        </div><!--/product-details-->

                        <div class="category-tab shop-details-tab"><!--category-tab-->
                            <div class="col-sm-12">
                                <ul class="nav nav-tabs">
                                    <li class="active"><a href="#details" data-toggle="tab">Feedback</a></li>								
                                    <li ><a href="#reviews" data-toggle="tab">Reviews</a></li>
                                </ul>
                            </div>
                            <!--                            <div class="tab-content">																	
                                                            <div class="tab-pane fade active in" id="reviews" >
                                                                <div class="col-sm-12">
                                                                    <ul>
                                                                        <li><a href=""><i class="fa fa-user"></i>EUGEN</a></li>
                                                                        <li><a href=""><i class="fa fa-clock-o"></i>12:41 PM</a></li>
                                                                        <li><a href=""><i class="fa fa-calendar-o"></i>31 DEC 2014</a></li>
                                                                    </ul>
                                                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.</p>
                                                                    <p><b>Write Your Review</b></p>
                            
                                                                    <form action="#">
                                                                        <span>
                                                                            <input type="text" placeholder="Your Name"/>
                                                                            <input type="email" placeholder="Email Address"/>
                                                                        </span>
                                                                        <textarea name="" ></textarea>
                                                                        <b>Rating: </b> <img src="images/product-details/rating.png" alt="" />
                                                                        <button type="button" class="btn btn-default pull-right">
                                                                            Submit
                                                                        </button>
                                                                    </form>
                                                                </div>
                                                            </div>
                                                        </div>-->

                            <div class="tab-content">
                                <c:forEach  var="o" items="${productFeedback}">
                                    <div class="tab-pane fade active in" id="reviews" >
                                        <div class="col-sm-12">
                                            <ul>
<!--                                                <img src="${o.avatar}" alt="">-->
                                                <img src="contents/images/product-details/rating.png" alt="" />
                                                <li><a><i></i>${o.username}</a></li>                                           
                                            </ul>
                                            <p>${o.cmt}</p>
                                            <b>Rating: ${o.rateStar}</b> <img src="contents/images/product-details/rating.png" alt="" />
                                            <br>
                                            <br>
                                        </div>
                                    </div>
                                </c:forEach>
                            </div>
                        </div><!--/category-tab-->

                        <div class="recommended_items"><!--recommended_items-->
                            <h2 class="title text-center">recommended items</h2>

                            <div id="recommended-item-carousel" class="carousel slide" data-ride="carousel">
                                <div class="carousel-inner">
                                    <div class="item active">	
                                        <c:forEach items="${top3Recom1}" var="i">
                                            <div class="col-sm-4">
                                                <div class="product-image-wrapper">
                                                    <div class="single-products">
                                                        <div class="productinfo text-center">
                                                            <img src="${i.thumbnail}" alt="" />
                                                            <h2>$${i.price}</h2>
                                                            <p>${i.name}</p>
                                                            <a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
                                                        </div>

                                                    </div>
                                                </div>
                                            </div>
                                        </c:forEach>
                                    </div>
                                    <div class="item">	
                                        <c:forEach items="${top3Recom2}" var="i">
                                            <div class="col-sm-4">
                                                <div class="product-image-wrapper">
                                                    <div class="single-products">
                                                        <div class="productinfo text-center">
                                                            <img src="${i.thumbnail}" alt="" />
                                                            <h2>$${i.price}</h2>
                                                            <p>${i.name}</p>
                                                            <a href="#" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
                                                        </div>

                                                    </div>
                                                </div>
                                            </div>
                                        </c:forEach>
                                    </div>
                                </div>
                                <a class="left recommended-item-control" href="#recommended-item-carousel" data-slide="prev">
                                    <i class="fa fa-angle-left"></i>
                                </a>
                                <a class="right recommended-item-control" href="#recommended-item-carousel" data-slide="next">
                                    <i class="fa fa-angle-right"></i>
                                </a>			
                            </div>
                        </div><!--/recommended_items-->

                    </div>
                </div>
            </div>
        </section>

        <%@include file="contents/compontents/Footer.jsp"%>

        <script type="text/javascript">
            function buy(id, quantity) {
                var m = document.f.num.value;
                if (m > quantity) {
                    alert("Khong du hang");
                    return;
                } else {
                    document.f.action = "addtocart?id=" + id;
                    document.f.submit();
                }
            }
        </script> 


        <script src="js/jquery.js"></script>
        <script src="js/price-range.js"></script>
        <script src="js/jquery.scrollUp.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.prettyPhoto.js"></script>
        <script src="js/main.js"></script>
    </body>
</html>