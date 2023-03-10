package hipkg;

import java.util.Scanner;

public class Array_bae_method_call {
	public static void main(String[] args) {
		/*
		 * Q. 10개의 데이터를 배열에 입력받은 후 method호출문 2형식을 사용하여 
		 * 메소드 정의문으로 배열전체를 보낸 후 정의문에서
		 * 배열의 값을 반복문으로 출력하는
		 * 자바 프로그램을 작성하시오
		 */	
		
		// call by value (값에 의한 호출)
		// call by reference (참조에 의한 호출)
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i+1 +"번째 배열 수 입력: ");
			arr[i] = Integer.parseInt(sc.next());
			// arr[i] = sc.nextInt(); // 괜찮지만 더 큰수가 들어왔을때 오류를 대비해 위에처럼 써주기
		}
		
		// call by value (값에 의한 호출)
		// hap(arr[0], arr[1], ..arr[9])
		// 배열 전달시 알아야할 한줄의 속담은
		//		ㄴ "배열의 대표명은 그 배열의 시작번지이다"
		
		hap(arr);
		
		
		} // main end
	
	public static void hap(int[] arr) {

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.print("합 : " + sum);
	}
	
} // class end
