class Ex14{
      public static void main(String[] args){
        // ���� ������ (���� ������)
        //  - ���� : �ڷ��� ������ = ���ǽ� ? ���϶� ������ ���� : �����϶� ������ ���� ;
        //  - ���ǽĿ� �� �ڷ��� : boolean�� => �񱳿�����, ��������, boolean��
        //  -** ������ ��, �����϶� ������ ����� �ڷ����� ��� ���ƾ� �Ѵ�.

          String res =  true ? "�հ�" : "���հ�" ;
          System.out.println(res);

          res =  false ? "�հ�" : "���հ�" ;
          System.out.println(res);

         // true��� �ؼ� true�� ����� �°�,false ����� �ڷ����� ���� ������ �����߻�
         // res =  true ? "�հ�" : 10 ;

          // char�� int ���� ���� �ڷ����̹Ƿ� int ������ �����ϴ�.
          int result = true ?  'A' : 'B' ;
          System.out.println(result);

          // �����ڷ����� ū�ڷ����� ���� �� �� �ִ�. 
          double b1 = true ? 14 : 3.14 ;
          System.out.println(b1);
      }
}