package com.ict.edu;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		// �迭 ���� �����ϱ�
		int[] su = {3, 4, 9, 5, 6, 1, 7, 2, 10, 8};
		
		// �������� ���� ����, �������� ���� ����
		Arrays.sort(su);
		for (int i : su) {
			System.out.println(i);
		}
		System.out.println("=================");
		
		// �������� (i>j), ��������(i<j);
		int temp = 0 ;  // �ڸ������� ���� �ӽ��������
		int[] k = {3, 4, 9, 5, 6, 1, 7, 2, 10, 8};
		for (int i = 0; i < k.length-1; i++) {
			for (int j = i+1; j < k.length; j++) {
				if(k[i] < k[j]) {
					temp = k[i];
					k[i] = k[j];
					k[j] = temp;
				}
			}
		}
		for (int i : k) {
			System.out.println(i);
		}
		System.out.println("=================");
		
	}
}









