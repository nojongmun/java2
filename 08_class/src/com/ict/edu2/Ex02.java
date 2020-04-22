package com.ict.edu2;

import java.util.Random;

public class Ex02 extends Random {
	public static void main(String[] args) {
		// Random 클래스를 객체로 만들자
		Random ran = new Random();
		int su = ran.nextInt(10)+1; //1-10;
		System.out.println(su);
		
		Ex02 test = new Ex02();
     	int n1 = test.nextInt(10)+1 ;
		System.out.println();
		
		// main()가 static 이므로 불러 올 수 없다. 
		// nextInt()가 static이 아니라서 불러 올 수 없다.
		// int num = nextInt(10)+1 ;
		
		// play()는 불러올 방법이 없다.
	}
	
	public  void play() {
		int num = nextInt(10)+1 ;
		System.out.println(num);
	}
	
}
