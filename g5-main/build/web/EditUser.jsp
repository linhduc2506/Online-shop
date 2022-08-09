<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Change Information</title>
        <!-- Common CSS file -->
        <!-- Specific CSS file -->
        <%@include file="contents/compontents/Import.jsp"%>
        <link href="contents/css/editUser.css" rel="stylesheet">
        <link href="contents/css/common.css" rel="stylesheet" type="text/css">
    </head>

    <body>
        <%@include file="contents/compontents/Header.jsp"%>
        <div class="header-placeholder"></div>
        <div class="header-placeholder"></div>

        <form action="EditProfileController" method="POST">
            <div class="bio">
                <p>Bio</p>

                <div class="bio-table">
                    <table> 
                        <input type="hidden" value="${user.id}" name="userId">

                        <tr>
                            <td>Avatar</td>
                            <td><input type="text" value="${user.avatar}" name="avatar">
                            </td>
                        </tr>
                        <tr>
                            <td>Phone</td>
                            <td><input type="text" value="${user.phone}" name="phone">
                            </td>
                        </tr>
                        <tr>
                            <td>Address</td>
                            <td><input type="text" value="${user.address}" name="address">
                            </td>
                        </tr>
                        <tr>
                            <td>Gender</td>
                            <td><input type="text" value="${user.gender}" name="gender">
                            </td>
                        </tr>
                        <tr>
                            <td>Status</td>
                            <td><input type="text" value="${user.status}" name="status">
                            </td>
                        </tr>
                        <tr>
                            <td><span>Short infor</span>
                                <span>(max 20 characters)</span>
                            </td>
                            <td><input type="text" value="${user.shortDescription}" name="shortDescription">
                            </td>
                        </tr>
                    </table>
                </div>

                <div class="text">
                    <c:if test="${admin == null}">
                        <span>Need to change your password?</span>
                        <a href="${pageContext.request.contextPath}/changePassword">Click there!</a>
                    </c:if>
                    <c:if test="${admin != null}">
                        <a href="#">Reset user password</a>
                    </c:if>
                </div>
            </div>

            <div class="profile">
                <p>Profile</p>

                <div class="tus">
                    <input  type="text" value="${user.profile}" name="profile">
                </div>

                <button class="save-button" type="action">Save</button>
            </div>
        </form>

        <%@include file="contents/compontents/Footer.jsp"%>

        <script src="contents/js/jquery.js"></script>
        <script src="contents/js/bootstrap.min.js"></script>
        <script src="contents/js/jquery.scrollUp.min.js"></script>
        <script src="contents/js/price-range.js"></script>
        <script src="contents/js/jquery.prettyPhoto.js"></script>
        <script src="contents/js/main.js"></script>
    </body>

</html>