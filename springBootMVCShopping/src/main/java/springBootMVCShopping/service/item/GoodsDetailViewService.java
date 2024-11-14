package springBootMVCShopping.service.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.http.HttpServletResponse;
import springBootMVCShopping.domain.GoodsStockDTO;
import springBootMVCShopping.mapper.GoodsStockMapper;

@Service
public class GoodsDetailViewService {
	@Autowired
	GoodsStockMapper goodsStockMapper;
	public void execute(String goodsNum, Model model, HttpServletResponse response) {
		GoodsStockDTO dto = goodsStockMapper.goodsStockSelectOne(goodsNum);
		goodsStockMapper.goodsVisitCountUpdate(goodsNum);
		model.addAttribute("dto", dto);
		
		ObjectMapper mapper = new ObjectMapper();
		response.setCharacterEncoding("utf-8");
		try {
			response.getWriter().print(mapper.writeValueAsString(dto));
		}catch(Exception e) {}
	}
}
