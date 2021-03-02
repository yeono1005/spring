<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="memberIns.do" method="post">
	 id : <input type="text" name="id"><br/>
	 passwd : <input type="password" name="passwd"><br/>
	 name : <input type="text" name="name"><br/>
	  남여구분 : 남 <input type="radio" name="gender" value="M">
	  		여<input type="radio" name="gender" value="F"><br/>
	 age : <input type="text" name="age" value="0"><br/>
	 <input type="submit" value="회원가입">
</form>
</body>
</html>