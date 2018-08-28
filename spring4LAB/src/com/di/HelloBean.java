package com.di;
/*
 * 스프링 사용 목적
 * 하나.클래스 간에 결합도를 낮춰주는 코딩을 전개할 수 있다.
 * 결합도를 낮춰주는 코드는 인터페이스나 추상클래스 중심으로 코딩을 전개할 때
 * 누릴 수 있다.
 * 문제:초보 개발자와 숙련자 사이에 갭이 있다.
 * 스프링 프레임웤를 이용하면 그 갭을 줄일 수 있다.
 * 일관성있는 구조를 가져가고 싶다.
 */
public interface HelloBean {
	public String getGreeting(String msg);
}
