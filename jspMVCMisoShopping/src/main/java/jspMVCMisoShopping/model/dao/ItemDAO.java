package jspMVCMisoShopping.model.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jspMVCMisoShopping.model.dto.CartDTO;
import jspMVCMisoShopping.model.dto.CartListDTO;
import jspMVCMisoShopping.model.dto.PaymentDTO;
import jspMVCMisoShopping.model.dto.PurchaseDTO;
import jspMVCMisoShopping.model.dto.PurchaseInfoDTO;

public class ItemDAO extends DataBaseInfo{
	public void paymentDelete(String purchaseNum) {
		con = getConnection();
		sql = " delete from payment where purchase_Num = ? ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, purchaseNum);
			int i = pstmt.executeUpdate();
			System.out.println(i + "개가 삭제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {close();}
	}
	public void paymentInsert(PaymentDTO dto) {
		con = getConnection();
		sql = " insert into payment(purchase_Num,confirmNumber,cardNum,TID"
			+ "                ,totalPrice,RESULTMASSAGE,PAYMATHOD,applDate"
			+ "                ,appTime )"
			+ " values(?,?,?,?,?,?,?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getPurchaseNum());
			pstmt.setString(2, dto.getConfirmNumber());
			pstmt.setString(3, dto.getCardNum());
			pstmt.setString(4, dto.getTid());
			pstmt.setString(5, dto.getTotalPrice());
			pstmt.setString(6, dto.getResultMessage());
			pstmt.setString(7, dto.getPayMethod());
			pstmt.setString(8, dto.getApplDate());
			pstmt.setString(9, dto.getApplTime());
			int i = pstmt.executeUpdate();
			System.out.println(i + "개가 삽입되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {close();}
	}
	public PurchaseDTO purchaseSelectOne(String purchaseNum) {
		PurchaseDTO dto = null;
		con = getConnection();
		sql = "  select purchase_price,delivery_name,delivery_Phone, purchase_Name ,member_num "
			+ "  from purchase "
			+ "  where purchase_num = ? ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, purchaseNum);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				dto = new PurchaseDTO();
				dto.setDeliveryName(rs.getString("delivery_name"));
				dto.setPurchasePrice(rs.getLong("purchase_price"));
				dto.setDeliveryPhone(rs.getString("delivery_Phone"));
				dto.setPurchaseName(rs.getString("purchase_Name"));
				dto.setMemberNum(rs.getString("member_num"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {close();}
		
		return dto;
	}
	public List<PurchaseInfoDTO> purchaseItemSelect(String memberNum){
		List<PurchaseInfoDTO> list = new ArrayList<PurchaseInfoDTO>();
		con = getConnection();
		sql = " select g.goods_num , goods_name, GOODS_MAIN_STORE_IMAGE "
			+ "       ,p.purchase_num , purchase_Status , purchase_Price, member_Num"
			+ "       ,CONFIRMNUMBER, APPLDATE"
			+ " from goods g join purchase_list pl"
			+ " on g.goods_num = pl.goods_num join purchase p"
			+ " on pl.purchase_num = p.purchase_num left outer join payment pm"
			+ " on pm.purchase_num = p.purchase_num "
			+ " where member_Num = ? "
			+ " order by p.purchase_num desc ";
		System.out.println(sql);
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, memberNum);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				PurchaseInfoDTO dto = new PurchaseInfoDTO();
				dto.setPurchaseNum(rs.getLong("purchase_num"));
				dto.setPurchaseStatus(rs.getString("purchase_Status"));
				dto.setGoodsImage(rs.getString("GOODS_MAIN_STORE_IMAGE"));
				dto.setGoodsName(rs.getString("goods_name"));
				dto.setGoodsNum(rs.getString("goods_num"));
				dto.setMemberNum(rs.getString("member_num"));
				dto.setConfirmNum(rs.getString("confirmNumber"));
				dto.setApplDate(rs.getString("applDate"));
				list.add(dto);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {close();}
		
		return list;
	}
	public void purchaseListInsert( String purchaseNum,String goodsNum, String memberNum){
		con = getConnection();
		sql = " insert into purchase_list(GOODS_NUM, PURCHASE_NUM, PURCHASE_QTY,GOODS_UNIT_PRICE )"
			+ " select ? ,? , cart_qty, cart_qty * goods_price"
			+ " from cart c  join goods g"
			+ " on c.goods_num = g.goods_num "
			+ " where g.goods_num = ? and member_num = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, goodsNum);
			pstmt.setString(2, purchaseNum);
			pstmt.setString(3, goodsNum);
			pstmt.setString(4, memberNum);
			int i = pstmt.executeUpdate();
			System.out.println(i + "개가 삽입되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {close();}
	}
	public void purchaseInsert(PurchaseDTO dto) {
		con = getConnection();
		sql = " insert into purchase(PURCHASE_NUM, PURCHASE_DATE, PURCHASE_PRICE "
			+ "					,DELIVERY_ADDR, DELIVERY_ADDR_DETAIL, DELIVERY_POST"
			+ "                 ,DELIVERY_PHONE, MESSAGE, PURCHASE_STATUS, MEMBER_NUM"
			+ "                 ,DELIVERY_NAME, PURCHASE_NAME)"
			+ " values(?, sysdate, ?, ?, ?, ?, ?, ?, '결제대기중', ?, ?, ?)  ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getPurchaseNum());
			pstmt.setLong(2, dto.getPurchasePrice());
			pstmt.setString(3, dto.getDeliveryAddr());
			pstmt.setString(4, dto.getDeliveryAddrDetail());
			pstmt.setString(5, dto.getDeliveryPost());
			pstmt.setString(6, dto.getDeliveryPhone());
			pstmt.setString(7, dto.getMessage());
			pstmt.setString(8, dto.getMemberNum());
			pstmt.setString(9, dto.getDeliveryName());
			pstmt.setString(10, dto.getPurchaseName());
			int i = pstmt.executeUpdate();
			System.out.println(i + "개 행이(가) 삽입되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {close();}
	}
	public CartListDTO itemSelectOne(String memberNum , String goodsNum) {
		CartListDTO dto = new CartListDTO();
		con = getConnection();
		sql = " select g.goods_Num, goods_Name, goods_Price, goods_main_store_image "
			+ "       ,MEMBER_NUM, CART_QTY, CART_DATE  "
			+ "       ,goods_Price * CART_QTY as total_price "
			+ " from goods g join cart c "
			+ " on g.goods_num = c.goods_num "
			+ " where MEMBER_NUM = ? and g.goods_num = ? "
			+ " order by g.goods_Num desc ";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, memberNum);
			pstmt.setString(2, goodsNum);
			rs = pstmt.executeQuery();
			rs.next();
			dto.setCartDate(rs.getDate("CART_DATE"));
			dto.setCartQty(rs.getInt("CART_QTY"));
			dto.setGoodsName(rs.getString("goods_name"));
			dto.setGoodsNum(rs.getString("GOODS_NUM"));
			dto.setMemberNum(rs.getString("MEMBER_NUM"));
			dto.setTotalPrice(rs.getInt("total_price"));
			dto.setGoodsImage(rs.getString("goods_main_store_image"));
			dto.setGoodsPrice(rs.getInt("goods_price"));
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {close();}		
		return dto;
	}
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
