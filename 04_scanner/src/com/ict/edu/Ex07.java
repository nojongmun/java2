package com.ict.edu;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		// menu�� 1�̸� ī���ī 3500, 2�̸� ī��� 4000, 3�̸� �Ƹ޸�ī�� 3000,
		// 4�̸� �����꽺 3500�̴�. ģ���� 2���� 10000���� �Ծ���.
		// �ܵ��� ���ΰ�? (�ΰ��� 10% ����)
		Scanner sc = new Scanner(System.in);
		esc:
		while (true) {
			System.out.print("�Աݾ� : ");
			int input = sc.nextInt();

			System.out.print("�޴� : 1.ī���ī, 2.ī���, 3.�Ƹ޸�ī��, 4. �����꽺  >>  ");
			int menu = sc.nextInt();
			String coff = "";
			int dan = 0 ;
			int su = 2 ;
			int vat = 0 ;
			int total = 0 ;
			int output = 0 ;
			
			switch (menu) {
				case 1: dan = 3500; coff="ī���ī"; break;
				case 2: dan = 4000; coff="ī���"; break;
				case 3: dan = 3000; coff="�Ƹ޸�ī��"; break;
				case 4: dan = 3500; coff="�����꽺"; break;
			}
			total = dan * su ;
			vat = (int) (total * 0.1)  ;
			output = input - (total+vat);
			System.out.println("�������� : "+coff);
			System.out.println("�Աݾ� : "+input);
			System.out.println("����ܰ� : "+dan);
			System.out.println("���� : "+su);
			System.out.println("�ѱݾ� : "+(total+vat));
			System.out.println("�ܵ� :"+ output);
			
			while (true) {
				System.out.print("����ұ��?(1.yes, 2.no) >> ");
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
		System.out.println("�����ϼ̽��ϴ�.");
	}
}










