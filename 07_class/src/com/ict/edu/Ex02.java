package com.ict.edu;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// �̸�, ����, ����, ���� ������ �޾Ƽ�  => Ex02
		// ����, ���, ����, ������ ���ϰ� ���� �� ����Ͻÿ� => Ex03
		Scanner sc = new Scanner(System.in);
		Ex03 test = new Ex03();
		
		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		
		for (int i = 0; i < name.length; i++) {
			System.out.print("�̸� : ");
		    name[i] = sc.next();	
			System.out.print("���� : ");
			kor[i] = sc.nextInt();
			System.out.print("���� : ");
			eng[i] = sc.nextInt();
			System.out.print("���� : ");
			math[i] = sc.nextInt();
		}
		test.sum(name, kor, eng, math);
	}
}
