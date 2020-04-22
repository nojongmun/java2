package com.ict.edu;

import java.util.HashSet;

public class Ex04 {
	public static void main(String[] args) {
		String[] str = {"java","jsp","spring","andorid"};
		
		// 배열을 Set에 넣자
		HashSet<String> set1 = new HashSet<String>(); 
		for (String k : str) {
			set1.add(k);
		}
		// 추가 하자
		set1.add("html");
		set1.add("css");
		System.out.println(set1);
		System.out.println("===================");
		
		// Set를 배열로 만들자
		  Object[] arr = set1.toArray();
		// String[] arr = (String[])set1.toArray(); // Exception 발생
		for (Object k : arr) {
			System.out.println((String)(k));
		}
		System.out.println("===================");
		
		// 중복 검사
		// set1 : spring, css, java, andorid, jsp, html
		HashSet<String> set2 = new HashSet<String>();
		HashSet<String> set3 = new HashSet<String>();
		set2.add("Java");
		set2.add("JAVA");
		set2.add("java");
		System.out.println(set2); // JAVA, Java, java => 대소문자 구별한다.
		
		for (String k : set2) {
			// set2을 set1에 추가하는 것이 실패하면 (즉,중복되거나 제네닉이 틀린 경우)
			if(! set1.add(k)) {
				set3.add(k);
			}
		}
		System.out.println("===========");
		System.out.println("set1 : " + set1);
		System.out.println("set3 : " + set3);
		
	}
}











