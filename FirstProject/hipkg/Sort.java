package hipkg;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		
		// sort (����) 
		// key(����), ����(����, ����) ascending/descending
		
		/*
		 * sort
		 * 1) ���� sort : memory, radix sort, selection sort,
		 * 					bubble sort, quick sort
		 * 2) �ܺ� sort : ���������ġ
		 * 					2-way merge sort
		 */	
		
		// Q. ���� �迭�� sort�Ͽ� �������� �� ������������ ����Ͻÿ�
		int[] bae = {10, 90, 100, 60, 70};

		// shuffle()
		Arrays.sort(bae);
		// �⺻ �������� : 10 60 70 90 100
		for (int i = 0; i < bae.length; i++) {
			System.out.print(bae[i] + " ");
		}System.out.println();
		
		for (int i = bae.length-1; i >=0; i--) {
			System.out.print(bae[i] + " ");
		}
	}
}
