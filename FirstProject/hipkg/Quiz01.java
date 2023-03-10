package hipkg;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		//Q. A, B, C �� ���� ���� ū ���� ���ϴ� �˰����� �ۼ��Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A, B, C �� ���� �Է¹޾� ���� ū ���� ���ϴ� �˰����� �ۼ��Ͻÿ�.");
		System.out.print("A:");
		int a = sc.nextInt();
		System.out.print("B:");
		int b = sc.nextInt();
		System.out.print("C:");
		int c = sc.nextInt();
		
		if(a>b && a>c) { // a�� ���� Ŭ ��
			System.out.print("���� ū ���� A�Դϴ�. A�� " + a + "�Դϴ�.");
		} else if(b>a && b>c) { // b�� ���� Ŭ ��
			System.out.print("���� ū ���� B�Դϴ�. B�� " + b + "�Դϴ�.");
		} else { // c�� ���� Ŭ ��
			System.out.print("���� ū ���� C�Դϴ�. C�� " + c + "�Դϴ�.");
		}
		System.out.println();
		
		// ū �� ������� ����ϱ�
		int tmp = 0;
		if(a>b && a>c) { // a�� ���� Ŭ ��
			if (c>b) { // a>c>b
				tmp = b;
				b = c;
				c = tmp;
			}
		}
		else if(b>a && b>c) { // b�� ���� Ŭ ��
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
		else { // c�� ���� Ŭ ��
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
