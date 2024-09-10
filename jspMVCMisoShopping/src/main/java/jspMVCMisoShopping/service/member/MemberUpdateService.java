package jspMVCMisoShopping.service.member;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import jspMVCMisoShopping.model.dao.MemberDAO;
import jspMVCMisoShopping.model.dto.MemberDTO;

public class MemberUpdateService {
	public void execute(HttpServletRequest request) {
		MemberDTO dto = new MemberDTO();
		dto.setMemberAddr(request.getParameter("memberAddr"));
		dto.setMemberAddrDetail(request.getParameter("memberAddrDetail"));
		dto.setMemberEmail(request.getParameter("memberEmail"));
		dto.setGender(request.getParameter("gender"));
		dto.setMemberId(request.getParameter("memberId"));
		dto.setMemberName(request.getParameter("memberName"));
		dto.setMemberNum(request.getParameter("memberNum"));
		dto.setMemberPhone1(request.getParameter("memberPhone1"));
		dto.setMemberPhone2(request.getParameter("memberPhone2"));
		dto.setMemberPost(request.getParameter("memberPost"));
		dto.setMemberPw(request.getParameter("memberPw"));
		String birth = request.getParameter("memberBirth");
		// 문자열 날짜로 형변환
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		Date memberBirth = null;
		try {
			memberBirth = sdf.parse(birth);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		dto.setMemberBirth(memberBirth);
		MemberDAO dao = new MemberDAO();
		dao.memberUpdate(dto);
	}
}





