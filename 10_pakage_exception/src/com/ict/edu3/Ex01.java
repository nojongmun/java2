package com.ict.edu3;

// ����ó�� : Exception() => try ~ catch ~
//    ���� : ���������� ���Ḧ �������� ����� �����ϰ�, ���� �߻��� ���ܿ� ���� ó���� ���ش�.
//    ���� : 
//    try{
//        ���� �߻� ������ ���� ;
//        ���ܰ� �߻��Ǹ� ���� �߻� ���� �Ʒ��� �����ϴ� ������� �����ϰ� �ٷ� catch������ �̵��Ѵ�.;
//        ���� �߻� ������ ���� ;
//        ���� �߻� ������ ���� ;
//    }catch(���ܹ߻�  e){
//      ���� �߻��� ó���ϴ� ����;
//    }

public class Ex01 {
	public static void main(String[] args) {
		try {
			int[] var = {10,20,30};
			for (int i = 0; i <= var.length; i++) {
				System.out.println(1);
				System.out.println(2);
				System.out.println("var[" + i + "] = " + var[i]);
				System.out.println(3);
				System.out.println(4);
			}
		} catch (Exception e) {
			System.out.println("���ܹ߻� : " + e);
		}
		
		System.out.println("���� �ϼ̽��ϴ�.");
	}
}




