package com.ict.edu;

import java.util.HashSet;

public class Ex04 {
	public static void main(String[] args) {
		String[] str = {"java","jsp","spring","andorid"};
		
		// �迭�� Set�� ����
		HashSet<String> set1 = new HashSet<String>(); 
		for (String k : str) {
			set1.add(k);
		}
		// �߰� ����
		set1.add("html");
		set1.add("css");
		System.out.println(set1);
		System.out.println("===================");
		
		// Set�� �迭�� ������
		  Object[] arr = set1.toArray();
		// String[] arr = (String[])set1.toArray(); // Exception �߻�
		for (Object k : arr) {
			System.out.println((String)(k));
		}
		System.out.println("===================");
		
		// �ߺ� �˻�
		// set1 : spring, css, java, andorid, jsp, html
		HashSet<String> set2 = new HashSet<String>();
		HashSet<String> set3 = new HashSet<String>();
		set2.add("Java");
		set2.add("JAVA");
		set2.add("java");
		System.out.println(set2); // JAVA, Java, java => ��ҹ��� �����Ѵ�.
		
		for (String k : set2) {
			// set2�� set1�� �߰��ϴ� ���� �����ϸ� (��,�ߺ��ǰų� ���״��� Ʋ�� ���)
			if(! set1.add(k)) {
				set3.add(k);
			}
		}
		System.out.println("===========");
		System.out.println("set1 : " + set1);
		System.out.println("set3 : " + set3);
		
	}
}











