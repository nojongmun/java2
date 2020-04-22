package com.ict.edu3;

public abstract class Aniaml {
	int eyes = 2 ;
	int legs = 4 ;
	
	public void like() {
		System.out.println("잠자기");
	}
	
	// 추상 메소드
	public abstract void sound();
}
