package com.ict.edu;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 횟수 : ");
		int su = sc.nextInt();
		
		System.out.print("원하는 단어 : ");
		String str = sc.next();
		
		for (int i = 0; i < su; i++) {
			System.out.println(str);
		}
		System.out.println("===============");
		int k=0;
		while(k<su) {
			System.out.println(str);
			k++;
		}
		System.out.println("===============");
		int t = 0 ;
		while(true) {
			if(t>=su) break;
			System.out.println(str);
			t++;
		}
		System.out.println("===============");
	}
}








