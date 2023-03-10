package hipkg;

import java.util.Scanner;

public class Forfor { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for(초기치;목적치;증가치){
		//    STMT:
	    //} 
		//for(i=1;i <= 5  ;i++)
		//  print("aa");
		
		for(int i=1;i<=5;i++) {
		 // System.out.println("aa");	
			System.out.print(i+"\t");	
			
			
		}
		
		//random number 
		
		//임의의 수가 0~1 
		//45*  0~44.xxxx
		//올림 
	
   for(int i=1;i<=6;i++)		 
	   System.out.print((int) Math.ceil(45*Math.random())+"\t");
   System.out.println();	//line-skip 	
		//nested 기법 
   
  /*  
   학년     반
    1   -  1 
    1   -  2
    2   -  1
    2  -   2
    3  -   1
    3  -   2  
 */  
  // for(i=1;i<=3;i++) {}
   
 //  for(j=1;j<=2;j++) {}
   
   
   
   
   for(int i=1;i<=3;i++)// {
	   
	   for(int j=1;j<=2;j++) //{
		    System.out.println(i+" - "+j);
		   
	   //}
	   
 //  }
   
	
	}  

}
