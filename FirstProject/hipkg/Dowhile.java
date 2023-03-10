package hipkg;

import java.util.Scanner;///////////

public class Dowhile { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
		Scanner sc1=new Scanner(System.in);
		
		int bada;
		do {
			System.out.println("1.짜장");
			System.out.println("2.짬뽕");
			System.out.print("선택(1-2)");
			 bada=sc1.nextInt(); 
		}while(bada != 1 && bada != 2); //잘못누르는 동안 반복해 
	    //제대로 선택한 경우 : 1 or 2
		//메뉴가 다시나오게 하는 경우 : 1 or 2의 반대의 경우 
		// 즉, !1   and  !2
		System.out.println("맛점하세요");
	
	//-------------------------------
       Scanner sc2=new Scanner(System.in);
		
       String bada2;
		do {
			System.out.println("1.짜장");
			System.out.println("2.짬뽕");
			System.out.print("선택(1-2)");
			 bada2=sc2.next();   
			// sc2.nextLine(); // I love you
	//	}while(bada2 != "1" && bada2 != "2"); //잘못누르는 동안 반복해 
		}while(!bada2.equals("1")  && !bada2.equals("2")); 	 
	    //제대로 선택한 경우 : 1 or 2
		//메뉴가 다시나오게 하는 경우 : 1 or 2의 반대의 경우 
		// 즉, !1   and  !2
		System.out.println("맛점하세요");

	
	
	String st1=new String("ondal");
	
	String st2=new String("ondal");
	
	if(st1==st2) 
		System.out.println("=");
	else
		System.out.println("!="); 
	
	if(st1.equals(st2)) 
		System.out.println("=");
	else
		System.out.println("!="); 
	
	
	
	
	
	
	
	
	}
	
	
	 //for(){
	 //i=100
     //}
     // sysout i 	
	
	
	

}
