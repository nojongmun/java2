package com.ict.edu3;

public class Ex02 {
	public static void main(String[] args) {
		try {
			String year = "1994";
			int age = 2019 - Integer.parseInt(year) + 1 ;
			System.out.println("나이 : " + age);
			System.out.println("-----------------------------");
			
			String year2 = "1994년";
			int age2 = 2019 - Integer.parseInt(year2) + 1 ;
			System.out.println("나이 : " + age2);
		} catch (Exception e) {
			System.out.println("숫자만 넣어 주세요");
		}
		System.out.println("수고 하셨습니다.");
		
	}
}
