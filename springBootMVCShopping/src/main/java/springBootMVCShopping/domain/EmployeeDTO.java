package springBootMVCShopping.domain;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("emp")
public class EmployeeDTO {
	String empNum;
	String empId;
	String empPw;
	String empName;
	String empAddr;
	String empAddrDetail;
	Integer empPost;
	String empPhone;
	String empEmail;
	Date empRegiDate;
	String empJumin;
}
