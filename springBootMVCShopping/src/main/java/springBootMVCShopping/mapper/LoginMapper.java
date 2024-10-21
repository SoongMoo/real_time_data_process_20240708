package springBootMVCShopping.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import springBootMVCShopping.domain.AuthInfoDTO;

@Mapper
public interface LoginMapper {
	public Integer idCheckSelectOne(@Param("userId")  String userId);
	public Integer emailCheckSelectOne(@Param("userEmail") String userEmail);
	public AuthInfoDTO loginSelectOne(String userId);
}








