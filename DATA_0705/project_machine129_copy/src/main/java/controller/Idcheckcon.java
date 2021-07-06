package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.memberDAO;


@WebServlet("/Idcheckcon")
public class Idcheckcon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		memberDAO dao = new memberDAO();
		boolean check = dao.idCheck(id);
		//text
		PrintWriter out =  response.getWriter();
		out.print(check);
		
		
		
	}

}
