class Ex12{
      public static void main(String[] args){
         // �������� : &&(AND, ����), ||(OR, ����), !(NOT, ������)
         // ���������� ����� boolean��,  ��� boolean��
         // ���������� ����� �񱳿�����, ��������, boolean�� 

         // || (OR, ����, ������)
         //  - �־��� ���ǵ��� ��� ����(false)�϶��� ��� ����(false)
         //  - �־��� ���ǵ� �� ��(true)�� ������ ����� ��(true)
         //  - ��(true)�� ������ ��(true)�ڿ� �����ϴ� ������ ������ ���� ����
 
          int su1 = 10 ;
          int su2 = 7 ;
          boolean b1 = (su1>=7) || (su2>=5); // true = true && true
          System.out.println("��� : " + b1); 

          b1 = (su1<=7) || (su2>=5);         // true = false && true
          System.out.println("��� : " + b1);

          b1 = (su1>=7) || (su2<=5);         // true = true && false
          System.out.println("��� : " + b1);
 
          b1 = (su1<=7) || (su2<=5);         // false = false && false
          System.out.println("��� : " + b1);
          System.out.println("=====================");

          su1 = 10 ;
          su2 = 7 ;
          boolean res = ((su1 = su1+2) > su2) && (su1 == (su2 = su2+5));
          System.out.println("��� : " + res); // true      
          System.out.println("su1 : " + su1); // 12       
          System.out.println("su2 : " + su2); // 7 
          System.out.println("=====================");

          // ! (NOT, ������)
          //  - �־��� ������ �ݴ�� ��Ÿ��
          //  - true => false,  false => true

          res = true;
          System.out.println(res);
          System.out.println(!res);
          System.out.println(!!res);
          System.out.println(!!!res);

      }
}