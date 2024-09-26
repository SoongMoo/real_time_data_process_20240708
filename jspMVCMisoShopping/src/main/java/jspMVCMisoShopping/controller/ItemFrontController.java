package jspMVCMisoShopping.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jspMVCMisoShopping.service.goods.GoodsDetailService;
import jspMVCMisoShopping.service.item.CartItemsDeleteService;
import jspMVCMisoShopping.service.item.CartListService;
import jspMVCMisoShopping.service.item.CartMergeService;
import jspMVCMisoShopping.service.item.CartQtyDownService;
import jspMVCMisoShopping.service.item.GoodsVisitCountService;
import jspMVCMisoShopping.service.item.GoodsWishItemService;

public class ItemFrontController extends HttpServlet {
	protected void doProcess(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		if(command.equals("/detailView.item")) {
			GoodsVisitCountService count = new GoodsVisitCountService();
			count.execute(request);
			
			GoodsDetailService action= new GoodsDetailService();
			action.execute(request);
			RequestDispatcher dispatcher =
					request.getRequestDispatcher("item/detailView.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/wishItem.item")) {
			GoodsWishItemService action  = new GoodsWishItemService();
			action.execute(request);
		}else if(command.equals("/cart.item")) {
			CartMergeService action = new CartMergeService();
			action.execute(request);
		}else if(command.equals("/cartList.item")) {
			CartListService action = new CartListService(request);
			action.execute(request);
			RequestDispatcher dispatcher =
					request.getRequestDispatcher("item/cartList.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/cartQtyDown.item")) {
			CartQtyDownService action = new CartQtyDownService(request);
			action.execute(request);
		}else if(command.equals("/cartItemsDel.item")) {
			CartItemsDeleteService action = new CartItemsDeleteService(request);
			action.execute(request);
			response.sendRedirect("cartList.item");
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

