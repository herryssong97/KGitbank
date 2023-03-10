package hipkg;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		//Q. A, B, C 세 수중 가장 큰 수를 구하는 알고리즘을 작성하시오.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A, B, C 세 수를 입력받아 가장 큰 수를 구하는 알고리즘을 작성하시오.");
		System.out.print("A:");
		int a = sc.nextInt();
		System.out.print("B:");
		int b = sc.nextInt();
		System.out.print("C:");
		int c = sc.nextInt();
		
		if(a>b && a>c) { // a가 가장 클 때
			System.out.print("가장 큰 수는 A입니다. A는 " + a + "입니다.");
		} else if(b>a && b>c) { // b가 가장 클 때
			System.out.print("가장 큰 수는 B입니다. B는 " + b + "입니다.");
		} else { // c가 가장 클 때
			System.out.print("가장 큰 수는 C입니다. C는 " + c + "입니다.");
		}
		System.out.println();
		
		// 큰 수 순서대로 출력하기
		int tmp = 0;
		if(a>b && a>c) { // a가 제일 클 때
			if (c>b) { // a>c>b
				tmp = b;
				b = c;
				c = tmp;
			}
		}
		else if(b>a && b>c) { // b가 제일 클 때
			if (a>c) { // b>a>c
				tmp = a;
				a = b;
				b = tmp;
			} else{ // b>c>a
				tmp = a;
				a = b;
				b = c;
				c = tmp;
			}
		}
		else { // c가 제일 클 때
			if(a>b) { // c>a>b
				tmp = a;
				a = c;
				c = b;
				b = tmp;
			} else{ // c>b>a
				tmp = a;
				a = c;
				c = tmp;
			}
		}
		System.out.println(a+">"+b+">"+c);
		
	}
}
