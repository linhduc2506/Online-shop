<%-- 
    Document   : HomePage
    Created on : Jan 6, 2022, 2:59:14 PM
    Author     : LAPTOP D&N
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home | E-Shopper</title>
        <%@include file="contents/compontents/Import.jsp"%>
    </head>
    <body>
        <%@include file="contents/compontents/Header.jsp"%>

        <section id="slider">
            <div class="container">
                <div class="row">
                    <div class="col-sm-12">
                        <div id="slider-carousel" class="carousel slide" data-ride="carousel">
                            <ol class="carousel-indicators">
                                <li data-target="#slider-carousel" data-slide-to="0" class="active"></li>
                                <li data-target="#slider-carousel" data-slide-to="1"></li>
                                <li data-target="#slider-carousel" data-slide-to="2"></li>
                            </ol>

                            <div class="carousel-inner">
                                <div class="item active">
                                    <div class="col-sm-6">
                                        <h1><span>E</span>-SHOPPER</h1>
                                        <h2>Free E-Commerce Template</h2>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>
                                        <button type="button" class="btn btn-default get">Get it now</button>
                                    </div>
                                    <div class="col-sm-6">
                                        <img src="contents/images/home/girl1.jpg" class="girl img-responsive" alt="" />
                                        <img src="contents/images/home/pricing.png"  class="pricing" alt="" />
                                    </div>
                                </div>
                                <div class="item">
                                    <div class="col-sm-6">
                                        <h1><span>E</span>-SHOPPER</h1>
                                        <h2>100% Responsive Design</h2>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>
                                        <button type="button" class="btn btn-default get">Get it now</button>
                                    </div>
                                    <div class="col-sm-6">
                                        <img src="contents/images/home/girl2.jpg" class="girl img-responsive" alt="" />
                                        <img src="contents/images/home/pricing.png"  class="pricing" alt="" />
                                    </div>
                                </div>

                                <div class="item">
                                    <div class="col-sm-6">
                                        <h1><span>E</span>-SHOPPER</h1>
                                        <h2>Free Ecommerce Template</h2>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>
                                        <button type="button" class="btn btn-default get">Get it now</button>
                                    </div>
                                    <div class="col-sm-6">
                                        <img src="contents/images/home/girl3.jpg" class="girl img-responsive" alt="" />
                                        <img src="contents/images/home/pricing.png" class="pricing" alt="" />
                                    </div>
                                </div>

                            </div>

                            <a href="#slider-carousel" class="left control-carousel hidden-xs" data-slide="prev">
                                <i class="fa fa-angle-left"></i>
                            </a>
                            <a href="#slider-carousel" class="right control-carousel hidden-xs" data-slide="next">
                                <i class="fa fa-angle-right"></i>
                            </a>
                        </div>

                    </div>
                </div>
            </div>
        </section>

        <section>
            <div class="container">
                <div class="row">
                    <div class="col-sm-3">
                        <div class="left-sidebar">
                            <h2>Category</h2>
                            <div class="panel-group category-products" id="accordian"><!--category-productsr-->
                                <c:forEach items="${cateList}" var="i">
                                    <div class="panel panel-default">
                                        <div class="panel-heading">
                                            <h4 class="panel-title"><a href="#">${i.name}</a></h4>
                                        </div>
                                    </div>
                                </c:forEach>
                            </div>
                            <div class="price-range"><!--price-range-->
                                <h2>Price Range</h2>
                                <div class="well text-center">
                                    <input type="text" class="span2" value="" data-slider-min="0" data-slider-max="600" data-slider-step="5" data-slider-value="[250,450]" id="sl2" ><br />
                                    <b class="pull-left">$ 0</b> <b class="pull-right">$ 600</b>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-9 padding-right">
                        <div class="feedbacklist-container">
                            <h2 class="title text-center">Feedback List</h2>
                            <div class="feedbacklist-main">
                                <div class="feedbacklist-head">
                                    <form class="feedbackform-cbo" action="FeedbackList" method="get">
                                        <select name="product" style="width: auto">
                                            <option value="" selected>All</option>
                                            <c:forEach items="${productList}" var="i">
                                                <option value="${i.name}">${i.name}</option>
                                            </c:forEach>
                                        </select>
                                        <select name="rate">
                                            <option value="">All</option>
                                            <option value="5">5</option>
                                            <option value="4">4</option>
                                            <option value="3">3</option>
                                            <option value="2">2</option>
                                            <option value="1">1</option>
                                        </select>
                                        <input type="submit" class="btn-search" value="Search"/>
                                    </form>
                                </div>
                                <div class="feebbacklist-content">
                                    <c:forEach items="${feedbackList}" var="i">
                                        <div class="feedbacklist-wrapper">
                                            <div class="feedback-main">
                                                <div class="username-feedback">
                                                    ${i.username}
                                                </div>
                                                <div class="star-feedback">
                                                    ${i.rateStar} sao
                                                </div>
                                                <div class="cmt-feedback">
                                                    ${i.cmt}
                                                </div>
                                            </div>
                                            <div class="feedbacklist-right">
                                                <div class="feedback-product-type">
                                                    ${i.productname}
                                                </div>
                                            </div>
                                        </div>
                                    </c:forEach>
                                </div>
                                <div class="pagging">
                                    <c:if test="${maxPage < 1}">
                                        <h3>Not Found !!</h3>
                                    </c:if>
                                    <c:if test="${maxPage >= 1}">
                                        <div>
                                            <a href="FeedbackList?index=1&product=${product}&rate=${rateStar}" class="${index-1==0?"disabled":""}"> << </a>
                                        </div>
                                        <div>
                                            <a href="FeedbackList?index=${index-1}&product=${product}&rate=${rateStar}" class="${index-1==0?"disabled":""}"> < </a>
                                        </div>
                                        <div class="page-current">
                                            ${index}
                                        </div>
                                        <div>
                                            <a href="FeedbackList?index=${index+1}&product=${product}&rate=${rateStar}" class="${index+1>maxPage?"disabled":""}"> > </a>
                                        </div>
                                        <div>
                                            <a href="FeedbackList?index=${maxPage}&product=${product}&rate=${rateStar}" class="${index+1>maxPage?"disabled":""}"> >> </a>
                                        </div>
                                    </c:if>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <%@include file="contents/compontents/Footer.jsp"%>

    <script src="contents/js/jquery.js"></script>
    <script src="contents/js/bootstrap.min.js"></script>
    <script src="contents/js/jquery.scrollUp.min.js"></script>
    <script src="contents/js/price-range.js"></script>
    <script src="contents/js/jquery.prettyPhoto.js"></script>
    <script src="contents/js/main.js"></script>
</body>
</html>
