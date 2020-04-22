package com.ict.edu4;

import java.io.Serializable;

// 객체의 정보를 담을수 잇는 멤버들로 구성 되어야 한다.
// Serialirzable 인터페이스를 사용하여 직렬화를 만든다.(추삼 클라스인데 추삼 메소드가 없다.)
// 모든 멤버변수들이 직렬화 대상이 된다.
// 제외 대상인 멤버의 아에는 tranisent 예약어를 사용한다.
// 	 - 제외대상은 모두 기본값을 가진.(int=0, double=0.0, boolean = false)
public class VO implements Serializable{
	private String name;
	private int age ;
	transient private double weight ;
	transient private boolean gender ;
	
	public VO() {}
	public VO(String name, int age, double weight, boolean gender) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.gender = gender;
	}
	
	

}
