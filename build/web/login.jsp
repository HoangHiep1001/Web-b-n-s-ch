<%-- 
    Document   : newjsplogin
    Created on : Apr 1, 2019, 4:20:24 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login</title>
    </head>
    <body>
        <%
            String err="";
            if(request.getAttribute("err")!=null){
                err = (String)request.getAttribute("err");
            }
            %>
        <jsp:include page="header.jsp"></jsp:include>
            <div class="container">
                <div class="account">
                    <h2 class="account-in">Login</h2>
                    <form action="LoginServlet" method="POST">
                        <p style="color: red"><%=err%></p>
                    <div> 
                        <span class="word">Username *</span>
                        <input type="text" name="email" placeholder="Email dang nhap">
                    </div>                    
                    <div> 
                        <span class="word">Password *</span>
                        <input type="password" name="pass" placeholder="password">
                    </div>				
                    <input type="hidden" value="login" name="command">
                    <input type="submit" value="Login"> 
                </form>
            </div>
        </div>
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
