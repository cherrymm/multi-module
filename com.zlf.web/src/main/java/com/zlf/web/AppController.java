package com.zlf.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zlf.domain.Member;
import com.zlf.service.AppService;

@Controller
@RequestMapping("/app")
public class AppController {
	@Autowired 
	private static AppService appService;
	
	@RequestMapping("/test")
	public void test(){
		appService.test();
	}
	
	@RequestMapping("/queryMemberById")
	public void queryMemberById(){
		String id = "1";
		Member member = appService.queryMemberById(id);
		System.out.println(member.getName());
	}
}
