package com.di;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InsaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//insaBean -> List<String>
		ApplicationContext context = new ClassPathXmlApplicationContext("com\\di\\insaBean.xml");
		InsaList insaList = (InsaList)context.getBean("insaList");
		List<String> insa = insaList.insaBean;
		for(String msg:insa) {
			System.out.println(msg);
		}
	}

}
