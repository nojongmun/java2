class Ex07{
     public static void main(String[] args){
          // 숫자 : 정수형(소수점이 없음) < 실수형(소숫점이 있음)
          //   - 정수형 : byte < short < int < long
          //   - 정수형의 기본은 int
          
          //   - 실수형 : float < double
          //   - 실수형의 기본은 double

          // short의 범위 -32768 ~ 32767 사이의 값만 저장 할 수 있다.
          short k1 = -32768;
          System.out.println(k1);

          k1 = 32767;
          System.out.println(k1);
          
          // 범위를 벗어나서 오류 발생 
          // k1 = -32769 ;
          // k1 = 32768 ;
    }
}