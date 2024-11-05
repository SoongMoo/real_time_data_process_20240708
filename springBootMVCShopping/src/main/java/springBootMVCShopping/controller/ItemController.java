package springBootMVCShopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.service.item.CartListService;
import springBootMVCShopping.service.item.GoodsCartDelsService;
import springBootMVCShopping.service.item.GoodsWishListService;

@Controller
@RequestMapping("item")
public class ItemController {
	@Autowired
	GoodsWishListService goodsWishListService;
	@Autowired
	CartListService cartListService;
	@Autowired
	GoodsCartDelsService goodsCartDelsService;
	@GetMapping("wishList")
	public String wishList(HttpSession session, Model model) {
		goodsWishListService.execute(session, model);
		return "thymeleaf/wish/wishList";
	}
	@RequestMapping("cartList")
	public String cartList(Model model, HttpSession session) {
		cartListService.execute(model, session);
		return "thymeleaf/item/cartList";
	}
	@GetMapping("cartDel")
	public String cartDel(String goodsNums[] , HttpSession session) {
		goodsCartDelsService.execute(goodsNums, session);
		return "redirect:cartList";
	}
}
