class Ex07{
      public static void main(String[] args){
         // 카페모카가 4500원이다. 친구와 둘이서 10000원을 내고 먹었다.
         // 잔돈은 얼마인가 ? (단, 전체금액에 10% 부가세포함 시키자)
          
         // 입력 정보
         int input = 10000;
         int dan = 4500;
         int su = 2 ;

         int total = dan * su ;
         int vat = (int)(total * 0.1) ;
         int output =  input - (total + vat);
         System.out.println("잔돈 : " + output);
        
     }
}