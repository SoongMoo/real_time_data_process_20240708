package springBootMVCShopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.sevice.item.GoodsWishService;

@RestController
@RequestMapping("item")
public class ItemRestController {
	@Autowired
	GoodsWishService goodsWishService;
	@RequestMapping("wishItem")
	public void wishAdd(@RequestBody String goodsNum,HttpSession session) {
		goodsWishService.execute(goodsNum, session);
	}
}
