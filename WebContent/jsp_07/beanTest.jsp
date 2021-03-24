<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="std" class="web_basic.jsp_07.Student" scope="page"/>
<%-- <jsp:setProperty property="stdNo" name="std" value="11"/>
<jsp:setProperty property="stdName" name="std" value="이나"/>
<jsp:setProperty property="kor" name="std" value="80"/> --%>
<jsp:setProperty name="std" property="*"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자바빈 사용 예제</title>
</head>
<body>
	<h1>자바빈 사용 예제</h1>
	<h3>학번 : <%=std.getStdNo() %></h3>
	<h3>성명 : <%=std.getStdName() %></h3>
	<h3>국어 : <%=std.getKor() %></h3>
	<h3>영어 : <%=std.getEng() %></h3>
	<h3>수학 : <%=std.getMath() %></h3>
	<h3>총점 : <%=std.getTotal() %></h3>
	<h3>평균 : <%=std.getAvg() %></h3>
	<hr>
	<h3>학번 : <jsp:getProperty name="std" property="stdNo"/></h3>
	<h3>이름 : <jsp:getProperty name="std" property="stdName"/></h3>
	<h3>국어 : <jsp:getProperty name="std" property="kor"/></h3>
	<h3>영어 : <jsp:getProperty name="std" property="eng"/></h3>
	<h3>수학 : <jsp:getProperty name="std" property="math"/></h3>
	<h3>총점 : <jsp:getProperty name="std" property="total"/></h3>
	<h3>평균 : <jsp:getProperty name="std" property="avg"/></h3>
	
</body>
</html>