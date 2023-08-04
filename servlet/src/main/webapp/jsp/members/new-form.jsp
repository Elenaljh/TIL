<%--
  Created by IntelliJ IDEA.
  User: jihye Lee1
  Date: 2023-08-04
  Time: 오후 2:14
  To change this template use File | Settings | File Templates.
--%>
<%--아래는 jsp파일이라는 뜻--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/jsp/members/save.jsp" method="post">
    username: <input type="text" name="username"/>
    age: <input type="text" name="age"/>
    <button type="submit">전송</button>
</form>
</body>
</html>
