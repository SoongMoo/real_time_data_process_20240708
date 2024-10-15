package springBootMVCShopping.sevice.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootMVCShopping.domain.MemberDTO;
import springBootMVCShopping.domain.StartEndPageDTO;
import springBootMVCShopping.mapper.MemberMapper;

@Service
public class MemberListService {
	@Autowired
	MemberMapper memberMapper;
	public void execute(String searchWord,Integer page, Model model) {
		// 한페이지에 몇개를 보여줄것인지?     ///     1 , 2
		Integer limit = 3; 
		int startRow = ((page - 1) * limit) + 1 ; // 11
		int endRow = startRow + limit - 1; // 11 + 10 -1 
		StartEndPageDTO sepDTO = new StartEndPageDTO(startRow, endRow, searchWord);
		List<MemberDTO> list = 
				memberMapper.memberSelectList(sepDTO);
		Integer count = memberMapper.memberCount();
		//                        2        12         25
		int limitPage = 10 ; // 1 ~ 10 , 11 ~ 20 , 21 ~ 30,...
		//                                 
		int startPageNum = (int)((double) page / limitPage + 0.95 - 1) * limitPage + 1;
		int endPageNum = startPageNum + limitPage - 1;  //20
		int maxPage = (int)((double)count / limit + 0.95); // 2
		if(endPageNum > maxPage) endPageNum = maxPage;
		model.addAttribute("list", list);
		model.addAttribute("searchWord", searchWord);
		model.addAttribute("page", page);
		model.addAttribute("startPageNum", startPageNum);
		model.addAttribute("endPageNum", endPageNum);
		model.addAttribute("count", count);
		model.addAttribute("maxPage", maxPage);
	}
}
