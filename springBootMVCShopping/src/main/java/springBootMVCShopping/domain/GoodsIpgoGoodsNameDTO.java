package springBootMVCShopping.domain;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("goodsIpgoGoodsName")
public class GoodsIpgoGoodsNameDTO {
	String goodsName;	
	GoodsIpgoDTO goodsIpgoDTO;
}
