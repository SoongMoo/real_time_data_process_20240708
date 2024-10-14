package springBootMVCShopping.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AutoNumMapper {
	public String AutoNumSelect(
			@Param("sep") String sep
			,@Param("columnName") String columnName
			,@Param("len") Integer len
			,@Param("tableName") String tableName);
}
