package com.ict.edu;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex08 {
	public static void main(String[] args) {
		// Queue(ť) �������̽� : FIFO(���Լ���)=>���� ���� ������ ���� ������.
		//          ���� Ŭ���� : LinkedList
		LinkedList<String> list  = new LinkedList<String>();
		// �߰�, ���� : add,addFirst, addLast,offer, offerFirst,offerLast
		list.add("��浿");
		list.add("�����");
		list.offer("������");
		list.addFirst("��ġ");
		list.offerFirst("������");
		list.addLast("�öѱ����");
		list.offerLast("��浿");
		System.out.println(list);
		
		// �������� �˻�
		if(list.contains("��浿")) {
			System.out.println(list.indexOf("��浿")+"��° ��ġ");
			System.out.println(list.lastIndexOf("��浿")+"��° ��ġ");
			System.out.println(list.getFirst());
			System.out.println(list.getLast());
			System.out.println(list.get(3));
		}
		System.out.println("=====================");
		// ���� : remove(Object), remove(index), removeFirst(), removeLast();
		list.removeFirst();
		list.removeLast();
		list.remove("�öѱ����");
		list.remove(2);
		System.out.println(list);
		
		// ���
		for (String k : list) {
			System.out.println(k);
		}
		System.out.println("================");
		
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String k = (String) it.next();
			System.out.println(k);
		}
	}
}








