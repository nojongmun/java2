package com.ict.edu;

import java.util.Random;

public class Ex04 {
	public static void main(String[] args) {
		//// ���� �߻� /////
		Random ran = new Random() ;
		// �����Ҷ� ���� �������� ���� ������ ���� ������ ���
		int res =  ran.nextInt();
		System.out.println(res);
		System.out.println("=========");
		// �����Ҷ� ���� �������� ���� 0-4 ������ ������ ���
		res =  ran.nextInt(5); //0-4 
		System.out.println(res);
		System.out.println("=========");
		
		// �������� ����  0.0 ~  1.0�̸� �� �Ǽ��� ���
		double k1 =  Math.random();
		System.out.println(k1);
		
		// ������ 0 ������.
		int k2 =  (int)(Math.random());
		System.out.println(k2);
		
		int k3 =  (int)(Math.random()*5);
		System.out.println(k2);
	}
}






