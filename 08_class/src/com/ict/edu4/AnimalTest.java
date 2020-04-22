package com.ict.edu4;

public class AnimalTest {
	public static void main(String[] args) {
		// 나이가 3살, 이름 큰뿔소, 살아있다.
		// 1) 생성자 2)get/set

		// 1) 생성자를 이용 초기값 지정
		Animal animal1 = new Animal(true, 3, "큰뿔소");
		System.out.println("이름 : " + animal1.name);
		if (animal1.live) {
			System.out.println("생존여부 : 살아있음");
		} else {
			System.out.println("생존여부 : 죽었음");
		}
		System.out.println("==================");

		// 2) 기본생성자를 이용해서 초기값 지정
		Animal animal2 = new Animal();
		System.out.println("이름 : " + animal2.name);
		if (animal2.live) {
			System.out.println("생존여부 : 살아있음");
		} else {
			System.out.println("생존여부 : 죽었음");
		}
		System.out.println("==================");
		
		// 2) set를 이용해서 데이터의 값을 변경 
		// 펭귄, 31, 살아있음으로 변경하자
		Animal animal3 = new Animal();
		animal3.setName("펭귄");
		animal3.setAge(31);
		animal3.setLive(true);
		
		System.out.println("이름 : " + animal3.name);
		if (animal3.live) {
			System.out.println("생존여부 : 살아있음");
		} else {
			System.out.println("생존여부 : 죽었음");
		}

	}
}
