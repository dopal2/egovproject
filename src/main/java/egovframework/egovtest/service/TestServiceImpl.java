package egovframework.egovtest.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.egovtest.dao.TestDAO;
import egovframework.egovtest.vo.UserVO;

@Service("testService")
public class TestServiceImpl implements TestService{
	
	@Resource(name="testDAO")
    private TestDAO testDAO;
	
	public UserVO getUserVO(UserVO userVO) {
		// TODO Auto-generated method stub
		return testDAO.getUserVO(userVO);
	}

}
