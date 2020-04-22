class Ex12{
      public static void main(String[] args){
         // 논리연산자 : &&(AND, 논리곱), ||(OR, 논리합), !(NOT, 논리부정)
         // 논리연산자의 대상은 boolean형,  결과 boolean형
         // 논리연산자의 대상은 비교연산자, 논리연산자, boolean형 

         // || (OR, 논리합, 합집합)
         //  - 주어진 조건들이 모두 거짓(false)일때만 결과 거짓(false)
         //  - 주어진 조건들 중 참(true)를 만나면 결과는 참(true)
         //  - 참(true)를 만나면 참(true)뒤에 존재하는 조건의 연산은 하지 않음
 
          int su1 = 10 ;
          int su2 = 7 ;
          boolean b1 = (su1>=7) || (su2>=5); // true = true && true
          System.out.println("결과 : " + b1); 

          b1 = (su1<=7) || (su2>=5);         // true = false && true
          System.out.println("결과 : " + b1);

          b1 = (su1>=7) || (su2<=5);         // true = true && false
          System.out.println("결과 : " + b1);
 
          b1 = (su1<=7) || (su2<=5);         // false = false && false
          System.out.println("결과 : " + b1);
          System.out.println("=====================");

          su1 = 10 ;
          su2 = 7 ;
          boolean res = ((su1 = su1+2) > su2) && (su1 == (su2 = su2+5));
          System.out.println("결과 : " + res); // true      
          System.out.println("su1 : " + su1); // 12       
          System.out.println("su2 : " + su2); // 7 
          System.out.println("=====================");

          // ! (NOT, 논리부정)
          //  - 주어진 논리값을 반대로 나타냄
          //  - true => false,  false => true

          res = true;
          System.out.println(res);
          System.out.println(!res);
          System.out.println(!!res);
          System.out.println(!!!res);

      }
}