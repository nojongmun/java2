package com.ict.edu;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� 1 : ");
		int su1 = scan.nextInt();
		
		System.out.print("���� 2 : ");
		int su2 = scan.nextInt();
		
		System.out.print("������(+,-,*,/) :  ");
		String op = scan.next();
		
		Ex09 test = new Ex09() ;
		int res = 0 ;
		
		switch (op) {
			case "+": res = test.add(su1, su2);  
			          System.out.println(su1 + op + su2 + " = " + res); break;
			case "-": test.sub(su1, su2); break;
			case "*": res = test.mul(su1, su2); 
			          System.out.println(su1 + op + su2 + " = " + res); break;
			case "/": test.div(su1, su2);break;
			default:
			   System.out.println("����� �� �����ϴ�.");break;
		}
		
	}
}
