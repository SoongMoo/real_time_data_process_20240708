package springBootMVCShopping.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import springBootMVCShopping.domain.OrderListDTO;

@Repository
public class PurchaseRepository {
	@Autowired
	SqlSession sqlSession;
	String namespace = "";
	String statement;
	public List<OrderListDTO> orderList(String memberNum){
		statement = namespace + ".orderList";
		return sqlSession.selectList(statement, memberNum);
	}
}
