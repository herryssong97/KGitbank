package hipkg;

public class Swap_bubblesort01 {
	public static void main(String[] args) {


		int imsi;
		int [] k = {90, 100, 35, 78, 34, 97};
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) { // bubble sort 1´Ü°è
				
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
