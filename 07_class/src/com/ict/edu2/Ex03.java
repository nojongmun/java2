package com.ict.edu2;

public class Ex03 {
	private int su;
	private String name;
	private int price ;
	private boolean order; 
	
	// getter/setter �����
	// �޴� - Source - getter and setter ����
	public int getSu() {	return su;	}
	public void setSu(int su) {
		this.su = su;
	}
	
	public String getName() {	return name;	}
	public void setName(String name) {
		// ���������� ���������� �̸� ������ ���������� ������
		// name = name;
		// ���������� ���������� �̸� ���� �� 
		// ���� ���� �տ��� �ݵ�� this�� ���δ�.
		this.name = name;
	}
	
	public int getPrice() { return price;	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// boolean���� get ��� is�� ����Ѵ�.
	public boolean isOrder() {	return order;	}
	public void setOrder(boolean order) {
		this.order = order;
	}
	
	
}
