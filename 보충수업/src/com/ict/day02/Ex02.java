package com.ict.day02;

// 사람이라는 객체를 만들기 위한 클래스 
public class Ex02 {
	// 정보 : 멤버필드
	String name ="홍길동" ;
	int age = 47 ;
	boolean gender = true ;
	
	// 생성자 
	public Ex02() {
	    name = "둘리";
	    age = 2457;
	}
	// 하는일 : 기능, 동작
	public void eat() {
		System.out.println("먹는다.");
	}
	public void sleep() {
		System.out.println("잔다.");
	}
	// 오버로딩 
	public void speek() {
		System.out.println("말한다.");
	}
	public void speek(int su) {
		System.out.println();
	}
	public void speek(int su, String str) {
		System.out.println();
	}
	public void speek(String str,int su) {
		System.out.println();
	}
}






