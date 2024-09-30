package jspMVCMisoShopping.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jspMVCMisoShopping.service.delivery.DeliveryDetailService;
import jspMVCMisoShopping.service.delivery.DeliveryModifyService;
import jspMVCMisoShopping.service.delivery.DeliveryWriteService;
import jspMVCMisoShopping.service.item.PurchaseListService;

public class DeliveryFrontController extends HttpServlet {
	protected void doProcess(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		if(command.equals("/purchaseList.deli")) {
			PurchaseListService action = new PurchaseListService(request);
			action.execute(request);
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("purchase/purchaseList.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/deliveryRegist.deli")) {
			DeliveryDetailService action = new DeliveryDetailService();
			action.execute(request);
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("purchase/deliveryRegist.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/deliveryWrite.deli")) {
			DeliveryWriteService action = new DeliveryWriteService();
			action.execute(request);
			response.sendRedirect("purchaseList.deli");
		}else if(command.equals("/deliveryModify.deli")) {
			DeliveryModifyService action = new DeliveryModifyService();
			action.execute(request);
			
			response.sendRedirect("purchaseList.deli");
		}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(req, resp);
	}
}
