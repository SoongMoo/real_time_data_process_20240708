package jspMVCMisoShopping.service.ipgo;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import jspMVCMisoShopping.model.dao.GoodsIpgoDAO;
import jspMVCMisoShopping.model.dto.GoodsIpgoDTO;

public class GoodsIpgoUpdateService {
	public void execute(HttpServletRequest request) {
		String goodsIpgoNum = request.getParameter("goodsIpgoNum");
		String goodsNum = request.getParameter("goodsNum");
		String ipgoDate = request.getParameter("ipgoDate");
		String ipgoQty = request.getParameter("ipgoQty");
		String madeDate = request.getParameter("madeDate");
		String ipgoPrice = request.getParameter("ipgoPrice");
		
		GoodsIpgoDTO dto = new GoodsIpgoDTO();
		dto.setGoodsIpgoNum(goodsIpgoNum);
		dto.setGoodsNum(goodsNum);
		dto.setIpgoPrice(Integer.parseInt(ipgoPrice));
		dto.setIpgoQty(Integer.parseInt(ipgoQty));
		
		SimpleDateFormat tsdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = tsdf.parse(madeDate);
			
			Timestamp timestamp = new Timestamp(date.getTime());
			dto.setMadeDate(timestamp);
			
			date = sdf.parse(ipgoDate);
			dto.setIpgoDate(date);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		GoodsIpgoDAO dao = new GoodsIpgoDAO();
		dao.ipgoGoodsUpdate(dto);
	}
}
