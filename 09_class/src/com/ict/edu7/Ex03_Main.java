package com.ict.edu7;

import com.ict.edu7.Ex03.In_Ex04;

public class Ex03_Main {
	public static void main(String[] args) {
		// 1. Member ���� Ŭ���� 
		//  ���� Ŭ������ ȥ�ڼ� ������ ��ü ���� �� �� ����.
		// In_Ex03 test1 = new In_Ex03();
		
		// ����Ŭ������ �ݵ�� �ܺ�Ŭ������ ���ؼ� ��ü ���� ����
		Ex03 test = new Ex03();
		Ex03.In_Ex03 in_test1 = test.new In_Ex03();
		System.out.println("=======================");
		
		Ex03.In_Ex03 in_test2 = new Ex03().new In_Ex03();
		System.out.println("=======================");
		
		in_test1.prn();
		System.out.println("=======================");
		
		// 3. static ���� Ŭ����
		// static ������  �׳� �ҷ��� ��� ����
		System.out.println(In_Ex04.a3);
		System.out.println(In_Ex04.a4);
		In_Ex04.go2();
		
		// **static ����Ŭ������ �ܵ����� ��ü ���� �� �� �ִ�.
		In_Ex04 test3 = new In_Ex04();
		System.out.println(test3.a1);
		System.out.println(test3.a2);
		System.out.println(test3.a3);
		System.out.println(test3.a4);
		
	}
}
