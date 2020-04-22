class Ex05{
      public static void main(String[] args){
         // 산술연산자 :  +, -, * , / , %(나머지)
         //  char형, 정수, 실수 사용가능
        int su1 = 9 ;
        int su2 = 4 ;
        int result = 0 ;

        result = su1 + su2 ;
        result = su1 - su2 ;    
        result = su1 * su2 ;

        result = su1 / su2 ;  // int / int => int (몫)
        System.out.println(result);
      
        result = su1 % su2 ;  // 나머지
        System.out.println(result);

        // 만약에 정확한 값을 알고 싶으면 결과를 double로 저장하는 것이 맞다
        double res = su1 / su2 ;
        System.out.println(res); // 2.0

        // su1이나 su2 둘 중에 하나를 형변환 해야됨 
        res = su1 / (double)(su2) ;
        System.out.println(res); 
            
      }
}