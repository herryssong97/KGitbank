package hipkg;

import java.util.Scanner;

public class Switch_multi_if { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   //������ �Է¹޾� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�
		//��, 90-100   80-89   70-79   60-69   ������
		//     A         B       C       D       F  ���� 
	
		
		Scanner in = new Scanner(System.in);
        System.out.print("������ �Է��ϼ���: ");
        int j = in.nextInt();
        if(j>=90 && j<=100)  // 90<= j <=100 
                System.out.println("���� : A");
        else if(j>=80 && j<=89) 
                System.out.println("���� : B");
        else if(j>=70 && j<=79) 
                System.out.println("���� : C");
        else if(j>=60 && j<=69) 
                System.out.println("���� : D");
        else 
                System.out.println("���� : F");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Scanner in = new Scanner(System.in);
        System.out.print("������ �Է��ϼ���: ");
        int j2 = in.nextInt();
        if(j2>=90)  //����if , ��øif
                System.out.println("���� : A");
        else if(j2>=80) 
                System.out.println("���� : B");
        else if(j2>=70) 
                System.out.println("���� : C");
        else if(j2>=60) 
                System.out.println("���� : D");
        else 
                System.out.println("���� : F");
		
		
		//----------------------------------
         Scanner  sc2= new Scanner(System.in);
        System.out.print("������ �Է��ϼ���: ");
        int jum = sc2.nextInt();
        int mok=jum/10; //98 93	 
        
        switch(mok) {
        //case 90-100: 
        case 10: 
        	 // System.out.println("A����");
             // break;
        case 9: //90-99  	
           System.out.println("A����");
           break;
        case 8:   
           System.out.println("B����");
           break;
        case 7:   
            System.out.println("C����");
            break;       
        case 6:   
            System.out.println("D����");
            break;      
        default:
        	 System.out.println("F����");
            // break;      
        }
        
        
        //Q) 2023�⵵ �� ���� ��¥���� ����ϴ� switch ���α׷��� �ۼ��Ͻÿ�
        // (��, �׷��ϱ� �ٽø��ؼ� switch��  Ư���� ����Ͽ� ��¹��� 3���� �� �ۼ��Ͻÿ�) 
        
        
        
        
        
        
        
        
        
        
        
        
        
		
	}

}
