class Ex02{
      public static void main(String[] args){
         // ���ڵ��� ũ���� ���� �������     
         // byte < short < char < int < long < float < double

         // 1. �ڱ⺸�� ū �ڷ������δ� �����Ӱ� ���� �� �� �ִ�. (�ڵ�����ȯ, ���θ��) 
           double s1 ;  
           s1 = 3.14 ;
           s1 = 3.14f;
           s1 = 34L;
           s1 = 3124;
           s1 = 'a' ; 
           System.out.println(s1);

       // 2. �ڱ⺸�� ���� �ڷ������� ������ ���� ���� �߻��Ѵ�.
       //   ������ �����ϱ� ���ؼ��� ������ �ڷ����� �����ؾ� �ȴ�.(��������ȯ,����,cast)
       //   ������ �ڷ����� �����ϸ� �������� �ս��� ���� �� �ִ�.
       //    - ���� �������� �ڷ����� �����. (�����ڷ���)(������)
            byte b1 = (byte)(-129) ;
            System.out.println(b1);

            float f1 = (float)(341.123);
            System.out.println(f1);

       // 3. char ����ȯ
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

       // 5. ���� ������ ���� �ڷ����� ū �ڷ����� ����Ǹ� ������ ū�ڷ������� ����ȴ�.
       //    ����) byte, short�� �����ϸ� ������ int �̻��� �ڷ����� ���´�.
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

         // �Ҽ��� ù°�ڸ������� ���ϱ�
         double res3 = 83.5555;
         int res4 = (int)(res3*10) ;
         System.out.println(res4); // 835

         // double res5 = res4 / 10 ; //  int / int => 83 �̴�.
         double res5 = res4 / 10.0 ;  //  int / double => 83.5
         System.out.println(res5);    // 83.0

        //  ���� �ڸ������� ���ϱ� (���� �ڸ� ����)
        int res6 = 17895;
        res6 = res6 / 10 ;  // int/int => 1789.5�� �ƴ϶�  1789
        res6 = res6 * 10 ; 
        System.out.println(res6);

  
          
      }
}







