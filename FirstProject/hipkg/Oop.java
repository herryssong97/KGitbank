package hipkg;

class Car{ // ����
	String color; // �Ӽ�
	int door;
	
	public void drive() { // �޼ҵ�
		System.out.println("����̺� ����");
	}
}

public class Oop {
	public static void main(String[] args) {
		
		// Ŭ���� ==> ��ü (�ν��Ͻ�)
		// new Ŭ������ ();
		// new Car();
		// Ŭ������ ��ü�������� = new Ŭ������();
		Car c1 = new Car(); // ����
		
		// ����� 3����
		// 1) ��ü.�Ӽ� = ��
		c1.color = "white";
		c1.door = 4;
		
		// 2) ��ü.�޼ҵ�()
		c1.drive();
		
		// 3) ��ü.�Ӽ�
		System.out.println(c1.color);
		System.out.println(c1.door);
		
		
		// OOP : Object Oriented Programming
		// OOL : Object Oriented Language
		
		/*
		 * ������ ��� 
		 * ��ü������ ��ü�� 
		 * �繰�� ��ü 
		 * 
		 * �繰�� Ư¡
		 * (1) �Ӽ� : ����, Ư¡
		 * (2) �޼ҵ� : �ൿ
		 * 
		 * ��ü : (1) �繰 (2) Ŭ����-��ü
		 * 
		 * OOP ����� 3�ܰ�
		 * 1) ���赵 : ����
		 * 2) ���� : ����
		 * 3) ��� : ���
		 * 
		 */
	}
}
