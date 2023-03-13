package hipkg;

class Car3{ // ����
	private String color; // �Ӽ� (field)
	private int door;
	
	//////////////////////////////
	
	public String toString() { // overriding
		return "toString() : �ڵ��� ���� " + color + " �̰�, " + "���� ������ " + door + "�� �̴�.";
	}
	
	// ������ �ߺ� (overloading)
	public Car3() { } // default constructor
		
	public Car3(String color, int door) { // ������	// void x, return x
		this.color = color;
		this.door = door;
	}
	
}

/////////////////////////////////////////////
public class Oop3 {
	public static void main(String[] args) {
		
		Car3 myCar = new Car3("red", 2); // ����
		
		System.out.println(myCar.toString());
		
		System.out.println("~ " + myCar);
		
		/*
		 * ��ü�� life circle;
		 * c : malloc() ==> free
		 * c++ : p= NULL
		 *  -> mempry leak, fangling pointer problem
		 *   Garbage Colloection:
		 *   new(��ü����) - ������(�⺻�ʱ�ġ ó��) -~~~ -�Ҹ���- ��ü����
		 */		
		
	}
}
