<%-- 
    Document   : register
    Created on : Apr 1, 2019, 4:29:46 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
<!--        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js" type="text/javascript"></script>
        <script type="text/javascript">
            $(document).ready(function () {
                var x_timer;
                $("#email").keyup(function (e) {
                    clearTimeout(x_timer);
                    var user_name = $(this).val();
                    x_timer = setTimeout(function () {
                        check_username_ajax(user_name);
                    }, 1000);
                });

                function check_username_ajax(username) {
                    $("#user-result").html('<img src="img/ajax-loader.gif" />');
                    $.post('', {'username': username}, function (data) {
                        $("#user-result").html(data);
                    });
                }
            });
        </script>-->
    </head>
    <body>
        <%
            String userError = "", passError = "";
            if(request.getAttribute("userError")!=null){
                userError = (String)request.getAttribute("userError");
            }
            if(request.getAttribute("passError")!=null){
                passError = (String)request.getAttribute("passError");
            }
            String email = "", pass = "";
            if(request.getAttribute("email")!=null){
                email = (String)request.getAttribute("email");
            }
            if(request.getAttribute("pass")!=null){
                pass = (String)request.getAttribute("pass");
            }
            %>
        <jsp:include page="header.jsp"></jsp:include>
            <div class="account">
                <h2 class="account-in">Register</h2>
                <form action="UserServlet" method="post">
                    <p style="color: red"><%=userError%></p>
                    <div>
                        <span>UserName*</span>
                        <input type="text" name="email" id="email" placeholder="Nhập email của bạn" value="<%=email%>">
                        <span id="user-result"></span>
                    </div> 				
                    <div>
                        <p style="color: red"><%=passError%></p>
                        <span class="word">Password*</span>
                        <input type="password" name="pass" placeholder="Nhập password của bạn" value="<%=pass%>">
                        <span></span>
                    </div>
                    <input type="hidden" value="insert" name="command">
                    <input type="submit" value="Register"> 
                </form>
            </div>
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
