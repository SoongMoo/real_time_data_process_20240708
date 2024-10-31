package springBootMVCShopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.service.item.CartListService;
import springBootMVCShopping.service.item.GoodsDetailViewService;

@Controller
@RequestMapping("item")
public class CornerController {
	@Autowired
	GoodsDetailViewService goodsDetailViewService;
	@Autowired
	CartListService cartListService;
	@GetMapping("detailView/{goodsNum}")
	public String goodsInfo(
			@PathVariable("goodsNum") String goodsNum,Model model) {
		goodsDetailViewService.execute(goodsNum, model);
		return "thymeleaf/item/detailView";
	}
	@GetMapping("cartList")
	public String cartList(Model model, HttpSession session) {
		cartListService.execute(model, session);
		return "thymeleaf/corner/cartList";
	}
}
