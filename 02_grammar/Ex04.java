class Ex04{
      public static void main(String[] args){
        // 증감연산자 : 1씩 증가하거나, 감소하는 연산자
        //           char, 정수, 실수에 사용된다.
        // ++ 변수 : 현재값에 먼저 1 증가 시키고 나머지 연산을 한다.
        // -- 변수 : 현재값에 먼저 1 감소 시키고 나머지 연산을 한다.
        // 변수 ++ : 현재값을 가지고 연산 후 나중에 1 증가 시킨다.
        // 변수 -- : 현재값을 가지고 연산 후 나중에 1 감소 시킨다.

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