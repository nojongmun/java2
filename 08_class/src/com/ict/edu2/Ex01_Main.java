package com.ict.edu2;

public class Ex01_Main {
	public static void main(String[] args) {
		// ��� ���� : �ڽ�Ŭ������ �θ�Ŭ������ ����ʵ�, ����޼ҵ带 ������� ��� �� �� �ִ� �� 
		//          �ڹٿ����� ���߻�Ӹ� �� �� ����. �� �θ�Ŭ������ �ϳ��� ������ �� �ִ�.
		//          ��� Ŭ������ Object��� Ŭ������ ��ӹް� �ִ�.
		//          ( ����Ŭ������ ��Ӱ��迡 ������ Object Ŭ������ ��� �ް� �ִٴ� ���̴�.)
		
		// �ڽ�Ŭ������ ��ü�� �����.
		// �θ�Ŭ������ �����ڰ� ���� ����ǰ� 
		// �ڽ�Ŭ������ �����ڰ� ���߿� ����ȴ�. 
		Ex01_Sub test = new Ex01_Sub();
		
		System.out.println(test);
		System.out.println(test.name);
		System.out.println(test.age);
		
		// �ڽ�Ŭ�������� ����� �θ�Ŭ�������� �����ü� �ִ�.
		System.out.println(test.addr);
		// ��Ӱ���� private�� ����� �� ����.
		// System.out.println(test.dog);
		
		System.out.println("==============");
		test.play();
	}
}
