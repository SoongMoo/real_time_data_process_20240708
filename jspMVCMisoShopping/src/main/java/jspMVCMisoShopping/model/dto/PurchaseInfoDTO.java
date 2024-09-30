package jspMVCMisoShopping.model.dto;

import lombok.Data;

@Data
public class PurchaseInfoDTO {
	// goods
	String goodsNum;   
	String goodsImage;
	String goodsName;
	
	// purchase
	Long purchaseNum;
	String purchaseStatus;
	String memberNum;
	
	// payment
	String confirmNum;
	String applDate;
	
	Long purchasePrice ;
	Long deliveryNum;
	String deliveryStatus;
}



