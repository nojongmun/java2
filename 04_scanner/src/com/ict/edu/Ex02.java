package com.ict.edu;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� : ");
		// ���ڸ� �Է� �޾Ƽ�  60�̻� �̸� �հ�, �ƴϸ� ���հ�
		int k1 = sc.nextInt();
		String res = "";
		if (k1 >= 60) {
			res = "�հ�";
		} else {
			res = "���հ�";
		}
		
		System.out.println("��� : " + res);
		
		System.out.print("���� �Է� : ");
		// Ȧ������ ¦�� ���� �Ǻ�����
		int k2 = sc.nextInt();
		res = "";
		if (k2%2 == 0) {
			res = "¦��";
		} else {
			res = "Ȧ��";
		}
		System.out.println("��� : " + res);
		
		System.out.print("���� �Է� : ");
		String k3 = sc.next();
		res = "";
		switch (k3) {
			case "�ѱ�": res ="����"; break;
			case "�߱�": res ="����¡"; break;
			case "�Ϻ�": res ="����"; break;
			default: res = "������ ����";break;
		}
		System.out.println(k3+"�� ������ "+ res );
		
		
		
		
		
	}
}
