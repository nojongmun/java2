package com.ict.edu2;

// �ڽ� Ŭ���� : Sub, Child
// �ڽ� Ŭ�������� ��Ӱ��踦 �δ´�. (�ڽ� extends �θ�)
// ��� ���� : �ڽ�Ŭ������ �θ�Ŭ������ ����ʵ�, ����޼ҵ带 ������� ��� �� �� �ִ� �� 
//          �ڹٿ����� ���߻�Ӹ� �� �� ����. �� �θ�Ŭ������ �ϳ��� ������ �� �ִ�.
//          ��� Ŭ������ Object��� Ŭ������ ��ӹް� �ִ�.
//          ( ����Ŭ������ ��Ӱ��迡 ������ Object Ŭ������ ��� �ް� �ִٴ� ���̴�.)
public class Ex01_Sub extends Ex01_Super{
    String name = "ȫ����";
    int age = 15 ;
    String cat = "��ũ";
    public Ex01_Sub() {
    	// �θ�Ŭ������ �����ڸ� ȣ���ϴ� ���� ���� �Ǿ��̴�. (������ ù��° ��)
		System.out.println("�ڽ�Ŭ���� ������ : " +this);
	}
    
    public void play() {
    	String name = "ȫ�β�";
    	System.out.println(name);
    	System.out.println(this.name);
    	System.out.println(super.name);
    	System.out.println(age);
    	
    	// �ڽ�Ŭ������ �θ�Ŭ������ ����ʵ峪 �޼ҵ带 ������� �����ü� �ִ�.
    	System.out.println(super.addr);
    	System.out.println(this.addr);
    	System.out.println(addr);
    	
    	// private�� ��Ӱ��迡���� ���� �ȵ�
    	// System.out.println(dog);
    	
    }
}
