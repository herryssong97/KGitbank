package hipkg;

import java.util.Arrays;
import java.util.Scanner;

public class Array_hangman_game2 {
	public static void main(String[] args) {
		/* (Ǯ��)
		 * Q. picture�� ���ڿ� �迭�� �ְ� ���ڸ� �˾Ƹ��ߴ� hangman program
		 * 		�� �ۼ��Ͻÿ� (��, 13�� �ȿ� ����� �Ѵ�)
		 * (����)  char, string �迭 ���
		 */		
		String [] moonja={"p","i","c","t","u","r","e"};
        String [] jool={"_","_","_","_","_","_","_"};
        String ip;
    
        int cnt,sw=0;//�ʱ�ġ�� ���� �� ���߿� 
        
        for(int j=0; j<7;j++) //ó�� �� ���   _______
            System.out.print(jool[j]);
        System.out.println();//�ٹٲ�
        
        Scanner scan1=new Scanner(System.in);
        
        
        
        
        
        
        for(int i=1;i<=13;i++){ //13�� üũ 
              cnt=0;  
              System.out.println("��������Է�:"); 
               ip=scan1.next(); ////////          

          for(int j=0; j<7;j++){ //������ڰ� �����ܾ �־�?
                   if(ip.equals(moonja[j]))  // ==  �� ������ 
                                jool[j]=moonja[j];
          }            
          for(int j=0; j<7;j++) //�ְ� ���� ���� �����
               System.out.print(jool[j]);//�����        
          System.out.println("\t"+i+"���õ�");
         
          for(int j=0; j<7;j++){ //�����ܾ�� �ٱ��ڰ�  7�� ����? 
                    if(jool[j].equals(moonja[j]))
                                 cnt++;
          }           
          if(cnt == 7){ //�׷��� �� ���߾����� ������
               System.out.println("�µ�");
               sw=1;/////////////////
                   break;           
          }
       }//13-for-end 
          if(sw==0)
               System.out.print("������ȸ��");
         
	}// main end
}// class end
