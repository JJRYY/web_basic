<%@page import="web_basic.jsp_13.erp.Title"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	List<Title> list = (List<Title>) request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>타이틀 목록</title>
<link rel="stylesheet" href="chap08/css/display-2.css">
</head>
<body>
	<nav>
		<ul>
			<li><a href="/web_basic/TitleServlet">직책 목록</a></li>
			<li><a href="jsp_13/newtitle.html">직책 추가</a></li>
			<li><a href="jsp_13/deltitle.jsp">직책 삭제</a></li>
			<li><a href="jsp_13/updatetitle.jsp">직책 수정</a></li>
		</ul>
	</nav>
<%
	if(list.size() > 0){	
		for(Title t : list){
%>
			<%=t.gettNo() %> - <%=t.gettName() %> <br>
<%		} %>
<%	} else { %>
 		 데이터가 없음
<%  } %>
</body>
</html>