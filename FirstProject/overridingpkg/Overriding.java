package overridingpkg;

import java.util.Scanner;

class Parent{
	public void car() {
		System.out.println("부모차 타고 드라이브 가자");
	}
}

class Child extends Parent{
	public void car() {
		System.out.println("자녀차 타고 세계여행 가자");
	}
}

public class Overriding {
	/*
	 * Q. 다음처럼 진행되도록 프로그램을 작성하되 객체의 형변한을 사용하시오
	 * 어느 차를 타시렵니까? (1=부모 2=자녀) 
	 * 2 : 자녀차 타고 세계여행 가자 
	 * 1: 부모차 타고 드라이브 가자
	 */	public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.print("입력 : ");
		 int n = sc.nextInt();
		 
//		 Parent p1 = new Parent();
//		 Child c1 = new Child();
//		 p1.car();
		 Parent p77 = null;
		 
		 switch(n) {
		 	case 1: 
		 		p77 = new Parent();
		 		p77.car();
		 		break;
		 	case 2 : 
		 		p77 = new Child(); // p77 = 자식객체
		 		p77.car();
		 		break;
		 	default : 
		 		System.out.println("잘못입력했습니다.");
		 		break;
		 }
	}
}
