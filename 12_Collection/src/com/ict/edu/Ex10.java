package com.ict.edu;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Ex10 {
	public static void main(String[] args) {
		// ���ѹα�, ĳ����, ����, �������� ������ ���� HashMap ����ǵ��� �ϰ�, 
		// ���ϴ� ���� key���� �Ǿ� , ȭ�鿡�� ���� ����� ������ ��µǴ� ���α׷��� �ۼ�
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("���ѹα�", "����");
		map.put("ĳ����", "��Ÿ��");
		map.put("����", "����");
		map.put("������", "����");
		
		Set<String> keys = map.keySet();
		
		esc:
		while (true) {
			System.out.print("�����Է� : ");
			String str = sc.next();
			if(keys.contains(str)) {
				String res = map.get(str);
				System.out.println(str+"�� ������ "+ res + "�Դϴ�.");
			}else {
				System.out.println("�����Ϳ� ���� ���� �Դϴ�.");
			}
			while (true) {
				System.out.print("����ұ��?(y/n) >> ");
				String msg = sc.next();
				if(msg.equalsIgnoreCase("y")) {
					continue esc;
				}else if(msg.equalsIgnoreCase("n")) {
					break esc;
				}else {
					continue;
				}
			}
		}
		System.out.println("�����ϼ̽��ϴ�.");
	}
}
