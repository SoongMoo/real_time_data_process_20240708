package springBootMVCShopping.sevice.goodsIpgo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springBootMVCShopping.domain.GoodsDTO;
import springBootMVCShopping.domain.StartEndPageDTO;
import springBootMVCShopping.mapper.GoodsMapper;
import springBootMVCShopping.sevice.StartEndPageService;

@Service
public class GoodsItemService { 
	//상품 정보를 가지고 오는 것이므로 GoodsMapper를 이용합니다.
	@Autowired
	GoodsMapper goodsMapper;
	@Autowired
	StartEndPageService startEndPageService;
	public Map<String, Object> execute(String searchWord, int page){
		int limit = 10;
		Map<String, Object> map = new HashMap<String, Object>();
		StartEndPageDTO sepDTO = startEndPageService.execute(limit, page, searchWord);
		List<GoodsDTO> list = goodsMapper.allSelect(sepDTO);
		int count = goodsMapper.goodsCount(searchWord);
		int limitPage = 10;
		int startPage = (int)((double)page / limitPage + 0.95 -1) * limitPage + 1 ;
		int endPage = startPage + limitPage -1 ;
		int maxPage = (int)((double)count / limit + 0.95);
		if(maxPage < endPage) endPage = maxPage;
		map.put("dtos", list);
		map.put("searchWord", searchWord);
		map.put("page", page);
		map.put("startPage", startPage);
		map.put("endPage", endPage);
		map.put("count", count);
		map.put("maxPage", maxPage);
		return map;
	}
}
