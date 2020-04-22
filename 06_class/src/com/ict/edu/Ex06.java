package com.ict.edu;

public class Ex06 {
	
	// 멤버 메소드 : 기능, 동작
	// 메소드 구성 : [접근제한자][메소드종류] 반환형  메소드이름([인자=매개변수]){ 실행문  }
	
	// 메소드  유형  : - void O, =>  return ; 생략(기본), 결과값을 가지고 가지 않음
	//               자료형     =>  반드시 return 결과값(자료형), 결과값을 가지고 감
	//            - static X, => 객체 생성 해야만 사용 가능
	//            - static O  => 객체 생성 없이 사용 가능
	public void add() {
		System.out.println("add-1");
		System.out.println("add 메소드");
		System.out.println("add-2");
		// return ;
	}
	public static void sub() {
		System.out.println("sub-1");
		System.out.println("sub 메소드");
		System.out.println("sub-2");
		// return;
	}
	
	public int mul1() { return 0;	}
	public double mul2() {	return 0.0;	}
	public double mul3() { 	return 0;	}
	
	public static String div() {
		return "대한민국";
		
	}
}
