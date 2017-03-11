<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="${pageContext.request.contextPath }/items/queryItems.action">查询测试</a><br><br>
<a href="${pageContext.request.contextPath }/items/editItems.action?id=1">文件上传测试</a><br><br>
<a href="${pageContext.request.contextPath }/jsonTest.jsp">json测试</a><br><br>

<!-- 使用firefox浏览器 -->
<a href="${pageContext.request.contextPath }/items/itemsView/1">restful测试</a><br><br>


<a href="${pageContext.request.contextPath }/login.action">登录测试</a><br><br>
<a href="${pageContext.request.contextPath }/logout.action">注销</a><br><br>
</body>
</html>