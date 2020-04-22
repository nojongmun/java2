package com.ict.edu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Ex07 {
	public static void main(String[] args) {
		// List 인터페이스 : 배열과 흡사한 구조, 삽입,삭제,추가가 자유롭고, 크기를 미리 지정하지 않아도 됨
		// 관련 클래스 : Stack, ArrayList, Vector ;

		// ArrayList : 배열과 흡사한 구조, 멀티스레드 동기화를 지원하지 않는다.(1:N 실시간 처리에 적합하지 않음)
		// Vector : 배열과 흡사한 구조, 멀티스레드 동기화 지원한다.(1:N실시간 처리에 적합(온라인 좌석예약))
		// ArrayList와 Vector는 사용용도만 다르지 사용법은 같다.

		ArrayList<String> list = new ArrayList<String>();
		// 추가, 삽입 => add
		list.add("박찬호");
		list.add("손흥민");
		list.add("류현진");
		list.add(0, "차범근");
		System.out.println(list);
		System.out.println("===============");

		Vector<String> vector = new Vector<String>();
		vector.add("박찬호");
		vector.add("손흥민");
		vector.addElement("류현진");
		vector.add(0, "차범근");
		System.out.println(vector);
		System.out.println("===============");

		// 검색
		if (list.contains("손흥민")) {
			System.out.println(list.indexOf("손흥민") + "번째 위치");
			System.out.println(list.lastIndexOf("손흥민") + "번째 위치");
			System.out.println(list.get(2));
			// System.out.println(list.elementAt(2));
			// System.out.println(list.firstElement());
			// System.out.println(list.lastElement());
		}
		System.out.println("===============");

		// 검색
		if (vector.contains("손흥민")) {
			System.out.println(vector.indexOf("손흥민") + "번째 위치");
			System.out.println(vector.lastIndexOf("손흥민") + "번째 위치");
			System.out.println(vector.get(2));
			System.out.println(vector.elementAt(2));
			System.out.println(vector.firstElement());
			System.out.println(vector.lastElement());
		}
		System.out.println("===============");
		
		// 치환
		list.set(1, "박세리");
		System.out.println(list);
		
		vector.set(1, "박세리");
		vector.setElementAt("차두리",1);
		System.out.println(vector);
		
		// 중복 가능
		list.add(0,"박지성");
		list.add(3,"박지성");
		list.add("박지성");
		System.out.println(list);
		
		vector.add(0,"이승엽");
		vector.add(3,"이승엽");
		vector.add("이승엽");
		System.out.println(vector);
		System.out.println("================");
		
		// 용량, 크기
		System.out.println(list.size());         // 크기
		// System.out.println(list.capacity());  // 용량
		System.out.println("=================");
		
		System.out.println(vector.size());      // 크기
		System.out.println(vector.capacity());  // 용량
		vector.add(0,"이승엽");
		vector.add(3,"이승엽");
		vector.add("이승엽");
		vector.add("이승엽");
		System.out.println("=================");
		System.out.println(vector.size());      // 크기
		System.out.println(vector.capacity());  // 용량
		
		// 출력
		for (String k : vector) {
			System.out.println(k);
		}
		System.out.println("=======================");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String k = (String) it.next();
			System.out.println(k);
		}
		
	}
}






