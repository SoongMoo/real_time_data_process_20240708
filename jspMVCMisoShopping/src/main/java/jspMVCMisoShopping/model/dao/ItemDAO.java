package jspMVCMisoShopping.model.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jspMVCMisoShopping.model.dto.CartDTO;
import jspMVCMisoShopping.model.dto.CartListDTO;

public class ItemDAO extends DataBaseInfo{
	public void itemDelete(String goodsNum, String memberNum) {
		con = getConnection();
		sql = " delete from cart where goods_num = ? and member_num = ? ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, goodsNum);
			pstmt.setString(2, memberNum);
			int i = pstmt.executeUpdate();
			System.out.println(i + "삭제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {close();}
	}
	
	
	public void itemQtyDownUpdate(String goodsNum, String memberNum) {
		con = getConnection();
		sql = " update cart "
			+ " set CART_QTY = CART_QTY - 1 "
			+ " where MEMBER_NUM = ? and goods_num = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, memberNum);
			pstmt.setString(2, goodsNum);
			int i = pstmt.executeUpdate();
			System.out.println(i + "개가 수정되었습니다.");	
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {close();}
	}
	
	public List<CartListDTO> cartSelectList(String memberNum) {
		List<CartListDTO> list = new ArrayList<CartListDTO>();
		con = getConnection();
		sql = " select g.goods_Num, goods_Name, goods_Price, goods_main_store_image "
			+ "       ,MEMBER_NUM, CART_QTY, CART_DATE  "
			+ "       ,goods_Price * CART_QTY as total_price "
			+ " from goods g join cart c "
			+ " on g.goods_num = c.goods_num "
			+ " where MEMBER_NUM = ? "
			+ " order by g.goods_Num desc ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, memberNum);
			rs = pstmt.executeQuery();
			while(rs.next()){
				CartListDTO dto = new CartListDTO();
				dto.setCartDate(rs.getDate("CART_DATE"));
				dto.setCartQty(rs.getInt("CART_QTY"));
				dto.setGoodsName(rs.getString("goods_name"));
				dto.setGoodsNum(rs.getString("GOODS_NUM"));
				dto.setMemberNum(rs.getString("MEMBER_NUM"));
				dto.setTotalPrice(rs.getInt("total_price"));
				dto.setGoodsImage(rs.getString("goods_main_store_image"));
				dto.setGoodsPrice(rs.getInt("goods_price"));
				list.add(dto);
			}
		} catch (SQLException e) { e.printStackTrace();
		}finally {close();}
		return list;
	}
	public void cartMerge(CartDTO dto) {
		con = getConnection();
		sql = " merge into cart c "
			+ " using (select goods_num from goods where goods_num = ?) g "
			+ " on (c.goods_num = g.goods_num and MEMBER_NUM = ?)"
			+ " WHEN MATCHED THEN "
			+ "      update set CART_QTY = CART_QTY + ? "
			+ " WHEN NOT MATCHED THEN "
			+ " insert (MEMBER_NUM,GOODS_NUM,CART_DATE, CART_QTY)"
			+ " values (?, ?, sysdate, ?)  ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getGoodsNum());
			pstmt.setString(2, dto.getMemberNum());
			pstmt.setInt(3, dto.getCartQty());
			pstmt.setString(4, dto.getMemberNum());
			pstmt.setString(5, dto.getGoodsNum());
			pstmt.setInt(6, dto.getCartQty());
			int i = pstmt.executeUpdate();
			System.out.println(i + "개가 병합되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {close();}
	}
	
	
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
