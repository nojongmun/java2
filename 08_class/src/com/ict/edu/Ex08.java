package com.ict.edu;

public class Ex08 {
	public static void main(String[] args) {
		// ���� �߻��ϴ� ��� : Math.random(), Random Ŭ����
		// 2. Math Ŭ���� : static ( Math.�޼ҵ�() ȣ��)
		
		// 1. random()
		System.out.println(Math.random()); // 0.0�̻� - 1.0�̸�
		System.out.println((int)(Math.random())*6); // 0-5����
		
		// 2. abs : ���밪 ����
		System.out.println(Math.abs(100));  // 100
		System.out.println(Math.abs(-100)); // 100 
		
		// 3. ceil(double x) : �ø�, floor(double x) ; ����, round(double x) : �ݿø�
		System.out.println(Math.ceil(3.45));   // 4.0
		System.out.println(Math.ceil(3.55));   // 4.0
		System.out.println(Math.floor(3.45));  // 3.0
		System.out.println(Math.floor(3.55));  // 3.0
		System.out.println(Math.round(3.45));  // 3
		System.out.println(Math.round(3.55));  // 4
		
		// 4. max(�ڷ��� a, �ڷ��� b) : �� ���� �� �� ū ��
		// 5. min(�ڷ��� a, �ڷ��� b) : �� ���� �� �� ū ������
		System.out.println(Math.max(54, 45));  // 54
		System.out.println(Math.max(45, 54));  // 54
		System.out.println(Math.min(54, 45));  // 45
		System.out.println(Math.min(45, 54));  // 45
		
		// 6. pow(double a, double b) : ������
		System.out.println(Math.pow(2, 3)); // 2�� 3�� = > 8.0
		System.out.println(Math.pow(3, 3)); // 3�� 3�� => 27.0
	}
}
