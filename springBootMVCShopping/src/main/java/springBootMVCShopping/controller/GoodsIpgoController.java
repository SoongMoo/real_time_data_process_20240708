package springBootMVCShopping.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.command.GoodsIpgoCommand;
import springBootMVCShopping.domain.GoodsIpgoGoodsNameDTO;
import springBootMVCShopping.sevice.AutoNumService;
import springBootMVCShopping.sevice.goodsIpgo.GoodsIpgoDeleteService;
import springBootMVCShopping.sevice.goodsIpgo.GoodsIpgoDetailService;
import springBootMVCShopping.sevice.goodsIpgo.GoodsIpgoListService;
import springBootMVCShopping.sevice.goodsIpgo.GoodsIpgoService;
import springBootMVCShopping.sevice.goodsIpgo.GoodsIpgoUpdateService;
import springBootMVCShopping.sevice.goodsIpgo.GoodsItemService;

@Controller
@RequestMapping("goods")
public class GoodsIpgoController {
	@Autowired
	GoodsItemService goodsItemService;
	@Autowired
	GoodsIpgoService goodsIpgoService;
	@Autowired
	GoodsIpgoListService goodsIpgoListService;
	@Autowired
	GoodsIpgoDetailService goodsIpgoDetailService;
	@Autowired
	GoodsIpgoUpdateService goodsIpgoUpdateService;
	@Autowired
	AutoNumService autoNumService;
	
	
	@Autowired
	GoodsIpgoDeleteService goodsIpgoDeleteService;
	@RequestMapping("goodsIpgoDelete")  // get/post
	public String goodsIpgoDelete(String num) {
		goodsIpgoDeleteService.execute(num);
		return "redirect:goodsIpgoList";
	}
	
	@PostMapping("goodsIpgoModify")
	public String goodsIpgoModify(GoodsIpgoCommand goodsIpgoCommand) {
		goodsIpgoUpdateService.execute(goodsIpgoCommand);
		return "redirect:goodsIpgoDetail?ipgoNum="+goodsIpgoCommand.getGoodsIpgoNum()
									  +"&goodsNum="+goodsIpgoCommand.getGoodsNum();
	}
	
	
	@RequestMapping(value="goodsIpgoUpdate" ,method=RequestMethod.GET)
	public String goodsIpgoUpdate(String ipgoNum, String goodsNum,Model model) {
		goodsIpgoDetailService.execute(ipgoNum,goodsNum, model);
		return "thymeleaf/goodsIpgo/goodsIpgoUpdate";
	}
	
	@GetMapping("goodsIpgoDetail")
	public String detailView(
			@ModelAttribute(value = "ipgoNum") String ipgoNum, 
			@ModelAttribute(value = "goodsNum") String goodsNum /*, Model model*/) {
		//model.addAttribute("ipgoNum", ipgoNum);
		//model.addAttribute("goodsNum", goodsNum);
		//goodsIpgoDetailService.execute(ipgoNum,goodsNum, model);
		return "thymeleaf/goodsIpgo/goodsIpgoDetail";
	}
	
	
	@PostMapping("goodsIpgoDetail")
	@ResponseBody
	public GoodsIpgoGoodsNameDTO  detail(String ipgoNum, String goodsNum,Model model) {
		GoodsIpgoGoodsNameDTO dto = goodsIpgoDetailService.execute(ipgoNum,goodsNum, model);
		return dto;
	}
	
	@GetMapping("goodsIpgoList")
	public String goodsIpgoList(Model model) {
		goodsIpgoListService.execute(model);
		return "thymeleaf/goodsIpgo/goodsIpgoList";
	}
	
	@RequestMapping(value="ipgoRegist")
	@ResponseBody
	public String ipgoRegist(GoodsIpgoCommand goodsIpgoCommand, HttpSession session) {
		goodsIpgoService.execute(goodsIpgoCommand, session);
		//return "redirect:goodsIpgoList";
		//return "thymeleaf/goods/goodsRedirect";
		return "200";  //CSR
	}
	
	@RequestMapping(value="goodsIpgo",method = RequestMethod.GET )
	public String goodsIpgo(Model model) {
		String autoNum = autoNumService.execute("ipgo_", "IPGO_NUM", 6, "goods_Ipgo");
		GoodsIpgoCommand  goodsIpgoCommand = new GoodsIpgoCommand();
		goodsIpgoCommand.setGoodsIpgoNum(autoNum);
		model.addAttribute("goodsIpgoCommand", goodsIpgoCommand);
		return "thymeleaf/goodsIpgo/goodsIpgo";
	}
	
	
	
	
	
	
	
	
	@GetMapping(value="goodsItem")
	public String goodsItem() {
		return "thymeleaf/goodsIpgo/goodsItem";
	}
	@PostMapping(value="goodsItemList")
	@ResponseBody // Map을 이용해 데이터를 html에 보내려면 RestAPI를 사용하지만 @ResponseBody를 이용하겠습니다.
	public Map<String, Object> goodsItem( //searchWord를 가져오기 위해 html에 검색 부분 추가
			@RequestParam(value = "searchWord", required = false) String searchWord,
			@RequestParam(value = "page" , required = false, defaultValue = "1" ) int page
			){ //함수 중복은 일단 넘어가겠습니다.
		Map<String, Object> map = goodsItemService.execute(searchWord, page);
		return map;
	}
}
