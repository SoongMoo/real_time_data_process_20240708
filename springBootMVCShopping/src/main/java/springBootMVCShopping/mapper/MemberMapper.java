package springBootMVCShopping.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import springBootMVCShopping.domain.MemberDTO;
import springBootMVCShopping.domain.StartEndPageDTO;

@Mapper
public interface MemberMapper {
	public void memberInsert(MemberDTO dto);
	public List<MemberDTO> memberSelectList(StartEndPageDTO sepDTO); 
	public Integer memberCount();
}
