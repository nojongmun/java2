package com.ict.edu2;

import java.util.ArrayList;
import java.util.List;

// �ڵ��� ���� ����
public class Car {
	// car�� ������ �ִ� ����Ʈ
	private List<String> carList = null;
	public Car() {
		carList = new ArrayList<String>();
	}
	// �������� �ڵ��� �����ϱ�
	public String getCat() {
		String carName = null;
		switch ((int)(Math.random()*3)) {
			case 0: carName="SM5"; break;
			case 1: carName="�ű׳ʽ�"; break;
			case 2: carName="ī����"; break;
		}
		return carName;
	}
	// carList���� ����  �ȱ�
	public synchronized String pop() {
		String carName = null;
		
		// car ��� ���� �� 
		if(carList.size() == 0) {
			System.out.println("���� ����� . �����Ҷ� ���� ��ٸ�����");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// ����Ʈ�� �� �������� �����ϴ� carName�� ��ȯ�ϰ� �����ϱ� (�Ǹ��Ѱ�)
		carName = (String)carList.remove(carList.size()-1);
		System.out.println("�մ��� ���� �簬���ϴ�. �Ǹ��� �� �̸���  : " + carName+"\n" );
		
		return carName;
	}
	
	// carList�� ����  ä���ֱ�
	public synchronized void push(String car) {
		// ���� car�� ����Ʈ�� �ֱ�
		carList.add(car);
		System.out.println("���� ����� �����ϴ�. ������� �� �̸��� :  "+car+"\n");
		
		// ��� �������� wait()�� �����带 �ٽ� ���� ��Ű�� ����
		if(carList.size() == 5) {
			notify();
		}
	}
}





