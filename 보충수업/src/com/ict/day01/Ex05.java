package com.ict.day01;

public class Ex05 {
	public static void main(String[] args) {
		// �������迭 ; 1���� �迭 �������� �ϳ��� ��� �迭�� ���� ��
		//  ���� , ����, ����'
		
		// �������̸� ����
		// ���� : �ڷ���[][] �̸� ;
		int[][] su ;
		int[][] num;
		
		// ���� : �̸� = new �ڷ���[1�����迭�� ����][1�����迭�� ������ ����] => ��������
		// ���� : �̸� = new �ڷ���[1�����迭�� ����][]  => ��������
		su = new int[4][2] ;
		num = new int[4][] ; // ������ ���� �������� ����
		
		su[0][0] = 10 ;
		su[0][1] = 10 ;
		
		su[1][0] = 10 ;
		su[1][1] = 10 ;
		
		su[2][0] = 10 ;
		su[2][1] = 10 ;
		
		su[3][0] = 10 ;
		su[3][1] = 10 ;
		
		/* �����Ҷ� �����߻�
		num[0][0] = 100 ;
		
		num[1][0] = 100 ;
		num[1][1] = 100 ;
		
		num[2][0] = 100 ;
		
		num[3][0] = 100 ;
		num[3][1] = 100 ;
		num[3][2] = 100 ;
		*/
		// ���������� �ݵ�� �Ʒ����ó�� �־�� �Ѵ�.(�������̵� ��밡��)
		int[] k1 = {100};
		int[] k2 = {1000,2000};
		int[] k3 = {10000};
		int[] k4 = {1000,2000,3000,4000};
		num[0] = k1;
		num[1] = k2;
		num[2] = k3;
		num[3] = k4;
		
		
		// 2�����迭 ����ϱ�
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.println(num[i][j]);
			}
		}
		System.out.println();
		
		// ����� �����ѹ��� => �������̸� ����
		int[][] su2 = new int [4][2];
		
		// ����
		su2[0][0] = 10 ;
		su2[0][1] = 10 ;
		su2[1][0] = 10 ;
		su2[1][1] = 10 ;
		su2[2][0] = 10 ;
		su2[2][1] = 10 ;
		su2[3][0] = 10 ;
		su2[3][1] = 10 ;
		
		// ���
		for (int i = 0; i < su2.length; i++) {
			for (int j = 0; j < su2[i].length; j++) {
				System.out.println(su2[i][j]);
			}
		}
		System.out.println();
		
		// ����,����,������ �ѹ��� : ��������, �������� ����
		// String[][] str1 = new String[3][2] ����
		String[][] str1 = {{"a","b"},{"c","d"},{"e","f"}};
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str1[i].length; j++) {
				System.out.println(str1[i][j]);
			}
		}
		System.out.println();
		
		// String[][] str1 = new String[3][] ����
		String[][] str2 = {{"a"},{"b","c","d"},{"e","f"}};
		for (int i = 0; i < str2.length; i++) {
			for (int j = 0; j < str2[i].length; j++) {
				System.out.println(str2[i][j]);
			}
		}
		
	}
}
