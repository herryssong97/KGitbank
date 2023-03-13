package hipkg;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		
		// sort (정렬) 
		// key(기준), 차순(오름, 내림) ascending/descending
		
		/*
		 * sort
		 * 1) 내부 sort : memory, radix sort, selection sort,
		 * 					bubble sort, quick sort
		 * 2) 외부 sort : 보조기억장치
		 * 					2-way merge sort
		 */	
		
		// Q. 다음 배열을 sort하여 오름차순 및 내림차순으로 출력하시오
		int[] bae = {10, 90, 100, 60, 70};

		// shuffle()
		Arrays.sort(bae);
		// 기본 오름차순 : 10 60 70 90 100
		for (int i = 0; i < bae.length; i++) {
			System.out.print(bae[i] + " ");
		}System.out.println();
		
		for (int i = bae.length-1; i >=0; i--) {
			System.out.print(bae[i] + " ");
		}
	}
}
