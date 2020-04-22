package com.ict.edu4;

public class AnimalTest {
	public static void main(String[] args) {
		// ���̰� 3��, �̸� ū�Լ�, ����ִ�.
		// 1) ������ 2)get/set

		// 1) �����ڸ� �̿� �ʱⰪ ����
		Animal animal1 = new Animal(true, 3, "ū�Լ�");
		System.out.println("�̸� : " + animal1.name);
		if (animal1.live) {
			System.out.println("�������� : �������");
		} else {
			System.out.println("�������� : �׾���");
		}
		System.out.println("==================");

		// 2) �⺻�����ڸ� �̿��ؼ� �ʱⰪ ����
		Animal animal2 = new Animal();
		System.out.println("�̸� : " + animal2.name);
		if (animal2.live) {
			System.out.println("�������� : �������");
		} else {
			System.out.println("�������� : �׾���");
		}
		System.out.println("==================");
		
		// 2) set�� �̿��ؼ� �������� ���� ���� 
		// ���, 31, ����������� ��������
		Animal animal3 = new Animal();
		animal3.setName("���");
		animal3.setAge(31);
		animal3.setLive(true);
		
		System.out.println("�̸� : " + animal3.name);
		if (animal3.live) {
			System.out.println("�������� : �������");
		} else {
			System.out.println("�������� : �׾���");
		}

	}
}
