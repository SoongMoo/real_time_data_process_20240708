package jspMVCMisoShopping.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jspMVCMisoShopping.service.member.MemberAutoNumService;
import jspMVCMisoShopping.service.member.MemberListService;
import jspMVCMisoShopping.service.member.MemberWriteService;

public class MemberFrontController extends HttpServlet {
	protected void doProcess(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		if(command.equals("/memberList.mem")) {
			MemberListService action = new MemberListService();
			action.execute(request);
			RequestDispatcher dispatcher =
					request.getRequestDispatcher("/member/memberList.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/memberWrite.mem")) {
			MemberAutoNumService action = new MemberAutoNumService();
			action.execute(request);
			RequestDispatcher dispatcher =
					request.getRequestDispatcher("/member/memberForm.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/memberRegist.mem")) {
			MemberWriteService action = new MemberWriteService();
			action.execute(request);
			response.sendRedirect("memberList.mem");
		}
	}
	@Override
	protected void doGet(HttpServletRequest req, 
			HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
}
