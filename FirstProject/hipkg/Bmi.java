package hipkg;

import java.util.Scanner;

public class Bmi { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
        Scanner sc1=new Scanner(System.in); //�ѹ��� ���� ����
		
	    System.out.print("Ű��?");
	    int ki=sc1.nextInt(); //180
		
		 System.out.print("�����Դ�?");
	    int mom=sc1.nextInt(); //65
	    
	    //bmi = ���� Ű/ü���� ���� 
	    double  mKi= ki / 100.0; //1.8
	    //double bmi =  mom / (mKi * mKi) ;
	    double bmi =  mom / Math.pow(mKi, 2);
	    		System.out.println(bmi);
	     //30�̻� ��  18.5~25  ����      ��ü�� 
	    
	    		  String result;
	    		
	    		  if(bmi >=30.0)
	    	    	   result="��";
	    	      else if(bmi >=25.0) //bmi >=25.0 && bmi < 30.0 
	    	    	      result="��ü��";
	    	      else if(bmi >=18.5)
	    	    	      result="����";
	    	      else 
	    	    	     result="��ü��";
	    	      
	    	      System.out.println(result);
	    
	    
	}

}
