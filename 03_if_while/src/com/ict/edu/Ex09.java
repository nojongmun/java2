package com.ict.edu;

public class Ex09 {
	public static void main(String[] args) {
		// break�� continue��
		// break : ���� �ݺ���(���)�� Ż���Ҷ� ����ϴ� �����
		// continue : countinue�� ���� ���๮�� �����ϰ� ����ȸ���� �����ϴ� �����
		// continue�� ������ for���� ���������� �̵�, while���� ��� ���ǽ����� �̵�
		// ** if���� �Բ� ��� �ȴ�.

		// 1-10 ���� ���
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}
		System.out.println("=====================");

		// i�� 6�϶� break�������
		for (int i = 1; i < 11; i++) {
			if (i == 6)  break;
			System.out.println(i);
		}
		System.out.println("=====================");

		// i�� 6�϶� continue�������
		for (int i = 1; i < 11; i++) {
			if (i == 6) continue;
			System.out.println(i);
		}
		System.out.println("=====================");
		
		// i�� 6�϶� break�������
		int i= 1 ;
		while (i<11) {
			if(i==6) break;
			System.out.println(i);
			i++;
		}
		System.out.println("=====================");
		
		// i�� 6�϶� continue�������
		// ���� ����
		/*
		i = 1 ;
		while (i<11) {
			if(i==6) continue;
			System.out.println(i);
			i++;
		}
		*/
		
		// 0-10���� ¦�� ���
		for (int j = 0; j < 11; j++) {
			// 2�� ���� �������� 0�̸� ¦��
			if(j%2==0) {
				System.out.println(j);
			}
		}
		System.out.println("=====================");
		
		// 0-10���� ¦�� ���
		for (int j = 0; j < 11; j++) {
			// Ȧ���϶� �Ʒ� ���๮�� ���� ���� ���������� ����
		  if(j%2==1) {
			  continue;
		  }
			System.out.println(j);
		}
		
	}
}
