package com.ict.edu;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("���� �Է� : ");
			int k = sc.nextInt();
			String str = "";
			if(k%2==0) {
				str = "¦��";
			}else {
				str = "Ȧ��";
			}
			System.out.println(k +"�� "+str+"�Դϴ�.");
			System.out.print("����ұ��?(1.yes, 2.no) >> " );
			int k2 = sc.nextInt();
			if(k2==1) {
				continue;
			}else if(k2==2) {
				break;
			}else {
				// �߸� �Էµ� ������ continue�� break �����ؾ� �ȴ�.
				continue;
			}
		}
		System.out.println("���� �ϼ̽��ϴ�.");
	}
}
