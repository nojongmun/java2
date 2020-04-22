package com.ict.edu;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        esc:
		while (true) {
			System.out.print("숫자 입력 : ");
			int k = sc.nextInt();
			String str = "";
			if (k % 2 == 0) {
				str = "짝수";
			} else {
				str = "홀수";
			}
			System.out.println(k + "는 " + str + "입니다.");
			while (true) {
				System.out.print("계속할까요?(1.yes, 2.no) >> ");
				int k2 = sc.nextInt();
				if (k2 == 1) {
					continue esc;
				} else if (k2 == 2) {
					break esc;
				} else {
					continue;
				}
			} // 안 while
		} // 밖 while
		System.out.println("수고 하셨습니다.");
	}
}
