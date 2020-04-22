package com.ict.edu7;

import com.ict.edu7.Ex03.In_Ex04;

public class Ex03_Main {
	public static void main(String[] args) {
		// 1. Member 내부 클래스 
		//  내부 클래스를 혼자서 별도로 객체 생성 할 수 없다.
		// In_Ex03 test1 = new In_Ex03();
		
		// 내부클래스는 반드시 외부클래스를 통해서 객체 생성 하자
		Ex03 test = new Ex03();
		Ex03.In_Ex03 in_test1 = test.new In_Ex03();
		System.out.println("=======================");
		
		Ex03.In_Ex03 in_test2 = new Ex03().new In_Ex03();
		System.out.println("=======================");
		
		in_test1.prn();
		System.out.println("=======================");
		
		// 3. static 내부 클래스
		// static 있으면  그냥 불러서 사용 가능
		System.out.println(In_Ex04.a3);
		System.out.println(In_Ex04.a4);
		In_Ex04.go2();
		
		// **static 내부클래스는 단독으로 객체 생성 할 수 있다.
		In_Ex04 test3 = new In_Ex04();
		System.out.println(test3.a1);
		System.out.println(test3.a2);
		System.out.println(test3.a3);
		System.out.println(test3.a4);
		
	}
}
