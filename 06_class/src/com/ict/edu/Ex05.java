package com.ict.edu;

public class Ex05 {
	// 멤버필드 : 상태값, 속성
	// - static X = instance ,
	// - static O = static,
	// - final X = 변수
	// - final O = 상수
	String name = "홍길동";       // instance 변수
	int kor = 80;               // instance 변수
	static int eng = 90;        // static 변수
	final int MATH = 100;       // instance 상수
	static final int COM = 100; // static 상수
	
    // 메소드 구성 : [접근제한자][메소드종류] 반환형  메소드이름([인자=매개변수]){ 실행문  }
	// 메소드종류는 기본적으로 instance냐?, static 냐?
	// void 는 반환형이 없다는 뜻
	public void add() {
		kor = kor + 10;     // final X  => 변수
		eng = eng + 10 ;    // final X  => 변수
		// MATH = 90 ;         // final O  => 상수 (값변경이 안됨)
		// COM = COM + 10 ;    // final O  => 상수 (값변경이 안됨)
	}
}
