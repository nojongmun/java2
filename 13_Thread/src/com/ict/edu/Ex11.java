package com.ict.edu;

 // �Ӱ迵�� : ��Ƽ�����忡�� �������� ���Ǵ� ����
 //          ���� ���� ���� �����尡 ���İ��� �ٸ� �����忡�� ������� ���ѱ��.
//           �̷��� ��� �ǽð� ó�������� ������ �߻��� �� �ִ�.
//           �̸� �ذ��ϱ� ���� ����� ����ȭ ó���̴�.

// ����ȭ ó�� : �Ӱ迵���� synchronized ������� ����ϹǷν�
//            ���� ���� ���� �����尡 ������ ���� �ٸ� ������� ���� �Ұ� ����(���� �ɸ� ����)�� �ȴ�.
public class Ex11 implements Runnable {
	int x;
	
	// �Ӱ迵��
	@Override
	public synchronized void  run() {
	    for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName()+":"+(x++));
		}	
	}
	public static void main(String[] args) {
		Ex11 t1 = new Ex11();
		new Thread(t1, "dog").start();
		new Thread(t1, "cat").start();
		new Thread(t1, "tiger").start();
		new Thread(t1, "lion").start();
	}
}





