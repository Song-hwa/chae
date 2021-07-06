package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.memberDAO;
import model.memberDTO;

@WebServlet("/Logincon")
public class Logincon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("EUC-KR");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		memberDAO dao =  new memberDAO();
		memberDTO member = dao.logincheck(id, pw);
		
		
		if (member != null) {
			System.out.println("로그인성공..");
			HttpSession session = request.getSession();
			session.setAttribute("member", member);
			response.sendRedirect("homePage.jsp");
		} else {
			System.out.println("로그인실패..");
			response.sendRedirect("homePage.jsp");
		}
	}

}
