package hipkg;
/* 
 * ��ӿ���
 * �θ�Ŭ���� Parent class, base class, �⺻Ŭ����
 * 
 * �ڳ�Ŭ���� child class, derived class, �Ļ�Ŭ����
 * undified modeling language
 */
class Parent{
	String address;
	public void money() {
		System.out.println("�� ����");
	}
	public Parent() { // default ������
		System.out.println("���� �ּ� �������");
	}
	public Parent(String address) { // ���� x ������
		System.out.println("�� �Ա��� �� �ּҴ�" + address + "�̴�.");
	}
}

class Child extends Parent{
	int age;
	public Child(String address, int age) {
		this.address = address;
		this.age = age;
	}
	public Child() { // default ������
		System.out.println("����");
	}
	public void car() {
		System.out.println("�θ��θ�");
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
		Child c2 = new Child("����", 30);
		// �⺻������ �ڳ��ʿ��� �ּ�, ���� ����� �����Ѱ���? -> ��
		System.out.println(c2.address + " " + c2.age);
	}
}
