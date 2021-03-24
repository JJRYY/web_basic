package web_basic.chap04;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/chap04/registerServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	
	private void process(HttpServletRequest request, HttpServletResponse response)
			throws UnsupportedEncodingException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		String[] cls = request.getParameterValues("class");
		String subject = request.getParameter("subject");
		String id = request.getParameter("id");
		String passwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		String mail = request.getParameter("mail");
		
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>개인정보</h2>");
		out.print("ID : " + id + "<br>");
		out.print("password : " + passwd + "<br>");
		out.print("이름 : " + name + "<br>");
		out.print("메일주소 : " + mail + "<br>");
		out.println("<hr>");
		out.println("<h2>수강분야</h2>");
		for(int i = 0; i < cls.length; i++) {
			out.print(cls[i] + "<br>");
		}
		out.println("<hr>");
		out.println("<h2>수강과목</h2>");
		out.println(subject + "<br>");
		out.println("</body>");
		out.println("</html>");
	}

}
