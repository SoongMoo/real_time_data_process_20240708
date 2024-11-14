package springBootMVCShopping.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.ReviewDTO;
import springBootMVCShopping.mapper.MemberMapper;
import springBootMVCShopping.repository.ReviewRepository;

@Controller
@RequestMapping("review")
public class ReviewController {
	@Autowired
	ReviewRepository reviewRepository;
	@RequestMapping(value="goodsReview" , method=RequestMethod.GET)
	public String goodsReview(
			 String goodsNum
			,String purchaseNum
			,Model model) {
		ReviewDTO dto = new ReviewDTO();
		dto.setGoodsNum(goodsNum);
		dto.setPurchaseNum(purchaseNum);
		String reviewContens =  reviewRepository.reviewSelectOne(dto);
		dto.setReviewContents(reviewContens);
		model.addAttribute("dto", dto);
		return "thymeleaf/review/goodsReview";
	}
	@Autowired
	MemberMapper memberMapper; 
	@RequestMapping("reviewWrite")
	public String reviewWrite(ReviewDTO dto, HttpSession session) {
		String reviewContents = reviewRepository.reviewSelectOne(dto);
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		String memberId = auth.getUserId();
		dto.setMemberId(memberId);
		if(reviewContents == null)
			reviewRepository.reviewInsert(dto);
		else reviewRepository.reviewUpdate(dto);

		return "redirect:/purchase/orderList";
	}
	
	@PostMapping("reviewList")
	public ResponseEntity<Map<String, Object>> reviewList(
			@RequestBody Map<String, String> map
			) {
		String goodsNum = map.get("goodsNum");
		System.out.println(goodsNum);
		List<ReviewDTO> list  = reviewRepository.goodsReviewList(goodsNum);
		Map<String, Object> response = new HashMap<>();
		response.put("reviews", list);
		return ResponseEntity.ok(response);
	}
	
	
	
	
	
}
