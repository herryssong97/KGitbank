package hipkg;

import java.util.Scanner;///////////

public class Dowhile { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
		Scanner sc1=new Scanner(System.in);
		
		int bada;
		do {
			System.out.println("1.¥��");
			System.out.println("2.«��");
			System.out.print("����(1-2)");
			 bada=sc1.nextInt(); 
		}while(bada != 1 && bada != 2); //�߸������� ���� �ݺ��� 
	    //����� ������ ��� : 1 or 2
		//�޴��� �ٽó����� �ϴ� ��� : 1 or 2�� �ݴ��� ��� 
		// ��, !1   and  !2
		System.out.println("�����ϼ���");
	
	//-------------------------------
       Scanner sc2=new Scanner(System.in);
		
       String bada2;
		do {
			System.out.println("1.¥��");
			System.out.println("2.«��");
			System.out.print("����(1-2)");
			 bada2=sc2.next();   
			// sc2.nextLine(); // I love you
	//	}while(bada2 != "1" && bada2 != "2"); //�߸������� ���� �ݺ��� 
		}while(!bada2.equals("1")  && !bada2.equals("2")); 	 
	    //����� ������ ��� : 1 or 2
		//�޴��� �ٽó����� �ϴ� ��� : 1 or 2�� �ݴ��� ��� 
		// ��, !1   and  !2
		System.out.println("�����ϼ���");

	
	
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
