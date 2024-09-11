package jspMVCMisoShopping.model.dto;

import lombok.Data;

@Data
public class AuthInfoDTO {
	String userId;
	String userPw;
	String userName;
	String userEmail;
	String grade;
}
