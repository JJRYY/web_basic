package web_basic.chap04;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

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
		int member = Integer.parseInt(request.getParameter("member"));
		int stuffs = Integer.parseInt(request.getParameter("stuffs"));
		int satis = Integer.parseInt(request.getParameter("satis"));
		String strSatis = "";
		if (satis == 1) {
			strSatis = "하";
		} else if (satis == 2) {
			strSatis = "중";
		} else if (satis == 3) {
			strSatis = "상";
		}
		String subjectValue = request.getParameter("subject");
		String subject = "";
		if(subjectValue != null) {
			if (subjectValue.equals("speaking")) {
				subject = "회화";
			} else if (subjectValue.equals("grammar")) {
				subject = "문법";
			} else if (subjectValue.equals("writing")) {
				subject = "작문";
			}
		} 
		String[] mailing = request.getParameterValues("mailing");
		String strMail = "메일링 : ";
		if(mailing != null) {
			for(int i = 0; i < mailing.length; i++) {
				if (mailing[i].equals("news")) {
					strMail += "해외 단신 ";
				} else if (mailing[i].equals("dialog")) {
					strMail += "5분 회화 ";
				} else if (mailing[i].equals("pops")) {
					strMail += "모닝팝스 ";
				}
			}
		}
		
		String start = request.getParameter("start");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		Date dateStart = null;
		try {
			dateStart = sdf1.parse(start);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		String end = request.getParameter("end");
		Date dateEnd = null;
		try {
			dateEnd = sdf1.parse(end);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		String startTime = request.getParameter("start1");
		String endTime = request.getParameter("end1");
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm");
		SimpleDateFormat sdf3 = new SimpleDateFormat("HH:mm:ss");
		Date dateStartTime = null;
		Date dateEndTime = null;
		try {
			dateStartTime = sdf2.parse(startTime);
			dateEndTime = sdf2.parse(endTime);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		/*
		 * String startTime2 = request.getParameter("start2"); String endTime2 =
		 * request.getParameter("end2");
		 * 
		 * LocalDateTime startDate2 = LocalDateTime.parse(startTime2,
		 * DateTimeFormatter.ISO_LOCAL_DATE_TIME); LocalDateTime endDate2 =
		 * LocalDateTime.parse(endTime2, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
		 * 
		 * DateTimeFormatter formatter =
		 * DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		 * 
		 * //LocalDateTime -> Date 변환 Date sd =
		 * Date.from(startDate2.atZone(ZoneId.systemDefault()).toInstant()); Date ed =
		 * Date.from(endDate2.atZone(ZoneId.systemDefault()).toInstant());
		 */
		
		
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
		out.println("<h2>등록 정보</h2>");
		out.println("참여인원 : " + member + "<br>");
		out.println("지원물품 : " + stuffs + "<br>");
		out.println("희망단계 : " + strSatis + "<br>");
		out.println("<h2>신청 과목</h2>");
		out.println("신청과목 : " + subject + "<br>");
		out.println("<h2>메일링</h2>");
		out.println(strMail + "<br>");
		out.println("<h2>조회기간</h2>");
		out.println("start : " + sdf1.format(dateStart) + "<br>");
		out.println("end : " + sdf1.format(dateEnd) + "<br>");
		out.println("<h2>대관시간</h2>");
		out.println("start : " + sdf3.format(dateStartTime) + "<br>");
		out.println("end : " + sdf3.format(dateEndTime) + "<br>");
		out.println("<h2>대관시간(다른 날짜)</h2>");
//		out.println(startDate2.format(formatter));
//		out.println(endDate2.format(formatter));
//		out.printf("%1$tF %1$tT - %2$tF %2$tT%n", sd, ed);
		out.println("</body>");
		out.println("</html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
