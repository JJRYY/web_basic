<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("UTF-8"); %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

if (request.getParameter("item1")!=null) {%>


<%if(request.getParameter("cntGuate") != "") {%>
	상품 : <%=request.getParameter("item1") %>
	개수 : <%=request.getParameter("cntGuate") %>
	<%} else { %>
	<h1>개수를 선택하세요</h1>
	<%} %>
	
	
<% } else {%>
<h1>선택된 아이템이 없습니다</h1>
<%}%>

	

</body>
</html>