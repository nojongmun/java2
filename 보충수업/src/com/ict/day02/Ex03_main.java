package com.ict.day02;

public class Ex03_main {
	public static void main(String[] args) {
		// �߻�޼ҵ带 ��üȭ �ؾ� ��ü�� ���� �� �ִ�.
		Ex03 test = new Ex03() {
			@Override
			public void speak() {
				System.out.println("���Ѵ�.");
			}
		};
		
		System.out.println(test.name);
		System.out.println(test.age);
		test.eat();
		test.speak();
	}
}
