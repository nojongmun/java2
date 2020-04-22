package com.ict.edu2;

public class Ex01 {
	private int su;
	private String name;
	private int price ;
	
	// 메소드를 이용해서  멤버필드의 정보를 보내(getter)고, 변경(setter)가능
	
	// getter()들
	public int getSu(){ 
		return su ;	
	}
	public String getName() {	
		return name;	
	}
	public int getPrice() {		
		return price ;	
	}
	// setter()들
	public void setSu(int k) {
		su = k ;
	}
	public void setName(String k) {
		name = k ;
	}
	public void setPrice(int k) {
		price = k ;
	}
}
