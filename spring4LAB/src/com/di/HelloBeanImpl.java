package com.di;
//������, ��ü����, ������ ����...
//��ü���Թ�
//1)������ ��ü ���Թ�, 2)setter��ü ���Թ�
//���̺����� �ǽ����� �ʴ� ����
//������Ʈ ���� �پ��� ���¼ҽ��� ����ϰ� ��.
public class HelloBeanImpl implements HelloBean {
	//��ü ���� �ޱ� - ��𿡼� xml���� �޾ƺ���. - helloBean.xml
	/*<property name="msg">*/
	String msg = null;
	//setter��ü ���Թ� �ڵ� - ����������Ŭ ����(���� spring container[����-c���-���� h/w���� -> c++]- spring-core.jar)
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String getGreeting(String msg2) {
		return msg+ "spring!!!";
	}

}
