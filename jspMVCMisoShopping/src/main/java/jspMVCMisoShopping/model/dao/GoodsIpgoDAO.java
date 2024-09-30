package jspMVCMisoShopping.model.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jspMVCMisoShopping.model.dto.GoodsIpgoDTO;

public class GoodsIpgoDAO extends DataBaseInfo{
	public void goodsIpgoInsert(GoodsIpgoDTO dto) {
		con = getConnection();
		sql = " insert into goodsipgo(ipgo_num, goods_num, ipgo_qty"
				+ "                  ,made_date,ipgo_price,ipgo_date,emp_num)"
				+ " values(?,?,?,?,?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getGoodsIpgoNum());
			pstmt.setString(2, dto.getGoodsNum());
			pstmt.setInt(3, dto.getIpgoQty());
			pstmt.setTimestamp(4, dto.getMadeDate());
			pstmt.setInt(5, dto.getIpgoPrice());
			pstmt.setDate(6, new java.sql.Date(dto.getIpgoDate().getTime()));
			pstmt.setString(7, dto.getEmpNum());
			int i = pstmt.executeUpdate(); 
			System.out.println(i + "개행이(가) 삽입되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}
	public List<GoodsIpgoDTO> selectAll() {
		List<GoodsIpgoDTO> list = new ArrayList<GoodsIpgoDTO>();
		con = getConnection();
		sql = "select ipgo_num, goods_num, ipgo_qty, made_date"
				+ "   ,ipgo_price, ipgo_date, emp_num"
			+ " from goodsIpgo"
			+ " order by ipgo_num desc, goods_num";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				GoodsIpgoDTO dto = new GoodsIpgoDTO();
				dto.setGoodsIpgoNum(rs.getString("ipgo_num"));
				dto.setGoodsNum(rs.getString(2)); //select절에 있는 컬럼의 순서번호나 컬럼명 사용
				dto.setIpgoQty(rs.getInt(3));     // 컬럼 번호는 앞에서 1부터 1씩 증가하는 값을 갖는다
				dto.setMadeDate(rs.getTimestamp(4));
				dto.setIpgoPrice(rs.getInt(5));
				dto.setIpgoDate(rs.getDate(6));
				dto.setEmpNum(rs.getString(7));
				list.add(dto); //list에 저장
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return list;
	}
	public GoodsIpgoDTO selectIpgoGoods(String ipgoNum , String goodsNum) {
		GoodsIpgoDTO dto = new GoodsIpgoDTO();
		con = getConnection();
		sql = " select ipgo_num, i.goods_num, ipgo_qty, made_date"
			+ "		  ,ipgo_price, ipgo_date, i.emp_num " //입고정보
			+ "       , goods_name "
			+ " from goodsIpgo i join goods g "
			+ " on i.goods_num = g.goods_num "
			+ " where i.ipgo_num = ? and g.goods_num = ? ";//상품정보
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, ipgoNum);
			pstmt.setString(2, goodsNum);
			rs = pstmt.executeQuery();
			rs.next();
			dto.setEmpNum(rs.getString("emp_num"));
			dto.setGoodsIpgoNum(rs.getString("ipgo_num"));
			dto.setGoodsName(rs.getString("goods_name"));
			dto.setGoodsNum(rs.getString("goods_num"));
			dto.setIpgoDate(rs.getDate("ipgo_date"));
			dto.setIpgoPrice(rs.getInt("ipgo_price"));
			dto.setIpgoQty(rs.getInt("ipgo_qty"));
			dto.setMadeDate(rs.getTimestamp("made_date"));
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return dto;
	}
	public void goodsIpgoDelete(String ipgoNum, String goodsNum) {
		con = getConnection();
		sql = " delete from goodsIpgo "
				+ " where ipgo_num = ? and goods_num = ?";
		try {
			pstmt =con.prepareStatement(sql);
			pstmt.setString(1, ipgoNum);
			pstmt.setString(2, goodsNum);
			int i = pstmt.executeUpdate();
			System.out.println(i + "개행이(가) 삭제되었습니다.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
	}
	public void ipgoGoodsUpdate(GoodsIpgoDTO dto) {
		con = getConnection();
		sql = " update goodsIpgo "
				+ " set ipgo_Date = ?, ipgo_Qty =? "
				+ "    , made_Date = ? , ipgo_Price = ?"
				+ " where ipgo_Num = ? "
				+ "   and goods_Num = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setDate(1, new java.sql.Date(dto.getIpgoDate().getTime()));
			pstmt.setInt(2, dto.getIpgoQty());
			pstmt.setTimestamp(3, dto.getMadeDate());
			pstmt.setInt(4, dto.getIpgoPrice());
			pstmt.setString(5, dto.getGoodsIpgoNum());
			//////////////////			
			pstmt.setString(6, dto.getGoodsNum());
			int i = pstmt.executeUpdate();
			System.out.println(i + "개 행이(가) 수정되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
	}
	
	
	
	
	
	
	
	
	
	
}
