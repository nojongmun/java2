package com.ict.edu;

public class Ex09 {
	public static void main(String[] args) {
		// break와 continue문
		// break : 현재 반복문(블록)를 탈출할때 사용하는 예약어
		// continue : countinue문 이하 수행문을 포기하고 다음회차로 진행하는 예약어
		// continue를 만나면 for문은 증감식으로 이동, while문인 경우 조건식으로 이동
		// ** if문과 함께 사용 된다.

		// 1-10 까지 출력
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}
		System.out.println("=====================");

		// i가 6일때 break사용하자
		for (int i = 1; i < 11; i++) {
			if (i == 6)  break;
			System.out.println(i);
		}
		System.out.println("=====================");

		// i가 6일때 continue사용하자
		for (int i = 1; i < 11; i++) {
			if (i == 6) continue;
			System.out.println(i);
		}
		System.out.println("=====================");
		
		// i가 6일때 break사용하자
		int i= 1 ;
		while (i<11) {
			if(i==6) break;
			System.out.println(i);
			i++;
		}
		System.out.println("=====================");
		
		// i가 6일때 continue사용하자
		// 무한 루프
		/*
		i = 1 ;
		while (i<11) {
			if(i==6) continue;
			System.out.println(i);
			i++;
		}
		*/
		
		// 0-10까지 짝수 출력
		for (int j = 0; j < 11; j++) {
			// 2로 나눈 나머지가 0이면 짝수
			if(j%2==0) {
				System.out.println(j);
			}
		}
		System.out.println("=====================");
		
		// 0-10까지 짝수 출력
		for (int j = 0; j < 11; j++) {
			// 홀수일때 아래 실행문을 하지 말고 증감식으로 가라
		  if(j%2==1) {
			  continue;
		  }
			System.out.println(j);
		}
		
	}
}
