package com.ict.edu;

public class Ex01_Sub extends Ex01_Super{
	String name = "차두리";
	int age = 23 ;
	String car = "그랜져";
	public Ex01_Sub() {
		// this() : 생성자 자신이 다른 생성자를 호출 반드시 첫째줄에서 사용
		this("희동이");
		System.out.println("자식클래스 기본 생성자");
	}
	public Ex01_Sub(String name) {
		// super() : 부모클래스의 생성자를 호출 반드시 첫째줄에서 사용 
		super("고길동");
		this.name = name;
	}
	
	public void play() {
		// 지역, 전역, 부모 변수이름이 모두 같을때 
		// 반드시 구분해서 사용 (this => 전역,super => 부모)
		String name = "둘리";
		System.out.println(name);       // 둘리
		System.out.println(this.name);  // 희동이
		System.out.println(super.name); // 고길동
		
		// 전역, 부모 변수이름이 같을 때
		System.out.println(age);       // 23 
		System.out.println(this.age);  // 23 
		System.out.println(super.age); // 45 
		
		// 자식만 변수를 가지고 있을때 
		System.out.println(car);      
		System.out.println(this.car);  
		// System.out.println(super.car); 
		
		// 부모만 변수를 가지고 있을때 
		System.out.println(addr);       //서울시 마포구 서교동
		System.out.println(this.addr);  //서울시 마포구 서교동
		System.out.println(super.addr); //서울시 마포구 서교동 		
	}
	
}
