package hipkg;

import java.util.Scanner;

//import java.util.Scanner;

public class Printf { //����� ���� Ŭ����(userdefined class) 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �־��� 3���� ���� ������  ����� �Ҽ����� ��°¥������ ����Ͻÿ�
		//printf�� ���� 
		// printf( "���ڿ� format ",value, value); 
		System.out.printf(" ����� %s  ���̾� %s �ð��̰ŵ� %n","������","����");
		
		double dd=3.1415926536828; // %lf x
		System.out.printf("%.14f  / %d = %.14f �̶��\n",dd,2,dd/2);
		
		int tot=257;//3���� ����
		double avg = tot/3.0; 
		System.out.printf("����= %d  ���= %.2f \n",tot,avg);
		
		// 3 ���� ���� ������ �ϳ� �Է¹޾� ����� �Ҽ����� ��°¥������ ����Ͻÿ�
		
		//�ڹٿ��� ����� sysout
		//�Է��� 1) File�������� 2)Scanner   3) GUI 
		
		
		//Scanner�� ���� Ŭ����  
		
		Scanner  sc1=new Scanner(System.in);
		//ctrl+shift+o
		System.out.print("3���� ������ �Է��ϼ���");
		 int bada= sc1.nextInt();
		 double avg2 = tot/3.0; 
		System.out.printf("����= %d  ���= %.2f \n",tot,avg2);
		
		//------------------------------------------
		System.out.print("3���� ������ �Է��ϼ���");
		 int bada2= sc1.nextInt();
		
		 System.out.print("3���� ����� �Է��ϼ���");
		 double avg3= sc1.nextDouble();
		System.out.printf("����= %d  ���= %.2f \n",bada2,avg3);
		
		//---------------------------------------
		
		System.out.print("3���� ������ �Է��ϼ���");
		 String bada5= sc1.next(); // "257" ==> 257
		      
		          //int wrap 
		  int tot5=Integer.parseInt(bada5);
		 
		 System.out.print("3���� ����� �Է��ϼ���");
		String avg5= sc1.next();// "90.245" ==> 90.245
		  double avg55=  Double.parseDouble(avg5);
		
		
		System.out.printf("����= %d  ���= %.2f \n",tot5,avg55);
		
		    
		
		
		
	}

}
