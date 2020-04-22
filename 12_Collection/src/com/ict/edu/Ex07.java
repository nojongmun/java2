package com.ict.edu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Ex07 {
	public static void main(String[] args) {
		// List �������̽� : �迭�� ����� ����, ����,����,�߰��� �����Ӱ�, ũ�⸦ �̸� �������� �ʾƵ� ��
		// ���� Ŭ���� : Stack, ArrayList, Vector ;

		// ArrayList : �迭�� ����� ����, ��Ƽ������ ����ȭ�� �������� �ʴ´�.(1:N �ǽð� ó���� �������� ����)
		// Vector : �迭�� ����� ����, ��Ƽ������ ����ȭ �����Ѵ�.(1:N�ǽð� ó���� ����(�¶��� �¼�����))
		// ArrayList�� Vector�� ���뵵�� �ٸ��� ������ ����.

		ArrayList<String> list = new ArrayList<String>();
		// �߰�, ���� => add
		list.add("����ȣ");
		list.add("�����");
		list.add("������");
		list.add(0, "������");
		System.out.println(list);
		System.out.println("===============");

		Vector<String> vector = new Vector<String>();
		vector.add("����ȣ");
		vector.add("�����");
		vector.addElement("������");
		vector.add(0, "������");
		System.out.println(vector);
		System.out.println("===============");

		// �˻�
		if (list.contains("�����")) {
			System.out.println(list.indexOf("�����") + "��° ��ġ");
			System.out.println(list.lastIndexOf("�����") + "��° ��ġ");
			System.out.println(list.get(2));
			// System.out.println(list.elementAt(2));
			// System.out.println(list.firstElement());
			// System.out.println(list.lastElement());
		}
		System.out.println("===============");

		// �˻�
		if (vector.contains("�����")) {
			System.out.println(vector.indexOf("�����") + "��° ��ġ");
			System.out.println(vector.lastIndexOf("�����") + "��° ��ġ");
			System.out.println(vector.get(2));
			System.out.println(vector.elementAt(2));
			System.out.println(vector.firstElement());
			System.out.println(vector.lastElement());
		}
		System.out.println("===============");
		
		// ġȯ
		list.set(1, "�ڼ���");
		System.out.println(list);
		
		vector.set(1, "�ڼ���");
		vector.setElementAt("���θ�",1);
		System.out.println(vector);
		
		// �ߺ� ����
		list.add(0,"������");
		list.add(3,"������");
		list.add("������");
		System.out.println(list);
		
		vector.add(0,"�̽¿�");
		vector.add(3,"�̽¿�");
		vector.add("�̽¿�");
		System.out.println(vector);
		System.out.println("================");
		
		// �뷮, ũ��
		System.out.println(list.size());         // ũ��
		// System.out.println(list.capacity());  // �뷮
		System.out.println("=================");
		
		System.out.println(vector.size());      // ũ��
		System.out.println(vector.capacity());  // �뷮
		vector.add(0,"�̽¿�");
		vector.add(3,"�̽¿�");
		vector.add("�̽¿�");
		vector.add("�̽¿�");
		System.out.println("=================");
		System.out.println(vector.size());      // ũ��
		System.out.println(vector.capacity());  // �뷮
		
		// ���
		for (String k : vector) {
			System.out.println(k);
		}
		System.out.println("=======================");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String k = (String) it.next();
			System.out.println(k);
		}
		
	}
}






