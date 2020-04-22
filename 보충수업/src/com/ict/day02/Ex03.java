package com.ict.day02;
// 추상클래스
public abstract class Ex03 {
	// 일반멤버필드
	String name  = "둘리";
	int age = 3 ;
	
	// 일반멤버메소드
	public void eat() {
		System.out.println("먹는다.");
	}
	public void sleep() {
		System.out.println("잔다.");
	}
	// 추상 메소드
	public abstract void speak();
}
