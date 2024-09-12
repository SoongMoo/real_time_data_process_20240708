package jspMVCMisoShopping.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jspMVCMisoShopping.model.dto.AuthInfoDTO;
import jspMVCMisoShopping.service.member.MemberDetailService;
import jspMVCMisoShopping.service.member.MemberUpdateService;
import jspMVCMisoShopping.service.user.MemberDropService;
import jspMVCMisoShopping.service.user.MemberPasswordService;

public class MyPageFrontController extends HttpServlet {
	protected void doProcess(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		if(command.equals("/memberMyPage.my")) {
			System.out.println("memberMyPage.my");
			MemberDetailService action = new MemberDetailService();
			action.execute(request);
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("/myPage/memberMyPage.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/memberUpdate.my")) {
			MemberDetailService action = new MemberDetailService();
			action.execute(request);
			RequestDispatcher dispatcher =
					request.getRequestDispatcher("/myPage/myModify.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/memberModify.my")) {
			MemberUpdateService action = new MemberUpdateService();
			int i = action.execute(request);
			if(i == 1) response.sendRedirect("memberMyPage.my");
			else {
				MemberDetailService action1 = new MemberDetailService();
				action1.execute(request);
				RequestDispatcher dispatcher =
						request.getRequestDispatcher("/myPage/myModify.jsp");
				dispatcher.forward(request, response);
			}
		}else if(command.equals("/userPwModify.my")) {
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("myPage/myPwCon.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/memberPwModify.my")) {
			HttpSession session = request.getSession();
			AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
			String path = null;
			if(request.getParameter("memberPw").equals(auth.getUserPw())) {
				path = "myPage/myNewPw.jsp";
			}else {
				request.setAttribute("errPw", "비밀번호가 틀렸습니다.");
				path = "myPage/myPwCon.jsp";
			}
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher(path);
			dispatcher.forward(request, response);
			
		}else if(command.equals("/memberPwPro.my")) {
			MemberPasswordService action = new MemberPasswordService();
			int i = action.execute(request);
			if(i == 1) {
				response.sendRedirect("memberMyPage.my");
			}else {
				RequestDispatcher dispatcher = 
						request.getRequestDispatcher("myPage/myPwCon.jsp");
				dispatcher.forward(request, response);
			}
		}else if(command.equals("/memberDrop.my")) {
			RequestDispatcher dispatcher =
					request.getRequestDispatcher("myPage/memberDrop.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/memberDropOk.my")) {
			MemberDropService action = new MemberDropService();
			int i = action.execute(request);
			if(i == 1) response.sendRedirect("logout.login");
			else {
				RequestDispatcher dispatcher =
						request.getRequestDispatcher("myPage/memberDrop.jsp");
				dispatcher.forward(request, response);
			
			}
		}
		/*  브라우저가 종료되기 전 까지  
		 * 	session.setAttribute(이름, 값); 
		 *  session.getAttribute(이름);
		 *  session.invalidate();
		 */ 
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
