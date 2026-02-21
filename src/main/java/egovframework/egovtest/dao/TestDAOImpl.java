package egovframework.egovtest.dao;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import egovframework.egovtest.vo.UserVO;

@Repository("testDAO")
public class TestDAOImpl implements TestDAO {
    
    @Resource(name="egov.sqlSessionTemplate") 
    private SqlSessionTemplate sqlSession;

    @Override
    public UserVO getUserVO(UserVO userVO) {
        return sqlSession.selectOne("testDAO.getUserVO", userVO);
    }
}