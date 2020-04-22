package com.ict.edu3;

import java.util.Scanner;

//  throws : 예외전가, 예외 양도
//   - 의미 : 예외가 발생하면 예외처리를 하지 않고, 자신을 호출한 곳으로 예외 객체을 전달하는 것 
//   - 나중에라도 예외 처리(try~catch)를 하는 것이 좋다.


public class Ex04 {
	// 예외 양도, 예외 전가 : 해당 메소드를 호출한 곳으로 예외 객체를 전달.
	public void setData(String msg)throws NumberFormatException {
		/*
		try {
			if(msg.length()>=1) {
				String str = msg.substring(0, 1); // msg의 첫글자만 추출
				prnData(str);
			}
		} catch (Exception e) {
			System.out.println("숫자만 입력하세요");
		}
		*/
		if(msg.length()>=1) {
			String str = msg.substring(0, 1); // msg의 첫글자만 추출
			prnData(str);
		}
	}
	
	// 예외 양도, 예외 전가 : 해당 메소드를 호출한 곳으로 예외 객체를 전달.
	public void prnData(String str) throws NumberFormatException{
		// 예외처리
		/*
		try {
			int dan = Integer.parseInt(str);
			System.out.println(dan + " 단");
			for (int i = 1; i < 10; i++) {
				System.out.println(dan + " * " + i + " = " + (dan*i));
			}
		} catch (Exception e) {
			System.out.println("숫자만 입력하세요");
		}
		*/
		int dan = Integer.parseInt(str);
		System.out.println(dan + " 단");
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + " * " + i + " = " + (dan*i));
		}
	}
	// main 메소드는 JVM이 호출 한 것이므로 
	// throws를 하지 않는 것이 좋다.
	public static void main(String[] args) {
		try {
			Ex04 test = new Ex04();
			Scanner sc = new Scanner(System.in);
			System.out.print("정수입력 : ");
			String msg  = sc.next();
			test.setData(msg);
		} catch (Exception e) {
			System.out.println("첫글자는 무조건 숫자로 입력하세요");
		}
		
		
		System.out.println("수고 하셨습니다.");
	}
}




