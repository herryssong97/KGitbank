package hipkg;

import java.util.Scanner;

public class Method1type {
	public static void main(String[] args) {
		// Q. 2023���� �������� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.

		/*
		 * ���� : 365.2422��
		 * 0.2422*4 = 0.9688 = �� 1�� 
		 * 100�⿡ �������
		 * 400�⿡ 1���� ��������
		 * 
		 * ������?
		 * 4�� ������ ��������
		 * 100���� ������ �������� �ʰų�
		 * 400���� ������ �������� ��
		 */		
//		year();
//		passyear(2021);
//		System.out.println(nextyear());
		String a = nextyear();
		System.out.println(a);
		// �� a = "������� ó�� ��";
		
	}// main end
	
	private static String nextyear() {
		Scanner sc = new Scanner(System.in);
		String y = "���";
		
		System.out.print("�⵵�� �Է��ϼ��� : ");
		int year = sc.nextInt();
		
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			y = "����";
		} 
//		System.out.printf("%s���� %s�Դϴ�.\n", year, y);
		return "������� ó�� ��";
	}

	public static void year() {

		Scanner sc = new Scanner(System.in);
		String y = "���";
		
		System.out.print("�⵵�� �Է��ϼ��� : ");
		int year = sc.nextInt();
		
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			y = "����";
		} 
		System.out.printf("%s���� %s�Դϴ�.", year, y);
	}
	
	public static void passyear(int i) {
		String y = "���";
		
		if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
			y = "����";
		} 
		System.out.printf("%s���� %s�Դϴ�.", i, y);
	}
}
