package com.ict.edu;

public class Ex08 {
	public static void main(String[] args) {
		// ������ �迭 : 1���� �迭�� ������ ���� ��
		// ���� : �������� �迭�� ���� ���� �迭
		// �������̹迭 : 1�����ȿ� �����ϴ� �迭�� ���� ����.
		// �������̹迭 : 1�����ȿ� �����ϴ� �迭�� ���� �ٸ���.

		// �������� �迭
		// ����� ������ �ѹ���
		char[][] ch = new char[3][2] ;
		ch[0][0] = 'a';
		ch[0][1] = 'A';		
		
		ch[1][0] = 'b';
		ch[1][1] = 'B';
				
		ch[2][0] = 'c';
		ch[2][1] = 'C';
		
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch[i].length; j++) {
				System.out.println(ch[i][j]);
			}
		}
		System.out.println("====================");

		// ����� ������ �ʱⰪ�� �ѹ���
		String[][] str = {{"java","�ڹ�"},{"jsp","�ڹټ���������"},{"android","�ȵ���̵�"}};
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				System.out.println(str[i][j]);
			}
		}
		System.out.println("====================");
		
		// 1�����迭�� ����   �迭�� �ֱ� (�������� ������������ ������ �̰��� ����ؾ� ��)
		int[][] su = new int[2][4];
		
		int[] num1 = {1,2,3,4};
		int[] num2 = {10,20,30,40};
		
		su[0] = num1;
		su[1] = num2;
		
		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su[i].length; j++) {
				System.out.println(su[i][j]);
			}
		}
		
	}
}









