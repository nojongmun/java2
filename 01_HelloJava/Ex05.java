class Ex05{
      public static void main(String[] args){
         // ���ڸ� ������ �����ϱ�
         // ���� => char ����
         // char�� ���� �����ʹ� 0 - 65535 �� ���� ���̴�.
         // �������·� �����ϱ� ���ؼ��� �ݵ�� ''(Ȭ����ǥ)�� ����Ѵ�.
         // ���ڶ� �ݵ�� �� ���ڸ� �ǹ��ϴ�.
         // ex) 'a', 'A',  '1', '��', '��'  =>  O,  '10' => X

          char k1 ; // ����
          k1 = 'a'; // a�� k1�� ����Ǵ� ���� �ƴ϶� a�� �ش��ϴ� ���ڰ� k1�� ����ȴ�.
                    // ���ڿ� ���ڸ� ��Ī ��Ų ���� �����ڵ�ǥ(�����ڵ�)��� �Ѵ�.
          System.out.println(k1);

          char k2 = 97;
          System.out.println(k2); 
   
          char k3 = '\u0042';
          System.out.println(k3); 

          char k4 = '\u0062';
          System.out.println(k4); 

      }
}