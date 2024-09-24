package jspMVCMisoShopping.model.dao;

import java.sql.SQLException;

public class GoodsDAO extends DataBaseInfo{
	public String goodsAutoNum() {
		String goodsNum = null;
		con = getConnection();
		sql = " select concat('goods_', nvl(max(substr(goods_num, 7)), 100000) + 1) from goods ";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			rs.next();
			goodsNum = rs.getString(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {close();}
		return goodsNum;
	}
}
