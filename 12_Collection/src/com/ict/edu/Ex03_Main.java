package com.ict.edu;

import java.util.HashSet;

public class Ex03_Main {
	public static void main(String[] args) {
		Ex03_VO vo1 = new Ex03_VO();
		vo1.setName("�Ѹ�");
		vo1.setAge(1041);
		vo1.setKi(140.2);
		vo1.setHak('B');

		Ex03_VO vo2 = new Ex03_VO("����", 3, 76.4, 'F');
		Ex03_VO vo3 = new Ex03_VO("������", 27, 196.1, 'C');

		// ��ü�� �迭�� �ֱ�
		Ex03_VO[] arr = new Ex03_VO[3];
		arr[0] = vo1;
		arr[1] = vo2;
		arr[2] = vo3;

		System.out.println(arr); // �迭�� �ּ�
		for (Ex03_VO k : arr) {
			System.out.println("�̸� : " + k.getName());
			System.out.println("���� : " + k.getHak());
			System.out.println("------------------");
		}
		System.out.println("==================");

		// �÷��ǿ� �ֱ� : �߰� ����
		HashSet<Ex03_VO> sets = new HashSet<Ex03_VO>();
		sets.add(vo1);
		sets.add(vo2);
		sets.add(vo3);

		// �߰�(add)�� ����
		sets.add(new Ex03_VO("������", 2019, 139.5, 'A'));
		System.out.println(sets); // Ŭ������ ��� �ּҰ��� ���δ�.

		for (Ex03_VO k : sets) {
			System.out.println("�̸� : " + k.getName());
			System.out.println("���� : " + k.getHak());
			System.out.println("------------------");
		}
		System.out.println("==================");

		// ���� : remove(Object o), clear();
		sets.remove(vo3);

		// ���Կ��� : contains(Object o);
		if (sets.contains(vo3)) {
			System.out.println("vo3�� �ִ�.");
		} else {
			System.out.println("vo3��  ����.");
			if (sets.contains(vo2)) {
				System.out.println("vo2�� �ִ�.");
				if (sets.contains(vo2.getName().equals("ȫ�浿"))) {
					System.out.println("vo2�� �̸� ȫ�浿�̴�.");
				} else {
					System.out.println("vo2�� �̸� " + vo2.getName() + " �̴�.");
				}
			} else {
				System.out.println("vo2�� ����.");
			}
		}
		// ũ�� : size()
		System.out.println("sets�� ũ��(����)��  " + sets.size() + " �̴�.");

		// ��� ���� : clear()
		sets.clear();
		// ũ�� : size()
		System.out.println("sets�� ũ��(����)��  " + sets.size() + " �̴�.");
		// ����ֳ�? => ��������� true
		if(sets.isEmpty()) {
			System.out.println("����ִ�.");
		}else {
			System.out.println("������� �ʴ�.");
		}

	}
}
