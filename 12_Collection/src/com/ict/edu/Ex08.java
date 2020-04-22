package com.ict.edu;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex08 {
	public static void main(String[] args) {
		// Queue(큐) 인터페이스 : FIFO(선입선출)=>먼저 들어온 정보가 먼저 나간다.
		//          구현 클래스 : LinkedList
		LinkedList<String> list  = new LinkedList<String>();
		// 추가, 삽입 : add,addFirst, addLast,offer, offerFirst,offerLast
		list.add("고길동");
		list.add("도우너");
		list.offer("마이콜");
		list.addFirst("또치");
		list.offerFirst("공실이");
		list.addLast("꼴뚜기왕자");
		list.offerLast("고길동");
		System.out.println(list);
		
		// 포함유무 검색
		if(list.contains("고길동")) {
			System.out.println(list.indexOf("고길동")+"번째 위치");
			System.out.println(list.lastIndexOf("고길동")+"번째 위치");
			System.out.println(list.getFirst());
			System.out.println(list.getLast());
			System.out.println(list.get(3));
		}
		System.out.println("=====================");
		// 삭제 : remove(Object), remove(index), removeFirst(), removeLast();
		list.removeFirst();
		list.removeLast();
		list.remove("꼴뚜기왕자");
		list.remove(2);
		System.out.println(list);
		
		// 출력
		for (String k : list) {
			System.out.println(k);
		}
		System.out.println("================");
		
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String k = (String) it.next();
			System.out.println(k);
		}
	}
}








