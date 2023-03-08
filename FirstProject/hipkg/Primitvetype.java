package hipkg;

public class Primitvetype {

	public static void main(String[] args) {

		/*
		 * primitive type
		 * reference type
		 */	
		
		/*
		 * primitive type (stack 기본형 8가지) => 자료type, 자료길이
		 * 
		 * int : 정수, 4바이트 (-2147483648 ~ +2147483647)
		 * byte : 정수, 1바이트 (-128 ~ +127)
		 * short : 정수, 2바이트 (-32768 ~ +32767)
		 * long : 정수, 8바이트
		 * double : 실수, 8바이트
		 * float : 실수, 4바이트
		 * char : 문자형, 2바이트
		 * boolean : 논리형, 1바이트 (true, false)
		 * 
		 */		
		
		
		/* 
		 * reference type (heap)
		 * String : 문자열, 배열 ...
		 * 
		 */
		
		int aa = 100;
		byte bb = 100;
		short cc = 100;
		long dd = 100;
		long dd2 = 2147483648L;
		double ee = 100.78; // 배정도 실수
		float ff = 100.78F; // 단정도 실수
		System.out.println(10/3.0);
		System.out.println(10/3.0f);
		char gg = 'A';
		String gg2 = "A";
		boolean hh = true;
		boolean hh2 = false;
		
		
		
	}

}
