package com.ict.edu;

import java.util.HashSet;

public class Ex03_Main {
	public static void main(String[] args) {
		Ex03_VO vo1 = new Ex03_VO();
		vo1.setName("둘리");
		vo1.setAge(1041);
		vo1.setKi(140.2);
		vo1.setHak('B');

		Ex03_VO vo2 = new Ex03_VO("희동이", 3, 76.4, 'F');
		Ex03_VO vo3 = new Ex03_VO("마이콜", 27, 196.1, 'C');

		// 객체를 배열에 넣기
		Ex03_VO[] arr = new Ex03_VO[3];
		arr[0] = vo1;
		arr[1] = vo2;
		arr[2] = vo3;

		System.out.println(arr); // 배열의 주소
		for (Ex03_VO k : arr) {
			System.out.println("이름 : " + k.getName());
			System.out.println("학점 : " + k.getHak());
			System.out.println("------------------");
		}
		System.out.println("==================");

		// 컬렉션에 넣기 : 추가 가능
		HashSet<Ex03_VO> sets = new HashSet<Ex03_VO>();
		sets.add(vo1);
		sets.add(vo2);
		sets.add(vo3);

		// 추가(add)도 가능
		sets.add(new Ex03_VO("공실이", 2019, 139.5, 'A'));
		System.out.println(sets); // 클래스인 경우 주소값이 보인다.

		for (Ex03_VO k : sets) {
			System.out.println("이름 : " + k.getName());
			System.out.println("학점 : " + k.getHak());
			System.out.println("------------------");
		}
		System.out.println("==================");

		// 삭제 : remove(Object o), clear();
		sets.remove(vo3);

		// 포함여부 : contains(Object o);
		if (sets.contains(vo3)) {
			System.out.println("vo3은 있다.");
		} else {
			System.out.println("vo3은  없다.");
			if (sets.contains(vo2)) {
				System.out.println("vo2는 있다.");
				if (sets.contains(vo2.getName().equals("홍길동"))) {
					System.out.println("vo2의 이름 홍길동이다.");
				} else {
					System.out.println("vo2의 이름 " + vo2.getName() + " 이다.");
				}
			} else {
				System.out.println("vo2는 없다.");
			}
		}
		// 크기 : size()
		System.out.println("sets의 크기(갯수)는  " + sets.size() + " 이다.");

		// 모두 삭제 : clear()
		sets.clear();
		// 크기 : size()
		System.out.println("sets의 크기(갯수)는  " + sets.size() + " 이다.");
		// 비어있냐? => 비어있으면 true
		if(sets.isEmpty()) {
			System.out.println("비어있다.");
		}else {
			System.out.println("비어있지 않다.");
		}

	}
}
