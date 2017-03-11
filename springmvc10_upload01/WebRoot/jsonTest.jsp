<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript">
	function requestJson(){
		$.ajax({
			type:'post',
			url:'${pageContext.request.contextPath}/requestJson.action',
			contentType:'application/json;charset=utf-8',
			data:'{"name":"手机","price":888}',
			success:function(data){
				alert(data);
				alert(data.price);
			}
			
		});
		
	}
	
	function responseJson() {
		$.ajax({
			type:'post',
			url:'${pageContext.request.contextPath}/responseJson.action',
			data:'name=手机&price=8888',
			success:function(data){
				alert(data.name);
			}
		});
		
		
	}
	
	

</script>
</head>
<body>
<input type="button" value="请求是json，输出是json" onclick="requestJson()"><br>
<input type="button" value="请求是key/value，输出是json" onclick="responseJson()">
</body>
</html>