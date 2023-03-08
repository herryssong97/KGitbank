package hipkg;

public class Operator {

	public static void main(String[] args) {
		
		/*
		 * 산술연산자
		 * +, -, *, /, %(나머지연산자)
		 */		
		System.out.println(10*3);
		System.out.println(10/3);
		System.out.println(10/3.0);
		// 정수/정수 == 정수
		// 정수/실수 == 실수 ex) 10/3.0 == 3.3333333333333335
		// 실수/정수 == 실수
		// 실수/실수 == 실수
		System.out.println(10%3);
		System.out.println();
		
		/*
		 * 관계연산자
		 * >, <, >=, <=, ==, !=
		 */		
		System.out.println(10>3);
		System.out.println(10==3);
		System.out.println(10!=3);
		System.out.println();
		
		// 산수연산자-->관계연산자-->논리연산자 순서대로 처리한다.
		// 10이 3의 배수
		System.out.println(10%3==0);
		if(10%3==0) {
			System.out.println("10은 3의 배수가 맞다.");
		} else {
			System.out.println("10은 3의 배수가 아니다.");
		}
		System.out.println();
		
		/* 
		 * 논리연산자 (and or not)
		 * && || !
		 */
		System.out.println(10>3 && 10<5);
		System.out.println(10>3 || 10<5);
		System.out.println(10>3 && !(10<5));
	}

}
