package com.ict.edu2;

// ������
public class Producer implements Runnable{
	private Car car;
	// �����ڿ��� ���� ���ڴ� ���� ���������� ����� �ش�.
	public Producer(Car car) {
		this.car = car ;
	}
	@Override
	public void run() {
		String carName = null ;
		for (int i = 0; i < 50; i++) {
			// car ����
			carName = car.getCat();
			// ������ car�� ����Ʈ�� �ִ� �޼ҵ�
			car.push(carName);
			try {
				Thread.sleep((int)(Math.random()*300));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
