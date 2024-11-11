package springBootMVCShopping.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import springBootMVCShopping.domain.DeliveryDTO;

@Repository
public class DeliveryRepository {
	@Autowired
	SqlSession sqlSession;
	String namespace = "deliveryRepositorySql";
	String statement;
	public Integer deliveryInsert(DeliveryDTO dto) {
		statement = namespace + ".deliveryInsert";
		return sqlSession.insert(statement, dto);
	}
	public Integer deliveryStatusUpdate(String purchaseNum) {
		statement = namespace + ".deliveryStatusUpdate";
		return sqlSession.update(statement, purchaseNum);
	}
	public Integer deliveryDelete(String purchaseNum) {
		statement = namespace + ".deliveryDelete";
		return sqlSession.delete(statement, purchaseNum);
	}
}



