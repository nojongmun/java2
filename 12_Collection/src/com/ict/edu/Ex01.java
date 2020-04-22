package com.ict.edu;

public class Ex01 {
	// 제네닉과 컬렉션(자료구조)
	// 제네닉 : 컬렉션이 어떤 객체들로 이루어졌는지를 표시하는 객체 타입을 말하다. ex) <객체타입>
	// 컬렉션 : 객체들을 모아서 관리하는 인터페이스들을 말함
	// API : <T> => 객체타입,  <E> => 요소, 컬렉션 안에 존재하는 객체 하나를 뜻하는 것 
	// Map 형식 : <K,V> : Key(키), Value(값)을 뜻하고 
	//          key와 value는 1:1 대응, **key를 호출하면 value가 나온다.
	// 형식 : 컬렉션<제네닉> = 객체 
	
	// 최상위 컬렉션는 Collection<E> <- Set<E>, List<E>, Queue<E>, Map<K,V>
	// Collection 주요 메소드
	// add(E e):boolean => 해당 컬렉션에 객체 추가, 성공하면 true
	// addAll(Collection<? extends E> c) => 특정 컬렉션에 있는 모든 요소들을 다른 컬렉션에 추가
	// clear() => 모든 요소 삭제
	// remove(Object o) => 인자로 받은 특정객체만 삭제
	// contains(Object o) => 인자로 들어온 객체가 현재 컬렉션에 존재하면 true,
	// isEmpty() => 현재 컬렉션이 비어있으면  true,
	// size() => 해당 컬렉션안에 존재하는 객체들의 수 (for문에서 사용)
	// toArray() => 해당 컬렉션을 배열로 만들 때 사용
	// iterator() => 해당 컬렉션 안에 존재하는 객체들을 순서대로 접근하기 위한 Iterator 객체 반환
	//               하나씩 꺼내기 위해서는 필요한다.
	
	
	
}









