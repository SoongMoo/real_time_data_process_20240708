package springBootMVCShopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.service.purchase.OrderProcessListService;

@Controller
@RequestMapping("delivery")
public class DeliveryController {
	@Autowired
	OrderProcessListService orderProcessListService;
	
	@GetMapping("deliveryRegist")
	public String deliveryRegist(String purchaseNum
			,Model model, HttpSession session) {
		orderProcessListService.execute(session, model, purchaseNum);
		model.addAttribute("newLineChar", "\n");
		return "thymeleaf/delivery/deliveryRegist"; 
	}
}
