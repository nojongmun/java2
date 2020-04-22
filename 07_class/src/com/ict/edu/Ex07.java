package com.ict.edu;

public class Ex07 {
public static void main(String[] args) {
	
	// 객체 만들기 전에 static은 호출 가능
	// 클래스이름.멤버필드( 멤버메소드)
	
	// static이라도 private은 접근 할 수 없다.
	System.out.println(Ex06.GENDER);
	// System.out.println(Ex06.COUNTRY);
	
	// 객체 생성 후  접근
	Ex06 test = new Ex06();
	System.out.println(test.name);
	System.out.println(test.GENDER);
	
	// private 무조건 접근 불가
	// System.out.println(test.age);
	// System.out.println(test.lang);
	// System.out.println(test.COUNTRY);
	
	// 메소들 이용해서 정보 받기 : getter()
	int age = test.getAge();
	System.out.println(age);
	
	System.out.println(Ex06.GENDER);
	System.out.println(test.getGender());
	
	//System.out.println(Ex06.lang);
	System.out.println(test.getLang());
	System.out.println("================");
	System.out.println(test.name);
	System.out.println(test.getAge());
	test.setName("호순이");
	test.setAge(2);
	
	System.out.println(test.name);
	System.out.println(test.getAge());
	
}
}
