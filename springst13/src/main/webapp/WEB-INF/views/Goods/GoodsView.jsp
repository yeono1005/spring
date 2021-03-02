<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
*{text-align:center;}
</style>
</head>
<body>
<h1>${goods.code } 상품정보</h1>
<table border="1" align="center">
	<tr>
		<td>code</td>
		<td>${goods.code }</td>
	</tr>
	<tr>
		<td>name</td>
		<td>${goods.name }</td>
	</tr>
	<tr>
		<td>price</td>
		<td>${goods.price }</td>
	</tr>
	<tr>
		<td>color</td>
		<td>${goods.color }</td>
	</tr>
	<tr>
		<td><a href="goodsUpdate.do?code=${goods.code }">수정</a></td>
		<td><a href="goodsDelete.do?code=${goods.code }">삭제</a></td>
	</tr>
</table>
<a href="goodsList.do">상품리스트</a>
</body>
</html>