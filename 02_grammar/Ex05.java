class Ex05{
      public static void main(String[] args){
         // ��������� :  +, -, * , / , %(������)
         //  char��, ����, �Ǽ� ��밡��
        int su1 = 9 ;
        int su2 = 4 ;
        int result = 0 ;

        result = su1 + su2 ;
        result = su1 - su2 ;    
        result = su1 * su2 ;

        result = su1 / su2 ;  // int / int => int (��)
        System.out.println(result);
      
        result = su1 % su2 ;  // ������
        System.out.println(result);

        // ���࿡ ��Ȯ�� ���� �˰� ������ ����� double�� �����ϴ� ���� �´�
        double res = su1 / su2 ;
        System.out.println(res); // 2.0

        // su1�̳� su2 �� �߿� �ϳ��� ����ȯ �ؾߵ� 
        res = su1 / (double)(su2) ;
        System.out.println(res); 
            
      }
}