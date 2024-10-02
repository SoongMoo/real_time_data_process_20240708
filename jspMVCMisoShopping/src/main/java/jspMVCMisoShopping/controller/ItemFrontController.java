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
import jspMVCMisoShopping.service.item.GoodsItemService;
import jspMVCMisoShopping.service.item.GoodsOrderService;
import jspMVCMisoShopping.service.item.GoodsVisitCountService;
import jspMVCMisoShopping.service.item.GoodsWishItemService;
import jspMVCMisoShopping.service.item.INIstdpayPcReturn;
import jspMVCMisoShopping.service.item.IniPayReqService;
import jspMVCMisoShopping.service.item.PaymentDeleteService;
import jspMVCMisoShopping.service.item.PurchaseListService;
import jspMVCMisoShopping.service.item.PurchasedService;

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
		}else if(command.equals("/itemBuy.item")) {
			GoodsItemService action = new GoodsItemService(request);
			action.execute(request);
			
			RequestDispatcher dispatcher =
					request.getRequestDispatcher("item/goodsOrder.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/goodsOrder.item")) {
			GoodsOrderService action = new GoodsOrderService(request);
			String purchaseNum = action.execute(request);
			response.sendRedirect("paymentOk.item?purchaseNum="+purchaseNum);
		}else if(command.equals("/paymentOk.item")) {
			IniPayReqService action1 = new IniPayReqService();
			try {
				action1.execute(request);
			} catch (Exception e) {
				e.printStackTrace();
			}
			RequestDispatcher dispatcher =
					request.getRequestDispatcher("item/payment.jsp");
			dispatcher.forward(request, response);	
		}else if(command.equals("/purchaseList.item")) {
			PurchaseListService action = new PurchaseListService(request);
			action.execute(request);
			RequestDispatcher dispatcher 
					= request.getRequestDispatcher("item/purchaseList.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/INIstdpay_pc_return.item")) {
			INIstdpayPcReturn action = new INIstdpayPcReturn();
			action.execute(request);
			
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("item/buyfinished.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/close.item")) {
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("item/close.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/paymentDelete.item")) {
			PaymentDeleteService action = new PaymentDeleteService();
			action.execute(request);
			response.sendRedirect("purchaseList.item");
		}else if(command.equals("/purchased.item")) {
			PurchasedService action = new PurchasedService();
			action.execute(request);
			response.sendRedirect("purchaseList.item");
		}else if(command.equals("/descript.item")) {
			GoodsDetailService action= new GoodsDetailService();
			action.execute(request);
			request.setAttribute("newLine", "\n");
			
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher("item/descript.jsp");
			dispatcher.forward(request, response);
		}else if(command.equals("/buyItem.item")) {
			CartMergeService action = new CartMergeService();
			action.execute(request);
			response.sendRedirect("itemBuy.item?prodCk="
						+request.getParameter("goodsNum"));
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

