package springBootMVCShopping.domain;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("purchaseListGoods")
public class PurchaseListGoodsDTO {
	PurchaseListDTO purchaseListDTO;// 1
	GoodsDTO goodsDTO;  // 1
	ReviewDTO reviewDTO;
}
