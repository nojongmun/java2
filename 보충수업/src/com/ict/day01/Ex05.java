package com.ict.day01;

public class Ex05 {
	public static void main(String[] args) {
		// 다차원배열 ; 1차원 배열 여러개를 하나의 묶어서 배열로 만든 것
		//  선언 , 생성, 저장'
		
		// 고정길이만 가능
		// 선언 : 자료형[][] 이름 ;
		int[][] su ;
		int[][] num;
		
		// 생성 : 이름 = new 자료형[1차원배열의 개수][1차원배열의 각각의 개수] => 고정길이
		// 생성 : 이름 = new 자료형[1차원배열의 개수][]  => 가변길이
		su = new int[4][2] ;
		num = new int[4][] ; // 각각의 수가 일정하지 않음
		
		su[0][0] = 10 ;
		su[0][1] = 10 ;
		
		su[1][0] = 10 ;
		su[1][1] = 10 ;
		
		su[2][0] = 10 ;
		su[2][1] = 10 ;
		
		su[3][0] = 10 ;
		su[3][1] = 10 ;
		
		/* 실해할때 오류발생
		num[0][0] = 100 ;
		
		num[1][0] = 100 ;
		num[1][1] = 100 ;
		
		num[2][0] = 100 ;
		
		num[3][0] = 100 ;
		num[3][1] = 100 ;
		num[3][2] = 100 ;
		*/
		// 가변길이은 반드시 아래방법처럼 넣어야 한다.(고정길이도 사용가능)
		int[] k1 = {100};
		int[] k2 = {1000,2000};
		int[] k3 = {10000};
		int[] k4 = {1000,2000,3000,4000};
		num[0] = k1;
		num[1] = k2;
		num[2] = k3;
		num[3] = k4;
		
		
		// 2차원배열 출력하기
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.println(num[i][j]);
			}
		}
		System.out.println();
		
		// 선언과 생성한번에 => 고정길이만 가능
		int[][] su2 = new int [4][2];
		
		// 저장
		su2[0][0] = 10 ;
		su2[0][1] = 10 ;
		su2[1][0] = 10 ;
		su2[1][1] = 10 ;
		su2[2][0] = 10 ;
		su2[2][1] = 10 ;
		su2[3][0] = 10 ;
		su2[3][1] = 10 ;
		
		// 출력
		for (int i = 0; i < su2.length; i++) {
			for (int j = 0; j < su2[i].length; j++) {
				System.out.println(su2[i][j]);
			}
		}
		System.out.println();
		
		// 선언,생성,저장을 한번에 : 고정길이, 가변길이 가능
		// String[][] str1 = new String[3][2] 같다
		String[][] str1 = {{"a","b"},{"c","d"},{"e","f"}};
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str1[i].length; j++) {
				System.out.println(str1[i][j]);
			}
		}
		System.out.println();
		
		// String[][] str1 = new String[3][] 같다
		String[][] str2 = {{"a"},{"b","c","d"},{"e","f"}};
		for (int i = 0; i < str2.length; i++) {
			for (int j = 0; j < str2[i].length; j++) {
				System.out.println(str2[i][j]);
			}
		}
		
	}
}
