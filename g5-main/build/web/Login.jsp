<%-- 
    Document   : Login
    Created on : Jan 6, 2022, 2:37:50 PM
    Author     : LAPTOP D&N
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login | E-Shopper</title>

        <%@include file="contents/compontents/Import.jsp"%>


    </head>
    <body>
        <%@include file="contents/compontents/Header.jsp"%>

        <section id="form"><!--form-->
            <div class="container">
                <div class="row">
                    <div class="col-sm-4 col-sm-offset-1">
                        <div class="login-form"><!--login form-->
                            <h2>Login to your account</h2>
                            <form action="login" method="POST">
                                <p class="error">${error}</p>
                                <input name="user" placeholder="Username" type="text">
                                <input name="pass" placeholder="Password" type="password">
                                <span>  
                                    <input type="checkbox" class="checkbox"> 
                                    Keep me signed in OR 
                                </span>
                                <a href="${pageContext.request.contextPath}/ForgotPasswordController">Forgot Password</a> 
                                <button type="submit" class="btn btn-default">Login</button>
                            </form>
                        </div><!--/login form-->
                    </div>
                                
                    <div class="col-sm-1">
                        <h2 class="or">OR</h2>
                    </div>
                                
                    <div class="col-sm-4">
                        <div class="signup-form"><!--sign up form-->
                            <h2>New User Signup!</h2>
                            <form action="signup" method="POST">
                                <p class="error">${error2}</p>
                                <input id="username" name="username" placeholder="Username" type="text">
                                <input id="email" name="email" placeholder="Email Address" type="text">
                                <input id="password" name="password" placeholder="Password" type="password">
                                <button type="submit" class="btn btn-default">Signup</button>
                            </form>
                        </div><!--/sign up form-->
                    </div>
                </div>
            </div>
        </section><!--/form-->

        <%@include file="contents/compontents/Footer.jsp"%>

        <script src="contents/js/jquery.js"></script>
        <script src="contents/js/bootstrap.min.js"></script>
        <script src="contents/js/jquery.scrollUp.min.js"></script>
        <script src="contents/js/price-range.js"></script>
        <script src="contents/js/jquery.prettyPhoto.js"></script>
        <script src="contents/js/main.js"></script>
    </body>
</html>
