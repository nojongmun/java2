package com.ict.edu;

public class Ex07 {
	public static void main(String[] args) {
		// while��  : for���� ���� �ݺ���
		// while���� ���� ������ ���ǽ����� �̵�
		
		// for(�ʱ��; ���ǽ� ; ������){
		//      ���ǽ��� ���϶� ����
		// }
		
		// �ʱ��                                              �ʱ��
		// while(���ǽ�){               while(true){
		//   ���ǽ��� ���϶� ������ ���� ;      if(�������� ����) break; 
		//   ������                                             ������ ����;
		//  }                           ������;           
	    //                           }    
		
		// 0-10�� ����ϱ�
		int i=0;
		while (i<11) {
			System.out.println(i);
			i++;
		}
		System.out.println("=====================");
		i=0;
		while (true) {
			if(i>=11) break;
			System.out.println(i);
			i++;
		}
		System.out.println("=====================");
		
		// 0-10���� ¦���� ����ϱ�
		i=0;
		while (i<11) {
			if(i%2 == 0) {
			   System.out.println(i);
			}
			i++;
		}
		System.out.println("=====================");
		i=0;
		while (true) {
			if(i>=11) break;
			if(i%2==0)  
				System.out.println(i);
			i++;
		}
		System.out.println("=====================");
		
		// a-g���� ���
		char j='a';
		while (j<'h') {
			System.out.println(j);
			j++;
		}
		System.out.println("=====================");
		j='a';
		while (true) {
			if(j>='h')    break;
			System.out.println(j);
			j++;
		}
		System.out.println("=====================");
		
		// 5�����
		i = 1 ;
		while (i<10) {
			System.out.println("5 * "+ i + " = "+ (5*i));
			i++;
		}
		System.out.println("=====================");
		i = 1 ;
		while (true) {
			if(i>=10)  break;
			System.out.println("5 * "+ i + " = "+ (5*i));
			i++;
		}
		System.out.println("=====================");
		
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		i=1;
		while (i<5) {
			System.out.println("0 0 0 0");
			i++;
		}
		System.out.println("=====================");
		i = 1 ;
		while (true) {
			if(i>=5)  break;
			System.out.println("0 0 0 0");
			i++;
		}
		System.out.println("=====================");
		
		// 0-10���� ������ ���ϱ�
		i = 0 ;
		int sum = 0 ;
		while (i<11) {
			sum = sum + i ;
			i++;
		}
		System.out.println("sum : " + sum);
		System.out.println("=====================");
		i = 0 ;
		sum = 0 ;
		while (true) {
			if(i>=11) break;
			sum = sum + i ;
			i++;
		}
		System.out.println("sum : " + sum);
		System.out.println("=====================");
	}
}









