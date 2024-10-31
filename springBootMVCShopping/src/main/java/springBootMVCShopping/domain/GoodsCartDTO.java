package springBootMVCShopping.domain;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("cartGoods")
public class GoodsCartDTO {
	GoodsDTO goodsDTO;     // 1
	CartDTO cartDTO;       // 1
	Integer totalPrice;
}
