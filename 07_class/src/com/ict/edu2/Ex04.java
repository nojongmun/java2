package com.ict.edu2;

public class Ex04 {
	// �����ε� :  �ϳ��� Ŭ���� �ȿ� ���� �̸��� ���� �޼ҵ尡 ������ �����ϴ� ��
	//          ��, �޼ҵ��� �̸��� ������ ������ �ڷ����̳� ����,������ �ٸ���.
	
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
		System.out.println("�Է°� : "+ n);
		System.out.println("�Է°��� ���� : "+ n.length());
	}
}
