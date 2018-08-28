package com.di;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class HelloMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com\\di\\helloBean.xml");
		Resource resource = 
				new FileSystemResource("E:\\dev_spring201804\\spring4LAB\\src\\com\\di\\helloBean.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		HelloBean helloBean  = (HelloBean)context.getBean("helloBean");
		HelloBean helloBean2  = (HelloBean)factory.getBean("helloBean");
		//String insa = helloBean.getGreeting("�ȳ�");
		String insa = helloBean.getGreeting("�ȳ�");
		System.out.println(insa);
		String insa2 = helloBean.getGreeting("ó���غ��� ");
		System.out.println(insa2);
		HelloBean helloBean3 = new HelloBeanImpl();
		System.out.println(helloBean3.getGreeting("���� �ҽ� F/W"));
		Tivoli gnom = new Tivoli("��ũ",6);
		System.out.println(gnom.toString());
		//                             <bean id="herCar" class="com.di.Tivoli">
		Tivoli myCar = (Tivoli)context.getBean("myCar");
		System.out.println(myCar.toString());
	}

}
