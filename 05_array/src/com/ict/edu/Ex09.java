package com.ict.edu;

public class Ex09 {
	public static void main(String[] args) {
		// 다차원 배열 : 1차원 배열이 여러개 모인 것
		// 종류 : 고정길이 배열과 가변 길이 배열
		// 고정길이배열 : 1차원안에 존재하는 배열의 수가 같다.
		// 가변길이배열 : 1차원안에 존재하는 배열의 수가 다르다.
		
		// 다차원 가변길이
		// 1. 선언 : 자료형[][] 이름;
		int[][] su ;
		
		// 2. 생성 : 이름  = new int[1차원배열의 수][] ;
		 su = new int[3][];
		 
		// 선언과 생성을 한번에 
		// int[][] su = new int[3][] ;
		 
		// 3. 데이터 저장 
		//  고정길이배열처러 할 수 없다.
		 /* 오류발생
		 su[0][0] = 1 ;
		 su[0][1] = 2 ;
		 
		 su[1][0] = 10 ;
		 su[1][1] = 20 ;
		 su[1][2] = 30 ;
		 
		 su[2][0] = 100 ;
		 su[2][1] = 200 ;
		 su[2][2] = 300 ;
		 su[2][3] = 400 ;
		 */
		// 1차원배열을 만들어서   배열에 넣기
		 int[] n1 = {1,2};
		 int[] n2 = {10,20, 30};
		 int[] n3 = {100,200,300,400};
		 
		 su[0] = n1;
		 su[1] = n2;
		 su[2] = n3;
		 
		 for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su[i].length; j++) {
				System.out.println(su[i][j]);
			}
		}
		System.out.println("======================"); 
		// 한번에 넣기
		String[][] str = {{"java","C","C#"},{"HTML","CSS"},
				{"안드로이드","IOS","라즈베리파이","윈도우즈"}};
		
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				System.out.println(str[i][j]);
			}
		}	
	}
}









