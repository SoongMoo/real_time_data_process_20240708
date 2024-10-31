package springBootMVCShopping.service.goodsIpgo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springBootMVCShopping.domain.GoodsDTO;
import springBootMVCShopping.mapper.GoodsIpgoMapper;

@Service
public class GoodsItemListService {
	@Autowired
	GoodsIpgoMapper goodsIpgoMapper;
	public Map<String, Object> execute(int page, String searchWord) {
		if(searchWord == null) searchWord = "";
		int limit = 3;
		int startRow =  ((page - 1) * limit) + 1 ;
		int endRow = startRow + limit - 1; 
		List<GoodsDTO> list  = goodsIpgoMapper.itemSelectList(startRow, endRow, searchWord);
		int count = goodsIpgoMapper.itemListCount(searchWord);
		int limitPage = 10;
		int startPage = (int)((double)page / limitPage + 0.95 -1) * limitPage + 1 ;//1
		int endPage = startPage + limitPage -1 ;// 10
		int maxPage = (int)((double)count / limit + 0.95);
		if(maxPage < endPage) endPage = maxPage;
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("searchWord", searchWord);
		map.put("list", list);
		map.put("page", page);
		map.put("startPage", startPage);
		map.put("endPage", endPage);
		map.put("count", count);
		map.put("maxPage", maxPage);
		return map;
	}
}
