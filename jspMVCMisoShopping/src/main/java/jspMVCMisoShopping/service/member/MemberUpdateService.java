package jspMVCMisoShopping.service.member;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import jspMVCMisoShopping.model.dao.MemberDAO;
import jspMVCMisoShopping.model.dto.AuthInfoDTO;
import jspMVCMisoShopping.model.dto.MemberDTO;

public class MemberUpdateService {
	public int execute(HttpServletRequest request) {
		String memberNum = request.getParameter("memberNum");
		HttpSession session = request.getSession(); 
		AuthInfoDTO auth = (AuthInfoDTO)session.getAttribute("auth");
		MemberDAO dao = new MemberDAO();
		if(memberNum == null) {
			memberNum = dao.memberNumSelect(auth.getUserId());
		}
		try {
			// 한글 깨짐 방지
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {}
		MemberDTO dto = new MemberDTO();
		dto.setMemberAddr(request.getParameter("memberAddr"));
		dto.setMemberAddrDetail(request.getParameter("memberAddrDetail"));
		dto.setMemberEmail(request.getParameter("memberEmail"));
		dto.setGender(request.getParameter("gender"));
		dto.setMemberId(request.getParameter("memberId"));
		dto.setMemberName(request.getParameter("memberName"));
		dto.setMemberNum(memberNum);
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
		int i = 0;
		if(auth.getUserPw().equals(request.getParameter("memberPw"))) {
			dao.memberUpdate(dto);
			i = 1;
		}else {
			request.setAttribute("errPw", "비밀번호가 틀렸습니다.");
		}
		return i;
	}
}





