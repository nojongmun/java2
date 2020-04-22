package com.ict.edu4;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// 1. 높음 2. 낮음
		// 컴퓨터는 1~13의 숫자를 가질 수 있다.
		// 1~6까지는 낮음, 7은 비김, 8~13까지는 높음
	    Scanner sc = new Scanner(System.in); 
	    int a_count = 0 ;
	    int v_count = 0 ;
	    String res = "";
		esc:
		while (true) {
			a_count ++;
			// 컴퓨터 숫자 지정
			int com = (int)(Math.random()*13)+1 ;
			
			// 사용자 숫자
			System.out.print("1.높음  2.낮음  중 하나를 선택하세요 : ");
			int user = sc.nextInt();
			if(user == 1) {
				if(com >=1 && com<=6) {
					res = "짐" ;
				}else if(com>=8  && com<=13){
					v_count ++ ;
					res = "이김";
				}else if(com == 7) {
					res = "비김";
				}
			}else if(user == 2){
				if(com >=1 && com<=6) {
					v_count ++ ;
					res = "이김";
				}else if(com>=8  && com<=13){
					res = "짐";
				}else if(com == 7) {
					res = "비김";
				}
			}
			System.out.println("com : " + com);
			System.out.println("결과 : " + res);
			while(true) {
				System.out.print("계속할까요?(y/n)");
				String msg = sc.next();
				if(msg.equalsIgnoreCase("y")) {
					continue esc ;
				}else if(msg.equalsIgnoreCase("n")) {
					break esc ;
				}else {
					continue;
				}
			}
		}
	   System.out.println("수고하셨습니다.");
	   System.out.println("전체 판의 수 : " + a_count);
	   System.out.println("이긴 판의 수 : " + v_count);
	   System.out.println("승률 : " +((int)((v_count/(a_count*1.0)*100)*10)/10.0) +"%");
	    
	}
}
