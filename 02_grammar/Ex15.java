class Ex15{
      public static void main(String[] args){
          // ���� ������ ����
          // int k1�� Ȧ�� ����, ¦�� ���� �Ǻ�����
          int k1 = 7 ;
          String res = ( k1%2 == 0  )?("¦��") : ("Ȧ��") ; 
          System.out.println("��� : " + res);

          // int k2�� ������ 60�̻��̸� �հ�, �ƴϸ� ���հ�
          int k2 = 70 ;
          res = ( k2 >= 60 ) ?  ("�հ�")  :  ("���հ�")  ;
          System.out.println("��� : " + res);

          // � ���� k3�� �빮������, �빮�ڰ� �ƴ��� �Ǻ�����
          char k3 = 'P' ;
          res = ( k3>='A' && k3<='Z') ?  ("�빮��")  :  ("�빮�ھƴ�")  ;
          System.out.println("��� : " + res);

          // int k4�� 1 �Ǵ� 3 �̸� ����, �ƴϸ� ����
          int k4 = 1 ;
          res =  (k4==1 || k4==3) ?  ("����")  :  ("����")  ;
          System.out.println("��� : " + res);

          // �ٹ��ð��� 8�ð������� 8350���̰�, 8�ð��� �ʰ��ϸ� 
          // �ʰ��� �ð� ��ŭ�� 1.5�踦 �����Ѵ�.
          // ���� �ٹ��� �ð��� 10�ð��̴�. 
          // �󸶸� �޾ƾ� �ϴ°�?
          int time = 10 ;
          int dan = 8350 ;
          int pay =  (time <= 8) ?  time * dan : 
                     (8 * dan)+ (int)((time-8)*dan*1.5) ;
          System.out.println("��� : " + pay);
      }
}




