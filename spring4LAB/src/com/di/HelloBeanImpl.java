package com.di;
//역제어, 객체주입, 의존성 주입...
//객체주입법
//1)생성자 객체 주입법, 2)setter객체 주입법
//메이븐으로 실습하지 않는 이유
//프로젝트 마다 다양한 오픈소스를 사용하게 됨.
public class HelloBeanImpl implements HelloBean {
	//객체 주입 받기 - 어디에서 xml에서 받아보자. - helloBean.xml
	/*<property name="msg">*/
	String msg = null;
	//setter객체 주입법 코드 - 라이프사이클 관리(누가 spring container[엔진-c언어-직접 h/w접근 -> c++]- spring-core.jar)
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String getGreeting(String msg2) {
		return msg+ "spring!!!";
	}

}
