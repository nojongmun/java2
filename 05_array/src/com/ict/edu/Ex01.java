package com.ict.edu;

public class Ex01 {
	public static void main(String[] args) {
		// �迭 :���� �ڷ����� �����͸� �� ���� ��Ƶ� ����
		//      �ݵ�� ���� �ڷ����� ���� �� �� �ִ�.
		//      �����Ҷ� ũ�⸦ �����ؾ� �ǰ�, ������ ũ��� ������� �ʴ´�.
		//      �迭�� ����� �Ϲ������� for���� ����Ѵ�.
		
		// �迭 ���� ���� : ���� => ���� => ������ ����
		
		// 1. ���� : �ڷ���[] �̸� ;  �Ǵ�   �ڷ��� �̸�[];
		int[] su ;
      
		// 2. ����  :  su = new �ڷ���[�迭��ũ��=���� ��=1���� ����]
		// �迭�� �ּҰ� �迭�̸��� �̿��ؼ� ����ȴ�.
		su = new int[4];
		
		// 3. ������ ���� : �迭�̸�[���ȣ=index=���ؽ�=0���ͽ���] = ������ ;
		su[0] = 10 ;
        su[1] = 20 ;				
        su[2] = 'c'; 				
        su[3] = 40 ;
        
        // su���� �迭�� �ּҰ� �ִ�.
        System.out.println(su);
        
        // su�� index�� ������ �����Ͱ� ���´�.
        System.out.println(su[0]);
        System.out.println(su[1]);
        System.out.println(su[2]);
        System.out.println(su[3]);
        System.out.println("===============");
        
        // for�� ���
        // �迭�̸�.length => �迭�� ũ��
        for (int i = 0; i < su.length; i++) {
			System.out.println(su[i]);
		}
        System.out.println("===============");
        
        // ������ for�� (foreach) : => �ַ� �迭�� ���� ���
        for (int i : su) {
			System.out.println(i);
		}
	}
}





