<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 09.04.2021
  Time: 20:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="post" items="${posts}">
    <li><c:out value="${post}" /></li>
</c:forEach>
</body>
</html>
