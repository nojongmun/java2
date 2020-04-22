package com.ict.edu;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		// 배열 내용 정렬하기
		int[] su = {3, 4, 9, 5, 6, 1, 7, 2, 10, 8};
		
		// 오름차순 정렬 가능, 내림차순 정렬 없음
		Arrays.sort(su);
		for (int i : su) {
			System.out.println(i);
		}
		System.out.println("=================");
		
		// 오름차순 (i>j), 내림차순(i<j);
		int temp = 0 ;  // 자리변경을 위한 임시저장공간
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









