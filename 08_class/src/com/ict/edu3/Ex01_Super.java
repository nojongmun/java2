package com.ict.edu3;

public  class Ex01_Super {
	String name = "������";
	int age = 57 ;
	String addr = "����� ������  ������";
	
	public void hobby() {
		System.out.println("���ǰ���");
	}
	public void play() {
		System.out.println("����");
	}

	// final
	// final ���� : ��� (�������� �ȵ�)
	// final �޼ҵ� : �������̵� �ȵ�(�޼ҵ� ���� ���� ����)
	// final Ŭ���� : ��ӺҰ� (�θ�Ŭ������ �� �����.)
	
	// �ڽ�Ŭ������ �ش� �޼ҵ带 �������� ������ �� ����. 
	// �ڽ�Ŭ������ ����� �� �� �ִ�.
	public final void job() {
		System.out.println("�౸����");
	}
}
