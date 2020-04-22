package com.ict.edu;

public class Ex04 {
	public static void main(String[] args) {
		// 순위 구하기
		// 모든 사람의 순위는 모두 1등을 초기값으로 부여한다.
		// 나(i)보다 다른 사람(j)이 크면  순위의 값을 증가 한다.
		int[] su = {90, 85, 70, 90, 95, 72};
		for (int i = 0; i < su.length; i++) {
			  int rank = 1 ;
			for (int j = 0; j < su.length; j++) {
				if(su[i] < su[j])   rank++;
			}
			System.out.println(su[i]+ "점   " + rank + "등");
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











