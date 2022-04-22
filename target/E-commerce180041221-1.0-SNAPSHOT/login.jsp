<%--
  Created by IntelliJ IDEA.
  User: samiu
  Date: 4/12/2022
  Time: 3:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Login</title>
</head>

<h1>Welcome To Online Shopping!!!</h1>
<div>
    <form action="loginServlet" method="post">
        <input type="text" name="username-field">
        <input type="password" name="password-field">
        <input type="submit" value="Log in">
    </form>
</div>
<div>
    <p>Don't have an account? <a href="registration.jsp">Register</a></p>
</div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</body>
</html>


</body>
</html>
