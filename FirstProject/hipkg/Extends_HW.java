package hipkg;

/*
 * Q. �θ� : Animal // move()
 * 	  �ڳ� : Bird // song()
 */


class Animal{ // �θ�
	public void move() {
		System.out.println("�����δ�!");
	}
}

class Bird extends Animal{
	public void song() {
		System.out.println("�뷡�Ѵ�~");
	}
}

public class Extends_HW {
	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		a1.move();
		
		Bird b1 = new Bird();
		b1.move();
		b1.song();
	}
}
