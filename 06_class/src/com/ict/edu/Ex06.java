package com.ict.edu;

public class Ex06 {
	
	// ��� �޼ҵ� : ���, ����
	// �޼ҵ� ���� : [����������][�޼ҵ�����] ��ȯ��  �޼ҵ��̸�([����=�Ű�����]){ ���๮  }
	
	// �޼ҵ�  ����  : - void O, =>  return ; ����(�⺻), ������� ������ ���� ����
	//               �ڷ���     =>  �ݵ�� return �����(�ڷ���), ������� ������ ��
	//            - static X, => ��ü ���� �ؾ߸� ��� ����
	//            - static O  => ��ü ���� ���� ��� ����
	public void add() {
		System.out.println("add-1");
		System.out.println("add �޼ҵ�");
		System.out.println("add-2");
		// return ;
	}
	public static void sub() {
		System.out.println("sub-1");
		System.out.println("sub �޼ҵ�");
		System.out.println("sub-2");
		// return;
	}
	
	public int mul1() { return 0;	}
	public double mul2() {	return 0.0;	}
	public double mul3() { 	return 0;	}
	
	public static String div() {
		return "���ѹα�";
		
	}
}
