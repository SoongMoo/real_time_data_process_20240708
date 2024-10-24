package springBootMVCShopping.sevice.goods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootMVCShopping.domain.GoodsDTO;
import springBootMVCShopping.mapper.GoodsMapper;

@Service
public class GoodsDetailService {
	@Autowired
	GoodsMapper goodsMapper;
	public void execute(String goodsNum, Model model) {
		GoodsDTO dto = goodsMapper.selectOne(goodsNum);
		model.addAttribute("goodsCommand", dto);
		// \n을 <br />로 변경하기 위해서 필요합니다.
		model.addAttribute("newLine", "\n");
	}
}
