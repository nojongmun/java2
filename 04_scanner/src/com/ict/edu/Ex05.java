package com.ict.edu;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        esc:
		while (true) {
			System.out.print("���� �Է� : ");
			int k = sc.nextInt();
			String str = "";
			if (k % 2 == 0) {
				str = "¦��";
			} else {
				str = "Ȧ��";
			}
			System.out.println(k + "�� " + str + "�Դϴ�.");
			while (true) {
				System.out.print("����ұ��?(1.yes, 2.no) >> ");
				int k2 = sc.nextInt();
				if (k2 == 1) {
					continue esc;
				} else if (k2 == 2) {
					break esc;
				} else {
					continue;
				}
			} // �� while
		} // �� while
		System.out.println("���� �ϼ̽��ϴ�.");
	}
}
