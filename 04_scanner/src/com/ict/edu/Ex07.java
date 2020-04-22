package com.ict.edu;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		// menu가 1이면 카페모카 3500, 2이면 카페라떼 4000, 3이면 아메리카노 3000,
		// 4이면 과일쥬스 3500이다. 친구와 2잔을 10000내고 먹었다.
		// 잔돈은 얼마인가? (부가세 10% 포함)
		Scanner sc = new Scanner(System.in);
		esc:
		while (true) {
			System.out.print("입금액 : ");
			int input = sc.nextInt();

			System.out.print("메뉴 : 1.카페모카, 2.카페라떼, 3.아메리카노, 4. 과일쥬스  >>  ");
			int menu = sc.nextInt();
			String coff = "";
			int dan = 0 ;
			int su = 2 ;
			int vat = 0 ;
			int total = 0 ;
			int output = 0 ;
			
			switch (menu) {
				case 1: dan = 3500; coff="카페모카"; break;
				case 2: dan = 4000; coff="카페라떼"; break;
				case 3: dan = 3000; coff="아메리카노"; break;
				case 4: dan = 3500; coff="과일쥬스"; break;
			}
			total = dan * su ;
			vat = (int) (total * 0.1)  ;
			output = input - (total+vat);
			System.out.println("음료종류 : "+coff);
			System.out.println("입금액 : "+input);
			System.out.println("음료단가 : "+dan);
			System.out.println("수량 : "+su);
			System.out.println("총금액 : "+(total+vat));
			System.out.println("잔돈 :"+ output);
			
			while (true) {
				System.out.print("계속할까요?(1.yes, 2.no) >> ");
				int res = sc.nextInt();
				if(res == 1) {
					continue esc;
				}else if(res == 2) {
					break esc;
				}else{
					continue; 
				}
			}
		}
		System.out.println("수고하셨습니다.");
	}
}










