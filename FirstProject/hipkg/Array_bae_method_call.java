package hipkg;

import java.util.Scanner;

public class Array_bae_method_call {
	public static void main(String[] args) {
		/*
		 * Q. 10���� �����͸� �迭�� �Է¹��� �� methodȣ�⹮ 2������ ����Ͽ� 
		 * �޼ҵ� ���ǹ����� �迭��ü�� ���� �� ���ǹ�����
		 * �迭�� ���� �ݺ������� ����ϴ�
		 * �ڹ� ���α׷��� �ۼ��Ͻÿ�
		 */	
		
		// call by value (���� ���� ȣ��)
		// call by reference (������ ���� ȣ��)
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i+1 +"��° �迭 �� �Է�: ");
			arr[i] = Integer.parseInt(sc.next());
			// arr[i] = sc.nextInt(); // �������� �� ū���� �������� ������ ����� ����ó�� ���ֱ�
		}
		
		// call by value (���� ���� ȣ��)
		// hap(arr[0], arr[1], ..arr[9])
		// �迭 ���޽� �˾ƾ��� ������ �Ӵ���
		//		�� "�迭�� ��ǥ���� �� �迭�� ���۹����̴�"
		
		hap(arr);
		
		
		} // main end
	
	public static void hap(int[] arr) {

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.print("�� : " + sum);
	}
	
} // class end
