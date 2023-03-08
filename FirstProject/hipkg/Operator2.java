package hipkg;

public class Operator2 {

	public static void main(String[] args) {
		
		/* 
		 * 기억창고 4가지 
		 * stack memory
		 * static
		 * code
		 * heap
		 */
		
		int aaa = 100;
		System.out.println(aaa);
		aaa = aaa+1;
		System.out.println(aaa);
//		aaa++; // 후치연산자
		System.out.println(aaa++);
//		++aaa; // 전치연산자
		System.out.println(++aaa);
	}

}
