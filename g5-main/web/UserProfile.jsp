<%-- 
    Document   : UserProfile
    Created on : Jan 8, 2022, 3:11:51 PM
    Author     : LAPTOP D&N
--%>
<%@ page import = "java.io.*,java.util.*, javax.servlet.*" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@include file="contents/compontents/Import.jsp"%>
        <link href="contents/css/userprofile2.css" rel="stylesheet" type="text/css">
        <link href="contents/css/common.css" rel="stylesheet" type="text/css">
    </head>
    <body>

        <%@include file="contents/compontents/Header.jsp"%>
        <div class="header-placeholder"></div>
        <div class="header-placeholder"></div>
        <div class="header-placeholder"></div>

        <div>
            <div class="banner">
                <p class="title">User Profile</p>

                <a href="UserManagement.jsp">
                    <button class="generate-button">Users Management</button>                                
                </a>

            </div>
            <div class="main">
                <div class="pic">
                    <div class="left">
                        <div class="avatar" style="background-image: url('${user.avatar}')"></div>

                        <h4>${user.username}</h4>
                        <p>${user.shortDescription}</p>
                        <p>${user.address}</p>
                    </div>

                    <div class="right">
                        <div class="title-block">
                            <p class="title">Bio</p>
                            <a class="edit-button" href="${pageContext.request.contextPath}/EditProfileController">
                                <img src="${pageContext.request.contextPath}/contents/images/Edit.svg"/>
                            </a>
                        </div>

                        <div class="detail">
                            <div class="row">
                                <p class="property">Username</p>
                                <p class="value">${user.username}</p>
                            </div>

                            <div class="row">
                                <p class="property">Info</p>
                                <p class="value">${user.shortDescription}</p>
                            </div>

                            <div class="row">
                                <p class="property">Email</p>
                                <p class="value">${user.email}</p>
                            </div>

                            <div class="row">
                                <p class="property">Phone</p>
                                <p class="value">${user.phone}</p>
                            </div>

                            <div class="row">
                                <p class="property">Gender</p>
                                <p class="value">${user.gender}</p>
                            </div>

                            <div class="row">
                                <p class="property">Status</p>
                                <p class="value">${user.status}</p>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="profile">
                    <div class="title-block">
                        <p class="title">Profile</p>
                        <a class="edit-button" href="${pageContext.request.contextPath}/EditProfileController">
                            <img src="${pageContext.request.contextPath}/contents/images/Edit.svg"/>
                        </a>
                    </div>

                    <p class="tus">
                        ${user.profile}
                    </p>
                </div>

                <c:if test="${user.role == 2}">
                    <a class="admin-link" href="${pageContext.request.contextPath}/changePassword">
                        <button class="admin-button">Change Password</button>
                    </a>
                </c:if>
            </div>

        </div>





        <%@include file="contents/compontents/Footer.jsp"%>

        <script src="contents/js/jquery.js"></script>
        <script src="contents/js/bootstrap.min.js"></script>
        <script src="contents/js/jquery.scrollUp.min.js"></script>
        <script src="contents/js/price-range.js"></script>
        <script src="contents/js/jquery.prettyPhoto.js"></script>
        <script src="contents/js/main.js"></script>
    </body>
</html>
