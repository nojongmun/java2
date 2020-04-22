package com.ict.edu;

import java.util.HashSet;
import java.util.TreeSet;

// ·Î¶Ç : 1 - 45 , ·£´ý, Áßº¹¾ÈµÊ, 6ÀÚ¸®
public class Ex05 {
	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<Integer>();
		for (int i = 0; i < 6; i++) {
			int k = ((int)(Math.random()*45))+1 ;
			if(! set1.add(k)) {
				i--;
			}
		}
		System.out.println(set1);
		
		System.out.println("================");
		TreeSet<Integer> set2 = new TreeSet<Integer>();
		for (int i = 0; i < 6; i++) {
			int k = ((int)(Math.random()*45))+1 ;
			if(! set2.add(k)) {
				i--;
			}
		}
		System.out.println(set2);
	}
}
