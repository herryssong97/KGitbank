package hipkg;
/* 
 * 상속에서
 * 부모클래스 Parent class, base class, 기본클래스
 * 
 * 자녀클래스 child class, derived class, 파생클래스
 * undified modeling language
 */
class Parent{
	String address;
	public void money() {
		System.out.println("돈 많아");
	}
	public Parent() { // default 생성자
		System.out.println("나도 주소 물어봐줘");
	}
	public Parent(String address) { // 인자 x 생성자
		System.out.println("잘 왔구만 내 주소는" + address + "이다.");
	}
}

class Child extends Parent{
	int age;
	public Child(String address, int age) {
		this.address = address;
		this.age = age;
	}
	public Child() { // default 생성자
		System.out.println("으흠");
	}
	public void car() {
		System.out.println("부릉부릉");
	}
}


public class Parents_extends2{
	public static void main(String[] args) {
		Parent p1 = new Parent();
		Child c1 = new Child();
		p1.money();
		c1.money();
		c1.car();
		//--------------
		Child c2 = new Child("종로", 30);
		// 기본적으로 자녀쪽에서 주소, 나이 사용이 가능한가요? -> 예
		System.out.println(c2.address + " " + c2.age);
	}
}
