package hipkg;

class Car2{ // 정의
	private String color; // 속성 (field)
	private int door;
	
	// getter
	public String getColor() {
		return color;
	}
	public int getDoor(){
		return door;
	}
	
	// setter
	public void setColor(String color) {
		this.color = color;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	
	//////////////////////////////
	public void drive() { // 메소드
		System.out.println("드라이브 가자");
	}
	
	// 출력 전문 메소드
	public void chool() {
//		System.out.println("자동차 색은 " + color + " 이고, " + "문의 개수는 " + door + "개 이다.");
	}
	
	@Override
	public String toString() {
		return "자동차 색은 " + color + " 이고, " + "문의 개수는 " + door + "개 이다.";
	}
	
	// 상속관련 출력전문 메소드(getter)
//	public String toString() { // overriding
//		return "자동차 색은 " + color + " 이고, " + "문의 개수는 " + door + "개 이다.";
//	}
}

/////////////////////////////////////////////
public class Oop2 {
	public static void main(String[] args) {
		
		// 클래스 ==> 객체 (인스턴스)
		// new 클래스명 ();
		// new Car();
		// 클래스명 객체참조변수 = new 클래스명();
		Car2 myCar = new Car2(); // 생성
		
		// 사용방법 3가지
		// 1) 객체.속성 = 값
//		c1.color = "white";
//		c1.door = 4;
		
		// 2) 객체.메소드()
		myCar.setColor("white");
		myCar.setDoor(4);
		
		// 3) 객체.속성
		System.out.println(myCar.getColor() + ", " + myCar.getDoor());
		myCar.chool();
		System.out.println(myCar.toString());
		
		Car2 yourCar = new Car2();
		yourCar.setColor("black");
		yourCar.setDoor(2);
		
		System.out.println(yourCar.getColor() + ", " + yourCar.getDoor());
		yourCar.chool();
		System.out.println(yourCar.toString());
		System.out.println("~"+yourCar);
		
		
		
		
		
		
		
		
		
	}
}
