<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/5 0005
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--/login 指的是web.xml中域名为login的东西--%>
<form action="${pageContext.request.contextPath}/login" method="get">
    用户名 <input type="text" name="username">
    密码 <input type="password" name="password">
    <input type="submit">

</form>
</body>
</html>
