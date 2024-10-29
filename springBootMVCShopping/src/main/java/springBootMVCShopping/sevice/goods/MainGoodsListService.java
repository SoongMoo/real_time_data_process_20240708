package springBootMVCShopping.sevice.goods;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootMVCShopping.domain.GoodsDTO;
import springBootMVCShopping.mapper.GoodsMapper;

@Service
public class MainGoodsListService {
	@Autowired
	GoodsMapper goodsMapper;
	public void execute(Integer page, Model model) {
		int limit = 6; // 1 ~ 6
		int startRow = ((page - 1) * limit) + 1 ;    //1
		int endRow = startRow + limit - 1;      //6
		List<GoodsDTO> list = goodsMapper.goodsSelectList(startRow, endRow);
		int count = goodsMapper.goodsCount(null);
		int maxPage = (int)((double)count /  limit  + 0.95); 
		model.addAttribute("maxPage", maxPage);	
		model.addAttribute("list", list);
	}
}
