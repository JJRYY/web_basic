package web_basic.chap04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/chap04/quiz2Servlet")
public class Quiz2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String field = request.getParameter("field");
		String subField = null;
		if (field.equals("WebPub")) {
			subField = "웹 퍼블리싱";
		} else if (field.equals("WebApp")) {
			subField = "웹 어플리케이션 개발";
		} else if (field.equals("BetterDev")) {
			subField = "개발 환경 개선";
		}
		String moti = request.getParameter("moti");
		String subMoti = moti.replace("\r\n", "<br>");
		
		out.println("<h2>개인정보</h2>");
		out.printf("이름 : %s <br>", name);
		out.printf("연락처 : %s <br>", phone);
		out.println("<h2>지원분야</h2>");
		out.printf("지원분야 : %s <br>", subField);
		out.println("<h2>지원동기</h2>");
		out.printf("%s <br>", subMoti);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
