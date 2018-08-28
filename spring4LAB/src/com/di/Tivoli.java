package com.di;

public class Tivoli {
	String carColor = "남색";
	int wheelNum = 0;
	String carName = "2018년형 티볼리";
	public Tivoli() {}
	//setter객체 주입법 코드는 자바로 
	//생성자 객체 주입법 코드(xml활용) 연습은 스프링과 다른 오픈소스의 연계시 사용할 수 있다.
	public Tivoli(String carColor, int wheelNum) {
		this.carColor = carColor;
		this.wheelNum = wheelNum;
	}
	@Override
	public String toString() {
		return "그녀의 자동차는 "+carName+" 이고 색상은 "+this.carColor+" 바퀴수는 "+wheelNum+" 입니다.";
	}
}
