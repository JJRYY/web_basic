package web_basic.chap04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/chap04/urlemailtelServlet")
public class UrlEmailTelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		String id = request.getParameter("user-id");
		String pwd1 = request.getParameter("pwd1");
		String pwd2 = request.getParameter("pwd2");
		String name = request.getParameter("user-name");
		String mail = request.getParameter("mail");
		String phone = request.getParameter("phone");
		String homep = request.getParameter("homep");
		
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>로그인 정보</h2>");
		out.println("ID : " + id + "<br>");
		out.println("비밀번호 : " + pwd1 + "<br>");
		out.println("비밀번호 확인 : " + pwd2 + "<br>");
		out.println("<h2>개인 정보</h2>");
		out.println("이름 : " + name + "<br>");
		out.println("이메일 : " + mail + "<br>");
		out.println("전화번호 : " + phone + "<br>");
		out.println("홈페이지 : " + homep + "<br>");
		out.println("</body>");
		out.println("</html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
