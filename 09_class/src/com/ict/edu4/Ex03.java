package com.ict.edu4;

// �������̽��� ���
// 1. �Ϲ�Ŭ������ �������̽��� ��� ������ �ݵ�� �������̵� �ؾ� �ȴ�.(implements ����� ��� ) 
class Ex03 implements Ex01{
	@Override
	public void play2() { 	}
	@Override
	public void sound() {	}
}

// 2. �߻�Ŭ������ �������̽��� ��� ������ �������̵� �� �ʿ䰡 ����.(implements ����� ��� )
abstract class Ex04 implements Ex01{
	int s1 = 10 ;             // �ν��Ͻ� ����
    static int s2 = 20 ;      // static ����
    final int s3 = 30 ;       // �ν��Ͻ� ���
    static final int s4 = 40 ;// static ���

    public abstract void leftSound() ; // �߻�޼ҵ�
    
}

abstract class Ex05 implements Ex01{
	int n1 = 10 ;             // �ν��Ͻ� ����
    static int n2 = 20 ;      // static ����
    final int n3 = 30 ;       // �ν��Ͻ� ���
    static final int n4 = 40 ;// static ���
}

// 3. �������̽��� �������̽��� ��ӹ����� �������̵� �� �ʿ䰡 ����.(extends ����� ���)
interface Ex06 extends Ex01{
	
}

// 2��,3���� ���߿� �Ϲ� Ŭ������ ��� ������ ��� �������̵� �ؾ� �ȴ�.
class Ex07 extends Ex04{
    // Ex01 
	@Override
	public void play2() {}
    // Ex01
	@Override
	public void sound() {}
    // Ex04
	@Override
	public void leftSound() {}
}

class Ex08 extends Ex05{
     // Ex01
	@Override
	public void play2() {}
     // Ex01
	@Override
	public void sound() {}
}
 
class Ex09 implements Ex06{
	 // Ex01
	@Override
	public void play2() {}
	 // Ex01
	@Override
	public void sound() {}
	
}



