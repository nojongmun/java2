package com.ict.edu2;

// �θ�Ŭ���� : super, parent
public class Ex01_Super {
    String name = "ȫ�浿";
    int age = 47;
    String addr = "����";
    private String dog = "�۹���";
    static int car = 1 ;
    static final boolean gender = true;
    
    public Ex01_Super() {
		System.out.println("�θ�Ŭ���� ������ : " + this);
	}
    
    public void prn() {
    	System.out.println("�θ�Ŭ���� �޼ҵ�");
    	
    	// �θ�� �ڽ��� ������� �����ü� ����.
    	// System.out.println(cat);
    	// System.out.println(this.cat);
    	
    }
    public static void prn2() {
    	System.out.println("�θ�Ŭ���� static �޼ҵ�");
    }
    
}
