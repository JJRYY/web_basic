package web_basic.jsp_13.erp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jsp_13/titleUpdate")
public class TitleUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TitleService service;
       
    public TitleUpdate() {
    	service = new TitleService();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String tNo = request.getParameter("tno").trim();
		String tName = request.getParameter("tname").trim();
		
		Title title = new Title(Integer.parseInt(tNo), tName);
		service.updateTitle(title);
		
		response.sendRedirect("/web_basic/TitleServlet");
	}

}
