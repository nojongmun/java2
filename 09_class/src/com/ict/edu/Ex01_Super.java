package com.ict.edu;

public class Ex01_Super {
	String name ="차범근";
	int age = 45 ;
	String addr = "서울시 마포구 서교동";
	
	public Ex01_Super() {
		System.out.println("부모클래스 기본 생성자");
	}
	public Ex01_Super(String name) {
		//  this() : 생성자 자신이 다른 생성자를 호출 반드시 첫 째줄에서 사용
		this();
		this.name = name;
		System.out.println("부모클래스 생성자");
	}
}
