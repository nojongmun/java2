class Ex13{
      public static void main(String[] args){
         // 대입연산자 : 특정 값이나 객체의 주소를 변수에 기억시킬 때 사용 (저장)
         //           =, +=, -=, *=, /=, %= 
         // 데이터 10을 su라는 변수에 대입(저장) 
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