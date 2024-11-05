package springBootMVCShopping.domain;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("purchaseListGoods")
public class PurchaseListGoodsDTO {
	PurchaseListDTO purchaseList;
	GoodsDTO goods;
}
