package hipkg;

public class Swap_bubblesort02 {
	public static void main(String[] args) {


		int imsi;
		int [] k = {90, 100, 35, 78, 34, 97};
		// k.length = 6
		
		for(int i=0; i<5; i++) { // k.length-1
			for(int j=0; j<5-i; j++) { // bubble sort 2´Ü°è
				
				if(k[j] < k[j+1]) {
					imsi = k[j];
					k[j] = k[j+1];
					k[j+1] = imsi;
					
				}
			}
		}
		
		for(int p=0; p<k.length; p++) {
			System.out.print(k[p] + " ");
		}
	}
}
