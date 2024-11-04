package springBootMVCShopping.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.command.CartCommand;
import springBootMVCShopping.service.item.CartInsertService;
import springBootMVCShopping.service.item.GoodsWishService;

@RestController
@RequestMapping("item")
public class ItemRestController {
	@Autowired
	GoodsWishService goodsWishService;
	@Autowired
	CartInsertService cartInsertService;
	@RequestMapping("wishItem")
	public void wishAdd(@RequestBody Map<String, Object> map,HttpSession session) {
		goodsWishService.execute(map.get("goodsNum").toString(), session);
	}
	@RequestMapping("cartAdd")
	public String cartAdd(@RequestBody CartCommand cartCommand
			, HttpSession session) {
		System.out.println(cartCommand.getGoodsNum());
		return cartInsertService.execute(cartCommand, session);
	}
}
