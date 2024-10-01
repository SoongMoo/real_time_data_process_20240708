package jspMVCMisoShopping.model.dao;

import java.sql.SQLException;

import jspMVCMisoShopping.model.dto.ReviewDTO;

public class ReviewDAO extends DataBaseInfo{
	
	public void reviewDelete(String reviewNum) {
		con = getConnection();
		sql = " delete from reviews where review_num = ? ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, reviewNum);
			int i = pstmt.executeUpdate();
			System.out.println(i + "개가 삭제되었습니다.");
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {close();}
	}
	
	public void reviewSelectOne(ReviewDTO dto) {
		con = getConnection();
		sql = " select REVIEW_CONTENTS from reviews "
			+ " where purchase_Num = ? and goods_Num = ? ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getPurchaseNum());
			pstmt.setString(2, dto.getGoodsNum());
			rs = pstmt.executeQuery();
			if(rs.next()) {
				dto.setReviewContent(rs.getString("REVIEW_CONTENTS"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {close();}
	}
	
	
	public void reviewInsert(ReviewDTO dto) {
		System.out.println( dto.getPurchaseNum());
		System.out.println(dto.getGoodsNum());
		con = getConnection();
		sql = "  merge into reviews r "
			+ "  using ( select purchase_num, goods_num from purchase_list "
			+ "         where purchase_num =? and goods_num = ? ) p "
			+ " on ( r.purchase_num = p.purchase_num and r.goods_num = p.goods_num) "
			+ " WHEN MATCHED THEN "
			+ " 	update set review_contents = ? "
			+ " WHEN NOT MATCHED THEN "
			+ " 	insert (REVIEW_NUM, GOODS_NUM,PURCHASE_NUM,REVIEW_DATE,REVIEW_CONTENTS,MEMBER_ID ) "
			+ "     values (review_seq.nextval, p.goods_num, p.purchase_num, sysdate,?,? )";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getPurchaseNum());
			pstmt.setString(2, dto.getGoodsNum());
			pstmt.setString(3, dto.getReviewContent());
			pstmt.setString(4, dto.getReviewContent());
			pstmt.setString(5, dto.getMemberId());
			int i = pstmt.executeUpdate();
			System.out.println(i + "개가 병합되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {close();}
	}
}
