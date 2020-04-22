class Ex08{
      public static void main(String[] args){
         // 3989초는 몇시간, 몇분, 몇초인가?
         // 시간
          int time = 3989 ;
          int h = time / (60 * 60) ; // 시간
          int res = time % (60 * 60) ; // 나머지

         // 나머지를 가지고 분, 초
          int m = res / 60 ; // 분
          int s = res % 60 ; // 초  

          System.out.println("3989초는 "+h+"시"+m+"분"+s+"초 입니다.");        

     }
}