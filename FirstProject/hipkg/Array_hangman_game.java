package hipkg;

import java.util.Arrays;
import java.util.Scanner;

public class Array_hangman_game {
	public static void main(String[] args) {
		/* (Ǯ��)
		 * Q. picture�� ���ڿ� �迭�� �ְ� ���ڸ� �˾Ƹ��ߴ� hangman program
		 * 		�� �ۼ��Ͻÿ� (��, 13�� �ȿ� ����� �Ѵ�)
		 * (����)  char, string �迭 ���
		 */		
		Scanner sc = new Scanner(System.in);
		String s ="";
		String[] bae = {"p", "i", "c", "t", "u", "r", "e"}; // 7��
		int cnt = 0;
		
		for (int i = 0; i < 13; i++) { // 13�� �ݺ�
			
			do {
				System.out.print(i+1+ "�Է�:");
				s = sc.next();
				if (Arrays.asList(bae).contains(s)) {
					System.out.println(s);
					cnt +=1;
					if (cnt == bae.length) {
						System.out.println("���� : picture");
						return;
					}
				} 
				else {
					System.out.println("Ʋ��");
				}
			}
			while(s.equals(bae));
		
		}
		System.out.println("���� ��ȸ��");
	}
}
