package jspMVCMisoShopping.model.dao;

import java.sql.SQLException;

public class ItemDAO extends DataBaseInfo{
	public int wishSelectOne(String memberNum,String goodsNum){
		con = getConnection();
		sql = " select 'a' from wish where member_num = ? and goods_num = ? ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, memberNum);
			pstmt.setString(2, goodsNum);
			rs = pstmt.executeQuery(); 
			if(rs.next()) {
				return 1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {close();}
		return 0;
	}
	public void wishItem(String memberNum,String goodsNum) {
		con = getConnection();
		sql = " merge  into wish w  "
			+ " using ( select goods_num from goods where goods_num = ? ) g "
			+ " on ( w.goods_num = g.goods_num and  member_num = ? )"
			+ " When MATCHED THEN "
			+ " 	update set WISH_DATE = sysdate "
			+ "     delete where member_num = ? and goods_num = ? "
			+ " When not MATCHED THEN "
			+ " 	insert (MEMBER_NUM, GOODS_NUM , WISH_DATE ) "
			+ "     values( ?, g.goods_num , sysdate) ";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, goodsNum);
			pstmt.setString(2, memberNum);
			pstmt.setString(3, memberNum);
			pstmt.setString(4, goodsNum);
			pstmt.setString(5, memberNum);
			int i = pstmt.executeUpdate();
			System.out.println(i + "개가 병합되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {close();}
		
	}
}
