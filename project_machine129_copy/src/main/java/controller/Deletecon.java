package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.memberDAO;


@WebServlet("/Deletecon")
public class Deletecon extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("EUC-KR");
		String email = request.getParameter("email");

		memberDAO dao = new memberDAO();
		int cnt = dao.delete(email);
		
		if(cnt>0) {
			System.out.println("삭제성공");
			response.sendRedirect("select.jsp");
		}else {
			System.out.println("삭제실패");
			response.sendRedirect("select.jsp");
		}
		
		
		
		
		
	}

}
