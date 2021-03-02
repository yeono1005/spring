<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
*{text-align:center;}
</style>
<body>
<h1 >상품 리스트</h1>
<table border="1" align="center">
	<tr>
		<th>code</th><th>name</th><th>price</th><th>color</th><th>date</th><th>수정</th><th>삭제</th>
	</tr>
	<c:forEach var="goods" items="${goodsList}">
	<tr>
		<td><a href="goodsView.do?code=${goods.code }">${goods.code }</a></td>
		<td>${goods.name }</td>
		<td>${goods.price }</td>
		<td>${goods.color }</td>
		<td>${goods.regdate }</td>
		<td><a href="goodsUpdate.do?code=${goods.code }">수정</a></td>
		<td><a href="goodsDelete.do?code=${goods.code }">삭제</a></td>
	</tr>
	</c:forEach>
</table>
<a href="goodsInsert.do">상품등록하기</a>
</body>
</html>