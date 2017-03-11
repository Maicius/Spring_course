<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录</title>
</head>
<body>

<form method="post" action="${pageContext.request.contextPath }/login.action">
用户账号：<input type="text" name="userName"><br>
密码：<input type="password" name="password"> <br>
<input type="submit" value="登录">
<input type="reset" value="取消">
 
</form>
</body>
</html>