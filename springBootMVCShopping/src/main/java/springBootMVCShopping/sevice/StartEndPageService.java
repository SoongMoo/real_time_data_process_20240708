package springBootMVCShopping.sevice;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springBootMVCShopping.domain.StartEndPageDTO;

@Service
public class StartEndPageService {
	public StartEndPageDTO execute(int page, int limit, String searchWord) {
		int startRow = ((page - 1) * limit) + 1 ; // 11
		int endRow = startRow + limit - 1; // 11 + 10 -1
		StartEndPageDTO sepDTO = new StartEndPageDTO(startRow, endRow, searchWord);
		return sepDTO;
	}
	public void execute(int page, int limit, int count,String searchWord
			, List list, Model model) {
							//      2        12         25
		int limitPage = 10 ; // 1 ~ 10 , 11 ~ 20 , 21 ~ 30,...                               
		int startPageNum = (int)((double) page / limitPage + 0.95 - 1) * limitPage + 1;
		int endPageNum = startPageNum + limitPage - 1;  //20
		int maxPage = (int)((double)count / limit + 0.95); // 3
		if(endPageNum > maxPage) endPageNum = maxPage;
		System.out.println();
		if(endPageNum == 0) endPageNum = 1;
		if(searchWord == null) searchWord="";
		model.addAttribute("list", list);
		model.addAttribute("searchWord", searchWord);
		model.addAttribute("page", page);
		model.addAttribute("startPageNum", startPageNum);
		model.addAttribute("endPageNum", endPageNum);
		model.addAttribute("count", count);
		model.addAttribute("maxPage", maxPage);
	}
}
