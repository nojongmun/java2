package com.ict.edu;

public class Ex05 {
	public static void main(String[] args) {
		// 랩퍼클래스 : 기본자료형(boolean, char, int, double)을 객체로 만드는 클래스들 
		// boolean => Boolean
		// char => Character
		// int => Integer
		// double => Double
		// Boxing = > 기본자료형을 객체로 만든 것 
		
		boolean b1 = true;
		Boolean obj_b1 = new Boolean(b1);
		Boolean obj_b2 = new Boolean("true");  // String => boolean
		
		char c1 = 'a';
		Character obj_c1 = new Character(c1);
		// Character obj_c2 = new Character("c"); // String 받는 생성자가 없다.
		String s1 ="a";
		char c2 = s1.charAt(0); // String => char
		
		int k1 = 12345;
		Integer obj_k1 = new Integer(k1);
		Integer obj_k2 = new Integer("12345");  // String => int
		
		double d1 = 234.124;
		Double obj_d1 = new Double(d1);
		Double obj_d2 = new Double("234.124"); // String => double
		
	}
}
