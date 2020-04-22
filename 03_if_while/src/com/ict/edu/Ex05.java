package com.ict.edu;

public class Ex05 {
	public static void main(String[] args) {
        // for문 : 정해진 규칙에 따라 실행문장을 반복 처리하는 문
		// for(초기식 ; 조건식 ; 증감식){
		//    조건식이 참일때 실행할 문장;
		//    조건식이 참일때 실행할 문장;
		//  }
		
		// for문을 만나면 무조건 초기식 부터,  조건식으로 이동
		// 조건식 => boolean, 논리연산, 비교연산
		// 조건식이 참일때만 for문 실행, 거짓이면 for문을 빠져나온다.
		// for문의 끝을 만나면 무조건 증감식으로 가라
		// 증감식은 조건식으로 가라
		
		//**for에서 만든 변수는 for 밖에서는 사용할 수 없다.
		
		// 안녕하세요 10번 출력하기
		for (int i = 1; i < 11; i++) {
			System.out.println(i+" : 안녕하세요");
		}
		
		//**for에서 만든 변수는 for 밖에서는 사용할 수 없다.
		// System.out.println(i);
		
		int k1 ;
		for ( k1 =1 ; k1 < 11; k1++) {
			System.out.println(k1+" : 안녕하세요");
		}
		System.out.println(k1);
		
		// 0-10 까지 출력하기
		for (int i = 0; i < 11; i++) {
			System.out.println(i);
		}
		// 0-10까지 짝수만 출력하기
		for (int i = 0; i < 11; i=i+2) {
			System.out.println(i);
		}
		for (int i = 0; i < 11; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		//0-10까지 홀수만 출력하기
		for (int i = 0; i < 11; i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
		//0-50까지 7의 배수를 출력하기
		for (int i = 0; i < 51; i++) {
			if(i%7==0) {
				System.out.println(i);
			}
		}
		// a-g까지 출력
		for (char i = 'a'; i < 'h'; i++) {
			System.out.println(i);
		}
		// 5단출력
		for (int i = 1; i < 10; i++) {
			System.out.println("5 * "+ i + " = " + (5*i));
		}
		
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		for (int i = 1; i < 5 ; i++) {
			System.out.println("0 0 0 0");
		}
		
		for (int i = 1; i < 17; i++) {
			System.out.print("0 ");
			// 한줄 일때는 {  } 를 생략해도 된다.
			if(i%4==0) System.out.println();
			
		}
		
		// 0-10까지 누적합 구하기
		int sum = 0 ; // 이전 누적을 기억시키는 변수
		for (int i = 0; i < 11; i++) {
			sum = sum + i ;
		}
		System.out.println("결과 : " + sum);
		
		// 7!(7 * 6 * 5 * 4 * 3 * 2 * 1 );
		sum = 1 ;
		for (int i = 7; i > 0; i--) {
			sum = sum * i ;
		}
		System.out.println("결과 : "+ sum);
		
		// 0-10까지의 홀수와 짝수의 합을 구하자
		int odd = 0 ;  // 홀수의 합
		int even = 0 ; // 짝수의 합
		for (int i = 0; i < 11; i++) {
			if(i%2==0) {
				even = even + i ;
			}else {
				odd = odd + i ;
			}
		}
		System.out.println("홀수의 합 : " + odd);
		System.out.println("짝수의 합 : " + even);
		
	}
}








