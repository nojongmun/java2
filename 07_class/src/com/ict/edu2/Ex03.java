package com.ict.edu2;

public class Ex03 {
	private int su;
	private String name;
	private int price ;
	private boolean order; 
	
	// getter/setter 만들기
	// 메뉴 - Source - getter and setter 선택
	public int getSu() {	return su;	}
	public void setSu(int su) {
		this.su = su;
	}
	
	public String getName() {	return name;	}
	public void setName(String name) {
		// 전역변수와 지역변수의 이름 같으면 지역변수가 먼저다
		// name = name;
		// 전역변수와 지역변수의 이름 같을 때 
		// 전역 변수 앞에는 반드시 this를 붙인다.
		this.name = name;
	}
	
	public int getPrice() { return price;	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// boolean형은 get 대신 is를 사용한다.
	public boolean isOrder() {	return order;	}
	public void setOrder(boolean order) {
		this.order = order;
	}
	
	
}
