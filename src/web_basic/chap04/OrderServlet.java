package web_basic.chap04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/chap04/orderServlet")
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		String name = request.getParameter("uname"); 
		String tel = request.getParameter("tell");
		String address = request.getParameter("addr");
		String tel2 = request.getParameter("tel2");
		String comment = request.getParameter("comment");
//		String[] item = request.getParameterValues("item");
//		String[] cnt = request.getParameterValues("cnt");
		String item1 = request.getParameter("item1");
		String item2 = request.getParameter("item2");
		String item3 = request.getParameter("item3");
		String cntGuate = request.getParameter("cntGuate");
		String cntIndia = request.getParameter("cntIndia");
		String cntTamra = request.getParameter("cntTamra");
		
		
		
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>개인 정보</h2>");
		out.println("이름 : " + name + "<br>");
		out.println("연락처 : " + tel + "<br>");
		out.println("<h2>배송지 정보</h2>");
		out.println("주소 : " + address + "<br>");
		out.println("전화번호 : " + tel2 + "<br>");
		out.println("메모 : " + comment + "<br>");
		out.println("<h2>주문 정보</h2>");
		if (item1 != null) {
			out.println(item1 + " : " + cntGuate + "개<br>");
		}
		if (item2 != null) {
			out.println(item2 + " : " + cntIndia + "개<br>");
		}
		if (item3 != null) {
			out.println(item3 + " : " + cntTamra + "개<br>");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
