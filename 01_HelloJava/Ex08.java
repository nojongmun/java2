class Ex08{
      public static void main(String[] args){
         // 숫자 : 정수형(소수점이 없음) < 실수형(소숫점이 있음)
         //   - 정수형 : byte < short < int < long
         //   - 정수형의 기본은 int
          
         //   - 실수형 : float < double
         //   - 실수형의 기본은 double 

         // int, long은 범위 외울 필요가 없다.
         // 일반적인 정수는 int 라고 생각하면 된다.

         int k1 = 128 ; // byte 초과
         System.out.println(k1);

         k1 = 32768 ;  // short 초과
         System.out.println(k1);

        // long : int 보다 더 넓은 범위를 가지고 있음
        //        숫자 뒤에 L 또는 l 를 붙인다. (생략 가능하다.)
        long k2 = 128L ; // byte 초과
        System.out.println(k2);

        k2 = 32768l; // short 초과
        System.out.println(k2);

        k2 = 127;
        System.out.println(k2);
  
       // k2 = 127.0;     

    }
}






