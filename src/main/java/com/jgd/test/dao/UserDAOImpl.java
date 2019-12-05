package com.jgd.test.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import com.jgd.test.vo.UserVO;

@Repository
public class UserDAOImpl {

	@Resource
	private SqlSessionFactory ssf;

	public List<UserVO> getUserList(UserVO user){
	SqlSession ss =ssf.openSession();
	
		try {
			return ss.selectList("com.jgd.test.dao.UserInfoMapper.selectUserInfoList");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ss.close();
		}
		return null;
	}
}
