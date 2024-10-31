package springBootMVCShopping.service.goodsIpgo;

import java.sql.Timestamp;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.command.GoodsIpgoCommand;
import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.GoodsIpgoDTO;
import springBootMVCShopping.mapper.EmployeeMapper;
import springBootMVCShopping.mapper.GoodsIpgoMapper;
@Service
public class GoodsIpgoService {
	@Autowired
	EmployeeMapper employeeMapper;
	@Autowired
	GoodsIpgoMapper goodsIpgoMapper;
	public void execute(GoodsIpgoCommand goodsIpgoCommand, HttpSession session) {
		//입고한 직원이 누구인지 알기 위해 직원 로그인 정보를 가지고 온다.
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		//아이디가 아닌 직원번호가 필요하므로 아이디를 이용해서 직원정보를 가지고 온다.
		String empNum = employeeMapper.getEmpNum(auth.getUserId());
		// 입고 DTO를 만들어준다.
		GoodsIpgoDTO dto = new GoodsIpgoDTO();
		/*
		dto.setGoodsNum(goodsIpgoCommand.getGoodsNum());
		dto.setIpgoDate(goodsIpgoCommand.getIpgoDate());
		dto.setGoodsIpgoNum(goodsIpgoCommand.getGoodsIpgoNum());
		dto.setIpgoPrice(goodsIpgoCommand.getIpgoPrice());
		dto.setIpgoQty(goodsIpgoCommand.getIpgoQty());
		*/
		BeanUtils.copyProperties(goodsIpgoCommand, dto);
		
		dto.setEmpNum(empNum);
		dto.setMadeDate(Timestamp.valueOf(goodsIpgoCommand.getMadeDate()));
		
		goodsIpgoMapper.goodsIpgoInsert(dto);
	}
}
