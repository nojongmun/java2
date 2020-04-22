class Ex01{
      public static void main(String[] args){
          // 숫자 : 정수형(소수점이 없음) < 실수형(소수점이 있음)
          // - 정수형 : byte < short < int < long
          //   정수형의 기본은 int
          
          // - 실수형 : float < double
          //   실수형의 기본은 double

          // float는 숫자 뒤에 반드시 F, f를 붙여한다.(생략하면 오류)
          float su1 = 3.14f;
          System.out.println(su1);
           
          // float는 숫자 뒤에 반드시 F, f를 붙여한다.(생략하면 오류)
          // su1 = 3.14;

          double su2 = 3.14 ;
          System.out.println(su2);

          su2 = 254.0f;
          System.out.println(su2);

      } 
}