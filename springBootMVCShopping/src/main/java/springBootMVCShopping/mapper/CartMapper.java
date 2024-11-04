package springBootMVCShopping.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import springBootMVCShopping.domain.CartDTO;
import springBootMVCShopping.domain.GoodsCartDTO;
import springBootMVCShopping.domain.GoodsDTO;

@Mapper
public interface CartMapper {
	public void cartMerge(CartDTO dto);
	public GoodsDTO goodsSelect(String goodsNum);
	public CartDTO cartSelect(Integer cartNum);
	public List<GoodsCartDTO> cartSelectList(String memberNum);
	public int cartQtyDown(@Param("goodsNum") String goodsNum
            ,@Param("memberNum") String memberNum);
}
