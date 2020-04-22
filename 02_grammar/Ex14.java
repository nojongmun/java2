class Ex14{
      public static void main(String[] args){
        // 삼항 연산자 (조건 연산자)
        //  - 형식 : 자료형 변수명 = 조건식 ? 참일때 실행할 문장 : 거짓일때 실행할 문장 ;
        //  - 조건식에 들어갈 자료형 : boolean형 => 비교연산자, 논리연산자, boolean형
        //  -** 변수와 참, 거짓일때 실행한 결과의 자료형은 모두 같아야 한다.

          String res =  true ? "합격" : "불합격" ;
          System.out.println(res);

          res =  false ? "합격" : "불합격" ;
          System.out.println(res);

         // true라고 해서 true의 결과는 맞고,false 결과의 자료형이 맞지 않으면 오류발생
         // res =  true ? "합격" : 10 ;

          // char는 int 보다 작은 자료형이므로 int 저장이 가능하다.
          int result = true ?  'A' : 'B' ;
          System.out.println(result);

          // 작은자료형은 큰자료형에 저장 할 수 있다. 
          double b1 = true ? 14 : 3.14 ;
          System.out.println(b1);
      }
}