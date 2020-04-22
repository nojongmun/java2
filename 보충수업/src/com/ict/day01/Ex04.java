package com.ict.day01;

public class Ex04 {
	public static void main(String[] args) {
		// 변수 : 하나의 데이터를 저장하는 기억공간
		//       다른 데이터를 저장할 수 있다. (이전 것은 지워진다.)
		// 배열 : 같은 자료형 여러개를 묶어서 기억하는 기억공간
		// 클래스 : 여러가지 자료형을 여러개를 하나의 객체로 만들어서 기억할 수 있다.
		
		// 배열 순서 : 선언 => 생성 => 저장 ,   저장된 정보 출력
		// 선언 :  자료형[] 이름 ;
		// 생성 :  이름 = new 자료형[갯수=크기];
		// 저장 :  이름[위치=index=방번호=0부터시작] = 데이터
		
		// 선언
		String[] str ;
		// 생성
		str = new String[4];
		// 저장
		str[0] = "java";
		str[1] = "jsp";
		str[2] = "spring";
		str[3] = "android" ;
		
		// 배열의 출력은 무조건 for문
		for (String k : str) {
			System.out.println(k);
		}
		System.out.println();
		
		// 선언과 생성을 한번에 
	    String[] str2 = new String[4];
	    // 저장
	    str2[0] = "java";
		str2[1] = "jsp";
		str2[2] = "spring";
		str2[3] = "android" ;
		for (int i = 0; i < str2.length; i++) {
			System.out.println(str2[i]);
		}
		System.out.println();
		
		// 선언, 생성, 저장을 한번에
		String[] str3 = {"java","jsp","spring","android"};
		for (String k : str3) {
			System.out.println(k);
		}
		
		
		
		
		
		
		
	}
}
