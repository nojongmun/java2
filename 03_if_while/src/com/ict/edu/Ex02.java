package com.ict.edu;

public class Ex02 {
	public static void main(String[] args) {
		// if ~ else ~ : 조건식 참일때와 거짓일때 각각 나눠서 처리한다.
		// if(조건식){
		//   조건식일 참일때 실행할 문장;
		//   조건식일 참일때 실행할 문장;
		// }else{
		//   조건식일 거짓일때 실행할 문장;
		//   조건식일 거짓일때 실행할 문장;
		// }

		// int k1이 60이상 이면 합격, 아니면 불합격
		int k1 = 50;
		String str = "";
		if (k1 >= 60) {
			str = "합격";
		}else {
			str = "불합격";
		}
		System.out.println("결과 : " + str);

		// int k2가 홀수인지 짝수 인지 판별하자
		int k2 = 142;
		str = "";
		if (k2 % 2 == 0) {
			str = "짝수";
		}else {
			str = "홀수";
		}
		System.out.println("결과 : " + str);

		// char k3가 대문자인지, 대문자가 아닌지 판별하자
		char k3 = 'T';
		str = "";
		if (k3 >= 'A' && k3 <= 'Z') {
			str = "대문자";
		}else {
			str = "대문자 아님";
		}
		System.out.println("결과 : " + str);

		// int k4가 1 또는 3 이면 남자, 아니면 여자 인지 판별하자
		int k4 = 2;
		str = "여자";
		if (k4 == 1 || k4 == 3) {
			str = "남자";
		}else {
			str = "여자";
		}
		System.out.println("결과 : " + str);

		// 두수 중 큰값을 출력하시오
		int k5 = 10 ;
		int k6 = 15 ;
		int max = 0 ;
		if (k5 > k6) {
			max = k5;
		} else {
			max = k6;
		}
		System.out.println("결과 : " + max);
		
	}
}





