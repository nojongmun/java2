package com.ict.edu2;

public class Ex06 {
	public void add(String s1, String s2) {
		int k1 = Integer.parseInt(s1);
		int k2 = Integer.parseInt(s2);
		add(k1, k2);
	}
	public void add(String s1, int s2) {
		int k1 = Integer.parseInt(s1);
		add(k1, s2);
	}
	public void add(int s1, String s2) {
		int k2 = Integer.parseInt(s2);
		add(s1, k2);
	}
	public void add(int s1, int s2) {
		System.out.println(s1 + " +" + s2 +" = "+(s1+s2));
	}
}
