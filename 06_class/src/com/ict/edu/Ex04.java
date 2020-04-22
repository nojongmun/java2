package com.ict.edu;

import java.util.Random;

public class Ex04 {
	public static void main(String[] args) {
		//// 난수 발생 /////
		Random ran = new Random() ;
		// 실행할때 마다 정해지지 않은 정수의 범위 정수값 출력
		int res =  ran.nextInt();
		System.out.println(res);
		System.out.println("=========");
		// 실행할때 마다 정해지지 않은 0-4 범위의 정수값 출력
		res =  ran.nextInt(5); //0-4 
		System.out.println(res);
		System.out.println("=========");
		
		// 정해지지 않은  0.0 ~  1.0미만 의 실수값 출력
		double k1 =  Math.random();
		System.out.println(k1);
		
		// 무조건 0 나오다.
		int k2 =  (int)(Math.random());
		System.out.println(k2);
		
		int k3 =  (int)(Math.random()*5);
		System.out.println(k2);
	}
}






