package com.ict.edu3;

import com.ict.edu3.Ex01_Super;

public class Ex01_Sub extends Ex01_Super{
	String name = "���θ�";
	int age = 35 ;
	
	public void home() {
		System.out.println(addr);
	}
	
	// ��Ӱ��迡�� �θ�޼ҵ带 �״�� �����ͼ� ������ �����ؼ� ��� �ϴ� ��
	// �������̵� : �θ�Ŭ������ �޼ҵ带 �����Ѵ�.
	
	@Override
	public void hobby() {
		System.out.println("��ȭ����");
	}
	// ��Ӱ��迡�� �θ�޼ҵ带 �״�� �����ͼ� ������ �����ؼ� ��� �ȵǴ� ��
	// �θ�Ŭ������ �޼ҵ带 ������ �� �� ����. (����� ����)
	
}
