<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>choose tag</title>
</head>
<body>
<!-- http://localhost:8080/web_basic/jsp_14/use_c_choose.jsp?name=ksk name 저장 -->
	<c:choose>
		<c:when test="${param.name eq 'ksk' }">
			당신의 이름은 김상건 입니다.
		</c:when>
		<c:when test="${param.name eq 'lny' }">
			당신의 이름은 이나연 입니다.
		</c:when>
		<c:otherwise>
			당신의 이름은 이태훈 입니다.
		</c:otherwise>
	</c:choose>
</body>
</html>