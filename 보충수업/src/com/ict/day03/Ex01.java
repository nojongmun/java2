package com.ict.day03;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
	    // Map 인터페이스 : Key와 Value를 매핑하는 객체이다. 사용되는 Key는 중복할 수 없다.
		// Key를 호출하면 Value가 나오는 구조이다.
		// key들을 별도의 Set에서 관리한다. => keySet()
		// 추가방법 : add() X,  put(key,value) 사용
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("대한민국", "서울");
		map.put("캐나다", "어타와");
		map.put("영국", "런던");
		map.put("스위스", "베른");
		
		// key를 Set 관리 시킨다. => keySet();
		Set<String> keys  =  map.keySet();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("나라입력 : ");
		String country = scan.next();
		// key에 해당 나라가 존재하는지 판단하자
		if(keys.contains(country)) {
			String city = map.get(country);
			System.out.println(country+"의 수도는 "+city+" 입니다.");
		}else {
			System.out.println(" 데이터가 없는 나라입니다.");
		}
		
	}
}
