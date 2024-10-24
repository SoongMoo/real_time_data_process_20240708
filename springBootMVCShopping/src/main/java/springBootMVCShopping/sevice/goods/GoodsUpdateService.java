package springBootMVCShopping.sevice.goods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import jakarta.servlet.http.HttpSession;
import springBootMVCShopping.command.GoodsCommand;
import springBootMVCShopping.domain.AuthInfoDTO;
import springBootMVCShopping.domain.GoodsDTO;
import springBootMVCShopping.mapper.EmployeeMapper;
import springBootMVCShopping.mapper.GoodsMapper;

@Service
public class GoodsUpdateService {
	@Autowired
	EmployeeMapper employeeMapper;
	@Autowired
	GoodsMapper goodsMapper;
	public void execute(GoodsCommand goodsCommand, HttpSession session
			, BindingResult result, Model model) {
		System.out.println("dkssud");
		GoodsDTO dto = new GoodsDTO();
		dto.setGoodsContents(goodsCommand.getGoodsContents());
		dto.setGoodsName(goodsCommand.getGoodsName());
		dto.setGoodsNum(goodsCommand.getGoodsNum());
		dto.setGoodsPrice(goodsCommand.getGoodsPrice());
		// 수정한 직원의 정보를 알기 위해 로그인 정보를 이용해서 직원정보를 가지고왔습니다.
		AuthInfoDTO auth = (AuthInfoDTO) session.getAttribute("auth");
		String empNum = employeeMapper.getEmpNum(auth.getUserId());
		dto.setUpdateEmpNum(empNum);
		System.out.println(dto.getGoodsName());
		goodsMapper.goodsUpdate(dto);
	}
}













