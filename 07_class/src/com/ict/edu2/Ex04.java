package com.ict.edu2;

public class Ex04 {
	// 오버로딩 :  하나의 클래스 안에 같은 이름을 가진 메소드가 여러개 존재하는 것
	//          단, 메소드의 이름은 같으나 인자의 자료형이나 갯수,순서가 다르다.
	
	public void getLength(boolean n) {
		String  str = String.valueOf(n);
		getLength(str);
	}
	public void getLength(char n) {
		String  str = String.valueOf(n);
		getLength(str);
	}
	public void getLength(int n) {
		String  str = String.valueOf(n);
		getLength(str);
	}
	public void getLength(double n) {
		String  str = String.valueOf(n);
		getLength(str);
	}
	public void getLength(String n) {
		System.out.println("입력값 : "+ n);
		System.out.println("입력값의 길이 : "+ n.length());
	}
}
