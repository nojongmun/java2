package com.ict.edu;

public class Ex02 {
	public static void main(String[] args) {
		// 배열 :같은 자료형의 데이터를 한 곳에 모아둔 묶음
		// 반드시 같은 자료형만 저장 할 수 있다.
		// 생성할때 크기를 지정해야 되고, 지정된 크기는 변경되지 않는다.
		// 배열의 출력은 일반적으로 for문을 사용한다.

		// 배열 생성 순서 : 선언 => 생성 => 데이터 저장
		
		// 선언과 생성을 한번에 
		char[] ch = new char[4];
		
		// 데이터 저장
		ch[0] = 'j';
		ch[1] = 'a';
		ch[2] = 'v';
		ch[3] =  97; // 0-65535 까지 가능;
		
		for (char c : ch) {
			System.out.println(c);
		}
		System.out.println("================");
		
		// 선언과 생성과 데이터 저장 한번에
		String[] str = {"java", "jsp","spring","android"};
		for (String k : str) {
			System.out.println(k);
		}
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
	}
}
