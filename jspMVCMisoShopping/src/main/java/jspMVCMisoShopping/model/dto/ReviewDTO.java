package jspMVCMisoShopping.model.dto;

import java.util.Date;

import lombok.Data;
@Data
public class ReviewDTO {
	int reviewNum;
	String goodsNum;
	String purchaseNum;
	String reviewContent;
	String memberId;
	Date reviewDate;
}
