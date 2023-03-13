package hipkg;

class Car3{ // 정의
	private String color; // 속성 (field)
	private int door;
	
	//////////////////////////////
	
	public String toString() { // overriding
		return "toString() : 자동차 색은 " + color + " 이고, " + "문의 개수는 " + door + "개 이다.";
	}
	
	// 생성자 중복 (overloading)
	public Car3() { } // default constructor
		
	public Car3(String color, int door) { // 생성자	// void x, return x
		this.color = color;
		this.door = door;
	}
	
}

/////////////////////////////////////////////
public class Oop3 {
	public static void main(String[] args) {
		
		Car3 myCar = new Car3("red", 2); // 생성
		
		System.out.println(myCar.toString());
		
		System.out.println("~ " + myCar);
		
		/*
		 * 객체의 life circle;
		 * c : malloc() ==> free
		 * c++ : p= NULL
		 *  -> mempry leak, fangling pointer problem
		 *   Garbage Colloection:
		 *   new(객체생성) - 생성자(기본초기치 처리) -~~~ -소멸자- 객체해제
		 */		
		
	}
}
