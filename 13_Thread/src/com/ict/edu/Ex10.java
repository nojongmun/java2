package com.ict.edu;

public class Ex10  implements Runnable{
    static boolean autoSave = false;
	public static void main(String[] args) {
		// ���� ������ : �Ϲ� �������� �۾��� ���� �������� ������ �����ϴ� �����带 ���Ѵ�.
		//           �Ϲ� �����尡 ���� �Ǹ� ���� ������� ���������� �ڵ� ���� �ȴ�.
		//           ��) �������μ����� �ڵ�����, ȭ�� �ڵ� ���ŵ��� �ִ�.

		Thread t1 = new Thread(new Ex10());
		t1.setDaemon(true); // ����
		t1.start();
		for (int i = 1; i < 18; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
			if(i==5) autoSave=true;
		}
		System.out.println("���α׷� �����մϴ�.");
		
	}
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(3*1000); // 3�ʸ���.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(autoSave) {
				autoSave();
			}
		}
	}
	public void autoSave() {
		System.out.println("�۾������� �ڵ� ���� �մϴ�.");
	}
}
