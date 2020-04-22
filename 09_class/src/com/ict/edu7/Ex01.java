package com.ict.edu7;

// ������ : ����� �ϳ��� ��ü�� �ν��ϰ�, �������� ��� ��ü���� �� ���� ��� ��  �ϳ��� ����(��ü)
public class Ex01 {
	// ���߿� �߰�
	static final int JAVA = 200 ;
	
	public enum Lesson{
		// static  final 
		JAVA, JSP, SPRING, ANDROID, 
	}
	public static void main(String[] args) {
		// �ϳ� ����
		Lesson s1 = Lesson.JAVA;
		System.out.println("s1 : " + s1);
		
		System.out.println("JAVA : " + Lesson.JAVA);  // JAVA ; ��ü
		System.out.println("JAVA : " + JAVA);         // 200  ; ��(������) 
		System.out.println("JSP : " + Lesson.JSP);
		
		System.out.println("==================");
		
		Lesson[] items = Lesson.values();
		System.out.println("���� : "+ items.length);
		
		// ordinal() : ���� ����� ������ ���ϱ�(index���� ����)
		for (Lesson k : items) {
			System.out.println(k + ":"+ k.ordinal());
		}
		
		
		
	}
}
