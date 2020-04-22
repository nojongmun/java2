class Ex11{
      public static void main(String[] args){
         // 논리연산자 : &&(AND, 논리곱), ||(OR, 논리합), !(NOT, 논리부정)
         // 논리연산자의 대상은 boolean형,  결과 boolean형
         // 논리연산자의 대상은 비교연산자, 논리연산자, boolean형                  

         // &&(AND, 논리곱, 교집합)
         //  - 주어진 조건들이 모두 참(true)이 일때만 결과가 참(true)
         //  - 주어진 조건들 중에 거짓(false)를 만나면 결과는 거짓(false)
         //  - false를 만나면 false 다음에 존재하는 조건의 연산은 하지 않음
         //  - 'a>=10  && a<=20' 는 a의 범위를 10-20까지를 말하는 것

          int su1 = 10 ;
          int su2 = 7 ;
          boolean b1 = (su1>=7) && (su2>=5); // true = true && true
          System.out.println("결과 : " + b1);  

          b1 = (su1<=7) && (su2>=5); // false = false && true
          System.out.println("결과 : " + b1); 

          b1 = (su1>=7) && (su2<=5); // false = true && false
          System.out.println("결과 : " + b1); 
     
          b1 = (su1<=7) && (su2<=5); // false = false && false
          System.out.println("결과 : " + b1); 
          System.out.println("========================");

          su1 = 10 ;
          su2 = 7 ;
          boolean res = ((su1 = su1+2) > su2) && (su1 == (su2 = su2+5));
          System.out.println("결과 : " + res); // true      
          System.out.println("su1 : " + su1); // 12       
          System.out.println("su2 : " + su2); // 12 

          su1 = 10 ;
          su2 = 7 ;
          res = ((su1 = su1+2) < su2) && (su1 == (su2 = su2+5));
          System.out.println("결과 : " + res); // false      
          System.out.println("su1 : " + su1); // 12       
          System.out.println("su2 : " + su2); // 7
          
          su1 = 13 ;
          // su1의 범위가 10 - 15 까지 
          res = (su1>=10) && (su1<=15);
          System.out.println("결과 : " + res); // true

          su1 = 17 ;
          // su1의 범위가 10 - 15 까지 
          res = (su1>=10) && (su1<=15);
          System.out.println("결과 : " + res);   // false  
          
         // c1인 소문자 이다. 
          char c1 = 'p';
          res = (c1>='a') && (c1<='z') ;
          System.out.println("결과 : " + res);   // true

          c1 = 'Q';
          res = (c1>='a') && (c1<='z') ;
          System.out.println("결과 : " + res);  // false
      }
}






