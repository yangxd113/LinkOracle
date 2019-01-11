package com.my.test.LinkOracle;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class testController {
	@Autowired
	private testService test;
	
	@RequestMapping("/index")
	public List login(){	
		Table0 t=new Table0();
		List l1=new ArrayList();
		l1= test.getList();
		System.out.println(l1.size());
		for (int i=0;i<l1.size();i++)
		{
			t=(Table0)l1.get(i);
			System.out.println("t.getHaoma():"+t.getHaoma());
		}
		return test.getList();
	}
	
	@RequestMapping("/index2")
	public List login2(){			
		return test.getCount();
	}
}
