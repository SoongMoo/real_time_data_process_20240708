package springBootMVCShopping.command;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
@Data
public class GoodsIpgoCommand {
	String goodsIpgoNum;
	String goodsNum;
	Integer ipgoQty;
	Integer ipgoPrice;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	Date ipgoDate;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	LocalDateTime madeDate;
}
