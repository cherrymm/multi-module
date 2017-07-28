package com.zlf.dao;

import org.springframework.stereotype.Repository;

import com.zlf.BaseDao;
import com.zlf.domain.Member;

@Repository
public class AppDaoImpl extends BaseDao implements AppDao{
	/** namespace */
    private final String namespace = AppDaoImpl.class.getName();
    
	public void test(){
		System.out.println("zhang");
	}

	public Member queryMemberById(String id) {
		return getSqlSession().selectOne(namespace +".queryMemberById", id);
	}
	
}
