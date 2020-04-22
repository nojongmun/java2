package com.ict.edu4;

public class Ex06 {
	// int num1 = 10 ; 사용못함
	static int num2 = 20 ; // 사용 가능
	
	public static void main(String[] args) {
		int num1 = 10 ; // 사용함
		System.out.println(num1);
		
	   // static int num2 = 20 ; // 사용 불가능
		
		Ex05 t1 = new Ex05();
		System.out.println(t1.su1);  // 11
		System.out.println(t1.su2);  // 11
		
		Ex05 t2 = new Ex05();
		System.out.println(t2.su1);  // 11
		System.out.println(t2.su2);  // 12
		
		Ex05 t3 = new Ex05();
		System.out.println(t3.su1);  // 11
		System.out.println(t3.su2);  // 13
		
	}
}
