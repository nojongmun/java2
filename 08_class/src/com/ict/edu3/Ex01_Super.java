package com.ict.edu3;

public  class Ex01_Super {
	String name = "차범근";
	int age = 57 ;
	String addr = "서울시 마포구  서교동";
	
	public void hobby() {
		System.out.println("음악감상");
	}
	public void play() {
		System.out.println("골프");
	}

	// final
	// final 변수 : 상수 (값변경이 안됨)
	// final 메소드 : 오버라이드 안됨(메소드 내용 변경 못함)
	// final 클래스 : 상속불가 (부모클래스를 못 만든다.)
	
	// 자식클래스가 해당 메소드를 가져가서 변경할 수 없다. 
	// 자식클래스가 사용할 수 는 있다.
	public final void job() {
		System.out.println("축구선수");
	}
}
