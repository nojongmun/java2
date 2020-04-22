package com.ict.edu3;

public class TestMain {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		System.out.println(dog.legs);
		System.out.println(dog.eyes);
		System.out.println(dog.name);
		System.out.println(dog.age);
		dog.like();
		dog.play();
		dog.sound();
		 
		System.out.println("=============");
		
		System.out.println(cat.legs);
		System.out.println(cat.eyes);
		System.out.println(cat.name);
		System.out.println(cat.age);
		
		cat.like();
		cat.hobby();
		cat.sound();
		
		System.out.println("=============");
		
		Aniaml aniaml = null;
		int op = 1 ;
		switch (op) {
			case 1: aniaml = new Dog(); break;
			case 2: aniaml = new Cat(); break;
		}
		// 다형성
		aniaml.sound();
		aniaml.like();
		// aniaml.play();  사용못함
		// aniaml.hobby(); 사용못함
		// System.out.println(aniaml.name);
		// System.out.println(aniaml.age);
		
	}
}
