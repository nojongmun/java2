package com.ict.edu;

public class Ex03 {
	public static void main(String[] args) {
		// 객체 생성 전
		// static : 객체 생성 전에 미리 만들어진다.
		//  클래스이름.멤버필드, 클래스이름.멤버메소드
		System.out.println(Ex02.COM);
		System.out.println(Ex02.eng);
		
		// 객체 생성
		// 클래스이름  참조변수 = new 생성자 ;
		
		// Ex02 클래스를 객체로 만들자
		// 현재 Ex02 생성자가 없으므로 기본 생성자를 사용
		// 기본생성자란 클래스이름()
		Ex02 test = new Ex02();
		System.out.println(test);
		// 멤버필드,멤버메소드에 접근 하는 방법 :
		// 참조변수.멤버필드,  참조변수.멤버메소드
		System.out.println(test.name);
		System.out.println(test.kor);
		System.out.println(test.eng);
		System.out.println(test.MATH);
		System.out.println(test.COM);
	}
}
