package com.ict.edu;

public class Ex01_Sub extends Ex01_Super{
	String name = "���θ�";
	int age = 23 ;
	String car = "�׷���";
	public Ex01_Sub() {
		// this() : ������ �ڽ��� �ٸ� �����ڸ� ȣ�� �ݵ�� ù°�ٿ��� ���
		this("����");
		System.out.println("�ڽ�Ŭ���� �⺻ ������");
	}
	public Ex01_Sub(String name) {
		// super() : �θ�Ŭ������ �����ڸ� ȣ�� �ݵ�� ù°�ٿ��� ��� 
		super("��浿");
		this.name = name;
	}
	
	public void play() {
		// ����, ����, �θ� �����̸��� ��� ������ 
		// �ݵ�� �����ؼ� ��� (this => ����,super => �θ�)
		String name = "�Ѹ�";
		System.out.println(name);       // �Ѹ�
		System.out.println(this.name);  // ����
		System.out.println(super.name); // ��浿
		
		// ����, �θ� �����̸��� ���� ��
		System.out.println(age);       // 23 
		System.out.println(this.age);  // 23 
		System.out.println(super.age); // 45 
		
		// �ڽĸ� ������ ������ ������ 
		System.out.println(car);      
		System.out.println(this.car);  
		// System.out.println(super.car); 
		
		// �θ� ������ ������ ������ 
		System.out.println(addr);       //����� ������ ������
		System.out.println(this.addr);  //����� ������ ������
		System.out.println(super.addr); //����� ������ ������ 		
	}
	
}
