package hipkg;

import java.util.Scanner;

class Bakery{ // 정의
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
		return "빵 종류 : " + jong + "\n가격 : " + price + "\n";
	}
}

/////////////////////////////////////////////
public class Oop_Quiz01 {
	public static void main(String[] args) {
		/*
		 * Q. 빵 종류와 가격을 속성으로 가지는 class를 만들고
		 * 		이를 생성하고 사용하는 OOP프로그램을 작성하시오
		 * 
		 * (조건) 빵 종류 속성명 : jong
		 * 			가격 속성명 : price
		 */		
		Scanner sc = new Scanner(System.in);
		Bakery b1 = new Bakery();
		
		System.out.println("0. 종료\t 1. 입력");
		System.out.print("입력 : ");
		int n = sc.nextInt();

		switch (n) {
			case 1 : 
				System.out.print("빵이름 입력 : ");
				b1.setJong(sc.next());
				System.out.print("빵 가격 입력 : ");
				b1.setPrice(sc.nextInt());
				break;
		}System.out.println("종료되었습니다.");
		
		
		System.out.println("=====");
		if(b1.getJong()==(null)) {
			System.out.println("입력된 값이 없습니다.");
		} else {
			System.out.println(b1.toString());
		}
	}
}
