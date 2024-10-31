package springBootMVCShopping.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import springBootMVCShopping.domain.GoodsStockDTO;

@Mapper
public interface GoodsStockMapper {
	public GoodsStockDTO goodsStockSelectOne(String goodsNum);
	public int goodsVisitCountUpdate(String goodsNum);
}
