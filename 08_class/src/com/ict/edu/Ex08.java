package com.ict.edu;

public class Ex08 {
	public static void main(String[] args) {
		// 난수 발생하는 방법 : Math.random(), Random 클래스
		// 2. Math 클래스 : static ( Math.메소드() 호출)
		
		// 1. random()
		System.out.println(Math.random()); // 0.0이상 - 1.0미만
		System.out.println((int)(Math.random())*6); // 0-5까지
		
		// 2. abs : 절대값 추출
		System.out.println(Math.abs(100));  // 100
		System.out.println(Math.abs(-100)); // 100 
		
		// 3. ceil(double x) : 올림, floor(double x) ; 버림, round(double x) : 반올림
		System.out.println(Math.ceil(3.45));   // 4.0
		System.out.println(Math.ceil(3.55));   // 4.0
		System.out.println(Math.floor(3.45));  // 3.0
		System.out.println(Math.floor(3.55));  // 3.0
		System.out.println(Math.round(3.45));  // 3
		System.out.println(Math.round(3.55));  // 4
		
		// 4. max(자료형 a, 자료형 b) : 두 인자 중 더 큰 값
		// 5. min(자료형 a, 자료형 b) : 두 인자 중 더 큰 작은값
		System.out.println(Math.max(54, 45));  // 54
		System.out.println(Math.max(45, 54));  // 54
		System.out.println(Math.min(54, 45));  // 45
		System.out.println(Math.min(45, 54));  // 45
		
		// 6. pow(double a, double b) : 제곱승
		System.out.println(Math.pow(2, 3)); // 2의 3승 = > 8.0
		System.out.println(Math.pow(3, 3)); // 3의 3승 => 27.0
	}
}
