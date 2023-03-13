package hipkg;

public class Array_SecBae {
	public static void main(String[] args) {
		int[][] jum = new int[2][3];
		/*
		 * 2열 3행의 배열이 생김
		 * 000
		 * 000
		 */		
		jum[0][0] = 100;
		jum[1][2] = 85;
		
		int[][] jum2 = {{10, 20, 30}
						,{40, 50, 60}};
		
		
		int[][] jum3 = new int [3][5];
		int plus = 0;
		for (int j = 0; j < 3; j++) { // 0. 1. 2
			for (int i = 0; i < 5; i++) { // 0. 1. 2. 3. 4
				plus +=1;
				jum3[j][i] = plus;
				System.out.print(jum3[j][i] + " ");
			} plus = 0;
			System.out.println();
		}System.out.println();
		
		
		int[][] jum4 = new int[3][5];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				jum4[i][j] = j+1; 
				System.out.print(jum4[i][j] + " ");
			}System.out.println();
		}System.out.println();
		
		for(int i = 0; i < jum4.length; i++) {
			for (int j = 0; j < jum4[i].length; j++) {
				System.out.print(jum4[i][j] + " ");
			}System.out.println();
		}
		
		
		
		
	} // main end
} // Array_SecBae class end
