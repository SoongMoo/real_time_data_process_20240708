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
	public void numsDelete(
			@Param("nums") String nums[]
			,@Param("tableName") String tableName
			,@Param("columnName") String columnName);
}
