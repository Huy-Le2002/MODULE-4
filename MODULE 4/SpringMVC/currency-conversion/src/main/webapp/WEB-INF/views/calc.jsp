<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 6/14/2021
  Time: 10:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency conversion</title>
</head>
<body>
<p>1$ = 22.000 vnđ</p>
<form action="" method="post">
    <label> Nhập mệnh giá: $
        <input type="text" name="number">
        <input type="submit" value="Đổi">
    </label>
</form>
<c:if test='${text != null}'>
    <p>${num} $ = ${rs} vnđ</p>
</c:if>

</body>
</html>
