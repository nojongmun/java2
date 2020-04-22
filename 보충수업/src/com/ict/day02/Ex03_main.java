package com.ict.day02;

public class Ex03_main {
	public static void main(String[] args) {
		// 추상메소드를 구체화 해야 객체로 만들 수 있다.
		Ex03 test = new Ex03() {
			@Override
			public void speak() {
				System.out.println("말한다.");
			}
		};
		
		System.out.println(test.name);
		System.out.println(test.age);
		test.eat();
		test.speak();
	}
}
