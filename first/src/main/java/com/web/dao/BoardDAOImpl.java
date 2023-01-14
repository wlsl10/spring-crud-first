package com.web.dao;

import java.util.List;
import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAOImpl implements BoardDAO {
	
	@Inject
	private SqlSession sqlSession;
	
	private static String namespace = "com.web.mappers.board";

	@Override
	public List list() throws Exception {
		return sqlSession.selectList(namespace + ".list");
	}

}
