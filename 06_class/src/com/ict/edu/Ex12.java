package com.ict.edu;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		// �̸�, ���� ,����, ���и� �޾Ƽ� 
		// �հ�, ���, ������ ���ϰ� 
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.print("���� : ");
		int kor = sc.nextInt();
		System.out.print("���� : ");
		int eng = sc.nextInt();
		System.out.print("���� : ");
		int math = sc.nextInt();
		 
		Ex11_1 test = new Ex11_1();
		int sum = test.sum(kor, eng, math);
		double avg = test.avg(sum);
		String hak = test.hak(avg);
		
		// ����ϱ�
		System.out.println("================");
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
		System.out.println("���� : " + hak);
		System.out.println("================");
		
		Ex11_2 test2 = new Ex11_2();
		test2.sum(kor, eng, math);
		test2.avg();
		test2.hak();
		test2.prn(name);
		
		Ex11_3 test3 = new Ex11_3();
		test3.sum(kor, eng, math);
		test3.prn(name);
		
	}
}
