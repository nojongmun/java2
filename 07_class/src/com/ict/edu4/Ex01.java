package com.ict.edu4;

public class Ex01 {
	String name = "홍길동";
	int age = 18 ;
	String addr = "충청도";
	
	// 생성자
	public Ex01() {
		// this : 객체 내부에서 자신을 지칭할때 사용하는 예약어
		// this : 객체 내부에서 객체 자신을 가리키는 예약어
		System.out.println("기본생성자 : " + this);
	}
	// 1. 전역변수 name은 외부에서는 test.name으로 접근 하지만 
	//    내부에서는 this.name으로 접근한다.
	// 2. 전역변수 name은 객체 생성시 같이 만들어지지만
	//    지역변수 name은 해당메소드를 호출해야만 생성된다.
	//    그래서 this.name이란 전역변수 name을 뜻한다.
	public void setName(String name) {
		this.name = name;
	}
}
