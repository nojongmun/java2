package com.ict.edu3;

public class Ex02 {
	public static void main(String[] args) {
		try {
			String year = "1994";
			int age = 2019 - Integer.parseInt(year) + 1 ;
			System.out.println("���� : " + age);
			System.out.println("-----------------------------");
			
			String year2 = "1994��";
			int age2 = 2019 - Integer.parseInt(year2) + 1 ;
			System.out.println("���� : " + age2);
		} catch (Exception e) {
			System.out.println("���ڸ� �־� �ּ���");
		}
		System.out.println("���� �ϼ̽��ϴ�.");
		
	}
}
