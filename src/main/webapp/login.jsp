<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:useBean  id="user" class="Entity.User" scope="page"/>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="resources/style/style.css">

</head>
<body>
<div class="container">

    Name : <jsp:setProperty name="user" property="name"/>
    Password : <jsp:setProperty name="user" property="password"/>
    <form action="logIn" method="POST">
        <p>Name:</p>
        <input type="text" name="name">
        <p>Password:</p>
        <input type="text" name="password">

        <input type="submit" value="login">
    </form>
</div>

</body>
</html>
