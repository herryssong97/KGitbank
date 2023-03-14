package hipkg;

import java.util.Arrays;

public class Swap_bubblesort03 {
	public static void main(String[] args) {

		int imsi;
		int [] k = {90, 100, 35, 78, 34, 97};
		
//		int sw = 0;
//		while(sw==0) {
//			sw = 1; // -> while 문을 빠져나오는 방법
//		}
		int sw = 0; // ---------------------------
		
		for(int i=0; i<k.length-1 && sw == 0; i++) { // k.length-1 == 5
			for(int j=0; j<k.length-1-i; j++) { // bubble sort 3단계
				sw = 1;
				if(k[j] < k[j+1]) {
					imsi = k[j];
					k[j] = k[j+1];
					k[j+1] = imsi;
					sw = 0;
				}
			}
		}
		
		for(int p=0; p<k.length; p++) {
			System.out.print(k[p] + " ");
		}System.out.println();
		
		System.out.println(Arrays.toString(k));
	}
}
