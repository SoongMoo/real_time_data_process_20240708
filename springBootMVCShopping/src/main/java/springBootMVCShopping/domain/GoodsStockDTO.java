package springBootMVCShopping.domain;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("goodsStock")
public class GoodsStockDTO {
	Integer stock;
	GoodsDTO goodsDTO;
}
