class Ex10{
      public static void main(String[] args){
         // �񱳿����� :  > , >= , < , <= , ==(����), !=(�����ʴ�)
         // ** �񱳿����ڸ� �� �� �ִ� �ڷ��� : char, ����, �Ǽ�
         // boolean, String�� �񱳿����ڸ� ���� �ʴ´�.
         // ** �񱳿������� ����� boolean�̴�. (90%�̻��� ���ǽĿ� ��� �ȴ�.)

         int su1 = 90 ; 
         int su2 = 80 ;
         boolean res = su1 > su2 ;
         System.out.println(res);  // true

         char ch1 = 'a';  // 97
         char ch2 = 'b';  // 98
         res = ch1 > ch2 ;
         System.out.println(res);  // false

         res = su1 < ch1 ;  // int �� char ��
         System.out.println(res);  // true

         res = su1 > 89.999999 ;  // int �� double ��
         System.out.println(res);  // true
           
          
      }
}