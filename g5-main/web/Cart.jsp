<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Cart | E-Shopper</title>
        <%@page contentType="text/html" pageEncoding="UTF-8"%>
        <%@include file="contents/compontents/Import.jsp"%>
    </head><!--/head-->

    <body>
        <%@include file="contents/compontents/Header.jsp"%>

        <section id="cart_items">
            <div class="container">
                <div class="breadcrumbs">
                    <ol class="breadcrumb">
                        <li><a href="#">Home</a></li>
                        <li class="active">Shopping Cart</li>
                    </ol>
                </div>
                <div class="table-responsive cart_info">
                    <table class="table table-condensed">
                        <thead>
                            <tr class="cart_menu">
                                <td class="image">Item</td>
                                <td class="description">Title</td>
                                <td class="price">Price</td>
                                <td class="quantity">Quantity</td>
                                <td class="total">Total</td>
                                <td></td>
                            </tr>
                        </thead>
                        <c:set var="o" value="${sessionScope.cart}"/>
                        <tbody>
                            <c:set var="t" value="0"/>
                            <c:forEach items="${o.carts}" var="productInCart">
                                <tr>
                                    <td class="cart_product">
                                        <a href=""><img src="${productInCart.product.thumbnail}" alt=""></a>
                                    </td>
                                    <td class="cart_description">
                                        <h4><a>${productInCart.product.name}</a></h4>
                                    </td>
                                    <td class="cart_price">
                                        <p>$<fmt:formatNumber pattern="##.#" value="${productInCart.product.price}"/>${productInCart.product.price}</p>
                            </td>
                            <td class="cart_quantity">
                                <div class="cart_quantity_button">
                                    <a type="submit" class="cart_quantity_up" href="cart?num=-1&id=${productInCart.product.id}"> - </a>
                                    <input class="cart_quantity_input" type="text" name="quantity" value="${productInCart.quantity}" autocomplete="off" size="2">
                                    <a type="submit" class="cart_quantity_down" href="cart?num=1&id=${productInCart.product.id}"> + </a>
                                </div>
                            </td>
                            <td class="cart_total">
                                <p class="cart_total_price">${productInCart.product.price * productInCart.quantity}</p>
                            </td>
                            <td class="cart_delete">
                                <form action="cart" method="post">
                                    <input type="hidden" name="id" value="${productInCart.product.id}"/>
                                    <button type="submit">
                                        <a class="cart_quantity_delete"><i class="fa fa-times"></i></a>
                                    </button>
                                </form>
                            </td>
                            </tr>


                            <c:set var="t" value="${ t + productInCart.quantity * productInCart.product.price}"/>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </section> <!--/#cart_items-->

        <c:if test="${t!=0}">
            <jsp:useBean id="db" class="model.Carts"/>
            <section id="do_action">
                <div class="container">
                    <div class="row">

                        <div class="col-sm-6">
                            <div class="total_area">
                                <ul>
                                    <li>Cart Sub Total <span>$${t}</span></li>
                                    <li>Eco Tax (10%) <span>$${t*10/100}</span></li>
                                    <li>Total <span>$${t+t*10/100}</span></li>
                                </ul>
                                <form action="checkout" method="post">
                                    <button type="submit">
                                        <a class="btn btn-default check_out">Check Out</a>
                                    </button>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </section><!--/#do_action-->
        </c:if>

        <%@include file="contents/compontents/Footer.jsp"%>



        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.scrollUp.min.js"></script>
        <script src="js/jquery.prettyPhoto.js"></script>
        <script src="js/main.js"></script>
    </body>
</html>