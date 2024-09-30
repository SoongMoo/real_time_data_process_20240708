package jspMVCMisoShopping.model.dto;

import java.sql.Timestamp;
import java.util.Date;

public class GoodsIpgoDTO {
	String goodsIpgoNum;
	String goodsNum;
	Date ipgoDate;
	Integer ipgoPrice;
	Timestamp madeDate;
	String empNum;
	Integer ipgoQty;
	
	String goodsName;	
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	
	
	public String getGoodsIpgoNum() {
		return goodsIpgoNum;
	}
	public void setGoodsIpgoNum(String goodsIpgoNum) {
		this.goodsIpgoNum = goodsIpgoNum;
	}
	public String getGoodsNum() {
		return goodsNum;
	}
	public void setGoodsNum(String goodsNum) {
		this.goodsNum = goodsNum;
	}
	public Date getIpgoDate() {
		return ipgoDate;
	}
	public void setIpgoDate(Date ipgoDate) {
		this.ipgoDate = ipgoDate;
	}
	public Integer getIpgoPrice() {
		return ipgoPrice;
	}
	public void setIpgoPrice(Integer ipgoPrice) {
		this.ipgoPrice = ipgoPrice;
	}
	public Timestamp getMadeDate() {
		return madeDate;
	}
	public void setMadeDate(Timestamp madeDate) {
		this.madeDate = madeDate;
	}
	public String getEmpNum() {
		return empNum;
	}
	public void setEmpNum(String empNum) {
		this.empNum = empNum;
	}
	public Integer getIpgoQty() {
		return ipgoQty;
	}
	public void setIpgoQty(Integer ipgoQty) {
		this.ipgoQty = ipgoQty;
	}
}
