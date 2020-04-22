package com.ict.edu;

import java.util.StringTokenizer;

public class Ex04 {
	public static void main(String[] args) {
		// ���ڿ� ������ : String.split(), StringTokenizer Ŭ����
		// ������ : 
		//  - String.split() : ����� String[]�ε� �迭�� ũ�⸦ ������� ���� �� �ִ�. for�� ���
		//  - StringTokenizer : �˾Ƽ� �ڵ����� ������. �ʿ���� ���� �ڵ� ����(�߰��� ����), 
		//                      ��ȯ���� String[]�� �ƴϹǷ� for�� ��� �Ұ�, while�� ����Ѵ�.
		
		String s1 = "This     is     a     Test";
		String[] arr1 = s1.split(" ") ;  // [This][is][a][Test]
		for (String k : arr1) {
			System.out.println(k);
		}
		System.out.println("======================");
		
		String[] arr2 = s1.split(" ", 2); // [This] [is a Test]
		for (String k : arr2) {
			System.out.println(k);
		}
		System.out.println("======================");
		StringTokenizer st1 = new StringTokenizer(s1);
		
		while (st1.hasMoreTokens()) {
			String k1 = st1.nextToken();
			System.out.println("k1 : " + k1);
		}
		System.out.println("======================");
		
		// st1�� ������ �������.
		s1 = "This      is     a     Test";
		StringTokenizer st2 = new StringTokenizer(s1);
		while (st2.hasMoreElements()) {
			String k2 = (String) st2.nextElement();
			System.out.println("k2 : " + k2);
		}
		System.out.println("==============");
		// StringTokenizer�� ���������� ó���� �����ϳ� 
		// ��ü ó�� �ϱ� ���ؼ��� �迭�� ���� ó���Ѵ�.
		s1 = "This      is     a     Test";
		StringTokenizer st3 = new StringTokenizer(s1);
		String[] arr3 = new String[st3.countTokens()];
		int i = 0 ;
		while(st3.hasMoreTokens()) {
			arr3[i++] = st3.nextToken();
		}
		for (int j = 0; j < arr3.length;j++) {
			System.out.println(arr3[j]);
		}
	}
}








