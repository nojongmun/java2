class Ex05{
      public static void main(String[] args){
         // 문자를 변수에 저장하기
         // 문자 => char 선언
         // char에 들어가는 데이터는 0 - 65535 의 숫자 값이다.
         // 문자형태로 저장하기 위해서는 반드시 ''(홑따옴표)를 사용한다.
         // 문자란 반드시 한 글자를 의미하다.
         // ex) 'a', 'A',  '1', '가', '大'  =>  O,  '10' => X

          char k1 ; // 선언
          k1 = 'a'; // a가 k1에 저장되는 것이 아니라 a에 해당하는 숫자가 k1에 저장된다.
                    // 문자에 숫자를 대칭 시킨 것을 문자코드표(유니코드)라고 한다.
          System.out.println(k1);

          char k2 = 97;
          System.out.println(k2); 
   
          char k3 = '\u0042';
          System.out.println(k3); 

          char k4 = '\u0062';
          System.out.println(k4); 

      }
}