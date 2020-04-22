package com.ict.day03;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
	    // Map �������̽� : Key�� Value�� �����ϴ� ��ü�̴�. ���Ǵ� Key�� �ߺ��� �� ����.
		// Key�� ȣ���ϸ� Value�� ������ �����̴�.
		// key���� ������ Set���� �����Ѵ�. => keySet()
		// �߰���� : add() X,  put(key,value) ���
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("���ѹα�", "����");
		map.put("ĳ����", "��Ÿ��");
		map.put("����", "����");
		map.put("������", "����");
		
		// key�� Set ���� ��Ų��. => keySet();
		Set<String> keys  =  map.keySet();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�����Է� : ");
		String country = scan.next();
		// key�� �ش� ���� �����ϴ��� �Ǵ�����
		if(keys.contains(country)) {
			String city = map.get(country);
			System.out.println(country+"�� ������ "+city+" �Դϴ�.");
		}else {
			System.out.println(" �����Ͱ� ���� �����Դϴ�.");
		}
		
	}
}
