package springBootMVCShopping.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import springBootMVCShopping.domain.ReviewDTO;

@Repository
public class ReviewRepository {
	@Autowired
	SqlSession sqlSession;
	String namespace="reviewMapperSql";
	String statement;
	public String reviewSelectOne(ReviewDTO dto) {
		statement = namespace + ".reviewSelectOne";
		return sqlSession.selectOne(statement, dto);
	}
	public int reviewInsert(ReviewDTO dto) {
		statement = namespace + ".reviewInsert";
		return sqlSession.update(statement, dto);
	}
	
	
	
	
	
}
