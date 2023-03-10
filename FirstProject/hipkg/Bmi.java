package hipkg;

import java.util.Scanner;

public class Bmi { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
        Scanner sc1=new Scanner(System.in); //한번만 쓰고 시작
		
	    System.out.print("키는?");
	    int ki=sc1.nextInt(); //180
		
		 System.out.print("몸무게는?");
	    int mom=sc1.nextInt(); //65
	    
	    //bmi = 미터 키/체중의 제곱 
	    double  mKi= ki / 100.0; //1.8
	    //double bmi =  mom / (mKi * mKi) ;
	    double bmi =  mom / Math.pow(mKi, 2);
	    		System.out.println(bmi);
	     //30이상 비만  18.5~25  보통      저체중 
	    
	    		  String result;
	    		
	    		  if(bmi >=30.0)
	    	    	   result="비만";
	    	      else if(bmi >=25.0) //bmi >=25.0 && bmi < 30.0 
	    	    	      result="과체중";
	    	      else if(bmi >=18.5)
	    	    	      result="보통";
	    	      else 
	    	    	     result="저체중";
	    	      
	    	      System.out.println(result);
	    
	    
	}

}
