package springBootMVCShopping.sevice.goodsIpgo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootMVCShopping.domain.GoodsIpgoGoodsNameDTO;
import springBootMVCShopping.mapper.GoodsIpgoMapper;

@Service
public class GoodsIpgoDetailService {
	@Autowired
	GoodsIpgoMapper goodsIpgoMapper;
	public GoodsIpgoGoodsNameDTO execute(String ipgoNum,String goodsNum,Model model) {
		GoodsIpgoGoodsNameDTO dto = goodsIpgoMapper.ipgoGoodsSelectOne(ipgoNum, goodsNum) ;
		model.addAttribute("dto", dto);
		return dto;
	}
}
