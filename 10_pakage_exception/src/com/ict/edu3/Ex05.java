package com.ict.edu3;

import java.util.InputMismatchException;
import java.util.Scanner;

// finally : 예외처리와 상관없이 반드시 실행 해야 되는 문장을 처리 할때 사용
//           데이터베이스, I/O, 네트워크에서 사용한다.
// 형식 : 
//  try{
//      예외 발생 가능한 문장들 ;
//  } catch(예외객체 e){
//      예외 객체 처리 문장;
//  } catch(예외객체 e){
//      예외 객체 처리 문장;'
//  } finally{
//     예외 처리와 상관없이 반드시 실행해야 하는 문장;
//  }

public class Ex05 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			int var = 50 ;
			System.out.print("정수입력 : ");
			int su = sc.nextInt();
			System.out.println("정답 : " + (var / su));
		} catch (InputMismatchException e) {
			System.out.println("정수만 입력해  주세요");
			return ;
		} catch (ArithmeticException e) {
			System.out.println("0으로는 나눌 수가 없습니다.");
			return;
		} finally {
			System.out.println("반드시 수행하는 문장");
		}
		System.out.println("수고 하셨습니다.");
	}
}
