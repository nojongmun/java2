package com.ict.edu;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// �̸�, ����, ����, ���������� �޾Ƽ�  ����, ���, ������ ������
		Scanner sc = new Scanner(System.in);
		
		esc:
		while (true) {
			System.out.print("����� �̸� : ");
			String name = sc.next();
			System.out.print("�������� : ");
			int kor = sc.nextInt();
			System.out.print("�������� : ");
			int eng = sc.nextInt();
			System.out.print("�������� : ");
			int math = sc.nextInt();
			
			int sum = kor + eng + math ;
			double avg = (int)(sum/3.0*10)/10.0 ;
			String hak = "";
			if (avg>=90) {
				hak ="A����";
			}else if (avg>=80) {
				hak ="B����";
			}else if (avg>=70) {
				hak ="C����";
			}else {
				hak ="F����";
			}
			
			System.out.println("�̸� : " + name);
			System.out.println("���� : " + sum);
			System.out.println("��� : " + avg);
			System.out.println("���� : " + hak);
			
			while (true) {
				System.out.print("����ұ��(1.yes, 2.no) >> ");
				int res = sc.nextInt();
				if (res == 1) {
					continue esc;
				} else if(res == 2){
					break esc;
				} else {
					continue ;
				}
			}
		}
		System.out.println("�����ϼ̽��ϴ�.");
		
	}
}