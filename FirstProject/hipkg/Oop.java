package hipkg;

class Car{ // 정의
	String color; // 속성
	int door;
	
	public void drive() { // 메소드
		System.out.println("드라이브 가자");
	}
}

public class Oop {
	public static void main(String[] args) {
		
		// 클래스 ==> 객체 (인스턴스)
		// new 클래스명 ();
		// new Car();
		// 클래스명 객체참조변수 = new 클래스명();
		Car c1 = new Car(); // 생성
		
		// 사용방법 3가지
		// 1) 객체.속성 = 값
		c1.color = "white";
		c1.door = 4;
		
		// 2) 객체.메소드()
		c1.drive();
		
		// 3) 객체.속성
		System.out.println(c1.color);
		System.out.println(c1.door);
		
		
		// OOP : Object Oriented Programming
		// OOL : Object Oriented Language
		
		/*
		 * 절차형 언어 
		 * 객체지향언어 객체는 
		 * 사물이 객체 
		 * 
		 * 사물의 특징
		 * (1) 속성 : 성격, 특징
		 * (2) 메소드 : 행동
		 * 
		 * 객체 : (1) 사물 (2) 클래스-객체
		 * 
		 * OOP 만드는 3단계
		 * 1) 설계도 : 정의
		 * 2) 제작 : 생성
		 * 3) 사용 : 사용
		 * 
		 */
	}
}
