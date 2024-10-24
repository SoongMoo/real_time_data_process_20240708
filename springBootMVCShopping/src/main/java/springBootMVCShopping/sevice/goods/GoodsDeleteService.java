package springBootMVCShopping.sevice.goods;

import java.io.File;
import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springBootMVCShopping.domain.GoodsDTO;
import springBootMVCShopping.mapper.GoodsMapper;

@Service
public class GoodsDeleteService {
	@Autowired
	GoodsMapper goodsMapper;
	public void execute(String goodsNum) {
		//파일 삭제코드를 추가합니다. 
		// 먼저 삭제할 파일의 정보를 자져옵니다.
		GoodsDTO dto = goodsMapper.selectOne(goodsNum);
		int i = goodsMapper.goodsDelete(goodsNum);
	}
}
