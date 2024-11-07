package springBootMVCShopping.domain;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("delivery")
public class DeliveryDTO {
	String purchaseNum;
	String deliveryNum;
	Date deliveryDate;
	String deliveryStatus;
}
