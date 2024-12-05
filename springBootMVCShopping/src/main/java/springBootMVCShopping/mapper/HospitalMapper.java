package springBootMVCShopping.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import springBootMVCShopping.domain.HospitalDTO;

@Mapper
public interface HospitalMapper {
	void insertHospital(HospitalDTO hospital);
}
