class Ex11{
      public static void main(String[] args){
         // �������� : &&(AND, ����), ||(OR, ����), !(NOT, ������)
         // ���������� ����� boolean��,  ��� boolean��
         // ���������� ����� �񱳿�����, ��������, boolean��                  

         // &&(AND, ����, ������)
         //  - �־��� ���ǵ��� ��� ��(true)�� �϶��� ����� ��(true)
         //  - �־��� ���ǵ� �߿� ����(false)�� ������ ����� ����(false)
         //  - false�� ������ false ������ �����ϴ� ������ ������ ���� ����
         //  - 'a>=10  && a<=20' �� a�� ������ 10-20������ ���ϴ� ��

          int su1 = 10 ;
          int su2 = 7 ;
          boolean b1 = (su1>=7) && (su2>=5); // true = true && true
          System.out.println("��� : " + b1);  

          b1 = (su1<=7) && (su2>=5); // false = false && true
          System.out.println("��� : " + b1); 

          b1 = (su1>=7) && (su2<=5); // false = true && false
          System.out.println("��� : " + b1); 
     
          b1 = (su1<=7) && (su2<=5); // false = false && false
          System.out.println("��� : " + b1); 
          System.out.println("========================");

          su1 = 10 ;
          su2 = 7 ;
          boolean res = ((su1 = su1+2) > su2) && (su1 == (su2 = su2+5));
          System.out.println("��� : " + res); // true      
          System.out.println("su1 : " + su1); // 12       
          System.out.println("su2 : " + su2); // 12 

          su1 = 10 ;
          su2 = 7 ;
          res = ((su1 = su1+2) < su2) && (su1 == (su2 = su2+5));
          System.out.println("��� : " + res); // false      
          System.out.println("su1 : " + su1); // 12       
          System.out.println("su2 : " + su2); // 7
          
          su1 = 13 ;
          // su1�� ������ 10 - 15 ���� 
          res = (su1>=10) && (su1<=15);
          System.out.println("��� : " + res); // true

          su1 = 17 ;
          // su1�� ������ 10 - 15 ���� 
          res = (su1>=10) && (su1<=15);
          System.out.println("��� : " + res);   // false  
          
         // c1�� �ҹ��� �̴�. 
          char c1 = 'p';
          res = (c1>='a') && (c1<='z') ;
          System.out.println("��� : " + res);   // true

          c1 = 'Q';
          res = (c1>='a') && (c1<='z') ;
          System.out.println("��� : " + res);  // false
      }
}






