<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<h1>상품 등록 페이지</h1>
<form action="goodsInsert.do" method="post">
	<table border="1" align="center">
		<tr>
			<td>code</td>
			<td><input type="text" name="code"/></td>
		</tr>
		<tr>
			<td>name</td>
			<td><input type="text" name="name" /></td>
		</tr>
		<tr>
			<td>price</td>
			<td><input type="text" name="price" /></td>
		</tr>
		<tr>
			<td>color</td>
			<td>red<input type="radio" name="color" value="red" />
				blue<input type="radio" name="color" value="blue" />
				white<input type="radio" name="color" value="white" />
			</td>
		</tr>
	</table><br/>
		<input type="submit" value="등록">
</form>
</body>
</html>