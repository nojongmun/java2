package com.ict.debugging;

import java.util.Scanner;

public class Ex02 {
	public void setData(String msg) throws NumberFormatException {
		if (msg.length() >= 1) {
			String str = msg.substring(0, 1);
			prnData(str);
		}
	}

	public void prnData(String str) throws NumberFormatException {
		int dan = Integer.parseInt(str);
		System.out.println(dan + " ��");
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
	}

	public static void main(String[] args) {
		try {
			Ex02 test = new Ex02();
			Scanner sc = new Scanner(System.in);
			System.out.print("�����Է� : ");
			String msg = sc.next();
			System.out.println(msg);
			test.setData(msg);
			int k = 10 + Integer.parseInt(msg.substring(0, 1));
			int sum = 145 + k ; 
		} catch (Exception e) {
			System.out.println("ù���ڴ� ������ ���ڷ� �Է��ϼ���");
		}

		System.out.println("���� �ϼ̽��ϴ�.");
	}
}
