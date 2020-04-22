package com.ict.edu4;

public class Ex03 {
	String name = "홍길동";
	int age = 37 ;
	
	// 생성자 오버로딩
	// 기본 생성자
	public Ex03() {
    // this() : 생성자를 뜻하는 예약어
	// 생성자가 다른 생성자를 호출할때 사용
	// 반드시 생성자의 첫번째 줄에서 사용해야된다.
	    this("박지성");
	}
	public Ex03(String name) {
		this(1004);
		this.name = name;
	}
	public Ex03(int age) {
		this.age = age;
	}
	public Ex03(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
}
