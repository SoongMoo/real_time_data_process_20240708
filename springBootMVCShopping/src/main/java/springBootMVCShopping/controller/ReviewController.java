package springBootMVCShopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springBootMVCShopping.domain.ReviewDTO;
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
	@RequestMapping("reviewWrite")
	public String reviewWrite(ReviewDTO dto) {
		reviewRepository.reviewInsert(dto);
		return "redirect:goodsReview?goodsNum="+dto.getGoodsNum()
			  +"&purchaseNum="+dto.getPurchaseNum();
	}
	
	
	
	
	
	
}
