package com.zlf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zlf.dao.AppDao;
import com.zlf.domain.Member;
@Service
public class AppServiceImpl implements AppService{
	
	@Autowired
	private AppDao appDao;
	  
	public void test(){
		appDao.test();
	}

	public Member queryMemberById(String id) {
		return appDao.queryMemberById(id);
	}
  
}
