package hipkg;

class Car2{ // ����
	private String color; // �Ӽ� (field)
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
	public void drive() { // �޼ҵ�
		System.out.println("����̺� ����");
	}
	
	// ��� ���� �޼ҵ�
	public void chool() {
//		System.out.println("�ڵ��� ���� " + color + " �̰�, " + "���� ������ " + door + "�� �̴�.");
	}
	
	@Override
	public String toString() {
		return "�ڵ��� ���� " + color + " �̰�, " + "���� ������ " + door + "�� �̴�.";
	}
	
	// ��Ӱ��� ������� �޼ҵ�(getter)
//	public String toString() { // overriding
//		return "�ڵ��� ���� " + color + " �̰�, " + "���� ������ " + door + "�� �̴�.";
//	}
}

/////////////////////////////////////////////
public class Oop2 {
	public static void main(String[] args) {
		
		// Ŭ���� ==> ��ü (�ν��Ͻ�)
		// new Ŭ������ ();
		// new Car();
		// Ŭ������ ��ü�������� = new Ŭ������();
		Car2 myCar = new Car2(); // ����
		
		// ����� 3����
		// 1) ��ü.�Ӽ� = ��
//		c1.color = "white";
//		c1.door = 4;
		
		// 2) ��ü.�޼ҵ�()
		myCar.setColor("white");
		myCar.setDoor(4);
		
		// 3) ��ü.�Ӽ�
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
