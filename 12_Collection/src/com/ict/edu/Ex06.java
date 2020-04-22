package com.ict.edu;

import java.util.Iterator;
import java.util.Stack;

public class Ex06 {
	public static void main(String[] args) {
		// List �������̽� : �迭�� ����� ����, ����,����,�߰��� �����Ӱ�, ũ�⸦ �̸� �������� �ʾƵ� ��
		// ���� Ŭ���� : Stack, ArrayList, Vector ;
		
		// Stack : LIFO(LastInFristOut) : �������� ���� ������ ���� ������ ����
		// add,push, addElement => �߰�(append)
		// add(index, E) => ����(insert)
		// *pop : ������ �����ϴ� ��ü�� ��ȯ, �������� ��
		// *peek : ������ �����ϴ� ��ü�� ��ȯ
		// *search : �˻�  (������ 1���ͽ���)
		// *indexOf : �˻� (����  0���� ����)
		// *elementAt(index) => �˻� (����  0���� ����)
		// *get(index) => �˻� (����  0���� ����)
		// firstElement() => ó�����
	    // lastElement() => ���������
		// *setElement(Element,index) => ġȯ 	
		
		Stack<String> st = new Stack<String>(); 
		// set �ٸ��� ������ �ִ�.
		st.add("�Ѹ�");
		st.addElement("������");
		st.push("������");
		System.out.println(st);
		st.add(0, "��浿");
		st.add(3, "����");
		System.out.println(st);
		System.out.println("==========");
		
		// ������ ��ü ���� : pop(��������), peek
		System.out.println(st.peek());
		System.out.println(st);
		System.out.println("---------------");
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println("==========");
		
		// �˻�
		if(st.contains("�Ѹ�")) {
			System.out.println(st.indexOf("�Ѹ�")+"��° ��ġ");
			System.out.println(st.search("�Ѹ�")+"��° ��ġ");
			System.out.println(st.elementAt(3));
			System.out.println(st.get(3));
			System.out.println(st.firstElement());
			System.out.println(st.lastElement());
			System.out.println(st.get(st.size()-1));
		}else {
			System.out.println("�������� �ʽ��ϴ�.");
		}
		System.out.println("==========");
		
		// ġȯ 
		st.setElementAt("�����", 2);
		System.out.println(st);
		
		// �ߺ� ����
		st.add("�Ѹ�");
	    st.add(0, "�Ѹ�");
		System.out.println(st);
		System.out.println("==========");
		
		// ���
		for (String k : st) {
			System.out.println(k);
		}
		System.out.println("=============");
		Iterator<String> it = st.iterator();
		while (it.hasNext()) {
			String k = (String) it.next();
			System.out.println(k);
		}
		System.out.println("=============");
		// �Ųٷ� �����鼭 ����
		while (! st.isEmpty()) {
			// st.peek()�� ���� ������ ������.
			String k = st.pop();
			System.out.println(k);
			System.out.println("pop�� ���� �ϹǷ� ũ��� "+ st.size() + "�̴�.");
		}
	}
}














