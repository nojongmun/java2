class Ex06{
      public static void main(String[] args){
          // 숫자 : 정수형(소수점이 없음) < 실수형(소숫점이 있음)
          //   - 정수형 : byte < short < int < long
          //   - 정수형의 기본은 int
          
          //   - 실수형 : float < double
          //   - 실수형의 기본은 double

          // byte : 정수형이면서 가장 작은 범위를 가지고 있다.
          //       -128 ~ 127 사이의 값만 저장 가능하다.

          byte b1 = -128 ;
          System.out.println(b1);

          b1 = 127;
          System.out.println(b1);

          // byte 범위를 벗어나서 오류
          // b1 = -129 ;
          // b1 = 128 ;

          // 계산식은 결과만 저장한다.(결과값이 범위를 벗어나서 오류) 
          // b1 = 120 + 10 ;
 
      }
}