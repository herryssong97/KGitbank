package hipkg;

import java.util.Scanner;

class Bakery{ // ����
	private String jong;
	private int price;
	
	
	public String getJong() {
		return jong;
	}
	public void setJong(String jong) {
		this.jong = jong;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
/////////////////////////////////////////////
	public String toString() {
		return "�� ���� : " + jong + "\n���� : " + price + "\n";
	}
}

/////////////////////////////////////////////
public class Oop_Quiz01 {
	public static void main(String[] args) {
		/*
		 * Q. �� ������ ������ �Ӽ����� ������ class�� �����
		 * 		�̸� �����ϰ� ����ϴ� OOP���α׷��� �ۼ��Ͻÿ�
		 * 
		 * (����) �� ���� �Ӽ��� : jong
		 * 			���� �Ӽ��� : price
		 */		
		Scanner sc = new Scanner(System.in);
		Bakery b1 = new Bakery();
		
		System.out.println("0. ����\t 1. �Է�");
		System.out.print("�Է� : ");
		int n = sc.nextInt();

		switch (n) {
			case 1 : 
				System.out.print("���̸� �Է� : ");
				b1.setJong(sc.next());
				System.out.print("�� ���� �Է� : ");
				b1.setPrice(sc.nextInt());
				break;
		}System.out.println("����Ǿ����ϴ�.");
		
		
		System.out.println("=====");
		if(b1.getJong()==(null)) {
			System.out.println("�Էµ� ���� �����ϴ�.");
		} else {
			System.out.println(b1.toString());
		}
	}
}
