package com.ict.edu;

public class Ex04 {
	public static void main(String[] args) {
		// ���� ���ϱ�
		// ��� ����� ������ ��� 1���� �ʱⰪ���� �ο��Ѵ�.
		// ��(i)���� �ٸ� ���(j)�� ũ��  ������ ���� ���� �Ѵ�.
		int[] su = {90, 85, 70, 90, 95, 72};
		for (int i = 0; i < su.length; i++) {
			  int rank = 1 ;
			for (int j = 0; j < su.length; j++) {
				if(su[i] < su[j])   rank++;
			}
			System.out.println(su[i]+ "��   " + rank + "��");
		}
		System.out.println("=======================");
		
		int[] sum = {90, 85, 70, 95, 72};
		int[] rank = {1, 1, 1, 1, 1};
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if(sum[i] < sum[j]) {
					rank[i]++;
				}
			}
		}
		for (int i : rank) {
			System.out.println(i);
		}
		
	}
}











