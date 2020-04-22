package com.ict.edu;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		// 이름, 국어 ,영어, 수학를 받아서 
		// 합계, 평균, 학점을 구하고 
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		 
		Ex11_1 test = new Ex11_1();
		int sum = test.sum(kor, eng, math);
		double avg = test.avg(sum);
		String hak = test.hak(avg);
		
		// 출력하기
		System.out.println("================");
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("학점 : " + hak);
		System.out.println("================");
		
		Ex11_2 test2 = new Ex11_2();
		test2.sum(kor, eng, math);
		test2.avg();
		test2.hak();
		test2.prn(name);
		
		Ex11_3 test3 = new Ex11_3();
		test3.sum(kor, eng, math);
		test3.prn(name);
		
	}
}
