<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<form action="goodsUpdate.do" method="post">
	<table border="1" align="center">
		<tr>
			<td>code</td>
			<td>${goods.code }</td>
		</tr>
		<tr>
			<td>name</td>
			<td><input type="text" name="name" value="${goods.name }"/></td>
		</tr>
		<tr>
			<td>price</td>
			<td><input type="text" name="price" value="${goods.price }"/></td>
		</tr>
		<tr>
			<td>color</td>
			<td>red<input type="radio" name="color" value="red" ${goods.color =='red' ? 'checked' : '' }>
				blue<input type="radio" name="color" value="blue" ${goods.color =='blue' ? 'checked' : '' }>
				white<input type="radio" name="color" value="white" ${goods.color =='white' ? 'checked' : '' }>
			</td>
		</tr>
		<tr>
			<td colspan="2">${goods.regdate }</td>
		</tr>
		
	</table><br/>
		<input type="submit" value="수정">
</form>
</body>
</html>