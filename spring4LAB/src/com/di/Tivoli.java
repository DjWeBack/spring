package com.di;

public class Tivoli {
	String carColor = "����";
	int wheelNum = 0;
	String carName = "2018���� Ƽ����";
	public Tivoli() {}
	//setter��ü ���Թ� �ڵ�� �ڹٷ� 
	//������ ��ü ���Թ� �ڵ�(xmlȰ��) ������ �������� �ٸ� ���¼ҽ��� ����� ����� �� �ִ�.
	public Tivoli(String carColor, int wheelNum) {
		this.carColor = carColor;
		this.wheelNum = wheelNum;
	}
	@Override
	public String toString() {
		return "�׳��� �ڵ����� "+carName+" �̰� ������ "+this.carColor+" �������� "+wheelNum+" �Դϴ�.";
	}
}
