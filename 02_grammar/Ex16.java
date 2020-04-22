
public class Ex16 {
       public static void main(String[] args) {
		//  중첩 삼항 연산자
    	// char k1이 대문자인지, 소문자인지 , 기타문자인지   판별
    	   char k1 = 'p' ;
    	   String str = (k1>='A' && k1<='Z') ? "대문자" : ((k1>='a'&& k1<='z') ? "소문자" : "기타문자");
    	   System.out.println(str);
    	   
        // 	int k2 가 1 또는 3이면 남자, 2 또는 4이면 여자, 나머지 외국인
    	   int k2 = 7 ;
    	   str = (k2==1 || k2 ==3)? "남자" : ((k2==2 || k2==4)?("여자"):("외국인")) ;
    	   System.out.println(str);
    	   
    	// int k3이 90이상이면 "A", 80이상이면 "B", 70이상이면 "C" 나머지 "F";
    	   int k3 =97;
    	  str = (k3>=90)?("A"):((k3>=80)?("B"):((k3>=70)?("C"):("F"))) ;
    	  System.out.println(str); 
    	   
	}
}
