package jspMVCMisoShopping.model.dto;

import java.util.Date;

import lombok.Data;

@Data
public class GoodsDTO {
	String goodsNum;
	String goodsName;
	int goodsPrice;
	String goodsContent;
	int visitCount;
	String empNum;
	Date goodsRegist;
	String updateEmpNum;
	Date goodsUpdateDate;
	
	String goodsMainImage;
	String goodsMainStoreImage;
	
	String goodsDetailImage;
	String goodsDetailStoreImage;
}





