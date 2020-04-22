package com.ict.edu4;

public class Ex02 {
	public static void main(String[] args) {
		String str ="Java Programming";
		String msg = str.substring(2, 4);
		System.out.println(msg);
		System.out.println("=================");
		int su = 0;
		for (int i = 0; i < str.length(); i++) {
			char k1 = str.charAt(i);
			if(k1=='r') {
				su++;
			}
		}
		System.out.println(su);
		System.out.println("=================");
		
		su = 0;
		for (int i = 0; i < str.length(); i++) {
			String s = str.substring(i, i+1);
			if(s.equals("r")) {
				su++;
			}
		}
		System.out.println(su);
	}
}
