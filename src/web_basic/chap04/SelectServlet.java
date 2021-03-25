package web_basic.chap04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/chap04/selectServlet")
public class SelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		String className = request.getParameter("class");
		String classGubun = "";
		
		switch(className) {
		case "archi": 
			classGubun = "건축공학과";
			break;
		case "mechanic": 
			classGubun = "기계공학과";
			break;
		case "indust": 
			classGubun = "산업공학과";
			break;
		case "elec": 
			classGubun = "전기전자공학과";
			break;
		case "computer": 
			classGubun = "컴퓨터공학과";
			break;
		case "chemical": 
			classGubun = "화학공학과";
			break;
		case "history": 
			classGubun = "사학과";
			break;
		case "lang": 
			classGubun = "어문학부";
			break;
		case "philo": 
			classGubun = "철학";
			break;
		}	
		out.println("<h2>학과정보</h2>");
		out.println("학과 : " + classGubun + "<br>");
		
		String intro = request.getParameter("intro");
		// 줄바꿈 변환
		String introSubs = intro.replace("\r\n", "<br>");
		out.println("<h2>텍스트 영역</h2>");
		out.println(introSubs);
		
		String interest = request.getParameter("interest");
		String interestGubun = "";
		
		switch(interest) {
		case "grammar":
			interestGubun = "문법";
			break;
		case "voca":
			interestGubun = "어휘";
			break;
		case "speaking":
			interestGubun = "회화";
			break;
		case "listening":
			interestGubun = "리스닝";
			break;
		case "news":
			interestGubun = "뉴스청취";
			break;
			
		}
		out.println("<h2>수강과목 선택</h2>");
		out.println("수강과목 : " + interestGubun);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
