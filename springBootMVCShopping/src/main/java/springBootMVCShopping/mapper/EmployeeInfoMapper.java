package springBootMVCShopping.mapper;

import org.apache.ibatis.annotations.Mapper;

import springBootMVCShopping.domain.EmployeeDTO;

@Mapper
public interface EmployeeInfoMapper {
	public EmployeeDTO employeeSelectOne(String empId);
	public Integer employeeUpdate(EmployeeDTO dto);
}








