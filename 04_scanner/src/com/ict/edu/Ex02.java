package com.ict.edu;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		// 숫자를 입력 받아서  60이상 이면 합격, 아니면 불합격
		int k1 = sc.nextInt();
		String res = "";
		if (k1 >= 60) {
			res = "합격";
		} else {
			res = "불합격";
		}
		
		System.out.println("결과 : " + res);
		
		System.out.print("숫자 입력 : ");
		// 홀수인지 짝수 인지 판별하자
		int k2 = sc.nextInt();
		res = "";
		if (k2%2 == 0) {
			res = "짝수";
		} else {
			res = "홀수";
		}
		System.out.println("결과 : " + res);
		
		System.out.print("나라 입력 : ");
		String k3 = sc.next();
		res = "";
		switch (k3) {
			case "한국": res ="서울"; break;
			case "중국": res ="베이징"; break;
			case "일본": res ="도쿄"; break;
			default: res = "데이터 없음";break;
		}
		System.out.println(k3+"의 수도는 "+ res );
		
		
		
		
		
	}
}
