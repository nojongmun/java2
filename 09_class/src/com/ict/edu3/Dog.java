package com.ict.edu3;

// �߻�Ŭ������ ��ӹ޾����Ƿ� �θ�Ŭ������ �߻�޼ҵ带 �������̵� �ؾ� �Ѵ�.
public class Dog extends Aniaml{
	String name = "�����";
	int age = 4 ;
	
	public void play() {
		System.out.println("��å�ϱ�");
	}

	@Override
	public void sound() {
		System.out.println("��~��~");
	}
	
}
