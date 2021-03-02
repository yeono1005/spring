<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="memberUpt.do" method="post">
	 id : <input type="text" name="id" value="${member.id }" readonly><br/>
	 passwd : <input type="password" name="passwd" value="${member.passwd }" readonly ><br/>
	 name : <input type="text" name="name" value="${member.name }"><br/>
	  남여구분 : 남 <input type="radio" name="gender" value="M" ${member.gender == 'M' ? 'checked' : '' }> <!-- 삼항연산자 gender가 M이면 checked, 아니면 공백 -->
	  		여<input type="radio" name="gender" value="F" ${member.gender == 'F' ? 'checked' : '' }><br/>
	 age : <input type="text" name="age" value="${member.age }"><br/>
	 <input type="submit" value="수정하기">
</form>
</body>
</html>