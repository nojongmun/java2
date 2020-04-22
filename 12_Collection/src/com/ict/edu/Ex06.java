package com.ict.edu;

import java.util.Iterator;
import java.util.Stack;

public class Ex06 {
	public static void main(String[] args) {
		// List 인터페이스 : 배열과 흡사한 구조, 삽입,삭제,추가가 자유롭고, 크기를 미리 지정하지 않아도 됨
		// 관련 클래스 : Stack, ArrayList, Vector ;
		
		// Stack : LIFO(LastInFristOut) : 마지막에 들어온 정보가 먼저 나가는 형태
		// add,push, addElement => 추가(append)
		// add(index, E) => 삽입(insert)
		// *pop : 맨위에 존재하는 객체를 반환, 삭제까지 함
		// *peek : 맨위에 존재하는 객체를 반환
		// *search : 검색  (오른쪽 1부터시작)
		// *indexOf : 검색 (왼쪽  0부터 시작)
		// *elementAt(index) => 검색 (왼쪽  0부터 시작)
		// *get(index) => 검색 (왼쪽  0부터 시작)
		// firstElement() => 처음요소
	    // lastElement() => 마지막요소
		// *setElement(Element,index) => 치환 	
		
		Stack<String> st = new Stack<String>(); 
		// set 다르게 순서가 있다.
		st.add("둘리");
		st.addElement("공실이");
		st.push("마이콜");
		System.out.println(st);
		st.add(0, "고길동");
		st.add(3, "희동이");
		System.out.println(st);
		System.out.println("==========");
		
		// 마지막 객체 보기 : pop(삭제까지), peek
		System.out.println(st.peek());
		System.out.println(st);
		System.out.println("---------------");
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println("==========");
		
		// 검색
		if(st.contains("둘리")) {
			System.out.println(st.indexOf("둘리")+"번째 위치");
			System.out.println(st.search("둘리")+"번째 위치");
			System.out.println(st.elementAt(3));
			System.out.println(st.get(3));
			System.out.println(st.firstElement());
			System.out.println(st.lastElement());
			System.out.println(st.get(st.size()-1));
		}else {
			System.out.println("존재하지 않습니다.");
		}
		System.out.println("==========");
		
		// 치환 
		st.setElementAt("도우너", 2);
		System.out.println(st);
		
		// 중복 가능
		st.add("둘리");
	    st.add(0, "둘리");
		System.out.println(st);
		System.out.println("==========");
		
		// 출력
		for (String k : st) {
			System.out.println(k);
		}
		System.out.println("=============");
		Iterator<String> it = st.iterator();
		while (it.hasNext()) {
			String k = (String) it.next();
			System.out.println(k);
		}
		System.out.println("=============");
		// 거꾸로 나오면서 삭제
		while (! st.isEmpty()) {
			// st.peek()는 무한 루프로 빠진다.
			String k = st.pop();
			System.out.println(k);
			System.out.println("pop는 삭제 하므로 크기는 "+ st.size() + "이다.");
		}
	}
}














