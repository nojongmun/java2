package com.ict.edu;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;


public class Ex02 {
	public static void main(String[] args) {
		// Set �������̽��� ������ Ŭ���� : HashSet, TreeSet ;
		// Ư¡ : �ߺ�����ȵ�, Ư���������� ������ �� ����(TreeSet�� ������ �������� ���ĵ�)
		
		// �÷��� ���� :  HashSet<���״�=��üŸ��=Ŭ����> �������� = new HashSet<[��üŸ��]>();
		 HashSet<String> t1 = new HashSet<String>();
		 HashSet<Integer> t2 = new HashSet<Integer>();
		 HashSet<Double> t3 = new HashSet<Double>();
		 TreeSet<Boolean> t4 = new TreeSet<Boolean>();
		 TreeSet<Character> t5 = new TreeSet<Character>();
		 
		 // �÷��ǿ� ��ü �߰�(add)
		 String s1 = "�Ѹ�";
		 String s2 = new String("����");
		 t1.add(s1);
		 t1.add(s2);
		 t1.add("������");
		 // t2.add(s1); => ���״��� ���� �ʾƼ� ����
		 // t3.add(s1); => ���״��� ���� �ʾƼ� ����
		 // t4.add(s1); => ���״��� ���� �ʾƼ� ����
		 // t5.add(s1); => ���״��� ���� �ʾƼ� ����
		 
		 Integer k1 = new Integer(10);
		 Integer k2 = new Integer("20");
		 t2.add(k1);
		 t2.add(k2);
		 t2.add(new Integer(30));
		 t2.add(40); // ����ڽ� : �ڵ����� ��ü�� �Ǿ ����.
		 int k3 = 50 ;
		 t2.add(k3); // ����ڽ� : �ڵ����� ��ü�� �Ǿ ����.
		 
		 Double d1 = new Double(3.142);
		 t3.add(d1);
		 t3.add(3.14);// ����ڽ� : �ڵ����� ��ü�� �Ǿ ����.
		 // t3.add(3); // ������ �ٸ��� �� ����.
		 
		 // �÷��� ��ü ���� ����
		 System.out.println(t1);
		 System.out.println("==========");
		 System.out.println(t2);
		 System.out.println("==========");
	 	 // �ϳ���  ����
		 // ������ for�� ���
		 for (String k : t1) {
			System.out.println(k);
		}
		 System.out.println("==========");
		 Iterator<String> it = t1.iterator();
		 while (it.hasNext()) {
			String str = (String) it.next();
			System.out.println(str);
		}
		 
		 
		 
		
	}
}
