class Ex06{
      public static void main(String[] args){
        // �̸��� ȫ�浿�� ����� ������ ���� 90��, ���� 80��, ���� 80���̴�.
        // ������ ����� ������
        // ����� �̸�, ����, ��� �� �������(��, ����� �Ҽ��� ù°�ڸ����� ������) 

        // �Է� 
         String name = "ȫ�浿"; 
         int kor = 90 ;
         int eng = 80 ;
         int math = 80 ;

        // ó�� : ����Ͻ� ����
        // int sum = 90 + 80 + 80 ;
         int sum = kor + eng + math ;
        
        //  �Ҽ��� ù°�ڸ��� ������ ����
        // int avg = sum / 3 ;
        // double avg = sum / 3 ;

        //  �Ҽ��� ù°�ڸ��� ����
        //  double avg = sum / 3.0 ;
        //  avg = (int)(avg*10)/10.0 ;
          double avg = (int)(sum/3.0*10) / 10.0;

        // ���
         System.out.println("�̸� : " + name);
         System.out.println("���� : " + sum);
         System.out.println("��� : " + avg);


     }
}







