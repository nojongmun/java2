package com.ict.edu;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex09 {
	public static void main(String[] args) {
	  // Map �������̽� : Key�� Value�� �����ϴ� ��ý�̴�.���⿡ ��� �Ǵ� Key�� �ߺ� �ɼ� ����.
	  //    ���� Ŭ���� : HashMap : value�� key�� null�� �ѹ� ��� �Ѵ�.
      //    key�� ȣ���ؾ� value�� ���´�.
	  //    key���� ������ Set���� ���� �Ѵ�. => keySet()
	  //    add()�� �߰� ���Ѵ�.
	  //  	put(key, value) ��� �ؾߵȴ�.
		
	  // Map ���� (key�� ���ڷ�)
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		// �߰� : add() X ,  put(k,v) O;
		map.put(0, "�ѱ�");
		map.put(1, "�̱�");
		map.put(2, "�߱�");
		map.put(3, "�Ϻ�");
		map.put(4, "�ѱ�"); // value �ߺ��̶� �������.
		map.put(3, "����"); // key �ߺ� => ����Ⱑ �ȴ�.
		System.out.println(map);
		
		// �ϳ��� ȣ���ϱ� : get(key) => value�� ���´�.
		System.out.println(map.get(4));
		System.out.println(map.get("�ѱ�"));
		System.out.println("=============");
		
		// �Ϻη� key�� 0 ���� ������� ������� ������ for���� ��� �� �� �ִ�.
		for (int i = 0; i < map.size(); i++) {
			System.out.println(map.get(i));
		}
		System.out.println("================");
		for (Integer k : map.keySet()) {
			System.out.println(map.get(k));
		}
		System.out.println("================");
	    Iterator<Integer> it = map.keySet().iterator();	
	    while (it.hasNext()) {
			Integer k = (Integer) it.next();
			System.out.println(map.get(k));
		}
	    System.out.println("=========================");
	    
	    // key�� ���ڿ��� ����� ����
	    HashMap<String, String> map2 = new HashMap<String, String>();
	    map2.put("�̸�", "��浿");
	    map2.put("����", "38");
	    map2.put("�ּ�", "����� ������ ���е�");
	    map2.put("����", "��");
	    
	    System.out.println(map2.get("�̸�"));
	    System.out.println(map2.get("����"));
	    System.out.println(map2.get("�ּ�"));
	    System.out.println(map2.get("����"));
	    System.out.println("=====================");
	    
	    for (String k : map2.keySet()) {
	        System.out.println(k + ":" +map2.get(k));
		}
	    System.out.println();
	    System.out.println("=====================");
	    
	    Iterator<String> it2 = map2.keySet().iterator();
	    while (it2.hasNext()) {
			String k = (String) it2.next();
			System.out.println(k + ":" + map2.get(k));
		}
	    System.out.println("====================");
	    
	    // key���� ������ �ִ�. 
	    Set<String> set1 = map2.keySet(); 
	    System.out.println(set1);
	    
	    // value���� ������ �ִ�.
	    Collection<String> set2 = (Collection<String>)map2.values();
	    System.out.println(set2);
	}
}














