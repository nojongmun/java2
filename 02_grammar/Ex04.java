class Ex04{
      public static void main(String[] args){
        // ���������� : 1�� �����ϰų�, �����ϴ� ������
        //           char, ����, �Ǽ��� ���ȴ�.
        // ++ ���� : ���簪�� ���� 1 ���� ��Ű�� ������ ������ �Ѵ�.
        // -- ���� : ���簪�� ���� 1 ���� ��Ű�� ������ ������ �Ѵ�.
        // ���� ++ : ���簪�� ������ ���� �� ���߿� 1 ���� ��Ų��.
        // ���� -- : ���簪�� ������ ���� �� ���߿� 1 ���� ��Ų��.

         int su1 = 10 ;
         int su2 = 10 ;

         System.out.println(++ su1);  // 11
         System.out.println(su2 ++);  // 10

         System.out.println(su1);  // 11
         System.out.println(su2);  // 11

         char ch1 = 'd';
         char ch2 = 'd';

         System.out.println(++ ch1);  // e
         System.out.println(ch2 ++);  // d

         System.out.println(ch1);     // e
         System.out.println(ch2);     // e
     }
}