<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>8080포트 egovproject tomcat B</h2>

	<c:choose>
		<c:when test="${not empty loginUser}">
			<h3 style="color: blue;">${loginUser.name}님,환영합니다! (로그인 중)</h3>
			<p>아이디: ${loginUser.id}</p>
			<a href="/egov/logout.do">로그아웃</a>
		</c:when>

		<c:otherwise>
			<h3 style="color: red;">로그인이 필요합니다.</h3>
			<form action="/egov/login.do" method="post">
				아이디: <input type="text" name="id"><br> 
				비번: <input type="password" name="pw"><br> 
				<input type="submit" value="로그인">
			</form>
		</c:otherwise>
	</c:choose>
</body>
</html>