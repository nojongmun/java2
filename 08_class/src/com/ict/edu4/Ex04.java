package com.ict.edu4;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// 1.����, 2.����, 3.��
		Scanner sc = new Scanner(System.in);
		int a_count = 0;
		int v_count = 0;
		String res = "";
		esc: while (true) {
			a_count++;
			// ��ǻ�� ���� ����
			int com = (int) (Math.random() * 3) + 1;

			// ����� ����
			System.out.print("1.����  2.����  3.��  �� �ϳ��� �����ϼ��� : ");
			int user = sc.nextInt();
			if (user == 1) {
				if (com == 1) {
					res = "���";
				} else if (com == 2) {
					res = "��";
				} else if (com == 3) {
					res = "�̱�";
					v_count++;
				}
			} else if (user == 2) {
				if (com == 1) {
					res = "�̱�";
					v_count++;
				} else if (com == 2) {
					res = "���";
				} else if (com == 3) {
					res = "��";
				}
			}else if (user == 3) {
				if (com == 1) {
					res = "��";
				} else if (com == 2) {
					res = "�̱�";
					v_count++;
				} else if (com == 3) {
					res = "���";
				}
			}
			System.out.println("com : " + com + "user : " + user);
			System.out.println("��� : " + res);
			while (true) {
				System.out.print("����ұ��?(y/n)");
				String msg = sc.next();
				if (msg.equalsIgnoreCase("y")) {
					continue esc;
				} else if (msg.equalsIgnoreCase("n")) {
					break esc;
				} else {
					continue;
				}
			}
		}
		System.out.println("�����ϼ̽��ϴ�.");
		System.out.println("��ü ���� �� : " + a_count);
		System.out.println("�̱� ���� �� : " + v_count);
		System.out.println("�·� : " + ((int) ((v_count / (a_count * 1.0) * 100) * 10) / 10.0) + "%");

	}
}
