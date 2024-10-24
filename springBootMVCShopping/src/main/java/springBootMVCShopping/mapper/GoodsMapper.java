package springBootMVCShopping.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import springBootMVCShopping.domain.GoodsDTO;
import springBootMVCShopping.domain.StartEndPageDTO;

@Mapper
public interface GoodsMapper {
	public int goodsInsert(GoodsDTO dto);
	public List<GoodsDTO> allSelect(StartEndPageDTO sepDTO);
	public int goodsCount(String searchWord);
	
	
	
	public int productsDelete(@Param("products") String products[]);
	public GoodsDTO selectOne(String goodsNum);
	public int goodsUpdate(GoodsDTO dto);
	public int goodsDelete(String goodsNum);
}




