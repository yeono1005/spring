<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- MemberController에 addObject로 memberList를 보내줬기 때문에 i로 memberList를 담아옴 -->
<%-- <c:forEach var="i" begin="1" end="3"> 
	i = ${i} <br/>
</c:forEach> --%>

<table border="1">
	<tr><th>아이디</th><th>이름</th><th>이메일</th><th>수정</th><th>삭제</th></tr>
	<c:forEach var="member" items="${memberList }">
		<tr>
			<td><a href="memberView.do?id=${member.id }">${member.id }</a></td>
			<td>${member.name }</td>
			<td>${member.email }</td>
			<td><a href="memberUpt.do?id=${member.id }">수정</a></td>
			<td><a href="memberDel.do?id=${member.id}">삭제</a></td>
		</tr>
	</c:forEach>
</table>
<a href="memberIns.do">회원등록하기</a>
</body>
</html>