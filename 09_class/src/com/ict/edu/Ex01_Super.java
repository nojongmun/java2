package com.ict.edu;

public class Ex01_Super {
	String name ="������";
	int age = 45 ;
	String addr = "����� ������ ������";
	
	public Ex01_Super() {
		System.out.println("�θ�Ŭ���� �⺻ ������");
	}
	public Ex01_Super(String name) {
		//  this() : ������ �ڽ��� �ٸ� �����ڸ� ȣ�� �ݵ�� ù °�ٿ��� ���
		this();
		this.name = name;
		System.out.println("�θ�Ŭ���� ������");
	}
}
