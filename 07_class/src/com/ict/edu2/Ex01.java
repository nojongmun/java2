package com.ict.edu2;

public class Ex01 {
	private int su;
	private String name;
	private int price ;
	
	// �޼ҵ带 �̿��ؼ�  ����ʵ��� ������ ����(getter)��, ����(setter)����
	
	// getter()��
	public int getSu(){ 
		return su ;	
	}
	public String getName() {	
		return name;	
	}
	public int getPrice() {		
		return price ;	
	}
	// setter()��
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
