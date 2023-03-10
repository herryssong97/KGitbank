package hipkg;

public class MethodOverloading {
	public static void main(String[] args) {
		kaja();
		kaja(10, 20);
		kaja(10, 20.8);
		
		kaja2(20);
	} // main end
	
	public static void kaja() {
		
	}

	public static void kaja(int x, int y) {
		
	}
	
	public static void kaja(int x, double y) {
		
	}
	
	public static void kaja2(int x) {
		
	}
	
	
} // class end
