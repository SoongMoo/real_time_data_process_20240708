package jspMVCMisoShopping.service.member;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import jspMVCMisoShopping.model.dao.MemberDAO;
import jspMVCMisoShopping.model.dto.MemberDTO;

public class MemberWriteService {
	public void execute(HttpServletRequest request) {
		try {		
			request.setCharacterEncoding("utf-8");
		}catch(Exception e) {}
		
		MemberDTO dto = new MemberDTO();
		dto.setMemberAddr(request.getParameter("memberAddr"));
		dto.setMemberAddrDetail(request.getParameter("memberAddrDetail"));
		dto.setMemberEmail(request.getParameter("memberEmail"));
		dto.setMemberGender(request.getParameter("gender"));
		dto.setMemberId(request.getParameter("memberId"));
		dto.setMemberName(request.getParameter("memberName"));
		dto.setMemberNum(request.getParameter("memberNum"));
		dto.setMemberPhone1(request.getParameter("memberPhone1"));
		dto.setMemberPhone2(request.getParameter("memberPhone2"));
		dto.setMemberPost(request.getParameter("memberPost"));
		dto.setMemberPw(request.getParameter("memberPw"));
		
		String memberBirth = request.getParameter("memberBirth");
		/// 자바에서 문자열을 날짜로 형변환
		Date date = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			date = sdf.parse(memberBirth);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		dto.setMemberBirth(date);
		
		MemberDAO dao = new MemberDAO();
		dao.memberWrite(dto);
	}
}
