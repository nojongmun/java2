class Ex13{
      public static void main(String[] args){
         // ���Կ����� : Ư�� ���̳� ��ü�� �ּҸ� ������ ����ų �� ��� (����)
         //           =, +=, -=, *=, /=, %= 
         // ������ 10�� su��� ������ ����(����) 
         int su = 10 ;

          su += 10 ;   // su = su + 10 ;
          System.out.println("su = " + su);  // 20

          su -= 10 ;   // su = su - 10 ;
          System.out.println("su = " + su);  // 10

          su *= 10 ;   // su = su * 10 ;
          System.out.println("su = " + su); // 100

          su /= 10 ;   // su = su / 10 ;
          System.out.println("su = " + su); // 10

          su %= 10 ;   // su = su % 10 ;
          System.out.println("su = " + su);  // 0

      }
}