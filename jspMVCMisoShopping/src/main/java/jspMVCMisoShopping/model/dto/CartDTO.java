package jspMVCMisoShopping.model.dto;

import java.util.Date;

import lombok.Data;

@Data
public class CartDTO {
	String memberNum;
	String goodsNum;
	Integer cartQty;  // null
	Date cartDate;
}
