class Ex07{
      public static void main(String[] args){
         // ī���ī�� 4500���̴�. ģ���� ���̼� 10000���� ���� �Ծ���.
         // �ܵ��� ���ΰ� ? (��, ��ü�ݾ׿� 10% �ΰ������� ��Ű��)
          
         // �Է� ����
         int input = 10000;
         int dan = 4500;
         int su = 2 ;

         int total = dan * su ;
         int vat = (int)(total * 0.1) ;
         int output =  input - (total + vat);
         System.out.println("�ܵ� : " + output);
        
     }
}