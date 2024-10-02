package jspMVCMisoShopping.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jspMVCMisoShopping.service.login.UserLoginService;

public class LoginFrontController extends HttpServlet{
	protected void doProcess(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		if(command.equals("/login.login")) {
			System.out.println("login.login");
			UserLoginService action = new UserLoginService();
			int i = action.execute(request, response);
			if(i == 1) response.sendRedirect(contextPath);
			else {
				RequestDispatcher dispatcher = 
						request.getRequestDispatcher("index.jsp");
				dispatcher.forward(request, response);
			}
		}else if(command.equals("/logout.login")) {
			Cookie cookie = new Cookie("keepLogin", "");
			cookie.setPath("/");
			cookie.setMaxAge(0);
			response.addCookie(cookie);
			
			HttpSession session = request.getSession();
			session.invalidate(); // 모든 session을 삭제
			response.sendRedirect(contextPath);
		}else if(command.equals("/loginCk.login")) {
			RequestDispatcher dispatcher =
					request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);	
		}else if(command.equals("/login1.login")) {
			UserLoginService action = new UserLoginService();
			int i = action.execute(request, response);
			if(i == 1) {
				PrintWriter out = response.getWriter();
				response.setContentType("text/html; charset=utf-8");
				out.print("<script type='text/javascript'>");
				out.print("opener.document.location.reload();");
				out.print("window.self.close();");
				out.print("</script>");
				out.close();
			}else {
				RequestDispatcher dispatcher =
						request.getRequestDispatcher("login.jsp");
				dispatcher.forward(request, response);
			}
		}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
}
