package com.ict.edu2;

import java.util.Random;

public class Ex02 extends Random {
	public static void main(String[] args) {
		// Random Ŭ������ ��ü�� ������
		Random ran = new Random();
		int su = ran.nextInt(10)+1; //1-10;
		System.out.println(su);
		
		Ex02 test = new Ex02();
     	int n1 = test.nextInt(10)+1 ;
		System.out.println();
		
		// main()�� static �̹Ƿ� �ҷ� �� �� ����. 
		// nextInt()�� static�� �ƴ϶� �ҷ� �� �� ����.
		// int num = nextInt(10)+1 ;
		
		// play()�� �ҷ��� ����� ����.
	}
	
	public  void play() {
		int num = nextInt(10)+1 ;
		System.out.println(num);
	}
	
}
