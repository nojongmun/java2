class Ex03{
      public static void main(String[] args){
         // 참조 자료형 : 클래스를 자료형으로 사용한다.
         // String 클래스 : 문자열을 처리하는 기능을 가지고 있는 클래스
         
         // String 클래스는 클래스이지만 기본 자료형처럼 사용할 수 있다.
         // String 클래스를 자료형처럼 사용하기 위해서는 반드시 "" 사용해야 된다.

         String str = "hello";
         System.out.println(str);

         int su = 24 ;
         System.out.println(su);

         // String 연산 :  + (덧셈이 아니라, 문자연결자 라고 함) 
         //            :  + 연산의 결과는 무조건 String 이다.
         //               -, * , / , % 는 없음   

         str = "1000";
         su = 1000;
         System.out.println(str+100); 
         System.out.println(su+100);

        int su1 = 20 ;
        int su2 = 4 ;
        int res = su1 + su2 ;

        System.out.println(su1 + su2);
        System.out.println("결과 : "+su1 + su2);
        System.out.println("결과 : "+(su1 + su2));
        System.out.println("결과 : "+ res);
      }
}





