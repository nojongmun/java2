class Ex15{
      public static void main(String[] args){
          // 삼항 연산자 예제
          // int k1가 홀수 인지, 짝수 인지 판별하자
          int k1 = 7 ;
          String res = ( k1%2 == 0  )?("짝수") : ("홀수") ; 
          System.out.println("결과 : " + res);

          // int k2의 점수가 60이상이면 합격, 아니면 불합격
          int k2 = 70 ;
          res = ( k2 >= 60 ) ?  ("합격")  :  ("불합격")  ;
          System.out.println("결과 : " + res);

          // 어떤 문자 k3가 대문자인지, 대문자가 아닌지 판별하자
          char k3 = 'P' ;
          res = ( k3>='A' && k3<='Z') ?  ("대문자")  :  ("대문자아님")  ;
          System.out.println("결과 : " + res);

          // int k4가 1 또는 3 이면 남성, 아니면 여성
          int k4 = 1 ;
          res =  (k4==1 || k4==3) ?  ("남성")  :  ("여성")  ;
          System.out.println("결과 : " + res);

          // 근무시간이 8시간까지는 8350원이고, 8시간을 초과하면 
          // 초과한 시간 만큼은 1.5배를 지급한다.
          // 현재 근무한 시간이 10시간이다. 
          // 얼마를 받아야 하는가?
          int time = 10 ;
          int dan = 8350 ;
          int pay =  (time <= 8) ?  time * dan : 
                     (8 * dan)+ (int)((time-8)*dan*1.5) ;
          System.out.println("결과 : " + pay);
      }
}




