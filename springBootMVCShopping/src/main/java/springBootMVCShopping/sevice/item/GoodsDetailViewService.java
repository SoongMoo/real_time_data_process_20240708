package springBootMVCShopping.sevice.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootMVCShopping.domain.GoodsStockDTO;
import springBootMVCShopping.mapper.GoodsStockMapper;

@Service
public class GoodsDetailViewService {
	@Autowired
	GoodsStockMapper goodsStockMapper;
	public void execute(String goodsNum, Model model) {
		GoodsStockDTO dto = goodsStockMapper.goodsStockSelectOne(goodsNum);
		goodsStockMapper.goodsVisitCountUpdate(goodsNum);
		model.addAttribute("dto", dto);
	}
}
