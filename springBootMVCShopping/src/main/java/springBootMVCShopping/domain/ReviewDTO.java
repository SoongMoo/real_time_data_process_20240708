package springBootMVCShopping.domain;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("review")
public class ReviewDTO {
	String goodsNum;
	String purchaseNum;
	Date reviewDate;
	String reviewContents;

	Integer reviewNum;
	String memberId;
}






