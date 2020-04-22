package com.ict.edu2;

public class Ex01_Main {
	public static void main(String[] args) {
		// 상속 관계 : 자식클래스가 부모클래스의 멤버필드, 멤버메소드를 마음대로 사용 할 수 있는 것 
		//          자바에서는 다중상속를 할 수 없다. 즉 부모클래스가 하나만 존재할 수 있다.
		//          모든 클래스는 Object라는 클래스를 상속받고 있다.
		//          ( 현재클래스가 상속관계에 없으면 Object 클래스를 상속 받고 있다는 뜻이다.)
		
		// 자식클래스를 객체로 만든다.
		// 부모클래스의 생성자가 먼저 실행되고 
		// 자식클래스의 생성자가 나중에 실행된다. 
		Ex01_Sub test = new Ex01_Sub();
		
		System.out.println(test);
		System.out.println(test.name);
		System.out.println(test.age);
		
		// 자식클래스없는 멤버는 부모클래스에서 가져올수 있다.
		System.out.println(test.addr);
		// 상속관계라도 private은 사용할 수 없다.
		// System.out.println(test.dog);
		
		System.out.println("==============");
		test.play();
	}
}
