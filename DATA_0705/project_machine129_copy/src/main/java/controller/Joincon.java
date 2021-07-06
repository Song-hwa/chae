package controller;

import java.io.IOException;



import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.memberDAO;
import model.memberDTO;

@WebServlet("/Joincon")
public class Joincon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("EUC-KR");
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String pw = request.getParameter("pw");
		String tel = request.getParameter("tel");
		String email = request.getParameter("email");
		String address = request.getParameter("address");

		memberDAO dao = new memberDAO();
		memberDTO member = new memberDTO(id ,name , pw, tel, email, address);
		int cnt = dao.join(member);

		if (cnt > 0) {
			System.out.println("/if¹®µµ´Þ");
			request.setAttribute("id", id);
			RequestDispatcher dispatcher = request.getRequestDispatcher("homePage.jsp");
			dispatcher.forward(request, response);

		} else {
			response.sendRedirect("homePage.jsp");
		}

	}

}
