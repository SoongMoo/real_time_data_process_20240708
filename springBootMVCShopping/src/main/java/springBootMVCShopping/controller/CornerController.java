package springBootMVCShopping.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.domain.InquireDTO;
import springBootMVCShopping.repository.InquireRepository;
import springBootMVCShopping.service.item.GoodsDetailViewService;

@Controller
@RequestMapping("corner")
public class CornerController {
	@Autowired
	GoodsDetailViewService goodsDetailViewService;
	@GetMapping("detailView/{goodsNum}")
	public String goodsInfo(
			@PathVariable("goodsNum") String goodsNum,Model model
			, HttpServletResponse response, HttpSession session) {
		goodsDetailViewService.execute(goodsNum, model, response, session);
		return "thymeleaf/item/detailView";
	}
	@RequestMapping("/goodsDescript")
	public void goodsDescript(@RequestBody Map<String, String> map,
			Model model, HttpServletResponse response, HttpSession session) {
		goodsDetailViewService.execute(map.get("goodsNum"), model, response,session);
		
	}
	@Autowired
	InquireRepository inquireRepository;
	@RequestMapping("inquireList")
	public String inquireList(@ModelAttribute("goodsNum") String goodsNum
			,Model model) {
		//model.addAttribute("goodsNum", goodsNum);
		List<InquireDTO> list = inquireRepository.inquireList(goodsNum, null);
		model.addAttribute("list", list);
		model.addAttribute("newLineChar", "\n");
		return "thymeleaf/inquire/inquireList";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
