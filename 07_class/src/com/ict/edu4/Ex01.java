package com.ict.edu4;

public class Ex01 {
	String name = "ȫ�浿";
	int age = 18 ;
	String addr = "��û��";
	
	// ������
	public Ex01() {
		// this : ��ü ���ο��� �ڽ��� ��Ī�Ҷ� ����ϴ� �����
		// this : ��ü ���ο��� ��ü �ڽ��� ����Ű�� �����
		System.out.println("�⺻������ : " + this);
	}
	// 1. �������� name�� �ܺο����� test.name���� ���� ������ 
	//    ���ο����� this.name���� �����Ѵ�.
	// 2. �������� name�� ��ü ������ ���� �����������
	//    �������� name�� �ش�޼ҵ带 ȣ���ؾ߸� �����ȴ�.
	//    �׷��� this.name�̶� �������� name�� ���Ѵ�.
	public void setName(String name) {
		this.name = name;
	}
}
