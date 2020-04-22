package com.ict.edu3;

// 추상클래스를 상속받았으므로 부모클래스의 추상메소드를 오버라이딩 해야 한다.
public class Dog extends Aniaml{
	String name = "댕댕이";
	int age = 4 ;
	
	public void play() {
		System.out.println("산책하기");
	}

	@Override
	public void sound() {
		System.out.println("멍~멍~");
	}
	
}
