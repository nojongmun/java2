class Ex08{
      public static void main(String[] args){
         // ���� : ������(�Ҽ����� ����) < �Ǽ���(�Ҽ����� ����)
         //   - ������ : byte < short < int < long
         //   - �������� �⺻�� int
          
         //   - �Ǽ��� : float < double
         //   - �Ǽ����� �⺻�� double 

         // int, long�� ���� �ܿ� �ʿ䰡 ����.
         // �Ϲ����� ������ int ��� �����ϸ� �ȴ�.

         int k1 = 128 ; // byte �ʰ�
         System.out.println(k1);

         k1 = 32768 ;  // short �ʰ�
         System.out.println(k1);

        // long : int ���� �� ���� ������ ������ ����
        //        ���� �ڿ� L �Ǵ� l �� ���δ�. (���� �����ϴ�.)
        long k2 = 128L ; // byte �ʰ�
        System.out.println(k2);

        k2 = 32768l; // short �ʰ�
        System.out.println(k2);

        k2 = 127;
        System.out.println(k2);
  
       // k2 = 127.0;     

    }
}






