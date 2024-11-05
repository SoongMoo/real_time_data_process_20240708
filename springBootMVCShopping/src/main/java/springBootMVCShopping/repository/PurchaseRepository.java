package springBootMVCShopping.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import springBootMVCShopping.domain.OrderListDTO;
import springBootMVCShopping.domain.PurchaseDTO;

@Repository
public class PurchaseRepository {
	@Autowired
	SqlSession sqlSession;
	String namespace = "purchaseRepositorySql";
	String statement;
	
	public String selectPurchaseNum() {
		statement = namespace + ".selectPurchaseNum";
		return sqlSession.selectOne(statement);
	}
	public int purchaseInsert(PurchaseDTO dto) {
		statement = namespace + ".purchaseInsert";
		return sqlSession.insert(statement, dto);
	}
	public int purchaseListInsert(Map<String, Object> map) {
		statement = namespace + ".purchaseListInsert";
		return sqlSession.insert(statement, map);
	}
	
	
	
	
	
	
	public List<OrderListDTO> orderList(String memberNum){
		statement = namespace + ".orderList";
		return sqlSession.selectList(statement, memberNum);
	}
}
