<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
message 페이지 <br/>
data1 : ${data1 }<br/>
data2 : ${data2 }<br/>
data3 : <fmt:formatDate pattern="yyyy-MM-dd hh:mm:ss" value="${data3 }" />
</body>
</html>