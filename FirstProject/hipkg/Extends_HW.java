package hipkg;

/*
 * Q. 부모 : Animal // move()
 * 	  자녀 : Bird // song()
 */


class Animal{ // 부모
	public void move() {
		System.out.println("움직인다!");
	}
}

class Bird extends Animal{
	public void song() {
		System.out.println("노래한다~");
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
