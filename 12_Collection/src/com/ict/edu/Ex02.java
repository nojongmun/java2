package com.ict.edu;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;


public class Ex02 {
	public static void main(String[] args) {
		// Set 인터페이스를 구현한 클래스 : HashSet, TreeSet ;
		// 특징 : 중복저장안됨, 특정기준으로 정렬할 수 없음(TreeSet은 무조건 오름차순 정렬됨)
		
		// 컬렉션 생성 :  HashSet<제네닉=객체타입=클래스> 참조변수 = new HashSet<[객체타입]>();
		 HashSet<String> t1 = new HashSet<String>();
		 HashSet<Integer> t2 = new HashSet<Integer>();
		 HashSet<Double> t3 = new HashSet<Double>();
		 TreeSet<Boolean> t4 = new TreeSet<Boolean>();
		 TreeSet<Character> t5 = new TreeSet<Character>();
		 
		 // 컬렉션에 객체 추가(add)
		 String s1 = "둘리";
		 String s2 = new String("희동이");
		 t1.add(s1);
		 t1.add(s2);
		 t1.add("마이콜");
		 // t2.add(s1); => 제네닉이 맞지 않아서 오류
		 // t3.add(s1); => 제네닉이 맞지 않아서 오류
		 // t4.add(s1); => 제네닉이 맞지 않아서 오류
		 // t5.add(s1); => 제네닉이 맞지 않아서 오류
		 
		 Integer k1 = new Integer(10);
		 Integer k2 = new Integer("20");
		 t2.add(k1);
		 t2.add(k2);
		 t2.add(new Integer(30));
		 t2.add(40); // 오토박싱 : 자동으로 객체가 되어서 들어간다.
		 int k3 = 50 ;
		 t2.add(k3); // 오토박싱 : 자동으로 객체가 되어서 들어간다.
		 
		 Double d1 = new Double(3.142);
		 t3.add(d1);
		 t3.add(3.14);// 오토박싱 : 자동으로 객체가 되어서 들어간다.
		 // t3.add(3); // 변수와 다르게 못 들어간다.
		 
		 // 컬렉션 전체 내용 보기
		 System.out.println(t1);
		 System.out.println("==========");
		 System.out.println(t2);
		 System.out.println("==========");
	 	 // 하나씩  보기
		 // 개선된 for문 사용
		 for (String k : t1) {
			System.out.println(k);
		}
		 System.out.println("==========");
		 Iterator<String> it = t1.iterator();
		 while (it.hasNext()) {
			String str = (String) it.next();
			System.out.println(str);
		}
		 
		 
		 
		
	}
}
