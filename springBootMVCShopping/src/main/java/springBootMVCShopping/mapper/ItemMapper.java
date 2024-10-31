package springBootMVCShopping.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ItemMapper {
	public int wishItem(Map<String , String> map);
}
