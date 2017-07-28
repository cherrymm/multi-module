package com.zlf.dao;

import com.zlf.domain.Member;

public interface AppDao {
	public void test();
	
	public Member queryMemberById(String id);
}
