package com.ict.edu;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex09 {
	public static void main(String[] args) {
	  // Map 인터페이스 : Key와 Value를 매핑하는 객첵이다.여기에 사용 되는 Key는 중복 될수 없다.
	  //    구현 클래스 : HashMap : value와 key가 null를 한번 허용 한다.
      //    key를 호출해야 value가 나온다.
	  //    key들을 별도로 Set에서 관리 한다. => keySet()
	  //    add()로 추가 못한다.
	  //  	put(key, value) 사용 해야된다.
		
	  // Map 생성 (key를 숫자로)
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		// 추가 : add() X ,  put(k,v) O;
		map.put(0, "한국");
		map.put(1, "미국");
		map.put(2, "중국");
		map.put(3, "일본");
		map.put(4, "한국"); // value 중복이랑 상관없다.
		map.put(3, "영국"); // key 중복 => 덮어쓰기가 된다.
		System.out.println(map);
		
		// 하나씩 호출하기 : get(key) => value가 나온다.
		System.out.println(map.get(4));
		System.out.println(map.get("한국"));
		System.out.println("=============");
		
		// 일부러 key를 0 부터 순서대로 만들었기 때문에 for문을 사용 할 수 있다.
		for (int i = 0; i < map.size(); i++) {
			System.out.println(map.get(i));
		}
		System.out.println("================");
		for (Integer k : map.keySet()) {
			System.out.println(map.get(k));
		}
		System.out.println("================");
	    Iterator<Integer> it = map.keySet().iterator();	
	    while (it.hasNext()) {
			Integer k = (Integer) it.next();
			System.out.println(map.get(k));
		}
	    System.out.println("=========================");
	    
	    // key를 문자열로 만들어 보자
	    HashMap<String, String> map2 = new HashMap<String, String>();
	    map2.put("이름", "고길동");
	    map2.put("나이", "38");
	    map2.put("주소", "서울시 도봉구 방학동");
	    map2.put("성별", "남");
	    
	    System.out.println(map2.get("이름"));
	    System.out.println(map2.get("나이"));
	    System.out.println(map2.get("주소"));
	    System.out.println(map2.get("성별"));
	    System.out.println("=====================");
	    
	    for (String k : map2.keySet()) {
	        System.out.println(k + ":" +map2.get(k));
		}
	    System.out.println();
	    System.out.println("=====================");
	    
	    Iterator<String> it2 = map2.keySet().iterator();
	    while (it2.hasNext()) {
			String k = (String) it2.next();
			System.out.println(k + ":" + map2.get(k));
		}
	    System.out.println("====================");
	    
	    // key값만 가지고 있다. 
	    Set<String> set1 = map2.keySet(); 
	    System.out.println(set1);
	    
	    // value값만 가지고 있다.
	    Collection<String> set2 = (Collection<String>)map2.values();
	    System.out.println(set2);
	}
}














