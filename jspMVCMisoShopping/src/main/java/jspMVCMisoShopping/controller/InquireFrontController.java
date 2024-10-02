package jspMVCMisoShopping.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jspMVCMisoShopping.service.inquire.InquireDetailService;
import jspMVCMisoShopping.service.inquire.InquireListService;
import jspMVCMisoShopping.service.inquire.InquireWriteProService;

public class InquireFrontController extends HttpServlet {
	protected void doProcess(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		if(command.equals("/inquireList.inq")) {
			InquireListService action = new InquireListService(request);
			action.execute(request);
			
			request.setAttribute("goodsNum", request.getParameter("goodsNum"));
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("inquire/inquireList.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/inquireWrite.inq")) {
			request.setAttribute("goodsNum", request.getParameter("goodsNum"));
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("inquire/inquireForm.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/inquireWritePro.inq")) {
			InquireWriteProService action = new InquireWriteProService(request);
			action.execute(request);
			
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			String str = "<script type='text/javascript'>"
					   + " 	opener.parent.inquire();"
					   + "  window.self.close();"
					   + "</script>";
			out.print(str);
			out.close();
		}else if(command.equals("/inquireUpdate.inq")) {
			InquireDetailService action = new InquireDetailService();
			action.execute(request);
			
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("inquire/inquireUpdate.jsp");
			dispatcher.forward(request, response);
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
