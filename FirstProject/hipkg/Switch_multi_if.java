package hipkg;

import java.util.Scanner;

public class Switch_multi_if { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   //점수를 입력받아 학점을 구하는 프로그램을 작성하시오
		//단, 90-100   80-89   70-79   60-69   나머지
		//     A         B       C       D       F  학점 
	
		
		Scanner in = new Scanner(System.in);
        System.out.print("점수를 입력하세요: ");
        int j = in.nextInt();
        if(j>=90 && j<=100)  // 90<= j <=100 
                System.out.println("학점 : A");
        else if(j>=80 && j<=89) 
                System.out.println("학점 : B");
        else if(j>=70 && j<=79) 
                System.out.println("학점 : C");
        else if(j>=60 && j<=69) 
                System.out.println("학점 : D");
        else 
                System.out.println("학점 : F");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Scanner in = new Scanner(System.in);
        System.out.print("점수를 입력하세요: ");
        int j2 = in.nextInt();
        if(j2>=90)  //다중if , 중첩if
                System.out.println("학점 : A");
        else if(j2>=80) 
                System.out.println("학점 : B");
        else if(j2>=70) 
                System.out.println("학점 : C");
        else if(j2>=60) 
                System.out.println("학점 : D");
        else 
                System.out.println("학점 : F");
		
		
		//----------------------------------
         Scanner  sc2= new Scanner(System.in);
        System.out.print("점수를 입력하세요: ");
        int jum = sc2.nextInt();
        int mok=jum/10; //98 93	 
        
        switch(mok) {
        //case 90-100: 
        case 10: 
        	 // System.out.println("A학점");
             // break;
        case 9: //90-99  	
           System.out.println("A학점");
           break;
        case 8:   
           System.out.println("B학점");
           break;
        case 7:   
            System.out.println("C학점");
            break;       
        case 6:   
            System.out.println("D학점");
            break;      
        default:
        	 System.out.println("F학점");
            // break;      
        }
        
        
        //Q) 2023년도 각 월의 날짜수를 출력하는 switch 프로그램을 작성하시오
        // (단, 그러니까 다시말해서 switch의  특성을 사용하여 출력문장 3종류 로 작성하시오) 
        
        
        
        
        
        
        
        
        
        
        
        
        
		
	}

}
