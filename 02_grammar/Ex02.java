class Ex02{
      public static void main(String[] args){
         // 숫자들의 크기의 따른 저장원리     
         // byte < short < char < int < long < float < double

         // 1. 자기보다 큰 자료형으로는 자유롭게 저장 할 수 있다. (자동형변환, 프로모션) 
           double s1 ;  
           s1 = 3.14 ;
           s1 = 3.14f;
           s1 = 34L;
           s1 = 3124;
           s1 = 'a' ; 
           System.out.println(s1);

       // 2. 자기보다 작은 자료형으로 저장할 때는 오류 발생한다.
       //   오류를 방지하기 위해서는 강제로 자료형을 변경해야 된다.(강제형변환,디모션,cast)
       //   강제로 자료형을 변경하면 데이터의 손실이 있을 수 있다.
       //    - 왼쪽 기준으로 자료형을 만든다. (왼쪽자료형)(데이터)
            byte b1 = (byte)(-129) ;
            System.out.println(b1);

            float f1 = (float)(341.123);
            System.out.println(f1);

       // 3. char 형변환
           char c1 = 'a' + 2 ;
           System.out.println(c1);

           char c2 = 97 + 2 ;
           System.out.println(c2);
        
       // 4. char+int = int, char+long = long 
           int k1 = 'a' + 2 ;     
           System.out.println(k1);  
           System.out.println((char)(k1));  
        
           long k2 = c1 + 2L;
           System.out.println(k2); 
           System.out.println((char)(k2)); 

       // 5. 수의 연산은 작은 자료형과 큰 자료형이 연산되면 무조건 큰자료형으로 변경된다.
       //    예외) byte, short를 연산하면 무조건 int 이상의 자료형이 나온다.
          double res1 =  240 + 3.14 ;
          float res2 = 240 + 3.14f ;
         
          byte n1 = 24 ;
          byte n2 = 30 ;
          short n3 = 70 ;
          short n4 = 50 ;

          int result = n1 + n2 ; // int = byte + byte
          result = n3 + n4 ;     // int = short + short
          result = n1 + n3 ;     // int = byte + short
          result = n4 + n2 ;     // int = short + byte

         // 소숫점 첫째자리까지만 구하기
         double res3 = 83.5555;
         int res4 = (int)(res3*10) ;
         System.out.println(res4); // 835

         // double res5 = res4 / 10 ; //  int / int => 83 이다.
         double res5 = res4 / 10.0 ;  //  int / double => 83.5
         System.out.println(res5);    // 83.0

        //  십의 자리까지만 구하기 (일의 자리 버림)
        int res6 = 17895;
        res6 = res6 / 10 ;  // int/int => 1789.5가 아니라  1789
        res6 = res6 * 10 ; 
        System.out.println(res6);

  
          
      }
}







