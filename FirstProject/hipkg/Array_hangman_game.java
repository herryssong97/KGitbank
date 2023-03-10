package hipkg;

import java.util.Arrays;
import java.util.Scanner;

public class Array_hangman_game {
	public static void main(String[] args) {
		/* (풀이)
		 * Q. picture를 문자열 배열에 넣고 글자를 알아맞추는 hangman program
		 * 		을 작성하시오 (단, 13번 안에 맞춰야 한다)
		 * (참고)  char, string 배열 사용
		 */		
		Scanner sc = new Scanner(System.in);
		String s ="";
		String[] bae = {"p", "i", "c", "t", "u", "r", "e"}; // 7자
		int cnt = 0;
		
		for (int i = 0; i < 13; i++) { // 13번 반복
			
			do {
				System.out.print(i+1+ "입력:");
				s = sc.next();
				if (Arrays.asList(bae).contains(s)) {
					System.out.println(s);
					cnt +=1;
					if (cnt == bae.length) {
						System.out.println("정답 : picture");
						return;
					}
				} 
				else {
					System.out.println("틀림");
				}
			}
			while(s.equals(bae));
		
		}
		System.out.println("다음 기회에");
	}
}
