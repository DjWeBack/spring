package com.di;

import java.util.List;

public class InsaList {
	//�ݵ�� null��
	List<String> insaBean = null;
	//setter��ü �����ڵ� - �����
	//��ü�� ���� �� �����ֱ⿡ ���� ������� �����ڿ��Լ�
	//spring container�� �Ѿ�ٴ� ���� �ǹ�
	/*
	 * ���� ���
	 * �ڹ� ����� ���ø����̼��� ������ �� �ڹ� ��ü�� �����ϰ� ���ΰ���
	 * �������踦 �����Ű�� �۾��� ���� ������� ���� ���ߵǴ� ���ø����̼�
	 * �� ����
	 * 
	 * ��������
	 * :������Ʈ���� ���յ��� ���Ƽ� ������Ʈ�� Ȯ�� �� ������ �����.
	 * 
	 * IoC
	 * ������� Container(BeanFactory, ApplicationContext)
	 * ���� �Ѿ ��ü�� ���� �ֱ⸦ Container�� �����ϰ� ��.
	 * ��)Servlet, EJB(�߷������̳�, �ڵ����� �ڵ����[�����߻���])
	 * 
	 * ���
	 * ������Ʈ���� ���յ� ������ ������Ʈ�� ���� �� Ȯ���� ����, 
	 * ������Ʈ�� �������� ������ ����.
	 * 
	 */
	public void setInsaBean(List<String> insaBean) {
		this.insaBean = insaBean;
	}
}
