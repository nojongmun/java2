package com.ict.edu;

public class Ex03 {
	public static void main(String[] args) {
		// ��ü ���� ��
		// static : ��ü ���� ���� �̸� ���������.
		//  Ŭ�����̸�.����ʵ�, Ŭ�����̸�.����޼ҵ�
		System.out.println(Ex02.COM);
		System.out.println(Ex02.eng);
		
		// ��ü ����
		// Ŭ�����̸�  �������� = new ������ ;
		
		// Ex02 Ŭ������ ��ü�� ������
		// ���� Ex02 �����ڰ� �����Ƿ� �⺻ �����ڸ� ���
		// �⺻�����ڶ� Ŭ�����̸�()
		Ex02 test = new Ex02();
		System.out.println(test);
		// ����ʵ�,����޼ҵ忡 ���� �ϴ� ��� :
		// ��������.����ʵ�,  ��������.����޼ҵ�
		System.out.println(test.name);
		System.out.println(test.kor);
		System.out.println(test.eng);
		System.out.println(test.MATH);
		System.out.println(test.COM);
	}
}
