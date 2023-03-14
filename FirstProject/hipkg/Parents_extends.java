package hipkg;

class Parents{
//	int diamond; // 속성
	protected int diamond; // protected : 상속관계에서만 사용 가능한 접근 지정자
	public void money() { // 메소드
		System.out.println("부모는 부자");
	}
} // Parents-class-end

class Baby extends Parents{
	public void car() {
		diamond = 3;
		System.out.println("자녀는 부릉부릉");
	}
} // Baby-class-end



public class Parents_extends{
	public static void main(String[] args) {
		Parents p1 = new Parents();
		p1.money(); // 객체.메소드()
		
		Baby b1 = new Baby();
		b1.money(); // 객체.메소드()
		b1.car(); // 객체.메소드()
		System.out.println(b1.diamond);

		
		
		
		
		
		
		
		
		
		
		/*
		 * 상속
		 * 1) 100% 상속
		 * 2) 자녀의 재산은 부모와 같거나 더 많다
		 * 3) 상속의 keyword는 extends
		 * 		A extends B -----------> A 는 B로부터 상속받는다
		 * 		A is kind of B 			자녀  부모
		 * 		fish extends Animal
		 */
	}
}
