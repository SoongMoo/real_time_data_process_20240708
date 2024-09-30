package jspMVCMisoShopping.service.ipgo;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import jspMVCMisoShopping.model.dao.EmployeeDAO;
import jspMVCMisoShopping.model.dao.GoodsIpgoDAO;
import jspMVCMisoShopping.model.dto.AuthInfoDTO;
import jspMVCMisoShopping.model.dto.GoodsIpgoDTO;

public class GoodsIpgoService {
	public void execute(HttpServletRequest request) {
		String goodsIpgoNum = request.getParameter("goodsIpgoNum");
		String goodsNum = request.getParameter("goodsNum");
		String ipgoDate = request.getParameter("ipgoDate");
		String ipgoQty = request.getParameter("ipgoQty");
		String ipgoPrice = request.getParameter("ipgoPrice");
		String madeDate = request.getParameter("madeDate");
		//로그인 seesion정보를 이용해서 직원정보를 가지고 온다.
		HttpSession session = request.getSession();
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		EmployeeDAO dao = new EmployeeDAO();
		String empNum = dao.empNumSelect(auth.getUserId());
		
		GoodsIpgoDTO dto = new GoodsIpgoDTO();
		dto.setEmpNum(empNum);
		dto.setGoodsIpgoNum(goodsIpgoNum);
		dto.setGoodsNum(goodsNum);
		dto.setIpgoPrice(Integer.parseInt(ipgoPrice));
		dto.setIpgoQty(Integer.parseInt(ipgoQty));
		// 문자열인 날짜를 날짜로 형변환
		SimpleDateFormat tsdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = tsdf.parse(madeDate); // 생산 날짜
			// 날짜를  타임스템프로 변환
			Timestamp timestamp = new Timestamp(date.getTime());
			dto.setMadeDate(timestamp);
			
			date = sdf.parse(ipgoDate); // 일고 날짜
			dto.setIpgoDate(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		GoodsIpgoDAO dao1 = new GoodsIpgoDAO();
		dao1.goodsIpgoInsert(dto);	
		
	}
}








