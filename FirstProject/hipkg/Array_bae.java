package hipkg;

public class Array_bae {
	public static void main(String[] args) {
//		int jum[] = new int[10]; // new �� ���� heap�� ����
		
		int[] jum = new int[10]; // new �� ���� heap�� ����
		jum[0] = 100;
		System.out.println(jum[0]);
		jum[8] = 20;
		jum[9] = 200;
//		jum[10] = 300;
		
		// 1���� �迭
		int[] gap = {10, 20, 30, 40, 50};
		
		for (int i = 0; i < gap.length; i++) {
			System.out.print(gap[i] + " ");
		}
	}
}
