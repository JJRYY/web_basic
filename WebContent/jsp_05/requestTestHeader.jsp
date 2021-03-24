<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.Enumeration" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>헤더 정보 예제</title>
<style type="text/css">
	h1 {
		text-align: center;
	}
	table {
		margin: auto;
		width: 800px;
		border: 1px solid red;
	}
	table > th {
		width: 300px;
	}
</style>
</head>
<body>
<ul id="menu">
	<li><a href=#content1>헤더 정보</a>
	<li><a href=#content2>쿠키, URL/URI 요청방식</a>
</ul>
	<h1 id="content1">헤더 정보 예제</h1>
	<table>
		<tr>
			<th>헤더이름</th>
			<td>헤더값</td>
		</tr>
		<%
		Enumeration<String> e = request.getHeaderNames();
		while(e.hasMoreElements()){
			String headerName = e.nextElement();
		%>
		<tr>
		<td><%=headerName %></td>
		<td><%=request.getHeader(headerName) %></td>
		<%}%>
	</table>
	<p><a href="#menu">메뉴</a></p>
	<hr>
	
	<h1 id="content2">쿠키, URL/URI 요청방식에 관련된 정보 예제</h1>
	<table border="1">
		<tr>
			<td>쿠키 정보</td>
	<%
	Cookie[] cookie=request.getCookies();
	if(cookie==null) {
	%>		
		<td>쿠키가 존재하지 않습니다</td>
	<%
	} else {
		for(int i=0; i<cookie.length; i++){
		%>
		<td><%=cookie[i].getName() %>(<%=cookie[i].getValue() %>) &nbsp;&nbsp;</td>
		<% 	
		}
	}
	%>
	
		</tr>
		<tr>
			<td>서버 도메인명</td>
			<td><%=request.getServerName() %>
		</td>
		<tr>
			<td>서버 포트번호</td>
			<td><%=request.getServerPort() %>
		</td>
		<tr>
			<td>요청 URL</td>
			<td><%=request.getRequestURL() %>
		</td>
		<tr>
			<td>요청 URI</td>
			<td><%=request.getRequestURI() %>
		</td>
		<tr>
			<td>요청 쿼리</td>
			<td><%=request.getQueryString() %>
		</td>
		<tr>
			<td>클라이언트 호스트명</td>
			<td><%=request.getRemoteHost() %>
		</td>
		<tr>
			<td>클라이언트 IP주소</td>
			<td><%=request.getRemoteAddr() %>
		</td>
		<tr>
			<td>프로토콜</td>
			<td><%=request.getProtocol() %>
		</td>
		<tr>
			<td>요청방식</td>
			<td><%=request.getMethod() %>
		</td>
		<tr>
			<td>컨텍스트 경로</td>
			<td><%=request.getContextPath() %>
		</td>
	</table>
	<p><a href="#menu">메뉴</a></p>
</body>
</html>