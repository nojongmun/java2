class Ex08{
      public static void main(String[] args){
         // 3989�ʴ� ��ð�, ���, �����ΰ�?
         // �ð�
          int time = 3989 ;
          int h = time / (60 * 60) ; // �ð�
          int res = time % (60 * 60) ; // ������

         // �������� ������ ��, ��
          int m = res / 60 ; // ��
          int s = res % 60 ; // ��  

          System.out.println("3989�ʴ� "+h+"��"+m+"��"+s+"�� �Դϴ�.");        

     }
}