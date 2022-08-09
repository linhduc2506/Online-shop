<%-- 
    Document   : MyOrder
    Created on : Mar 12, 2022, 1:15:19 AM
    Author     : dangd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Orders</title>
        <%@include file="contents/compontents/Import.jsp"%>
        <link href="${pageContext.request.contextPath}/contents/css/order.css" rel="stylesheet">
    </head>
    <body>
        <%@include file="contents/compontents/Header.jsp"%>


        <c:set var="z" value="1"/>
        <c:forEach items="${OrderList}" var="o">
            <div class="order">            
                <div class="">
                    <span>Order #${z}</span>
                    <c:set var="z" value="${z+1}"/>
                    <span>${o.updatedAt}</span>
                </div>
                
            </div>      
        </c:forEach>


        <%@include file="contents/compontents/Footer.jsp"%>

        <script src="contents/js/jquery.js"></script>
        <script src="contents/js/bootstrap.min.js"></script>
        <script src="contents/js/jquery.scrollUp.min.js"></script>
        <script src="contents/js/price-range.js"></script>
        <script src="contents/js/jquery.prettyPhoto.js"></script>
        <script src="contents/js/main.js"></script>
    </body>
</html>
