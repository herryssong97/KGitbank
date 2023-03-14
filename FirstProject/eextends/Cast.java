package eextends;

class Parent{
	
}

class Child extends Parent{
	 
}

public class Cast {
	public static void main(String[] args) {
		
		// 자료의 형변환
		// int <-- short
		// short <-- (short)int
		
		Parent p1 = new Parent();
		Child c1 = new Child();
		
//		Parent p2 = c1; == Parent p2 = new Child();
		// class Parent 입장에서 class Child에는 자신(Parent)의 자산이 있기 때문에 에러가 안남
		// 부모는 자식을 참조할 수 있음
		
		Parent p2 = new Child();
//		Child c2 = p1; == Child c2 = new Parent();
		// 에러가 나는 이유?
		// class Child 입장에서 class Parent에는 자신(Child)의 자산이 없기 때문에 에러가 남
		// 자식은 부모를 참조할 수 없음
		
	}
}
