package springBootMVCShopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.command.PurchaseCommand;
import springBootMVCShopping.repository.PurchaseRepository;
import springBootMVCShopping.service.purchase.GoodsBuyService;
import springBootMVCShopping.service.purchase.GoodsOrderService;
import springBootMVCShopping.service.purchase.INIstdpayPcReturn;
import springBootMVCShopping.service.purchase.IniPayReqService;
import springBootMVCShopping.service.purchase.OrderProcessListService;

@Controller
@RequestMapping("purchase")
public class PurchaseController {
	@Autowired
	OrderProcessListService orderProcessListService;
	@Autowired
	GoodsBuyService goodsBuyService;
	@Autowired
	GoodsOrderService goodsOrderService;
	@Autowired
	IniPayReqService iniPayReqService;

	@RequestMapping("goodsBuy")
	public String goodsBuy(String nums[] , HttpSession session,Model model) {
		goodsBuyService.execute(nums, session, model);
		return "thymeleaf/purchase/goodsOrder";
	}
	@PostMapping("goodsOrder")
	public String goodsOrder(PurchaseCommand purchaseCommand, HttpSession session,
			Model model) {
		String purchaseNum = goodsOrderService.execute(purchaseCommand, session, model);
		return "redirect:paymentOk?purchaseNum="+purchaseNum;
	}
	@GetMapping("paymentOk")
	public String paymentOk(String purchaseNum,Model model) {
		try {
			iniPayReqService.execute(purchaseNum, model);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "thymeleaf/purchase/payment";
	}

	@GetMapping("orderList")
	public String orderList(HttpSession session, Model model) {
		orderProcessListService.execute(session, model, null);
		return "thymeleaf/purchase/orderList";
	}
	@GetMapping("purchaseList")
	public String purchaseList(HttpSession session, Model model) {
		orderProcessListService.execute(session, model, null);
		return "thymeleaf/purchase/purchaseList";
	}
	@Autowired
	PurchaseRepository purchaseRepository;
	@GetMapping("paymentDel")
	public String paymentDel(String purchaseNum) {
		purchaseRepository.paymentDel(purchaseNum);
		return "redirect:orderList";
	}
	@GetMapping("purchaseOk")
	public String purchaseOk(String purchaseNum) {
		purchaseRepository.paymentStatusUpdate(purchaseNum);
		return "redirect:orderList";
	}
	
	
	
	
	
	
	
}
