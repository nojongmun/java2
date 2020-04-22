class Ex04{
      public static void main(String[] args){
         // 변수와 상수 : 데이터 저장할 수 있는  기억공간
         // 변수 : 데이터를 저장할 수 있는 기억공간, 데이터를 변경해서 저장 할 수 있다.
         // 상수 : 데이터를 저장할 수 있는 기억공간, 데이터를 변경할 수 없다.

         // 자료을 데이터에 저장하기 
         // 1. 선언 :  자료형 이름 ;    // 선언은 처음 한번만 하면 된다. 
         // 2. 저장 :  이름 = 데이터 ;

         // 선언과 저장을 한번에 : 자료형 이름 = 데이터 ;    

         // 논리형 데이터를 저장하기 
         // 자바에서 논리형이란 참(true), 거짓(false)을 말한다.
         // 논리형에 해당 되는 키워드는 boolean 이다.
         // 논리형 데이터는 '조건식'에 사용된다.
          boolean res ;
          res = true ;
          
         // 저장된 자료형 불러오기(호출) => 가지고 있는 데이터가 나옴 
         System.out.println(res); 

         // 기존에 변수에 다른 값을 넣자
         res = false ;
         System.out.println(res); 

        // boolean res2 = 10 ;
        // System.out.println(res2);
     }
}





