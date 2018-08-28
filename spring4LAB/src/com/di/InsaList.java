package com.di;

import java.util.List;

public class InsaList {
	//반드시 null로
	List<String> insaBean = null;
	//setter객체 주입코드 - 제어역전
	//객체의 생성 및 생명주기에 대한 제어권이 개발자에게서
	//spring container로 넘어갔다는 것을 의미
	/*
	 * 기존 방식
	 * 자바 기반의 어플리케이션을 개발할 때 자바 객체를 생성하고 서로간의
	 * 의존관계를 연결시키는 작업에 대한 제어권은 보통 개발되는 어플리케이션
	 * 에 있음
	 * 
	 * 문제제시
	 * :컴포넌트간의 결합도가 높아서 컴포넌트의 확장 및 재사용이 어려움.
	 * 
	 * IoC
	 * 제어권이 Container(BeanFactory, ApplicationContext)
	 * 에게 넘어가 객체의 생명 주기를 Container가 전담하게 됨.
	 * 예)Servlet, EJB(중량컨테이너, 자동으로 코드생산[에러발생땐])
	 * 
	 * 결론
	 * 컴포넌트간의 결합도 낮아져 컴포넌트의 재사용 및 확장이 쉽고, 
	 * 컴포넌트의 의존관계 변경이 쉬움.
	 * 
	 */
	public void setInsaBean(List<String> insaBean) {
		this.insaBean = insaBean;
	}
}
