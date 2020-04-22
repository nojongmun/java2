package com.ict.edu3;

import com.ict.edu3.Ex01_Super;

public class Ex01_Sub extends Ex01_Super{
	String name = "차두리";
	int age = 35 ;
	
	public void home() {
		System.out.println(addr);
	}
	
	// 상속관계에서 부모메소드를 그대로 가져와서 내용을 변경해서 사용 하는 것
	// 오버라이딩 : 부모클래스의 메소드를 은폐한다.
	
	@Override
	public void hobby() {
		System.out.println("영화감상");
	}
	// 상속관계에서 부모메소드를 그대로 가져와서 내용을 변경해서 사용 안되는 것
	// 부모클래스이 메소드를 가져올 수 도 없다. (사용은 가능)
	
}
