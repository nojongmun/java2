package com.ict.edu4;

public class Ex07 {
	// static �ʱ�ȭ
	//   static{
	//     ���๮
	//   }
	
	int n1 = 100 ;
	static int n2 = 200;
	
	// static �ʱ�ȭ
	static {
		n2 = 100 ;
		n3 = 200 ;
		n4 = 100 ;
	}
	static int n3 = 100;
	static int n4 ;  // ���� �����ְ� ���߿� ������ �ص� ��
	
	public static void main(String[] args) {
		// System.out.println(n1);
		System.out.println(n2);  // 100 ;
		System.out.println(n3);  // 100 ;
		System.out.println(n4);  // 100 ;
	}
}
