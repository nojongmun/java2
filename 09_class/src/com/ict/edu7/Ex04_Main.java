package com.ict.edu7;

public class Ex04_Main {
	public static void main(String[] args) {
		// Local 내부클래스 단독의 객체 생성 안됨
		// In_Ex04 test = new In_Ex04();
		
		// Member 내부클래스 처럼 생성 안됨
		// Ex04.InEx04 test1 = new Ex04().new In_Ex04() ;
		
		// Local 외부클래스 메소드안에 존재하므로 
		// 외부클래스 메소드를 실행해야 생성 조건이 된다.
		Ex04 test = new Ex04();
		test.play();
		System.out.println("수고하셧습니다.");
	}
}
