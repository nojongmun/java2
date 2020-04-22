package com.ict.edu;

 // �Ӱ迵�� : ��Ƽ�����忡�� �������� ���Ǵ� ����
 //          ���� ���� ���� �����尡 ���İ��� �ٸ� �����忡�� ������� ���ѱ��.
//           �̷��� ��� �ǽð� ó�������� ������ �߻��� �� �ִ�.
//           �̸� �ذ��ϱ� ���� ����� ����ȭ ó���̴�.

// ����ȭ ó�� : �Ӱ迵���� synchronized ������� ����ϹǷν�
//            ���� ���� ���� �����尡 ������ ���� �ٸ� ������� ���� �Ұ� ����(���� �ɸ� ����)�� �ȴ�.

// ����ȭ ó���϶�  ���� �������� �����带 ������ �����·� �����Ű�� �޼ҵ� : wait()
// �����¸� Ǯ��������  �ش� ������ �״�� �����¿��� ������.
// �׷��� �������� �����带 Ǯ���ִ� �޼ҵ� : notify(), notifyAll(); 
public class Ex12 implements Runnable {
	int x=0;
	
	// �Ӱ迵��
	@Override
	public synchronized void  run() {
	    for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName()+":"+(x++));
			if(x == 10) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else {
				notify();
			}
			
		}	
	}
	public static void main(String[] args) {
		Ex12 t1 = new Ex12();
		new Thread(t1, "dog").start();
		new Thread(t1, "cat").start();
		new Thread(t1, "tiger").start();
		new Thread(t1, "lion").start();
	}
}





