<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean  id="user" class="Entity.User" scope="page"/>

<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="resources/style/style.css">

</head>
<body>
<%--(Hidden Form Field, URL Rewriting, HttpSession)--%>

<div class="container">
    Name : <jsp:setProperty name="user" property="name"/>
    LastName : <jsp:setProperty name="user" property="lastname"/>
    Password : <jsp:setProperty name="user" property="password"/>
    <form action="registration" method="GET">
        <p>Name:</p>
        <input type="text" name="name">
        <p>Last Name:</p>
        <input type="text" name="lastName">
        <p>Password:</p>
        <input type="text" name="password">
        <input type="submit" value="Submit">
    </form>
</div>
</body>
</html>
