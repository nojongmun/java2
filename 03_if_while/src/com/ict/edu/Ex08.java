package com.ict.edu;

public class Ex08 {
	public static void main(String[] args) {
		// do ~ while문 : while문과 같은 반복문
		// 초기식 ;
		//  do{
		//     실행문;
		//     증감식;
		//   }while(조건식);
		
		// 1-10까지 출력
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i<11);
		
				
		// 5단 출력
		i = 1 ;
		do {
			System.out.println("5 * "+ i +" = " + (5*i));
			i++;
		} while (i<10);
		
	}
}







