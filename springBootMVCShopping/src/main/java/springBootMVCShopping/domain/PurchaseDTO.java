package springBootMVCShopping.domain;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Alias("purchase")
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseDTO {
	String purchaseNum;
	Date purchaseDate;
	Integer purchasePrice;
	String deliveryAddr;
	String deliveryAddrDetail;
	String deliveryPost;
	String deliveryPhone;
	String message;
	String purchaseStatus;
	String memberNum;
	String deliveryName;
	String purchaseName;
}
