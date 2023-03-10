package hipkg;

import java.util.Arrays;
import java.util.Scanner;

public class Array_hangman_game2 {
	public static void main(String[] args) {
		/* (풀이)
		 * Q. picture를 문자열 배열에 넣고 글자를 알아맞추는 hangman program
		 * 		을 작성하시오 (단, 13번 안에 맞춰야 한다)
		 * (참고)  char, string 배열 사용
		 */		
		String [] moonja={"p","i","c","t","u","r","e"};
        String [] jool={"_","_","_","_","_","_","_"};
        String ip;
    
        int cnt,sw=0;//초기치및 선언 은 나중에 
        
        for(int j=0; j<7;j++) //처음 줄 출력   _______
            System.out.print(jool[j]);
        System.out.println();//줄바꿈
        
        Scanner scan1=new Scanner(System.in);
        
        
        
        
        
        
        for(int i=1;i<=13;i++){ //13번 체크 
              cnt=0;  
              System.out.println("예상글자입력:"); 
               ip=scan1.next(); ////////          

          for(int j=0; j<7;j++){ //예상글자가 문제단어에 있어?
                   if(ip.equals(moonja[j]))  // ==  은 번지비교 
                                jool[j]=moonja[j];
          }            
          for(int j=0; j<7;j++) //있건 없건 한줄 출력해
               System.out.print(jool[j]);//줄출력        
          System.out.println("\t"+i+"번시도");
         
          for(int j=0; j<7;j++){ //문제단어와 줄글자가  7개 같아? 
                    if(jool[j].equals(moonja[j]))
                                 cnt++;
          }           
          if(cnt == 7){ //그러면 딱 맞추었으니 끝내자
               System.out.println("굿드");
               sw=1;/////////////////
                   break;           
          }
       }//13-for-end 
          if(sw==0)
               System.out.print("다음기회에");
         
	}// main end
}// class end
