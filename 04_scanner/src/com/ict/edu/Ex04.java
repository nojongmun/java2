package com.ict.edu;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자 입력 : ");
			int k = sc.nextInt();
			String str = "";
			if(k%2==0) {
				str = "짝수";
			}else {
				str = "홀수";
			}
			System.out.println(k +"는 "+str+"입니다.");
			System.out.print("계속할까요?(1.yes, 2.no) >> " );
			int k2 = sc.nextInt();
			if(k2==1) {
				continue;
			}else if(k2==2) {
				break;
			}else {
				// 잘못 입력된 정보는 continue나 break 선택해야 된다.
				continue;
			}
		}
		System.out.println("수고 하셨습니다.");
	}
}
