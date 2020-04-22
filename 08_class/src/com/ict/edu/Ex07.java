package com.ict.edu;

import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		// ���� �߻��ϴ� ��� : Math.random(), Random Ŭ����
		// 1. Random Ŭ���� : ��ü�� ���� �ؼ� ���
		Random ran = new Random();
		
		// ���� �ڷ����� ���� �߻� : �ڷ��� ���� �ȿ��� ���� �߻�
		System.out.println("boolean�� : " + ran.nextBoolean());
		System.out.println("int �� : " + ran.nextInt());
		System.out.println("long�� : " + ran.nextLong());
		System.out.println("float�� : " + ran.nextFloat()); 
		System.out.println("double�� : " + ran.nextDouble()); // 0.0 ���� ~ 1.0 �̸�
		
		// Ư�� ������ �����ؼ� ���� �߻� �� �� �ִ�.
		// nextInt(int ����) : 0 ~ ���� �� ���� ���� �߻� 
		System.out.println("���� ���� int : " + ran.nextInt(6));  // 0-5 
		System.out.println("�������� int : " + (int)(ran.nextDouble() * 6)); // 0-5
		
	}
}
