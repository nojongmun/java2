class Ex06{
      public static void main(String[] args){
        // 이름이 홍길동인 사람의 점수가 국어 90점, 영어 80점, 수학 80점이다.
        // 총점과 평균을 구하자
        // 출력은 이름, 총점, 평균 만 출력하자(단, 평균은 소숫점 첫째자리까지 구하자) 

        // 입력 
         String name = "홍길동"; 
         int kor = 90 ;
         int eng = 80 ;
         int math = 80 ;

        // 처리 : 비즈니스 로직
        // int sum = 90 + 80 + 80 ;
         int sum = kor + eng + math ;
        
        //  소수점 첫째자리을 구하지 못함
        // int avg = sum / 3 ;
        // double avg = sum / 3 ;

        //  소수점 첫째자리을 구함
        //  double avg = sum / 3.0 ;
        //  avg = (int)(avg*10)/10.0 ;
          double avg = (int)(sum/3.0*10) / 10.0;

        // 출력
         System.out.println("이름 : " + name);
         System.out.println("총점 : " + sum);
         System.out.println("평균 : " + avg);


     }
}







