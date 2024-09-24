package jspMVCMisoShopping.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jspMVCMisoShopping.service.goods.GoodsAutoNumService;
import jspMVCMisoShopping.service.goods.GoodsDeleteService;
import jspMVCMisoShopping.service.goods.GoodsDetailService;
import jspMVCMisoShopping.service.goods.GoodsListService;
import jspMVCMisoShopping.service.goods.GoodsUpdateService;
import jspMVCMisoShopping.service.goods.GoodsWriteService;

public class GoodsFrontController extends HttpServlet {
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command =  requestURI.substring(contextPath.length());
		if(command.equals("/goodsList.goods")) {
			GoodsListService action = new GoodsListService();
			action.execute(request);
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("/goods/goodsList.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/goodsWrite.goods")) {
			GoodsAutoNumService action = new GoodsAutoNumService();
			action.execute(request);
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("/goods/goodsForm.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/goodsRegist.goods")) {
			GoodsWriteService action = new GoodsWriteService();
			action.execute(request);
			response.sendRedirect("goodsList.goods");
		}else if(command.equals("/goodsDetail.goods")) {
			GoodsDetailService action = new GoodsDetailService();
			action.execute(request);
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("/goods/goodsInfo.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/goodsUpdate.goods")) {
			GoodsDetailService action = new GoodsDetailService();
			action.execute(request);
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("/goods/goodsModify.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/goodsModify.goods")) {
			GoodsUpdateService action = new GoodsUpdateService();
			action.execute(request);
			response.sendRedirect("goodsDetail.goods?goodsNum="+request.getParameter("goodsNum"));
		}else if(command.equals("/goodsDelete.goods")) {
			GoodsDeleteService action = new GoodsDeleteService();
			action.execute(request);
			response.sendRedirect("goodsList.goods");
		}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(req, resp);
	}
}
