package com.ict.edu3;

public class Ex01 {
	// 생성자 : 객체를 생성할때 자동으로 한번 호출된다.
	//   목적 : 멤버필드의 초기화
	//  - 생성자이름은 클래스이름과 같다.
	//  - 반환형이 없는 메소드와 같다. 
	//  - 오버로딩이 가능 (생성자가 여러개 존재할 수 있다.)
	//  - 클래스에 생성자를 만들지 않으면 기본생성자로 객체 생성을 한다.
	//  - 클래스에 생성자를 만들면 만들어진 생성자로 객체 생성을 해야 한다.
	//  - 기본생성자라 클래스이름(), 즉 인자 없는 생성자를 기본 생성자라고 한다.
	
	private String name = "일지매";
	private int age = 24 ;
	private String add = "충청도";
	
	// 기본 생성자는  만들수 있다. (ctrl + space)
	public Ex01() {
		System.out.println("기본 생성자");
		// 멤버들의 데이터를 변경할 수 있다
		name = "둘리";
		age = 1002;
		add = "남극";
	}
	public Ex01(String name, int age, String add) {
		this.name = name;
		this.age = age;
		this.add = add;
	}
  
	// 멤버를 갖는 생성자 : Source- 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
}
